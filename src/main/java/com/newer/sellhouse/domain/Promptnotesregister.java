package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class Promptnotesregister implements Serializable {
    private Integer promptnotesregisterid;

    private Integer offersumid;

    private Date promptdate;

    private String promptway;

    private String promptcontent;

    private static final long serialVersionUID = 1L;

    public Integer getPromptnotesregisterid() {
        return promptnotesregisterid;
    }

    public void setPromptnotesregisterid(Integer promptnotesregisterid) {
        this.promptnotesregisterid = promptnotesregisterid;
    }

    public Integer getOffersumid() {
        return offersumid;
    }

    public void setOffersumid(Integer offersumid) {
        this.offersumid = offersumid;
    }

    public Date getPromptdate() {
        return promptdate;
    }

    public void setPromptdate(Date promptdate) {
        this.promptdate = promptdate;
    }

    public String getPromptway() {
        return promptway;
    }

    public void setPromptway(String promptway) {
        this.promptway = promptway == null ? null : promptway.trim();
    }

    public String getPromptcontent() {
        return promptcontent;
    }

    public void setPromptcontent(String promptcontent) {
        this.promptcontent = promptcontent == null ? null : promptcontent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", promptnotesregisterid=").append(promptnotesregisterid);
        sb.append(", offersumid=").append(offersumid);
        sb.append(", promptdate=").append(promptdate);
        sb.append(", promptway=").append(promptway);
        sb.append(", promptcontent=").append(promptcontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}