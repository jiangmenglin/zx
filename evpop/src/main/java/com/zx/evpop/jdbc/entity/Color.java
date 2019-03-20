package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Color implements Serializable {
    private Integer tbcId;

    private String tbcName;

    private Long tbcModel;

    private String tbcFlag;

    private String tbcImage;

    private Date tbcUpdateTime;

    private Date tbcAddTime;

    private Byte tbcStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbcId() {
        return tbcId;
    }

    public void setTbcId(Integer tbcId) {
        this.tbcId = tbcId;
    }

    public String getTbcName() {
        return tbcName;
    }

    public void setTbcName(String tbcName) {
        this.tbcName = tbcName == null ? null : tbcName.trim();
    }

    public Long getTbcModel() {
        return tbcModel;
    }

    public void setTbcModel(Long tbcModel) {
        this.tbcModel = tbcModel;
    }

    public String getTbcFlag() {
        return tbcFlag;
    }

    public void setTbcFlag(String tbcFlag) {
        this.tbcFlag = tbcFlag == null ? null : tbcFlag.trim();
    }

    public String getTbcImage() {
        return tbcImage;
    }

    public void setTbcImage(String tbcImage) {
        this.tbcImage = tbcImage == null ? null : tbcImage.trim();
    }

    public Date getTbcUpdateTime() {
        return tbcUpdateTime;
    }

    public void setTbcUpdateTime(Date tbcUpdateTime) {
        this.tbcUpdateTime = tbcUpdateTime;
    }

    public Date getTbcAddTime() {
        return tbcAddTime;
    }

    public void setTbcAddTime(Date tbcAddTime) {
        this.tbcAddTime = tbcAddTime;
    }

    public Byte getTbcStatus() {
        return tbcStatus;
    }

    public void setTbcStatus(Byte tbcStatus) {
        this.tbcStatus = tbcStatus;
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
        sb.append(", tbcId=").append(tbcId);
        sb.append(", tbcName=").append(tbcName);
        sb.append(", tbcModel=").append(tbcModel);
        sb.append(", tbcFlag=").append(tbcFlag);
        sb.append(", tbcImage=").append(tbcImage);
        sb.append(", tbcUpdateTime=").append(tbcUpdateTime);
        sb.append(", tbcAddTime=").append(tbcAddTime);
        sb.append(", tbcStatus=").append(tbcStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}