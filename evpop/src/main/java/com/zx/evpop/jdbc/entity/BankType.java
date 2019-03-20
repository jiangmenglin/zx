package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class BankType implements Serializable {
    private Long tbbtId;

    private String tbbtName;

    private String tbbtFlag;

    private Short tbbtPriority;

    private Date tbbtAddTime;

    private Date tbbtUpdateTime;

    private Byte tbbtStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbbtId() {
        return tbbtId;
    }

    public void setTbbtId(Long tbbtId) {
        this.tbbtId = tbbtId;
    }

    public String getTbbtName() {
        return tbbtName;
    }

    public void setTbbtName(String tbbtName) {
        this.tbbtName = tbbtName == null ? null : tbbtName.trim();
    }

    public String getTbbtFlag() {
        return tbbtFlag;
    }

    public void setTbbtFlag(String tbbtFlag) {
        this.tbbtFlag = tbbtFlag == null ? null : tbbtFlag.trim();
    }

    public Short getTbbtPriority() {
        return tbbtPriority;
    }

    public void setTbbtPriority(Short tbbtPriority) {
        this.tbbtPriority = tbbtPriority;
    }

    public Date getTbbtAddTime() {
        return tbbtAddTime;
    }

    public void setTbbtAddTime(Date tbbtAddTime) {
        this.tbbtAddTime = tbbtAddTime;
    }

    public Date getTbbtUpdateTime() {
        return tbbtUpdateTime;
    }

    public void setTbbtUpdateTime(Date tbbtUpdateTime) {
        this.tbbtUpdateTime = tbbtUpdateTime;
    }

    public Byte getTbbtStatus() {
        return tbbtStatus;
    }

    public void setTbbtStatus(Byte tbbtStatus) {
        this.tbbtStatus = tbbtStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbbtId=").append(tbbtId);
        sb.append(", tbbtName=").append(tbbtName);
        sb.append(", tbbtFlag=").append(tbbtFlag);
        sb.append(", tbbtPriority=").append(tbbtPriority);
        sb.append(", tbbtAddTime=").append(tbbtAddTime);
        sb.append(", tbbtUpdateTime=").append(tbbtUpdateTime);
        sb.append(", tbbtStatus=").append(tbbtStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}