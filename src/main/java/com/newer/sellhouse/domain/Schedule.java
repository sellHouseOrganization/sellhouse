package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable {
    private Integer scheduleid;

    private Integer houseid;

    private Double fromtmoney;

    private Integer adviserid;

    private String remake;

    private Date scheduledate;

    private Integer clientid;

    private Double mustprices;

    private Double sumprices;

    private static final long serialVersionUID = 1L;

    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public Double getFromtmoney() {
        return fromtmoney;
    }

    public void setFromtmoney(Double fromtmoney) {
        this.fromtmoney = fromtmoney;
    }

    public Integer getAdviserid() {
        return adviserid;
    }

    public void setAdviserid(Integer adviserid) {
        this.adviserid = adviserid;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
    }

    public Date getScheduledate() {
        return scheduledate;
    }

    public void setScheduledate(Date scheduledate) {
        this.scheduledate = scheduledate;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Double getMustprices() {
        return mustprices;
    }

    public void setMustprices(Double mustprices) {
        this.mustprices = mustprices;
    }

    public Double getSumprices() {
        return sumprices;
    }

    public void setSumprices(Double sumprices) {
        this.sumprices = sumprices;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scheduleid=").append(scheduleid);
        sb.append(", houseid=").append(houseid);
        sb.append(", fromtmoney=").append(fromtmoney);
        sb.append(", adviserid=").append(adviserid);
        sb.append(", remake=").append(remake);
        sb.append(", scheduledate=").append(scheduledate);
        sb.append(", clientid=").append(clientid);
        sb.append(", mustprices=").append(mustprices);
        sb.append(", sumprices=").append(sumprices);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}