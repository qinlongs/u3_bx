package com.kgc.invoicingprivoder.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kgc.invocingcommon.entity.ResponseResult;
import com.kgc.invocingcommon.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;

public class TokenExistUtil {

    public static ResponseResult existToken(String token,RedisUtil redisUtil){
        ResponseResult rs = new ResponseResult();
        String user = redisUtil.getStr(token);
        if(!StringUtils.isEmpty(user)){
            User users = JSON.toJavaObject(JSONObject.parseObject(user),User.class);
            rs.setData(users);
            rs.setFlag(1);
            rs.setResult(true);
        }else{
            rs.setFlag(0);
            rs.setData("用户灭有登录");
        }

        return rs;
    }
    public static boolean delToken(String token,RedisUtil redisUtil){
        String user=redisUtil.getStr(token);
        if(!StringUtils.isEmpty(user)){
            User users = JSON.toJavaObject(JSONObject.parseObject(user),User.class);
            redisUtil.del(String.valueOf(users.getId()));
            redisUtil.del(token);
        }

        return true;
    }



}
