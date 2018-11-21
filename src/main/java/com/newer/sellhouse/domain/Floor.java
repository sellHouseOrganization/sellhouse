package com.newer.sellhouse.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Floor implements Serializable {
    private Integer floorid;

    private Item item;

    private Integer itemid;

    private String floornumber;

    private String structure;

    private Integer tier;

    private String batch;

    private String notout;

    private String notapertura;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getFloorid() {
        return floorid;
    }

    public void setFloorid(Integer floorid) {
        this.floorid = floorid;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getFloornumber() {
        return floornumber;
    }

    public void setFloornumber(String floornumber) {
        this.floornumber = floornumber;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure == null ? null : structure.trim();
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getNotout() {
        return notout;
    }

    public void setNotout(String notout) {
        this.notout = notout == null ? null : notout.trim();
    }

    public String getNotapertura() {
        return notapertura;
    }

    public void setNotapertura(String notapertura) {
        this.notapertura = notapertura == null ? null : notapertura.trim();
    }

    public Date getcreatetime() {
        return createtime;
    }

    public void setcreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", floorid=").append(floorid);
        sb.append(", item=").append(item);
        sb.append(", itemid=").append(itemid);
        sb.append(", floornumber=").append(floornumber);
        sb.append(", structure=").append(structure);
        sb.append(", tier=").append(tier);
        sb.append(", batch=").append(batch);
        sb.append(", notout=").append(notout);
        sb.append(", notapertura=").append(notapertura);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}