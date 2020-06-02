package com.bx.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

/**
 * 保险商品表
 * @Author:秦龙
 */
public class InsurProduct implements Serializable {

    private Integer id;
    private String productCode;
    private String productName;
    private Integer productStatus;
    private Integer typeId;
    private Integer minAge;
    private Integer maxAge;
    private Integer paymentWay;
    private Integer paymentDate;
    private String createId;
    private Date productExpireTime;
    private String productDescription;
    private Double minReturnMoney;
    private Double maxReturnMoney;
    private Date createTime;
    private Date updateTime;
    private Blob ensureInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public Integer getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(Integer paymentWay) {
        this.paymentWay = paymentWay;
    }

    public Integer getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Integer paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public Date getProductExpireTime() {
        return productExpireTime;
    }

    public void setProductExpireTime(Date productExpireTime) {
        this.productExpireTime = productExpireTime;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getMinReturnMoney() {
        return minReturnMoney;
    }

    public void setMinReturnMoney(Double minReturnMoney) {
        this.minReturnMoney = minReturnMoney;
    }

    public Double getMaxReturnMoney() {
        return maxReturnMoney;
    }

    public void setMaxReturnMoney(Double maxReturnMoney) {
        this.maxReturnMoney = maxReturnMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Blob getEnsureInfo() {
        return ensureInfo;
    }

    public void setEnsureInfo(Blob ensureInfo) {
        this.ensureInfo = ensureInfo;
    }
}
