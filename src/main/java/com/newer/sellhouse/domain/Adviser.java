package com.newer.sellhouse.domain;

import java.io.Serializable;

public class Adviser implements Serializable {
    private Integer adviserid;

    private String advisername;

    private String adviseridphone;

    private Integer staffid;

    private static final long serialVersionUID = 1L;

    public Integer getAdviserid() {
        return adviserid;
    }

    public void setAdviserid(Integer adviserid) {
        this.adviserid = adviserid;
    }

    public String getAdvisername() {
        return advisername;
    }

    public void setAdvisername(String advisername) {
        this.advisername = advisername == null ? null : advisername.trim();
    }

    public String getAdviseridphone() {
        return adviseridphone;
    }

    public void setAdviseridphone(String adviseridphone) {
        this.adviseridphone = adviseridphone == null ? null : adviseridphone.trim();
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adviserid=").append(adviserid);
        sb.append(", advisername=").append(advisername);
        sb.append(", adviseridphone=").append(adviseridphone);
        sb.append(", staffid=").append(staffid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}