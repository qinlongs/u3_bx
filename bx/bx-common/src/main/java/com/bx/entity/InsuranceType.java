package com.bx.entity;

import java.io.Serializable;

/**
 * 保险类型表
 * @Author:秦龙
 */
public class InsuranceType implements Serializable {

    private Integer id;
    private String TypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }
}
