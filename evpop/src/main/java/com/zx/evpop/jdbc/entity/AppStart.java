package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class AppStart implements Serializable {
    private Long tbasId;

    private String tbasName;

    private Integer tbasOrder;

    private String tbasThum;

    private String tbasIntroduction;

    private String tbasLink;

    private Date tbasUpdateTime;

    private Date tbasAddTime;

    private Byte tbasStatus;

    private String tbasContent;

    private static final long serialVersionUID = 1L;

    public Long getTbasId() {
        return tbasId;
    }

    public void setTbasId(Long tbasId) {
        this.tbasId = tbasId;
    }

    public String getTbasName() {
        return tbasName;
    }

    public void setTbasName(String tbasName) {
        this.tbasName = tbasName == null ? null : tbasName.trim();
    }

    public Integer getTbasOrder() {
        return tbasOrder;
    }

    public void setTbasOrder(Integer tbasOrder) {
        this.tbasOrder = tbasOrder;
    }

    public String getTbasThum() {
        return tbasThum;
    }

    public void setTbasThum(String tbasThum) {
        this.tbasThum = tbasThum == null ? null : tbasThum.trim();
    }

    public String getTbasIntroduction() {
        return tbasIntroduction;
    }

    public void setTbasIntroduction(String tbasIntroduction) {
        this.tbasIntroduction = tbasIntroduction == null ? null : tbasIntroduction.trim();
    }

    public String getTbasLink() {
        return tbasLink;
    }

    public void setTbasLink(String tbasLink) {
        this.tbasLink = tbasLink == null ? null : tbasLink.trim();
    }

    public Date getTbasUpdateTime() {
        return tbasUpdateTime;
    }

    public void setTbasUpdateTime(Date tbasUpdateTime) {
        this.tbasUpdateTime = tbasUpdateTime;
    }

    public Date getTbasAddTime() {
        return tbasAddTime;
    }

    public void setTbasAddTime(Date tbasAddTime) {
        this.tbasAddTime = tbasAddTime;
    }

    public Byte getTbasStatus() {
        return tbasStatus;
    }

    public void setTbasStatus(Byte tbasStatus) {
        this.tbasStatus = tbasStatus;
    }

    public String getTbasContent() {
        return tbasContent;
    }

    public void setTbasContent(String tbasContent) {
        this.tbasContent = tbasContent == null ? null : tbasContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbasId=").append(tbasId);
        sb.append(", tbasName=").append(tbasName);
        sb.append(", tbasOrder=").append(tbasOrder);
        sb.append(", tbasThum=").append(tbasThum);
        sb.append(", tbasIntroduction=").append(tbasIntroduction);
        sb.append(", tbasLink=").append(tbasLink);
        sb.append(", tbasUpdateTime=").append(tbasUpdateTime);
        sb.append(", tbasAddTime=").append(tbasAddTime);
        sb.append(", tbasStatus=").append(tbasStatus);
        sb.append(", tbasContent=").append(tbasContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}