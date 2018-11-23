package com.newer.sellhouse.domain;

import java.io.Serializable;

public class ScheduleAdd implements Serializable {

    private Integer scheduleid ;

    private String clientName ;

    private String sex ;

    private String cardnumber ;

    private String age ;

    private String phone ;

    private String adviserName ;

    private double fromtMoney ;

    private String itemName ;

    private String floornumber ;

    private String privateArea ;

    private double price ;

    private double total ;

    public ScheduleAdd(Integer scheduleid, String clientName, String sex, String cardnumber, String age, String phone, String adviserName, double fromtMoney, String itemName, String floornumber, String privateArea, double price, double total) {
        this.scheduleid = scheduleid;
        this.clientName = clientName;
        this.sex = sex;
        this.cardnumber = cardnumber;
        this.age = age;
        this.phone = phone;
        this.adviserName = adviserName;
        this.fromtMoney = fromtMoney;
        this.itemName = itemName;
        this.floornumber = floornumber;
        this.privateArea = privateArea;
        this.price = price;
        this.total = total;
    }

    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
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

    public String getAdviserName() {
        return adviserName;
    }

    public void setAdviserName(String adviserName) {
        this.adviserName = adviserName;
    }

    public double getFromtMoney() {
        return fromtMoney;
    }

    public void setFromtMoney(double fromtMoney) {
        this.fromtMoney = fromtMoney;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getFloornumber() {
        return floornumber;
    }

    public void setFloornumber(String floornumber) {
        this.floornumber = floornumber;
    }

    public String getPrivateArea() {
        return privateArea;
    }

    public void setPrivateArea(String privateArea) {
        this.privateArea = privateArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
