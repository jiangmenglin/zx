package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Dope implements Serializable {
    private Long tbdId;

    private String tbdContent;

    private Integer tbdManage;

    private String tbdName;

    private Long tbdTask;

    private String tbdFlag;

    private String tbdRemark;

    private Date tbdUpdateTime;

    private Date tbdAddTime;

    private Byte tbdStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbdId() {
        return tbdId;
    }

    public void setTbdId(Long tbdId) {
        this.tbdId = tbdId;
    }

    public String getTbdContent() {
        return tbdContent;
    }

    public void setTbdContent(String tbdContent) {
        this.tbdContent = tbdContent == null ? null : tbdContent.trim();
    }

    public Integer getTbdManage() {
        return tbdManage;
    }

    public void setTbdManage(Integer tbdManage) {
        this.tbdManage = tbdManage;
    }

    public String getTbdName() {
        return tbdName;
    }

    public void setTbdName(String tbdName) {
        this.tbdName = tbdName == null ? null : tbdName.trim();
    }

    public Long getTbdTask() {
        return tbdTask;
    }

    public void setTbdTask(Long tbdTask) {
        this.tbdTask = tbdTask;
    }

    public String getTbdFlag() {
        return tbdFlag;
    }

    public void setTbdFlag(String tbdFlag) {
        this.tbdFlag = tbdFlag == null ? null : tbdFlag.trim();
    }

    public String getTbdRemark() {
        return tbdRemark;
    }

    public void setTbdRemark(String tbdRemark) {
        this.tbdRemark = tbdRemark == null ? null : tbdRemark.trim();
    }

    public Date getTbdUpdateTime() {
        return tbdUpdateTime;
    }

    public void setTbdUpdateTime(Date tbdUpdateTime) {
        this.tbdUpdateTime = tbdUpdateTime;
    }

    public Date getTbdAddTime() {
        return tbdAddTime;
    }

    public void setTbdAddTime(Date tbdAddTime) {
        this.tbdAddTime = tbdAddTime;
    }

    public Byte getTbdStatus() {
        return tbdStatus;
    }

    public void setTbdStatus(Byte tbdStatus) {
        this.tbdStatus = tbdStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbdId=").append(tbdId);
        sb.append(", tbdContent=").append(tbdContent);
        sb.append(", tbdManage=").append(tbdManage);
        sb.append(", tbdName=").append(tbdName);
        sb.append(", tbdTask=").append(tbdTask);
        sb.append(", tbdFlag=").append(tbdFlag);
        sb.append(", tbdRemark=").append(tbdRemark);
        sb.append(", tbdUpdateTime=").append(tbdUpdateTime);
        sb.append(", tbdAddTime=").append(tbdAddTime);
        sb.append(", tbdStatus=").append(tbdStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}