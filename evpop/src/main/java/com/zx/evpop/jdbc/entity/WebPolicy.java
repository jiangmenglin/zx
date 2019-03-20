package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class WebPolicy implements Serializable {
    private Long tbwpId;

    private String tbwpTitle;

    private String tbwpSource;

    private String tbwpThum1;

    private String tbwpThum2;

    private Date tbwpPolicyTime;

    private Date tbwpAddTime;

    private Date tbwpUpdateTime;

    private Byte tbwpStatus;

    private String tbwpContent;

    private static final long serialVersionUID = 1L;

    public Long getTbwpId() {
        return tbwpId;
    }

    public void setTbwpId(Long tbwpId) {
        this.tbwpId = tbwpId;
    }

    public String getTbwpTitle() {
        return tbwpTitle;
    }

    public void setTbwpTitle(String tbwpTitle) {
        this.tbwpTitle = tbwpTitle == null ? null : tbwpTitle.trim();
    }

    public String getTbwpSource() {
        return tbwpSource;
    }

    public void setTbwpSource(String tbwpSource) {
        this.tbwpSource = tbwpSource == null ? null : tbwpSource.trim();
    }

    public String getTbwpThum1() {
        return tbwpThum1;
    }

    public void setTbwpThum1(String tbwpThum1) {
        this.tbwpThum1 = tbwpThum1 == null ? null : tbwpThum1.trim();
    }

    public String getTbwpThum2() {
        return tbwpThum2;
    }

    public void setTbwpThum2(String tbwpThum2) {
        this.tbwpThum2 = tbwpThum2 == null ? null : tbwpThum2.trim();
    }

    public Date getTbwpPolicyTime() {
        return tbwpPolicyTime;
    }

    public void setTbwpPolicyTime(Date tbwpPolicyTime) {
        this.tbwpPolicyTime = tbwpPolicyTime;
    }

    public Date getTbwpAddTime() {
        return tbwpAddTime;
    }

    public void setTbwpAddTime(Date tbwpAddTime) {
        this.tbwpAddTime = tbwpAddTime;
    }

    public Date getTbwpUpdateTime() {
        return tbwpUpdateTime;
    }

    public void setTbwpUpdateTime(Date tbwpUpdateTime) {
        this.tbwpUpdateTime = tbwpUpdateTime;
    }

    public Byte getTbwpStatus() {
        return tbwpStatus;
    }

    public void setTbwpStatus(Byte tbwpStatus) {
        this.tbwpStatus = tbwpStatus;
    }

    public String getTbwpContent() {
        return tbwpContent;
    }

    public void setTbwpContent(String tbwpContent) {
        this.tbwpContent = tbwpContent == null ? null : tbwpContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbwpId=").append(tbwpId);
        sb.append(", tbwpTitle=").append(tbwpTitle);
        sb.append(", tbwpSource=").append(tbwpSource);
        sb.append(", tbwpThum1=").append(tbwpThum1);
        sb.append(", tbwpThum2=").append(tbwpThum2);
        sb.append(", tbwpPolicyTime=").append(tbwpPolicyTime);
        sb.append(", tbwpAddTime=").append(tbwpAddTime);
        sb.append(", tbwpUpdateTime=").append(tbwpUpdateTime);
        sb.append(", tbwpStatus=").append(tbwpStatus);
        sb.append(", tbwpContent=").append(tbwpContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}