package com.newer.sellhouse.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class ScheduleTotal implements Serializable {

    private Integer scheduleid ;

    private double price ;

    private double Total ;

    private double fromtMoney ;

    private String clientName ;

    private String sex ;

    private String phone ;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date scheduleDate ;

    private String itemName ;

    private String floornumber ;

    private String houseName ;

    public ScheduleTotal(){

    }

    public ScheduleTotal(Integer scheduleid, double price, double total, double fromtMoney, String clientName, String sex, String phone, Date scheduleDate, String itemName, String floornumber, String houseName) {
        this.scheduleid = scheduleid;
        this.price = price;
        Total = total;
        this.fromtMoney = fromtMoney;
        this.clientName = clientName;
        this.sex = sex;
        this.phone = phone;
        this.scheduleDate = scheduleDate;
        this.itemName = itemName;
        this.floornumber = floornumber;
        this.houseName = houseName;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public double getFromtMoney() {
        return fromtMoney;
    }

    public void setFromtMoney(double fromtMoney) {
        this.fromtMoney = fromtMoney;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
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

    @Override
    public String toString() {
        return "ScheduleTotal{" +
                "scheduleid=" + scheduleid +
                ", price=" + price +
                ", Total=" + Total +
                ", fromtMoney=" + fromtMoney +
                ", clientName='" + clientName + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", scheduleDate=" + scheduleDate +
                ", itemName='" + itemName + '\'' +
                ", floornumber='" + floornumber + '\'' +
                ", houseName='" + houseName + '\'' +
                '}';
    }
}
