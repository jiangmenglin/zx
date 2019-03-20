package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class WebBanner implements Serializable {
    private Long tbwbId;

    private String tbwbTitle;

    private String tbwbThum1;

    private String tbwbThum2;

    private String tbwbLink;

    private Date tbwbAddTime;

    private String tbwbIntroduction;

    private Byte tbwbStatus;

    private String tbwbContent;

    private static final long serialVersionUID = 1L;

    public Long getTbwbId() {
        return tbwbId;
    }

    public void setTbwbId(Long tbwbId) {
        this.tbwbId = tbwbId;
    }

    public String getTbwbTitle() {
        return tbwbTitle;
    }

    public void setTbwbTitle(String tbwbTitle) {
        this.tbwbTitle = tbwbTitle == null ? null : tbwbTitle.trim();
    }

    public String getTbwbThum1() {
        return tbwbThum1;
    }

    public void setTbwbThum1(String tbwbThum1) {
        this.tbwbThum1 = tbwbThum1 == null ? null : tbwbThum1.trim();
    }

    public String getTbwbThum2() {
        return tbwbThum2;
    }

    public void setTbwbThum2(String tbwbThum2) {
        this.tbwbThum2 = tbwbThum2 == null ? null : tbwbThum2.trim();
    }

    public String getTbwbLink() {
        return tbwbLink;
    }

    public void setTbwbLink(String tbwbLink) {
        this.tbwbLink = tbwbLink == null ? null : tbwbLink.trim();
    }

    public Date getTbwbAddTime() {
        return tbwbAddTime;
    }

    public void setTbwbAddTime(Date tbwbAddTime) {
        this.tbwbAddTime = tbwbAddTime;
    }

    public String getTbwbIntroduction() {
        return tbwbIntroduction;
    }

    public void setTbwbIntroduction(String tbwbIntroduction) {
        this.tbwbIntroduction = tbwbIntroduction == null ? null : tbwbIntroduction.trim();
    }

    public Byte getTbwbStatus() {
        return tbwbStatus;
    }

    public void setTbwbStatus(Byte tbwbStatus) {
        this.tbwbStatus = tbwbStatus;
    }

    public String getTbwbContent() {
        return tbwbContent;
    }

    public void setTbwbContent(String tbwbContent) {
        this.tbwbContent = tbwbContent == null ? null : tbwbContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbwbId=").append(tbwbId);
        sb.append(", tbwbTitle=").append(tbwbTitle);
        sb.append(", tbwbThum1=").append(tbwbThum1);
        sb.append(", tbwbThum2=").append(tbwbThum2);
        sb.append(", tbwbLink=").append(tbwbLink);
        sb.append(", tbwbAddTime=").append(tbwbAddTime);
        sb.append(", tbwbIntroduction=").append(tbwbIntroduction);
        sb.append(", tbwbStatus=").append(tbwbStatus);
        sb.append(", tbwbContent=").append(tbwbContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}