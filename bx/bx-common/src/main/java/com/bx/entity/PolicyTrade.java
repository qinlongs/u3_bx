package com.bx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 保单扣款缴费记录表
 * @Author:秦龙
 *
 */
public class PolicyTrade implements Serializable {

    private String tradeId;
    private String policyId;
    private Double payMoney;
    private Date dateTime;
    private String bankId;

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
}
