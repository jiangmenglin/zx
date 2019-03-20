package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class LongFaulttype implements Serializable {
    private Long tblfId;

    private String tblfName;

    private String tblfFlag;

    private Short tblfPriority;

    private Date tblfAddTime;

    private Date tblfUpdateTime;

    private Byte tblfStatus;

    private static final long serialVersionUID = 1L;

    public Long getTblfId() {
        return tblfId;
    }

    public void setTblfId(Long tblfId) {
        this.tblfId = tblfId;
    }

    public String getTblfName() {
        return tblfName;
    }

    public void setTblfName(String tblfName) {
        this.tblfName = tblfName == null ? null : tblfName.trim();
    }

    public String getTblfFlag() {
        return tblfFlag;
    }

    public void setTblfFlag(String tblfFlag) {
        this.tblfFlag = tblfFlag == null ? null : tblfFlag.trim();
    }

    public Short getTblfPriority() {
        return tblfPriority;
    }

    public void setTblfPriority(Short tblfPriority) {
        this.tblfPriority = tblfPriority;
    }

    public Date getTblfAddTime() {
        return tblfAddTime;
    }

    public void setTblfAddTime(Date tblfAddTime) {
        this.tblfAddTime = tblfAddTime;
    }

    public Date getTblfUpdateTime() {
        return tblfUpdateTime;
    }

    public void setTblfUpdateTime(Date tblfUpdateTime) {
        this.tblfUpdateTime = tblfUpdateTime;
    }

    public Byte getTblfStatus() {
        return tblfStatus;
    }

    public void setTblfStatus(Byte tblfStatus) {
        this.tblfStatus = tblfStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tblfId=").append(tblfId);
        sb.append(", tblfName=").append(tblfName);
        sb.append(", tblfFlag=").append(tblfFlag);
        sb.append(", tblfPriority=").append(tblfPriority);
        sb.append(", tblfAddTime=").append(tblfAddTime);
        sb.append(", tblfUpdateTime=").append(tblfUpdateTime);
        sb.append(", tblfStatus=").append(tblfStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}