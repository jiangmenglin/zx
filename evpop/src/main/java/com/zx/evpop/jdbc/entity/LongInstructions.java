package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class LongInstructions implements Serializable {
    private Long tbliId;

    private Long tbliHost;

    private String tbliName;

    private String tbliflag;

    private String tbliDescribe;

    private String tbliNumber;

    private Date tbliAddTime;

    private Date tbliUpdateTime;

    private Short tbliStatus;

    private String tbliContent;

    private static final long serialVersionUID = 1L;

    public Long getTbliId() {
        return tbliId;
    }

    public void setTbliId(Long tbliId) {
        this.tbliId = tbliId;
    }

    public Long getTbliHost() {
        return tbliHost;
    }

    public void setTbliHost(Long tbliHost) {
        this.tbliHost = tbliHost;
    }

    public String getTbliName() {
        return tbliName;
    }

    public void setTbliName(String tbliName) {
        this.tbliName = tbliName == null ? null : tbliName.trim();
    }

    public String getTbliflag() {
        return tbliflag;
    }

    public void setTbliflag(String tbliflag) {
        this.tbliflag = tbliflag == null ? null : tbliflag.trim();
    }

    public String getTbliDescribe() {
        return tbliDescribe;
    }

    public void setTbliDescribe(String tbliDescribe) {
        this.tbliDescribe = tbliDescribe == null ? null : tbliDescribe.trim();
    }

    public String getTbliNumber() {
        return tbliNumber;
    }

    public void setTbliNumber(String tbliNumber) {
        this.tbliNumber = tbliNumber == null ? null : tbliNumber.trim();
    }

    public Date getTbliAddTime() {
        return tbliAddTime;
    }

    public void setTbliAddTime(Date tbliAddTime) {
        this.tbliAddTime = tbliAddTime;
    }

    public Date getTbliUpdateTime() {
        return tbliUpdateTime;
    }

    public void setTbliUpdateTime(Date tbliUpdateTime) {
        this.tbliUpdateTime = tbliUpdateTime;
    }

    public Short getTbliStatus() {
        return tbliStatus;
    }

    public void setTbliStatus(Short tbliStatus) {
        this.tbliStatus = tbliStatus;
    }

    public String getTbliContent() {
        return tbliContent;
    }

    public void setTbliContent(String tbliContent) {
        this.tbliContent = tbliContent == null ? null : tbliContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbliId=").append(tbliId);
        sb.append(", tbliHost=").append(tbliHost);
        sb.append(", tbliName=").append(tbliName);
        sb.append(", tbliflag=").append(tbliflag);
        sb.append(", tbliDescribe=").append(tbliDescribe);
        sb.append(", tbliNumber=").append(tbliNumber);
        sb.append(", tbliAddTime=").append(tbliAddTime);
        sb.append(", tbliUpdateTime=").append(tbliUpdateTime);
        sb.append(", tbliStatus=").append(tbliStatus);
        sb.append(", tbliContent=").append(tbliContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}