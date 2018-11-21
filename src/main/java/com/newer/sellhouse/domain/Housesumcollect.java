package com.newer.sellhouse.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Housesumcollect implements Serializable {
    private Integer housesumcollectid;

    private Integer offersumid;

    private String bill;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date collectiondate;

    private Double money;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date billdate;

    private String payway;

    private Integer offertime;

    private String payer;

    private static final long serialVersionUID = 1L;

    public Integer getHousesumcollectid() {
        return housesumcollectid;
    }

    public void setHousesumcollectid(Integer housesumcollectid) {
        this.housesumcollectid = housesumcollectid;
    }

    public Integer getOffersumid() {
        return offersumid;
    }

    public void setOffersumid(Integer offersumid) {
        this.offersumid = offersumid;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill == null ? null : bill.trim();
    }

    public Date getCollectiondate() {
        return collectiondate;
    }

    public void setCollectiondate(Date collectiondate) {
        this.collectiondate = collectiondate;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway == null ? null : payway.trim();
    }

    public Integer getOffertime() {
        return offertime;
    }

    public void setOffertime(Integer offertime) {
        this.offertime = offertime;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", housesumcollectid=").append(housesumcollectid);
        sb.append(", offersumid=").append(offersumid);
        sb.append(", bill=").append(bill);
        sb.append(", collectiondate=").append(collectiondate);
        sb.append(", money=").append(money);
        sb.append(", billdate=").append(billdate);
        sb.append(", payway=").append(payway);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}