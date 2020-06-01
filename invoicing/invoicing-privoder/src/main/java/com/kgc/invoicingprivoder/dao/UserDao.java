package com.kgc.invoicingprivoder.dao;

import com.kgc.invocingcommon.entity.Product;
import com.kgc.invocingcommon.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
   User getUser(User user);

}
