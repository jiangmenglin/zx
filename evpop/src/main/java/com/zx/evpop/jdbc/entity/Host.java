package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Host implements Serializable {
    private Integer shId;

    private String shName;

    private String shFlag;

    private Integer shOper;

    private Double shLon;

    private Double shLat;

    private Date shUpdateTime;

    private Date shAddTime;

    private Byte shState;

    private Byte shStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getShId() {
        return shId;
    }

    public void setShId(Integer shId) {
        this.shId = shId;
    }

    public String getShName() {
        return shName;
    }

    public void setShName(String shName) {
        this.shName = shName == null ? null : shName.trim();
    }

    public String getShFlag() {
        return shFlag;
    }

    public void setShFlag(String shFlag) {
        this.shFlag = shFlag == null ? null : shFlag.trim();
    }

    public Integer getShOper() {
        return shOper;
    }

    public void setShOper(Integer shOper) {
        this.shOper = shOper;
    }

    public Double getShLon() {
        return shLon;
    }

    public void setShLon(Double shLon) {
        this.shLon = shLon;
    }

    public Double getShLat() {
        return shLat;
    }

    public void setShLat(Double shLat) {
        this.shLat = shLat;
    }

    public Date getShUpdateTime() {
        return shUpdateTime;
    }

    public void setShUpdateTime(Date shUpdateTime) {
        this.shUpdateTime = shUpdateTime;
    }

    public Date getShAddTime() {
        return shAddTime;
    }

    public void setShAddTime(Date shAddTime) {
        this.shAddTime = shAddTime;
    }

    public Byte getShState() {
        return shState;
    }

    public void setShState(Byte shState) {
        this.shState = shState;
    }

    public Byte getShStatus() {
        return shStatus;
    }

    public void setShStatus(Byte shStatus) {
        this.shStatus = shStatus;
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
        sb.append(", shId=").append(shId);
        sb.append(", shName=").append(shName);
        sb.append(", shFlag=").append(shFlag);
        sb.append(", shOper=").append(shOper);
        sb.append(", shLon=").append(shLon);
        sb.append(", shLat=").append(shLat);
        sb.append(", shUpdateTime=").append(shUpdateTime);
        sb.append(", shAddTime=").append(shAddTime);
        sb.append(", shState=").append(shState);
        sb.append(", shStatus=").append(shStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}