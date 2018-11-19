package com.newer.sellhouse.domain;

import java.io.Serializable;

public class OffersumAdmitbuy implements Serializable {
    private Integer admitbuyid;
    private String clientName;
    private String houseName;

    public Integer getAdmitbuyid() {
        return admitbuyid;
    }

    public void setAdmitbuyid(Integer admitbuyid) {
        this.admitbuyid = admitbuyid;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    @Override
    public String toString() {
        return "OffersumAdmitbuy{" +
                "admitbuyid=" + admitbuyid +
                ", clientName='" + clientName + '\'' +
                ", houseName='" + houseName + '\'' +
                '}';
    }
}
