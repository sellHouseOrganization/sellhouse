package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Refund implements Serializable {
    private Integer refundid;

    private Double refundsum;

    private Date refunddate;

    private String refundexplain;

    private Integer admitbuyid;

    private Double takesum;

    private Client client;
    private Admitbuy admitbuy;
    private Floor floor;
    private House house;
    private Item item;

    private static final long serialVersionUID = 1L;

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Admitbuy getAdmitbuy() {
        return admitbuy;
    }

    public void setAdmitbuy(Admitbuy admitbuy) {
        this.admitbuy = admitbuy;
    }

    public Integer getRefundid() {
        return refundid;
    }

    public void setRefundid(Integer refundid) {
        this.refundid = refundid;
    }

    public Double getRefundsum() {
        return refundsum;
    }

    public void setRefundsum(Double refundsum) {
        this.refundsum = refundsum;
    }

    public Date getRefunddate() {
        return refunddate;
    }

    public void setRefunddate(Date refunddate) {
        this.refunddate = refunddate;
    }

    public String getRefundexplain() {
        return refundexplain;
    }

    public void setRefundexplain(String refundexplain) {
        this.refundexplain = refundexplain == null ? null : refundexplain.trim();
    }

    public Integer getAdmitbuyid() {
        return admitbuyid;
    }

    public void setAdmitbuyid(Integer admitbuyid) {
        this.admitbuyid = admitbuyid;
    }

    public Double getTakesum() {
        return takesum;
    }

    public void setTakesum(Double takesum) {
        this.takesum = takesum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", refundid=").append(refundid);
        sb.append(", refundsum=").append(refundsum);
        sb.append(", refunddate=").append(refunddate);
        sb.append(", refundexplain=").append(refundexplain);
        sb.append(", admitbuyid=").append(admitbuyid);
        sb.append(", takesum=").append(takesum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}