package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class AppProtocol implements Serializable {
    private Long tbapId;

    private String tbapName;

    private Short tbapType;

    private Date tbapAddTime;

    private Date tbapUpdateTime;

    private Byte tbapStatus;

    private String tbapContent;

    private static final long serialVersionUID = 1L;

    public Long getTbapId() {
        return tbapId;
    }

    public void setTbapId(Long tbapId) {
        this.tbapId = tbapId;
    }

    public String getTbapName() {
        return tbapName;
    }

    public void setTbapName(String tbapName) {
        this.tbapName = tbapName == null ? null : tbapName.trim();
    }

    public Short getTbapType() {
        return tbapType;
    }

    public void setTbapType(Short tbapType) {
        this.tbapType = tbapType;
    }

    public Date getTbapAddTime() {
        return tbapAddTime;
    }

    public void setTbapAddTime(Date tbapAddTime) {
        this.tbapAddTime = tbapAddTime;
    }

    public Date getTbapUpdateTime() {
        return tbapUpdateTime;
    }

    public void setTbapUpdateTime(Date tbapUpdateTime) {
        this.tbapUpdateTime = tbapUpdateTime;
    }

    public Byte getTbapStatus() {
        return tbapStatus;
    }

    public void setTbapStatus(Byte tbapStatus) {
        this.tbapStatus = tbapStatus;
    }

    public String getTbapContent() {
        return tbapContent;
    }

    public void setTbapContent(String tbapContent) {
        this.tbapContent = tbapContent == null ? null : tbapContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbapId=").append(tbapId);
        sb.append(", tbapName=").append(tbapName);
        sb.append(", tbapType=").append(tbapType);
        sb.append(", tbapAddTime=").append(tbapAddTime);
        sb.append(", tbapUpdateTime=").append(tbapUpdateTime);
        sb.append(", tbapStatus=").append(tbapStatus);
        sb.append(", tbapContent=").append(tbapContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}