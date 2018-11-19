package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class AdmitbuySel implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer admitbuyid;//认购ID

    private Integer manageperson;//经办人员

    private Double firstpay;//首付

    private Date admitbuydate;//认购日期

    private String clientName;//客户姓名

    private String sex;//性别

    private String cardnumber;//身份证号码

    private String phone;//电话号码

    private Double fromtmoney;//定金

    private String adviserName;//置业顾问名称

    private Double mustprices;//应交售价

    private Double sumprices;//成交总价

    private String houseName;//房源名称

    private String payWayName;//付款方式名称

    public Integer getAdmitbuyid() {
        return admitbuyid;
    }

    public void setAdmitbuyid(Integer admitbuyid) {
        this.admitbuyid = admitbuyid;
    }

    public Integer getManageperson() {
        return manageperson;
    }

    public void setManageperson(Integer manageperson) {
        this.manageperson = manageperson;
    }

    public Double getFirstpay() {
        return firstpay;
    }

    public void setFirstpay(Double firstpay) {
        this.firstpay = firstpay;
    }

    public Date getAdmitbuydate() {
        return admitbuydate;
    }

    public void setAdmitbuydate(Date admitbuydate) {
        this.admitbuydate = admitbuydate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getFromtmoney() {
        return fromtmoney;
    }

    public void setFromtmoney(Double fromtmoney) {
        this.fromtmoney = fromtmoney;
    }

    public String getAdviserName() {
        return adviserName;
    }

    public void setAdviserName(String adviserName) {
        this.adviserName = adviserName;
    }

    public Double getMustprices() {
        return mustprices;
    }

    public void setMustprices(Double mustprices) {
        this.mustprices = mustprices;
    }

    public Double getSumprices() {
        return sumprices;
    }

    public void setSumprices(Double sumprices) {
        this.sumprices = sumprices;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getPayWayName() {
        return payWayName;
    }

    public void setPayWayName(String payWayName) {
        this.payWayName = payWayName;
    }
}
