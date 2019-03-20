package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Rule implements Serializable {
    private Integer tbrId;

    private String tbrName;

    private Integer tbrEvent;

    private Integer tbrRepeat;

    private Long tbrInfo;

    private Integer tbrAmount;

    private String tbrProfile;

    private String tbrCondition;

    private String tbrIntegral;

    private String tbrCoupon;

    private String tbrDerate;

    private Date tbrStart;

    private Date tbrEnd;

    private Date tbrUpdateTime;

    private Date tbrAddTime;

    private Byte tbrStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbrId() {
        return tbrId;
    }

    public void setTbrId(Integer tbrId) {
        this.tbrId = tbrId;
    }

    public String getTbrName() {
        return tbrName;
    }

    public void setTbrName(String tbrName) {
        this.tbrName = tbrName == null ? null : tbrName.trim();
    }

    public Integer getTbrEvent() {
        return tbrEvent;
    }

    public void setTbrEvent(Integer tbrEvent) {
        this.tbrEvent = tbrEvent;
    }

    public Integer getTbrRepeat() {
        return tbrRepeat;
    }

    public void setTbrRepeat(Integer tbrRepeat) {
        this.tbrRepeat = tbrRepeat;
    }

    public Long getTbrInfo() {
        return tbrInfo;
    }

    public void setTbrInfo(Long tbrInfo) {
        this.tbrInfo = tbrInfo;
    }

    public Integer getTbrAmount() {
        return tbrAmount;
    }

    public void setTbrAmount(Integer tbrAmount) {
        this.tbrAmount = tbrAmount;
    }

    public String getTbrProfile() {
        return tbrProfile;
    }

    public void setTbrProfile(String tbrProfile) {
        this.tbrProfile = tbrProfile == null ? null : tbrProfile.trim();
    }

    public String getTbrCondition() {
        return tbrCondition;
    }

    public void setTbrCondition(String tbrCondition) {
        this.tbrCondition = tbrCondition == null ? null : tbrCondition.trim();
    }

    public String getTbrIntegral() {
        return tbrIntegral;
    }

    public void setTbrIntegral(String tbrIntegral) {
        this.tbrIntegral = tbrIntegral == null ? null : tbrIntegral.trim();
    }

    public String getTbrCoupon() {
        return tbrCoupon;
    }

    public void setTbrCoupon(String tbrCoupon) {
        this.tbrCoupon = tbrCoupon == null ? null : tbrCoupon.trim();
    }

    public String getTbrDerate() {
        return tbrDerate;
    }

    public void setTbrDerate(String tbrDerate) {
        this.tbrDerate = tbrDerate == null ? null : tbrDerate.trim();
    }

    public Date getTbrStart() {
        return tbrStart;
    }

    public void setTbrStart(Date tbrStart) {
        this.tbrStart = tbrStart;
    }

    public Date getTbrEnd() {
        return tbrEnd;
    }

    public void setTbrEnd(Date tbrEnd) {
        this.tbrEnd = tbrEnd;
    }

    public Date getTbrUpdateTime() {
        return tbrUpdateTime;
    }

    public void setTbrUpdateTime(Date tbrUpdateTime) {
        this.tbrUpdateTime = tbrUpdateTime;
    }

    public Date getTbrAddTime() {
        return tbrAddTime;
    }

    public void setTbrAddTime(Date tbrAddTime) {
        this.tbrAddTime = tbrAddTime;
    }

    public Byte getTbrStatus() {
        return tbrStatus;
    }

    public void setTbrStatus(Byte tbrStatus) {
        this.tbrStatus = tbrStatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbrId=").append(tbrId);
        sb.append(", tbrName=").append(tbrName);
        sb.append(", tbrEvent=").append(tbrEvent);
        sb.append(", tbrRepeat=").append(tbrRepeat);
        sb.append(", tbrInfo=").append(tbrInfo);
        sb.append(", tbrAmount=").append(tbrAmount);
        sb.append(", tbrProfile=").append(tbrProfile);
        sb.append(", tbrCondition=").append(tbrCondition);
        sb.append(", tbrIntegral=").append(tbrIntegral);
        sb.append(", tbrCoupon=").append(tbrCoupon);
        sb.append(", tbrDerate=").append(tbrDerate);
        sb.append(", tbrStart=").append(tbrStart);
        sb.append(", tbrEnd=").append(tbrEnd);
        sb.append(", tbrUpdateTime=").append(tbrUpdateTime);
        sb.append(", tbrAddTime=").append(tbrAddTime);
        sb.append(", tbrStatus=").append(tbrStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}