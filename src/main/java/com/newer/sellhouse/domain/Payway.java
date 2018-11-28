package com.newer.sellhouse.domain;

import java.io.Serializable;

public class Payway implements Serializable {

    private  String itemname;
    private Integer paywayid;

    private String payWayName;

    private String mortgageloanno;

    private String resrvedfundsloanno;

    private String notstart;

    private String mortgageterm;

    private String firstscale;

    private String twicescale;

    private String thricescale;

    private Integer itemid;

    private static final long serialVersionUID = 1L;

    public String getItemname() {
        return itemname;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public Integer getPaywayid() {
        return paywayid;
    }

    public void setPaywayid(Integer paywayid) {
        this.paywayid = paywayid;
    }

    public String getPayWayName() {
        return payWayName;
    }

    public void setPayWayName(String payWayName) {
        this.payWayName = payWayName;
    }

    public String getMortgageloanno() {
        return mortgageloanno;
    }

    public void setMortgageloanno(String mortgageloanno) {
        this.mortgageloanno = mortgageloanno == null ? null : mortgageloanno.trim();
    }

    public String getResrvedfundsloanno() {
        return resrvedfundsloanno;
    }

    public void setResrvedfundsloanno(String resrvedfundsloanno) {
        this.resrvedfundsloanno = resrvedfundsloanno == null ? null : resrvedfundsloanno.trim();
    }

    public String getNotstart() {
        return notstart;
    }

    public void setNotstart(String notstart) {
        this.notstart = notstart == null ? null : notstart.trim();
    }

    public String getMortgageterm() {
        return mortgageterm;
    }

    public void setMortgageterm(String mortgageterm) {
        this.mortgageterm = mortgageterm == null ? null : mortgageterm.trim();
    }

    public String getFirstscale() {
        return firstscale;
    }

    public void setFirstscale(String firstscale) {
        this.firstscale = firstscale == null ? null : firstscale.trim();
    }

    public String getTwicescale() {
        return twicescale;
    }

    public void setTwicescale(String twicescale) {
        this.twicescale = twicescale == null ? null : twicescale.trim();
    }

    public String getThricescale() {
        return thricescale;
    }

    public void setThricescale(String thricescale) {
        this.thricescale = thricescale == null ? null : thricescale.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemname=").append(itemname);
        sb.append(", paywayid=").append(paywayid);
        sb.append(", itemid=").append(itemid);
        sb.append(", payWayName=").append(payWayName);
        sb.append(", mortgageloanno=").append(mortgageloanno);
        sb.append(", resrvedfundsloanno=").append(resrvedfundsloanno);
        sb.append(", notstart=").append(notstart);
        sb.append(", mortgageterm=").append(mortgageterm);
        sb.append(", firstscale=").append(firstscale);
        sb.append(", twicescale=").append(twicescale);
        sb.append(", thricescale=").append(thricescale);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}