package com.kgc.invoicingprivoder.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.kgc.invocingcommon.entity.ResponseResult;
import com.kgc.invocingcommon.entity.User;
import com.kgc.invocingcommon.service.UserService;
import com.kgc.invocingcommon.util.SecurityUtils;
import com.kgc.invocingcommon.util.TokenUtils;
import com.kgc.invoicingprivoder.dao.UserDao;

import com.kgc.invoicingprivoder.util.RedisUtil;
import com.kgc.invoicingprivoder.util.TokenExistUtil;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Resource
    private RedisUtil redisUtil;

    @Override
    public ResponseResult loginUser(User user) {
        ResponseResult rs = new ResponseResult();
        System.out.println("UserService进来了。。。。。。。。");
        if(StringUtils.isEmpty(user)){
            rs.setData("参数为空");
            rs.setFlag(0);
            rs.setResult(false);
            return rs;
        }
        if(StringUtils.isEmpty(user.getUserName())){
            rs.setData("用户名为空");
            rs.setFlag(1);
            rs.setResult(false);
            return rs;
        }
        if(StringUtils.isEmpty(user.getPassword())){
            rs.setData("密码为空");
            rs.setFlag(2);
            rs.setResult(false);
            return rs;
        }else{
            user.setPassword(SecurityUtils.md5Hex(user.getPassword()));
        }
        User us = userDao.getUser(user);
        if(StringUtils.isEmpty(us)){
            rs.setData("用户名或密码错误");
            rs.setFlag(3);
            rs.setResult(false);
            return rs;
        }else{
            //如果登录陈宫，获取用户对象，去掉redis中通过用户ID获取token值
            String token = redisUtil.getStr(String.valueOf(us.getId()));
            //删除掉redis中当前用户对应的token值
            if(!StringUtils.isEmpty(token)){
                redisUtil.del(token);
                redisUtil.del(String.valueOf(us.getId()));
            }
//            生成token值
            token = TokenUtils.createToken(String.valueOf(us.getId()),us.getUserName());
           //存储用户信息至redis中，有效时间30分钟
            redisUtil.setStr(token, JSON.toJSONString(us),30L);
            redisUtil.setStr(String.valueOf(us.getId()),token,30L);
            rs.setResult(true);
            rs.setFlag(4);
            rs.setData(token);
        }

        return rs;
    }

    @Override
    public boolean loginOut(String token) {
        return TokenExistUtil.delToken(token,redisUtil);
    }
}
