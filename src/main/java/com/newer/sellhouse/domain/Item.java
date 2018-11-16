package com.newer.sellhouse.domain;

import java.io.Serializable;

/**
 * 项目类
 */
public class Item implements Serializable {
    private Integer itemid;

    private String itemname;

    private String itemcompanyname;

    private String itemlevel;

    private Integer notsettle;

    private Integer reserve1;

    private Integer reserve2;

    private static final long serialVersionUID = 1L;

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getItemcompanyname() {
        return itemcompanyname;
    }

    public void setItemcompanyname(String itemcompanyname) {
        this.itemcompanyname = itemcompanyname == null ? null : itemcompanyname.trim();
    }

    public String getItemlevel() {
        return itemlevel;
    }

    public void setItemlevel(String itemlevel) {
        this.itemlevel = itemlevel == null ? null : itemlevel.trim();
    }

    public Integer getNotsettle() {
        return notsettle;
    }

    public void setNotsettle(Integer notsettle) {
        this.notsettle = notsettle;
    }

    public Integer getReserve1() {
        return reserve1;
    }

    public void setReserve1(Integer reserve1) {
        this.reserve1 = reserve1;
    }

    public Integer getReserve2() {
        return reserve2;
    }

    public void setReserve2(Integer reserve2) {
        this.reserve2 = reserve2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemid=").append(itemid);
        sb.append(", itemname=").append(itemname);
        sb.append(", itemcompanyname=").append(itemcompanyname);
        sb.append(", itemlevel=").append(itemlevel);
        sb.append(", notsettle=").append(notsettle);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}