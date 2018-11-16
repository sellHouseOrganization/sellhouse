package com.newer.sellhouse.domain;

import java.io.Serializable;

/**
 * 面积售价类
 */
public class Areaprice implements Serializable {
    private Integer areapriceid;

    private String price;

    private Integer floorid;

    private static final long serialVersionUID = 1L;

    public Integer getAreapriceid() {
        return areapriceid;
    }

    public void setAreapriceid(Integer areapriceid) {
        this.areapriceid = areapriceid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getFloorid() {
        return floorid;
    }

    public void setFloorid(Integer floorid) {
        this.floorid = floorid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", areapriceid=").append(areapriceid);
        sb.append(", price=").append(price);
        sb.append(", floorid=").append(floorid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}