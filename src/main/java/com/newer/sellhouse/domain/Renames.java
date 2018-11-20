package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Renames implements Serializable {
    private Integer renameid;

    private Integer oldclientid;
    private Client client1;

    private Integer newclientid;
    private Client client2;
    private Date renamedate;

    private Integer admitbuyid;

    private static final long serialVersionUID = 1L;

    public Integer getRenameid() {
        return renameid;
    }

    public void setRenameid(Integer renameid) {
        this.renameid = renameid;
    }

    public Integer getOldclientid() {
        return oldclientid;
    }

    public void setOldclientid(Integer oldclientid) {
        this.oldclientid = oldclientid;
    }

    public Integer getNewclientid() {
        return newclientid;
    }

    public void setNewclientid(Integer newclientid) {
        this.newclientid = newclientid;
    }

    public Date getRenamedate() {
        return renamedate;
    }

    public void setRenamedate(Date renamedate) {
        this.renamedate = renamedate;
    }

    public Integer getAdmitbuyid() {
        return admitbuyid;
    }

    public void setAdmitbuyid(Integer admitbuyid) {
        this.admitbuyid = admitbuyid;
    }

    public Client getClient1() {
        return client1;
    }

    public void setClient1(Client client1) {
        this.client1 = client1;
    }

    public Client getClient2() {
        return client2;
    }

    public void setClient2(Client client2) {
        this.client2 = client2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", renameid=").append(renameid);
        sb.append(", oldclientid=").append(oldclientid);
        sb.append(", newclientid=").append(newclientid);
        sb.append(", renamedate=").append(renamedate);
        sb.append(", admitbuyid=").append(admitbuyid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}