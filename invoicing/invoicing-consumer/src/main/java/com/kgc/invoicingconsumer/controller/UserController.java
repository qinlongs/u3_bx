package com.kgc.invoicingconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.kgc.invocingcommon.entity.ResponseResult;
import com.kgc.invocingcommon.entity.User;
import com.kgc.invocingcommon.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Reference
     UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Object loginUser(User user){
        ResponseResult rs = new ResponseResult();
        if(StringUtils.isEmpty(user)){
            rs.setData("参数为空");
            rs.setFlag(0);
            rs.setResult(false);
            return JSON.toJSONString(rs);
        }
        if(StringUtils.isEmpty(user.getUserName())){
            rs.setData("用户名为空");
            rs.setFlag(1);
            rs.setResult(false);
            return JSON.toJSONString(rs);
        }
        if(StringUtils.isEmpty(user.getPassword())){
            rs.setData("密码为空");
            rs.setFlag(2);
            rs.setResult(false);
            return JSON.toJSONString(rs);
        }

        return JSON.toJSONString(userService.loginUser(user));
    }

    @ResponseBody
    @RequestMapping(value = "/loginOut",method = RequestMethod.GET)
    public boolean loginOut(String token){
        return userService.loginOut(token);
    }
}
