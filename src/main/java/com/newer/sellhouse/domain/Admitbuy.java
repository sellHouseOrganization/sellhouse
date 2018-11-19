package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Admitbuy implements Serializable {
    private Integer admitbuyid;

    private Integer scheduleid;

    private Integer manageperson;

    private Integer adviserid;

    private Integer clientid;

    private Integer paywayid;

    private Integer houseid;

    private Double firstpay;

    private Date admitbuydate;

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

    public Integer getPaywayid() {
        return paywayid;
    }

    public void setPaywayid(Integer paywayid) {
        this.paywayid = paywayid;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public Double getFirstpay() {
        return firstpay;
    }

    public void setFirstpay(Double firstpay) {
        this.firstpay = firstpay;
    }

    public Date getAdmitbuydate() {
        return admitbuydate;
    }

    public void setAdmitbuydate(Date admitbuydate) {
        this.admitbuydate = admitbuydate;
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
        sb.append(", paywayid=").append(paywayid);
        sb.append(", houseid=").append(houseid);
        sb.append(", firstpay=").append(firstpay);
        sb.append(", admitbuydate=").append(admitbuydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}