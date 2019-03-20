package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Model implements Serializable {
    private Integer tbmId;

    private String tbmName;

    private String tbmFlag;

    private Byte tbmType;

    private Byte tbmFile;

    private String tbmImage;

    private Integer tbmPedestal;

    private Integer tbmAlarm;

    private Integer tbmMileage;

    private Date tbmUpdateTime;

    private Date tbmAddTime;

    private Byte tbmStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbmId() {
        return tbmId;
    }

    public void setTbmId(Integer tbmId) {
        this.tbmId = tbmId;
    }

    public String getTbmName() {
        return tbmName;
    }

    public void setTbmName(String tbmName) {
        this.tbmName = tbmName == null ? null : tbmName.trim();
    }

    public String getTbmFlag() {
        return tbmFlag;
    }

    public void setTbmFlag(String tbmFlag) {
        this.tbmFlag = tbmFlag == null ? null : tbmFlag.trim();
    }

    public Byte getTbmType() {
        return tbmType;
    }

    public void setTbmType(Byte tbmType) {
        this.tbmType = tbmType;
    }

    public Byte getTbmFile() {
        return tbmFile;
    }

    public void setTbmFile(Byte tbmFile) {
        this.tbmFile = tbmFile;
    }

    public String getTbmImage() {
        return tbmImage;
    }

    public void setTbmImage(String tbmImage) {
        this.tbmImage = tbmImage == null ? null : tbmImage.trim();
    }

    public Integer getTbmPedestal() {
        return tbmPedestal;
    }

    public void setTbmPedestal(Integer tbmPedestal) {
        this.tbmPedestal = tbmPedestal;
    }

    public Integer getTbmAlarm() {
        return tbmAlarm;
    }

    public void setTbmAlarm(Integer tbmAlarm) {
        this.tbmAlarm = tbmAlarm;
    }

    public Integer getTbmMileage() {
        return tbmMileage;
    }

    public void setTbmMileage(Integer tbmMileage) {
        this.tbmMileage = tbmMileage;
    }

    public Date getTbmUpdateTime() {
        return tbmUpdateTime;
    }

    public void setTbmUpdateTime(Date tbmUpdateTime) {
        this.tbmUpdateTime = tbmUpdateTime;
    }

    public Date getTbmAddTime() {
        return tbmAddTime;
    }

    public void setTbmAddTime(Date tbmAddTime) {
        this.tbmAddTime = tbmAddTime;
    }

    public Byte getTbmStatus() {
        return tbmStatus;
    }

    public void setTbmStatus(Byte tbmStatus) {
        this.tbmStatus = tbmStatus;
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
        sb.append(", tbmId=").append(tbmId);
        sb.append(", tbmName=").append(tbmName);
        sb.append(", tbmFlag=").append(tbmFlag);
        sb.append(", tbmType=").append(tbmType);
        sb.append(", tbmFile=").append(tbmFile);
        sb.append(", tbmImage=").append(tbmImage);
        sb.append(", tbmPedestal=").append(tbmPedestal);
        sb.append(", tbmAlarm=").append(tbmAlarm);
        sb.append(", tbmMileage=").append(tbmMileage);
        sb.append(", tbmUpdateTime=").append(tbmUpdateTime);
        sb.append(", tbmAddTime=").append(tbmAddTime);
        sb.append(", tbmStatus=").append(tbmStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}