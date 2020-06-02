package com.bx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 保单信息表
 * @Author:秦龙
 */
public class Policy implements Serializable {

    private String policyId;
    private String policyHolderId;
    private String insuredId;
    private String benefId;
    private Integer productId;
    private Integer packageId;
    private Double policyMoney;
    private Integer paymentDate;
    private Integer status;
    private Date createTime;
    private Date policyStartTime;
    private String contractId;
    private Date policyNextTime;
    private Date policyEndTime;
    private String staffId;
    private String bankId;

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyHolderId() {
        return policyHolderId;
    }

    public void setPolicyHolderId(String policyHolderId) {
        this.policyHolderId = policyHolderId;
    }

    public String getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(String insuredId) {
        this.insuredId = insuredId;
    }

    public String getBenefId() {
        return benefId;
    }

    public void setBenefId(String benefId) {
        this.benefId = benefId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Double getPolicyMoney() {
        return policyMoney;
    }

    public void setPolicyMoney(Double policyMoney) {
        this.policyMoney = policyMoney;
    }

    public Integer getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Integer paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPolicyStartTime() {
        return policyStartTime;
    }

    public void setPolicyStartTime(Date policyStartTime) {
        this.policyStartTime = policyStartTime;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Date getPolicyNextTime() {
        return policyNextTime;
    }

    public void setPolicyNextTime(Date policyNextTime) {
        this.policyNextTime = policyNextTime;
    }

    public Date getPolicyEndTime() {
        return policyEndTime;
    }

    public void setPolicyEndTime(Date policyEndTime) {
        this.policyEndTime = policyEndTime;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
}
