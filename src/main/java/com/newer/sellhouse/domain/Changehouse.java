package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Changehouse implements Serializable {
    private Integer changehouseid;

    private Integer oldhouseid;

    private Integer newhouseid;

    private Date changehousedate;

    private String periodizationnumber;

    private String paymentperiodizationnumber;

    private String paysum;

    private static final long serialVersionUID = 1L;

    public Integer getChangehouseid() {
        return changehouseid;
    }

    public void setChangehouseid(Integer changehouseid) {
        this.changehouseid = changehouseid;
    }

    public Integer getOldhouseid() {
        return oldhouseid;
    }

    public void setOldhouseid(Integer oldhouseid) {
        this.oldhouseid = oldhouseid;
    }

    public Integer getNewhouseid() {
        return newhouseid;
    }

    public void setNewhouseid(Integer newhouseid) {
        this.newhouseid = newhouseid;
    }

    public Date getChangehousedate() {
        return changehousedate;
    }

    public void setChangehousedate(Date changehousedate) {
        this.changehousedate = changehousedate;
    }

    public String getPeriodizationnumber() {
        return periodizationnumber;
    }

    public void setPeriodizationnumber(String periodizationnumber) {
        this.periodizationnumber = periodizationnumber == null ? null : periodizationnumber.trim();
    }

    public String getPaymentperiodizationnumber() {
        return paymentperiodizationnumber;
    }

    public void setPaymentperiodizationnumber(String paymentperiodizationnumber) {
        this.paymentperiodizationnumber = paymentperiodizationnumber == null ? null : paymentperiodizationnumber.trim();
    }

    public String getPaysum() {
        return paysum;
    }

    public void setPaysum(String paysum) {
        this.paysum = paysum == null ? null : paysum.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", changehouseid=").append(changehouseid);
        sb.append(", oldhouseid=").append(oldhouseid);
        sb.append(", newhouseid=").append(newhouseid);
        sb.append(", changehousedate=").append(changehousedate);
        sb.append(", periodizationnumber=").append(periodizationnumber);
        sb.append(", paymentperiodizationnumber=").append(paymentperiodizationnumber);
        sb.append(", paysum=").append(paysum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}