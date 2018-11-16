package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable {
    private Integer scheduleid;

    private Integer houseid;

    private String fromtmoney;

    private Integer adviserid;

    private String remake;

    private Date scheduledate;

    private Integer clientid;

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

    public String getFromtmoney() {
        return fromtmoney;
    }

    public void setFromtmoney(String fromtmoney) {
        this.fromtmoney = fromtmoney == null ? null : fromtmoney.trim();
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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}