package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class AppHelp implements Serializable {
    private Long tbahId;

    private String tbahName;

    private Date tbahAddTime;

    private Date tbahUpdateTime;

    private Byte tbahStatus;

    private String tbahContent;

    private static final long serialVersionUID = 1L;

    public Long getTbahId() {
        return tbahId;
    }

    public void setTbahId(Long tbahId) {
        this.tbahId = tbahId;
    }

    public String getTbahName() {
        return tbahName;
    }

    public void setTbahName(String tbahName) {
        this.tbahName = tbahName == null ? null : tbahName.trim();
    }

    public Date getTbahAddTime() {
        return tbahAddTime;
    }

    public void setTbahAddTime(Date tbahAddTime) {
        this.tbahAddTime = tbahAddTime;
    }

    public Date getTbahUpdateTime() {
        return tbahUpdateTime;
    }

    public void setTbahUpdateTime(Date tbahUpdateTime) {
        this.tbahUpdateTime = tbahUpdateTime;
    }

    public Byte getTbahStatus() {
        return tbahStatus;
    }

    public void setTbahStatus(Byte tbahStatus) {
        this.tbahStatus = tbahStatus;
    }

    public String getTbahContent() {
        return tbahContent;
    }

    public void setTbahContent(String tbahContent) {
        this.tbahContent = tbahContent == null ? null : tbahContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbahId=").append(tbahId);
        sb.append(", tbahName=").append(tbahName);
        sb.append(", tbahAddTime=").append(tbahAddTime);
        sb.append(", tbahUpdateTime=").append(tbahUpdateTime);
        sb.append(", tbahStatus=").append(tbahStatus);
        sb.append(", tbahContent=").append(tbahContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}