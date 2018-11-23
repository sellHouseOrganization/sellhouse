package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.List;

public class Client implements Serializable {
    private Integer clientid;

    private String clientName;

    private String sex;

    private String cardnumber;

    private String age;

    private String phone;

    private Clientcontactcareful clientcontactcarefulList;

    private static final long serialVersionUID = 1L;

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Clientcontactcareful getClientcontactcarefulList() {
        return clientcontactcarefulList;
    }

    public void setClientcontactcarefulList(Clientcontactcareful clientcontactcarefulList) {
        this.clientcontactcarefulList = clientcontactcarefulList;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientid=" + clientid +
                ", clientName='" + clientName + '\'' +
                ", sex='" + sex + '\'' +
                ", cardnumber='" + cardnumber + '\'' +
                ", age='" + age + '\'' +
                ", phone='" + phone + '\'' +
                ", clientcontactcarefulList=" + clientcontactcarefulList +
                '}';
    }
}