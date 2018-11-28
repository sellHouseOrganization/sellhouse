package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class ChangeHouseEdit implements Serializable {
    private Long cardnumber;
    private String address;
    private Integer admitBuyid;
    private String houseName;
    private Double price;
    private Double fromtMoney;
    private Double sumPrices;
    private Double mustPrices;
    private Date admitbuyDate;
    private Date scheduleDate;
    private Integer area;
    private String remake;

    public Long getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(Long cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAdmitBuyid() {
        return admitBuyid;
    }

    public void setAdmitBuyid(Integer admitBuyid) {
        this.admitBuyid = admitBuyid;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getFromtMoney() {
        return fromtMoney;
    }

    public void setFromtMoney(Double fromtMoney) {
        this.fromtMoney = fromtMoney;
    }

    public Double getSumPrices() {
        return sumPrices;
    }

    public void setSumPrices(Double sumPrices) {
        this.sumPrices = sumPrices;
    }

    public Double getMustPrices() {
        return mustPrices;
    }

    public void setMustPrices(Double mustPrices) {
        this.mustPrices = mustPrices;
    }

    public Date getAdmitbuyDate() {
        return admitbuyDate;
    }

    public void setAdmitbuyDate(Date admitbuyDate) {
        this.admitbuyDate = admitbuyDate;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }
}
