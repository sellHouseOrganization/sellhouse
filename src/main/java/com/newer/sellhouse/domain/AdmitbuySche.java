package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class AdmitbuySche implements Serializable {

    private double price;//预售单价
    private String privateArea;//私有面积
    private double fromtMoney;//定金
    private double firstPay;//首付
    private double mustPrices;//预交售价
    private double sumPrices;//成交总价
    private String clientName;//客户姓名
    private String houseName;//房源名称
    private Date scheduleDate;//预购时间
    private String remake;//简要备注
    private String payWayName;//付款方式
    private Date admitbuyDate;//认购时间
    private String managePerson;//经办人员

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPrivateArea() {
        return privateArea;
    }

    public void setPrivateArea(String privateArea) {
        this.privateArea = privateArea;
    }

    public double getFromtMoney() {
        return fromtMoney;
    }

    public void setFromtMoney(double fromtMoney) {
        this.fromtMoney = fromtMoney;
    }

    public double getFirstPay() {
        return firstPay;
    }

    public void setFirstPay(double firstPay) {
        this.firstPay = firstPay;
    }

    public double getMustPrices() {
        return mustPrices;
    }

    public void setMustPrices(double mustPrices) {
        this.mustPrices = mustPrices;
    }

    public double getSumPrices() {
        return sumPrices;
    }

    public void setSumPrices(double sumPrices) {
        this.sumPrices = sumPrices;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public String getPayWayName() {
        return payWayName;
    }

    public void setPayWayName(String payWayName) {
        this.payWayName = payWayName;
    }

    public Date getAdmitbuyDate() {
        return admitbuyDate;
    }

    public void setAdmitbuyDate(Date admitbuyDate) {
        this.admitbuyDate = admitbuyDate;
    }

    public String getManagePerson() {
        return managePerson;
    }

    public void setManagePerson(String managePerson) {
        this.managePerson = managePerson;
    }
}
