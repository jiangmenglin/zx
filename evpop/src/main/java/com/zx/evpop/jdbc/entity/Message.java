package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private Integer tbmId;

    private Short tbmHost;

    private String tbmTitle;

    private String tbmRentcarorder;

    private String tbmHead;

    private String tbmCdorder;

    private Double tbmCdmoney;

    private String tbmContent;

    private String tbmFlag;

    private String tbmLink;

    private Integer tbmOperator;

    private Integer tbmMember;

    private Date tbmRcvTime;

    private Date tbmSndTime;

    private Date tbmAddTime;

    private Date tbmUpdateTime;

    private Byte tbmStatus;

    private Long tbmRelationmessage;

    private String tbmOperatorname;

    private Byte tbmType;

    private Short tbmCategory;

    private Short tbmCtype;

    private static final long serialVersionUID = 1L;

    public Integer getTbmId() {
        return tbmId;
    }

    public void setTbmId(Integer tbmId) {
        this.tbmId = tbmId;
    }

    public Short getTbmHost() {
        return tbmHost;
    }

    public void setTbmHost(Short tbmHost) {
        this.tbmHost = tbmHost;
    }

    public String getTbmTitle() {
        return tbmTitle;
    }

    public void setTbmTitle(String tbmTitle) {
        this.tbmTitle = tbmTitle == null ? null : tbmTitle.trim();
    }

    public String getTbmRentcarorder() {
        return tbmRentcarorder;
    }

    public void setTbmRentcarorder(String tbmRentcarorder) {
        this.tbmRentcarorder = tbmRentcarorder == null ? null : tbmRentcarorder.trim();
    }

    public String getTbmHead() {
        return tbmHead;
    }

    public void setTbmHead(String tbmHead) {
        this.tbmHead = tbmHead == null ? null : tbmHead.trim();
    }

    public String getTbmCdorder() {
        return tbmCdorder;
    }

    public void setTbmCdorder(String tbmCdorder) {
        this.tbmCdorder = tbmCdorder == null ? null : tbmCdorder.trim();
    }

    public Double getTbmCdmoney() {
        return tbmCdmoney;
    }

    public void setTbmCdmoney(Double tbmCdmoney) {
        this.tbmCdmoney = tbmCdmoney;
    }

    public String getTbmContent() {
        return tbmContent;
    }

    public void setTbmContent(String tbmContent) {
        this.tbmContent = tbmContent == null ? null : tbmContent.trim();
    }

    public String getTbmFlag() {
        return tbmFlag;
    }

    public void setTbmFlag(String tbmFlag) {
        this.tbmFlag = tbmFlag == null ? null : tbmFlag.trim();
    }

    public String getTbmLink() {
        return tbmLink;
    }

    public void setTbmLink(String tbmLink) {
        this.tbmLink = tbmLink == null ? null : tbmLink.trim();
    }

    public Integer getTbmOperator() {
        return tbmOperator;
    }

    public void setTbmOperator(Integer tbmOperator) {
        this.tbmOperator = tbmOperator;
    }

    public Integer getTbmMember() {
        return tbmMember;
    }

    public void setTbmMember(Integer tbmMember) {
        this.tbmMember = tbmMember;
    }

    public Date getTbmRcvTime() {
        return tbmRcvTime;
    }

    public void setTbmRcvTime(Date tbmRcvTime) {
        this.tbmRcvTime = tbmRcvTime;
    }

    public Date getTbmSndTime() {
        return tbmSndTime;
    }

    public void setTbmSndTime(Date tbmSndTime) {
        this.tbmSndTime = tbmSndTime;
    }

    public Date getTbmAddTime() {
        return tbmAddTime;
    }

    public void setTbmAddTime(Date tbmAddTime) {
        this.tbmAddTime = tbmAddTime;
    }

    public Date getTbmUpdateTime() {
        return tbmUpdateTime;
    }

    public void setTbmUpdateTime(Date tbmUpdateTime) {
        this.tbmUpdateTime = tbmUpdateTime;
    }

    public Byte getTbmStatus() {
        return tbmStatus;
    }

    public void setTbmStatus(Byte tbmStatus) {
        this.tbmStatus = tbmStatus;
    }

    public Long getTbmRelationmessage() {
        return tbmRelationmessage;
    }

    public void setTbmRelationmessage(Long tbmRelationmessage) {
        this.tbmRelationmessage = tbmRelationmessage;
    }

    public String getTbmOperatorname() {
        return tbmOperatorname;
    }

    public void setTbmOperatorname(String tbmOperatorname) {
        this.tbmOperatorname = tbmOperatorname == null ? null : tbmOperatorname.trim();
    }

    public Byte getTbmType() {
        return tbmType;
    }

    public void setTbmType(Byte tbmType) {
        this.tbmType = tbmType;
    }

    public Short getTbmCategory() {
        return tbmCategory;
    }

    public void setTbmCategory(Short tbmCategory) {
        this.tbmCategory = tbmCategory;
    }

    public Short getTbmCtype() {
        return tbmCtype;
    }

    public void setTbmCtype(Short tbmCtype) {
        this.tbmCtype = tbmCtype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbmId=").append(tbmId);
        sb.append(", tbmHost=").append(tbmHost);
        sb.append(", tbmTitle=").append(tbmTitle);
        sb.append(", tbmRentcarorder=").append(tbmRentcarorder);
        sb.append(", tbmHead=").append(tbmHead);
        sb.append(", tbmCdorder=").append(tbmCdorder);
        sb.append(", tbmCdmoney=").append(tbmCdmoney);
        sb.append(", tbmContent=").append(tbmContent);
        sb.append(", tbmFlag=").append(tbmFlag);
        sb.append(", tbmLink=").append(tbmLink);
        sb.append(", tbmOperator=").append(tbmOperator);
        sb.append(", tbmMember=").append(tbmMember);
        sb.append(", tbmRcvTime=").append(tbmRcvTime);
        sb.append(", tbmSndTime=").append(tbmSndTime);
        sb.append(", tbmAddTime=").append(tbmAddTime);
        sb.append(", tbmUpdateTime=").append(tbmUpdateTime);
        sb.append(", tbmStatus=").append(tbmStatus);
        sb.append(", tbmRelationmessage=").append(tbmRelationmessage);
        sb.append(", tbmOperatorname=").append(tbmOperatorname);
        sb.append(", tbmType=").append(tbmType);
        sb.append(", tbmCategory=").append(tbmCategory);
        sb.append(", tbmCtype=").append(tbmCtype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}