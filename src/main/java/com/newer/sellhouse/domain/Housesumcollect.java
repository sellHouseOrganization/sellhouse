package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Housesumcollect implements Serializable {
    private Integer housesumcollectid;

    private Integer offersumid;

    private String bill;

    private Date collectiondate;

    private Double money;

    private Date billdate;

    private String payway;

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