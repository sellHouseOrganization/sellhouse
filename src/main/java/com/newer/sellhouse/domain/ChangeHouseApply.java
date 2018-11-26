package com.newer.sellhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class ChangeHouseApply implements Serializable {
    private Integer changeHouseApplyid;
    private Date changeHouseApplyDate;
    private Integer admitBuyid;
    private String changeType;
    private String causeClassifiCation;
    private String reasonsForChange;
    private Integer checkSuccessNo;
    private Integer scrapNo;

    public Integer getChangeHouseApplyid() {
        return changeHouseApplyid;
    }

    public void setChangeHouseApplyid(Integer changeHouseApplyid) {
        this.changeHouseApplyid = changeHouseApplyid;
    }

    public Date getChangeHouseApplyDate() {
        return changeHouseApplyDate;
    }

    public void setChangeHouseApplyDate(Date changeHouseApplyDate) {
        this.changeHouseApplyDate = changeHouseApplyDate;
    }

    public Integer getAdmitBuyid() {
        return admitBuyid;
    }

    public void setAdmitBuyid(Integer admitBuyid) {
        this.admitBuyid = admitBuyid;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getCauseClassifiCation() {
        return causeClassifiCation;
    }

    public void setCauseClassifiCation(String causeClassifiCation) {
        this.causeClassifiCation = causeClassifiCation;
    }

    public String getReasonsForChange() {
        return reasonsForChange;
    }

    public void setReasonsForChange(String reasonsForChange) {
        this.reasonsForChange = reasonsForChange;
    }

    public Integer getCheckSuccessNo() {
        return checkSuccessNo;
    }

    public void setCheckSuccessNo(Integer checkSuccessNo) {
        this.checkSuccessNo = checkSuccessNo;
    }

    public Integer getScrapNo() {
        return scrapNo;
    }

    public void setScrapNo(Integer scrapNo) {
        this.scrapNo = scrapNo;
    }
}
