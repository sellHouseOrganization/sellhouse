package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Clientcontactcareful implements Serializable {
    private Integer clientcontactcarefulid;

    private String purposedegree;

    private Date interviewdate;

    private String messageaddress;

    private String email;

    private String housemortgageloan;

    private String aim;

    private String projectprice;

    private String needarea;

    private String payway;

    private String considerfactor;

    private String contactway;

    private Integer clientid;

    private static final long serialVersionUID = 1L;

    public Integer getClientcontactcarefulid() {
        return clientcontactcarefulid;
    }

    public void setClientcontactcarefulid(Integer clientcontactcarefulid) {
        this.clientcontactcarefulid = clientcontactcarefulid;
    }

    public String getPurposedegree() {
        return purposedegree;
    }

    public void setPurposedegree(String purposedegree) {
        this.purposedegree = purposedegree == null ? null : purposedegree.trim();
    }

    public Date getInterviewdate() {
        return interviewdate;
    }

    public void setInterviewdate(Date interviewdate) {
        this.interviewdate = interviewdate;
    }

    public String getMessageaddress() {
        return messageaddress;
    }

    public void setMessageaddress(String messageaddress) {
        this.messageaddress = messageaddress == null ? null : messageaddress.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getHousemortgageloan() {
        return housemortgageloan;
    }

    public void setHousemortgageloan(String housemortgageloan) {
        this.housemortgageloan = housemortgageloan == null ? null : housemortgageloan.trim();
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim == null ? null : aim.trim();
    }

    public String getProjectprice() {
        return projectprice;
    }

    public void setProjectprice(String projectprice) {
        this.projectprice = projectprice == null ? null : projectprice.trim();
    }

    public String getNeedarea() {
        return needarea;
    }

    public void setNeedarea(String needarea) {
        this.needarea = needarea == null ? null : needarea.trim();
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway == null ? null : payway.trim();
    }

    public String getConsiderfactor() {
        return considerfactor;
    }

    public void setConsiderfactor(String considerfactor) {
        this.considerfactor = considerfactor == null ? null : considerfactor.trim();
    }

    public String getContactway() {
        return contactway;
    }

    public void setContactway(String contactway) {
        this.contactway = contactway == null ? null : contactway.trim();
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clientcontactcarefulid=").append(clientcontactcarefulid);
        sb.append(", purposedegree=").append(purposedegree);
        sb.append(", interviewdate=").append(interviewdate);
        sb.append(", messageaddress=").append(messageaddress);
        sb.append(", email=").append(email);
        sb.append(", housemortgageloan=").append(housemortgageloan);
        sb.append(", aim=").append(aim);
        sb.append(", projectprice=").append(projectprice);
        sb.append(", needarea=").append(needarea);
        sb.append(", payway=").append(payway);
        sb.append(", considerfactor=").append(considerfactor);
        sb.append(", contactway=").append(contactway);
        sb.append(", clientid=").append(clientid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}