package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class AppBanner implements Serializable {
    private Long tbabId;

    private String tbabTitle;

    private Integer tbabOrder;

    private String tbabThum;

    private String tbabIntroduction;

    private String tbabLink;

    private Date tbabAddTime;

    private Date tbabUpdateTime;

    private Byte tbabStatus;

    private String tbabContent;

    private static final long serialVersionUID = 1L;

    public Long getTbabId() {
        return tbabId;
    }

    public void setTbabId(Long tbabId) {
        this.tbabId = tbabId;
    }

    public String getTbabTitle() {
        return tbabTitle;
    }

    public void setTbabTitle(String tbabTitle) {
        this.tbabTitle = tbabTitle == null ? null : tbabTitle.trim();
    }

    public Integer getTbabOrder() {
        return tbabOrder;
    }

    public void setTbabOrder(Integer tbabOrder) {
        this.tbabOrder = tbabOrder;
    }

    public String getTbabThum() {
        return tbabThum;
    }

    public void setTbabThum(String tbabThum) {
        this.tbabThum = tbabThum == null ? null : tbabThum.trim();
    }

    public String getTbabIntroduction() {
        return tbabIntroduction;
    }

    public void setTbabIntroduction(String tbabIntroduction) {
        this.tbabIntroduction = tbabIntroduction == null ? null : tbabIntroduction.trim();
    }

    public String getTbabLink() {
        return tbabLink;
    }

    public void setTbabLink(String tbabLink) {
        this.tbabLink = tbabLink == null ? null : tbabLink.trim();
    }

    public Date getTbabAddTime() {
        return tbabAddTime;
    }

    public void setTbabAddTime(Date tbabAddTime) {
        this.tbabAddTime = tbabAddTime;
    }

    public Date getTbabUpdateTime() {
        return tbabUpdateTime;
    }

    public void setTbabUpdateTime(Date tbabUpdateTime) {
        this.tbabUpdateTime = tbabUpdateTime;
    }

    public Byte getTbabStatus() {
        return tbabStatus;
    }

    public void setTbabStatus(Byte tbabStatus) {
        this.tbabStatus = tbabStatus;
    }

    public String getTbabContent() {
        return tbabContent;
    }

    public void setTbabContent(String tbabContent) {
        this.tbabContent = tbabContent == null ? null : tbabContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbabId=").append(tbabId);
        sb.append(", tbabTitle=").append(tbabTitle);
        sb.append(", tbabOrder=").append(tbabOrder);
        sb.append(", tbabThum=").append(tbabThum);
        sb.append(", tbabIntroduction=").append(tbabIntroduction);
        sb.append(", tbabLink=").append(tbabLink);
        sb.append(", tbabAddTime=").append(tbabAddTime);
        sb.append(", tbabUpdateTime=").append(tbabUpdateTime);
        sb.append(", tbabStatus=").append(tbabStatus);
        sb.append(", tbabContent=").append(tbabContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}