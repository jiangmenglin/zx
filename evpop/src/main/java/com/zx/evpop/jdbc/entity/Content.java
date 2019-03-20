package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Content implements Serializable {
    private Integer tbcId;

    private String tbcTitle;

    private Integer tbcParent;

    private String tbcFlag;

    private Integer tbcOrder;

    private String tbcThum;

    private String tbcIntroduction;

    private String tbcKeywords;

    private String tbcImages;

    private String tbcFile;

    private String tbcLink;

    private Date tbcAddTime;

    private Date tbcUpdateTime;

    private Integer tbcViewS;

    private Integer tbcReplyS;

    private Integer tbcCollectS;

    private Integer tbcPraiseS;

    private Byte tbcStatus;

    private String tbcContent;

    private static final long serialVersionUID = 1L;

    public Integer getTbcId() {
        return tbcId;
    }

    public void setTbcId(Integer tbcId) {
        this.tbcId = tbcId;
    }

    public String getTbcTitle() {
        return tbcTitle;
    }

    public void setTbcTitle(String tbcTitle) {
        this.tbcTitle = tbcTitle == null ? null : tbcTitle.trim();
    }

    public Integer getTbcParent() {
        return tbcParent;
    }

    public void setTbcParent(Integer tbcParent) {
        this.tbcParent = tbcParent;
    }

    public String getTbcFlag() {
        return tbcFlag;
    }

    public void setTbcFlag(String tbcFlag) {
        this.tbcFlag = tbcFlag == null ? null : tbcFlag.trim();
    }

    public Integer getTbcOrder() {
        return tbcOrder;
    }

    public void setTbcOrder(Integer tbcOrder) {
        this.tbcOrder = tbcOrder;
    }

    public String getTbcThum() {
        return tbcThum;
    }

    public void setTbcThum(String tbcThum) {
        this.tbcThum = tbcThum == null ? null : tbcThum.trim();
    }

    public String getTbcIntroduction() {
        return tbcIntroduction;
    }

    public void setTbcIntroduction(String tbcIntroduction) {
        this.tbcIntroduction = tbcIntroduction == null ? null : tbcIntroduction.trim();
    }

    public String getTbcKeywords() {
        return tbcKeywords;
    }

    public void setTbcKeywords(String tbcKeywords) {
        this.tbcKeywords = tbcKeywords == null ? null : tbcKeywords.trim();
    }

    public String getTbcImages() {
        return tbcImages;
    }

    public void setTbcImages(String tbcImages) {
        this.tbcImages = tbcImages == null ? null : tbcImages.trim();
    }

    public String getTbcFile() {
        return tbcFile;
    }

    public void setTbcFile(String tbcFile) {
        this.tbcFile = tbcFile == null ? null : tbcFile.trim();
    }

    public String getTbcLink() {
        return tbcLink;
    }

    public void setTbcLink(String tbcLink) {
        this.tbcLink = tbcLink == null ? null : tbcLink.trim();
    }

    public Date getTbcAddTime() {
        return tbcAddTime;
    }

    public void setTbcAddTime(Date tbcAddTime) {
        this.tbcAddTime = tbcAddTime;
    }

    public Date getTbcUpdateTime() {
        return tbcUpdateTime;
    }

    public void setTbcUpdateTime(Date tbcUpdateTime) {
        this.tbcUpdateTime = tbcUpdateTime;
    }

    public Integer getTbcViewS() {
        return tbcViewS;
    }

    public void setTbcViewS(Integer tbcViewS) {
        this.tbcViewS = tbcViewS;
    }

    public Integer getTbcReplyS() {
        return tbcReplyS;
    }

    public void setTbcReplyS(Integer tbcReplyS) {
        this.tbcReplyS = tbcReplyS;
    }

    public Integer getTbcCollectS() {
        return tbcCollectS;
    }

    public void setTbcCollectS(Integer tbcCollectS) {
        this.tbcCollectS = tbcCollectS;
    }

    public Integer getTbcPraiseS() {
        return tbcPraiseS;
    }

    public void setTbcPraiseS(Integer tbcPraiseS) {
        this.tbcPraiseS = tbcPraiseS;
    }

    public Byte getTbcStatus() {
        return tbcStatus;
    }

    public void setTbcStatus(Byte tbcStatus) {
        this.tbcStatus = tbcStatus;
    }

    public String getTbcContent() {
        return tbcContent;
    }

    public void setTbcContent(String tbcContent) {
        this.tbcContent = tbcContent == null ? null : tbcContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbcId=").append(tbcId);
        sb.append(", tbcTitle=").append(tbcTitle);
        sb.append(", tbcParent=").append(tbcParent);
        sb.append(", tbcFlag=").append(tbcFlag);
        sb.append(", tbcOrder=").append(tbcOrder);
        sb.append(", tbcThum=").append(tbcThum);
        sb.append(", tbcIntroduction=").append(tbcIntroduction);
        sb.append(", tbcKeywords=").append(tbcKeywords);
        sb.append(", tbcImages=").append(tbcImages);
        sb.append(", tbcFile=").append(tbcFile);
        sb.append(", tbcLink=").append(tbcLink);
        sb.append(", tbcAddTime=").append(tbcAddTime);
        sb.append(", tbcUpdateTime=").append(tbcUpdateTime);
        sb.append(", tbcViewS=").append(tbcViewS);
        sb.append(", tbcReplyS=").append(tbcReplyS);
        sb.append(", tbcCollectS=").append(tbcCollectS);
        sb.append(", tbcPraiseS=").append(tbcPraiseS);
        sb.append(", tbcStatus=").append(tbcStatus);
        sb.append(", tbcContent=").append(tbcContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}