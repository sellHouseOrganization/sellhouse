package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 房源类
 */
public class House implements Serializable {
    private Integer houseid;

    private Integer floorid;

    private Integer tiernumber;

    private Date housedate;

    private Integer housetypeid;

    private Integer marketstate;

    private Integer housestateid;

    private Integer housenumber;

    private static final long serialVersionUID = 1L;

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
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

    public Integer getHousetypeid() {
        return housetypeid;
    }

    public void setHousetypeid(Integer housetypeid) {
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
        sb.append(", floorid=").append(floorid);
        sb.append(", tiernumber=").append(tiernumber);
        sb.append(", housedate=").append(housedate);
        sb.append(", housetypeid=").append(housetypeid);
        sb.append(", marketstate=").append(marketstate);
        sb.append(", housestateid=").append(housestateid);
        sb.append(", housenumber=").append(housenumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}