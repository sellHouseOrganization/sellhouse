package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Floor implements Serializable {
    private Integer floorid;

    private Integer itemid;

    private Integer floornumber;

    private String structure;

    private Integer tier;

    private String batch;

    private String notout;

    private String notapertura;

    private Date 
creationdate;

    private static final long serialVersionUID = 1L;

    public Integer getFloorid() {
        return floorid;
    }

    public void setFloorid(Integer floorid) {
        this.floorid = floorid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getFloornumber() {
        return floornumber;
    }

    public void setFloornumber(Integer floornumber) {
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

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", floorid=").append(floorid);
        sb.append(", itemid=").append(itemid);
        sb.append(", floornumber=").append(floornumber);
        sb.append(", structure=").append(structure);
        sb.append(", tier=").append(tier);
        sb.append(", batch=").append(batch);
        sb.append(", notout=").append(notout);
        sb.append(", notapertura=").append(notapertura);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}