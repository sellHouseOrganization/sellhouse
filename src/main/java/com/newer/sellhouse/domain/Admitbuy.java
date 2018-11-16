package com.newer.sellhouse.domain;

import java.io.Serializable;

public class Admitbuy implements Serializable {
    private Integer admitbuyid;

    private Integer scheduleid;

    private Integer manageperson;

    private Integer adviserid;

    private Integer clientid;

    private String mustprices;

    private Integer paywayid;

    private static final long serialVersionUID = 1L;

    public Integer getAdmitbuyid() {
        return admitbuyid;
    }

    public void setAdmitbuyid(Integer admitbuyid) {
        this.admitbuyid = admitbuyid;
    }

    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public Integer getManageperson() {
        return manageperson;
    }

    public void setManageperson(Integer manageperson) {
        this.manageperson = manageperson;
    }

    public Integer getAdviserid() {
        return adviserid;
    }

    public void setAdviserid(Integer adviserid) {
        this.adviserid = adviserid;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public String getMustprices() {
        return mustprices;
    }

    public void setMustprices(String mustprices) {
        this.mustprices = mustprices == null ? null : mustprices.trim();
    }

    public Integer getPaywayid() {
        return paywayid;
    }

    public void setPaywayid(Integer paywayid) {
        this.paywayid = paywayid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", admitbuyid=").append(admitbuyid);
        sb.append(", scheduleid=").append(scheduleid);
        sb.append(", manageperson=").append(manageperson);
        sb.append(", adviserid=").append(adviserid);
        sb.append(", clientid=").append(clientid);
        sb.append(", mustprices=").append(mustprices);
        sb.append(", paywayid=").append(paywayid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}