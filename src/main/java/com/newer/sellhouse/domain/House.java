package com.newer.sellhouse.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class House implements Serializable {
    private Integer houseid;

    private Integer floorid;

    private Floor floor;

    private String itemcompanyname;

    private String appendmode;

    private String housetype;

    private String orientation;

    private String houseName;

    private Integer tiernumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date housedate;

    private Integer housetypeid;

    private Integer marketstate;

    private Integer housestateid;

    private Integer housenumber;

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    private static final long serialVersionUID = 1L;

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String gethousetype() {
        return housetype;
    }

    public void sethousetype(String housetype) {
        this.housetype = housetype;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
    public String getitemcompanyname() {
        return itemcompanyname;
    }

    public void setitemcompanyname(String itemcompanyname) {
        this.itemcompanyname = itemcompanyname;
    }

    public void setAppendmode(String appendmode) {
        this.appendmode = appendmode;
    }

    public String getAppendmode() {
        return appendmode;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public Integer getFloorid() {
        return floorid;
    }

    public void setFloorid(Integer floorid) {
        this.floorid = floorid;
    }

    public Integer getTiernumber() {
        return tiernumber;
    }

    public void setTiernumber(Integer tiernumber) {
        this.tiernumber = tiernumber;
    }

    public Date getHousedate() {
        return housedate;
    }

    public void setHousedate(Date housedate) {
        this.housedate = housedate;
    }

    public Integer gethousetypeid() {
        return housetypeid;
    }

    public void sethousetypeid(Integer housetypeid) {
        this.housetypeid = housetypeid;
    }

    public Integer getMarketstate() {
        return marketstate;
    }

    public void setMarketstate(Integer marketstate) {
        this.marketstate = marketstate;
    }

    public Integer getHousestateid() {
        return housestateid;
    }

    public void setHousestateid(Integer housestateid) {
        this.housestateid = housestateid;
    }

    public Integer getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(Integer housenumber) {
        this.housenumber = housenumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", houseid=").append(houseid);
        sb.append(", itemcompanyname=").append(itemcompanyname);
        sb.append(", appendmode=").append(appendmode);
        sb.append(", floor=").append(floor);
        sb.append(", floorid=").append(floorid);
        sb.append(", tiernumber=").append(tiernumber);
        sb.append(", housedate=").append(housedate);
        sb.append(", housetype=").append(housetype);
        sb.append(", orientation=").append(orientation);
        sb.append(", housetypeid=").append(housetypeid);
        sb.append(", marketstate=").append(marketstate);
        sb.append(", housestateid=").append(housestateid);
        sb.append(", housenumber=").append(housenumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}