package com.newer.sellhouse.domain;

import java.io.Serializable;

public class Areaprice implements Serializable {
    private Integer areapriceid;

    private Double price;

    private Integer itemid;

    private static final long serialVersionUID = 1L;

    public Integer getAreapriceid() {
        return areapriceid;
    }

    public void setAreapriceid(Integer areapriceid) {
        this.areapriceid = areapriceid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", areapriceid=").append(areapriceid);
        sb.append(", price=").append(price);
        sb.append(", itemid=").append(itemid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}