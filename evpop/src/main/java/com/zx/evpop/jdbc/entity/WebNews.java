package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class WebNews implements Serializable {
    private Long tbwnId;

    private String tbwnTitle;

    private String tbwnSource;

    private String tbwnThum1;

    private String tbwnThum2;

    private Date tbwnNewsTime;

    private Date tbwnAddTime;

    private Date tbwnUpdateTime;

    private Byte tbwnStatus;

    private String tbwnContent;

    private static final long serialVersionUID = 1L;

    public Long getTbwnId() {
        return tbwnId;
    }

    public void setTbwnId(Long tbwnId) {
        this.tbwnId = tbwnId;
    }

    public String getTbwnTitle() {
        return tbwnTitle;
    }

    public void setTbwnTitle(String tbwnTitle) {
        this.tbwnTitle = tbwnTitle == null ? null : tbwnTitle.trim();
    }

    public String getTbwnSource() {
        return tbwnSource;
    }

    public void setTbwnSource(String tbwnSource) {
        this.tbwnSource = tbwnSource == null ? null : tbwnSource.trim();
    }

    public String getTbwnThum1() {
        return tbwnThum1;
    }

    public void setTbwnThum1(String tbwnThum1) {
        this.tbwnThum1 = tbwnThum1 == null ? null : tbwnThum1.trim();
    }

    public String getTbwnThum2() {
        return tbwnThum2;
    }

    public void setTbwnThum2(String tbwnThum2) {
        this.tbwnThum2 = tbwnThum2 == null ? null : tbwnThum2.trim();
    }

    public Date getTbwnNewsTime() {
        return tbwnNewsTime;
    }

    public void setTbwnNewsTime(Date tbwnNewsTime) {
        this.tbwnNewsTime = tbwnNewsTime;
    }

    public Date getTbwnAddTime() {
        return tbwnAddTime;
    }

    public void setTbwnAddTime(Date tbwnAddTime) {
        this.tbwnAddTime = tbwnAddTime;
    }

    public Date getTbwnUpdateTime() {
        return tbwnUpdateTime;
    }

    public void setTbwnUpdateTime(Date tbwnUpdateTime) {
        this.tbwnUpdateTime = tbwnUpdateTime;
    }

    public Byte getTbwnStatus() {
        return tbwnStatus;
    }

    public void setTbwnStatus(Byte tbwnStatus) {
        this.tbwnStatus = tbwnStatus;
    }

    public String getTbwnContent() {
        return tbwnContent;
    }

    public void setTbwnContent(String tbwnContent) {
        this.tbwnContent = tbwnContent == null ? null : tbwnContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbwnId=").append(tbwnId);
        sb.append(", tbwnTitle=").append(tbwnTitle);
        sb.append(", tbwnSource=").append(tbwnSource);
        sb.append(", tbwnThum1=").append(tbwnThum1);
        sb.append(", tbwnThum2=").append(tbwnThum2);
        sb.append(", tbwnNewsTime=").append(tbwnNewsTime);
        sb.append(", tbwnAddTime=").append(tbwnAddTime);
        sb.append(", tbwnUpdateTime=").append(tbwnUpdateTime);
        sb.append(", tbwnStatus=").append(tbwnStatus);
        sb.append(", tbwnContent=").append(tbwnContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}