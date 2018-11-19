package com.newer.sellhouse.domain;

import java.io.Serializable;

public class Roomtype implements Serializable {
    private Integer housetypeid;

    private String pooledarea;

    private String privatearea;

    private String orientation;

    private String hallroom;

    private String housetype;

    private static final long serialVersionUID = 1L;

    public Integer getHousetypeid() {
        return housetypeid;
    }

    public void setHousetypeid(Integer housetypeid) {
        this.housetypeid = housetypeid;
    }

    public String getPooledarea() {
        return pooledarea;
    }

    public void setPooledarea(String pooledarea) {
        this.pooledarea = pooledarea == null ? null : pooledarea.trim();
    }

    public String getPrivatearea() {
        return privatearea;
    }

    public void setPrivatearea(String privatearea) {
        this.privatearea = privatearea == null ? null : privatearea.trim();
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation == null ? null : orientation.trim();
    }

    public String getHallroom() {
        return hallroom;
    }

    public void setHallroom(String hallroom) {
        this.hallroom = hallroom == null ? null : hallroom.trim();
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype == null ? null : housetype.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", housetypeid=").append(housetypeid);
        sb.append(", pooledarea=").append(pooledarea);
        sb.append(", privatearea=").append(privatearea);
        sb.append(", orientation=").append(orientation);
        sb.append(", hallroom=").append(hallroom);
        sb.append(", housetype=").append(housetype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}