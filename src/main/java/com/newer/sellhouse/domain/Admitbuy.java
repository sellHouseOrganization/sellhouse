package com.newer.sellhouse.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Admitbuy implements Serializable {
    private Integer admitbuyid; //认购ID

    private Integer scheduleid;//预定ID

    private String managePerson;//经办人员

    private Integer adviserid;//置业顾问ID

    private Integer clientid;//客户ID

    private Integer paywayid;//付款方式IDw

    private Integer houseid;//房源ID

    private Double firstPay;//首付
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date admitbuyDate;//认购日期

  /*  private List<Client> clientList;//客户关联

    private List<Schedule> scheduleList;//预定关联

    private Adviser adviserName;//关联置业顾问*/

    private static final long serialVersionUID = 1L;

   /* public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(List<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

    public Adviser getAdviserName() {
        return adviserName;
    }

    public void setAdviserName(Adviser adviserName) {
        this.adviserName = adviserName;
    }
*/
    public Integer getAdmitbuyid() {
        return admitbuyid;
    }

    public void setAdmitbuyid(Integer admitbuyid) {
        this.admitbuyid = admitbuyid;
    }

    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getManagePerson() {
        return managePerson;
    }

    public void setManagePerson(String managePerson) {
        this.managePerson = managePerson;
    }

    public Integer getAdviserid() {
        return adviserid;
    }

    public void setAdviserid(Integer adviserid) {
        this.adviserid = adviserid;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Integer getPaywayid() {
        return paywayid;
    }

    public void setPaywayid(Integer paywayid) {
        this.paywayid = paywayid;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public Double getFirstPay() {
        return firstPay;
    }

    public void setFirstPay(Double firstPay) {
        this.firstPay = firstPay;
    }

    public Date getAdmitbuyDate() {
        return admitbuyDate;
    }

    public void setAdmitbuyDate(Date admitbuyDate) {
        this.admitbuyDate = admitbuyDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", admitbuyid=").append(admitbuyid);
        sb.append(", scheduleid=").append(scheduleid);
        sb.append(", managePerson=").append(managePerson);
        sb.append(", adviserid=").append(adviserid);
        sb.append(", clientid=").append(clientid);
        sb.append(", paywayid=").append(paywayid);
        sb.append(", houseid=").append(houseid);
        sb.append(", firstPay=").append(firstPay);
        sb.append(", admitbuyDate=").append(admitbuyDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}