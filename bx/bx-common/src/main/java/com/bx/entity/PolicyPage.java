package com.bx.entity;

import java.util.List;

public class PolicyPage extends Page {

    private List<Policy> getPolicyList;

    public List<Policy> getGetPolicyList() {
        return getPolicyList;
    }

    public void setGetPolicyList(List<Policy> getPolicyList) {
        this.getPolicyList = getPolicyList;
    }
}
