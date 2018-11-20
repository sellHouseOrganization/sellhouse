package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Clientcontactcareful implements Serializable {
    private Integer clientContactCarefulid;

    private String purposeDegree;

    private Date interviewDate;

    private String messageAddress;

    private String email;

    private String houseMortgageLoan;

    private String aim;

    private String projectPrice;

    private String needArea;

    private String payWay;

    private String considerFactor;

    private String contactWay;

    private Integer clientid;

    private static final long serialVersionUID = 1L;

    public Integer getClientContactCarefulid() {
        return clientContactCarefulid;
    }

    public void setClientContactCarefulid(Integer clientContactCarefulid) {
        this.clientContactCarefulid = clientContactCarefulid;
    }

    public String getPurposeDegree() {
        return purposeDegree;
    }

    public void setPurposeDegree(String purposeDegree) {
        this.purposeDegree = purposeDegree;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getMessageAddress() {
        return messageAddress;
    }

    public void setMessageAddress(String messageAddress) {
        this.messageAddress = messageAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHouseMortgageLoan() {
        return houseMortgageLoan;
    }

    public void setHouseMortgageLoan(String houseMortgageLoan) {
        this.houseMortgageLoan = houseMortgageLoan;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public String getProjectPrice() {
        return projectPrice;
    }

    public void setProjectPrice(String projectPrice) {
        this.projectPrice = projectPrice;
    }

    public String getNeedArea() {
        return needArea;
    }

    public void setNeedArea(String needArea) {
        this.needArea = needArea;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getConsiderFactor() {
        return considerFactor;
    }

    public void setConsiderFactor(String considerFactor) {
        this.considerFactor = considerFactor;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    @Override
    public String toString() {
        return "Clientcontactcareful{" +
                "clientContactCarefulid=" + clientContactCarefulid +
                ", purposeDegree='" + purposeDegree + '\'' +
                ", interviewDate=" + interviewDate +
                ", messageAddress='" + messageAddress + '\'' +
                ", email='" + email + '\'' +
                ", houseMortgageLoan='" + houseMortgageLoan + '\'' +
                ", aim='" + aim + '\'' +
                ", projectPrice='" + projectPrice + '\'' +
                ", needArea='" + needArea + '\'' +
                ", payWay='" + payWay + '\'' +
                ", considerFactor='" + considerFactor + '\'' +
                ", contactWay='" + contactWay + '\'' +
                ", clientid=" + clientid +
                '}';
    }
}