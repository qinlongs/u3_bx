package com.bx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 保单审核记录表
 * @Author:秦龙
 */
public class ReviewRecord implements Serializable {

    private String  id;
    private String policyId;
    private Integer status;
    private String reviewId;
    private Date reviewTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }
}
