package com.kgc.invocingcommon.service;

import com.kgc.invocingcommon.entity.ResponseResult;
import com.kgc.invocingcommon.entity.User;

public interface UserService {
    ResponseResult loginUser(User user);
    boolean loginOut(String token);
}
