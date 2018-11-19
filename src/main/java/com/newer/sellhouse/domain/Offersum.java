package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Offersum implements Serializable {
    private Integer offersumid;

    private String offersumdeadline;

    private Integer admitbuyid;

    private Double sum;

    private String offersumname;

    private String offersumevent;

    private Date offersumtime;

    private String offerperiods;

    private static final long serialVersionUID = 1L;

    public Integer getOffersumid() {
        return offersumid;
    }

    public void setOffersumid(Integer offersumid) {
        this.offersumid = offersumid;
    }

    public String getOffersumdeadline() {
        return offersumdeadline;
    }

    public void setOffersumdeadline(String offersumdeadline) {
        this.offersumdeadline = offersumdeadline == null ? null : offersumdeadline.trim();
    }

    public Integer getAdmitbuyid() {
        return admitbuyid;
    }

    public void setAdmitbuyid(Integer admitbuyid) {
        this.admitbuyid = admitbuyid;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public String getOffersumname() {
        return offersumname;
    }

    public void setOffersumname(String offersumname) {
        this.offersumname = offersumname == null ? null : offersumname.trim();
    }

    public String getOffersumevent() {
        return offersumevent;
    }

    public void setOffersumevent(String offersumevent) {
        this.offersumevent = offersumevent == null ? null : offersumevent.trim();
    }

    public Date getOffersumtime() {
        return offersumtime;
    }

    public void setOffersumtime(Date offersumtime) {
        this.offersumtime = offersumtime;
    }

    public String getOfferperiods() {
        return offerperiods;
    }

    public void setOfferperiods(String offerperiods) {
        this.offerperiods = offerperiods == null ? null : offerperiods.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", offersumid=").append(offersumid);
        sb.append(", offersumdeadline=").append(offersumdeadline);
        sb.append(", admitbuyid=").append(admitbuyid);
        sb.append(", sum=").append(sum);
        sb.append(", offersumname=").append(offersumname);
        sb.append(", offersumevent=").append(offersumevent);
        sb.append(", offersumtime=").append(offersumtime);
        sb.append(", offerperiods=").append(offerperiods);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}