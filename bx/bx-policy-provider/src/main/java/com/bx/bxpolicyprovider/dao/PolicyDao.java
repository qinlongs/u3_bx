package com.bx.bxpolicyprovider.dao;

import com.bx.entity.Policy;
import com.bx.entity.PolicyPartment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PolicyDao {

    /**
     *
     * @return
     */
    List<Policy> getPolicyInfo(PolicyPartment policyPartment);



}
