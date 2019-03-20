package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class ArtifRecord implements Serializable {
    private Integer tbarId;

    private Short tbarHost;

    private String tbarTitle;

    private Integer tbarMember;

    private Double tbarCount;

    private Byte tbarMoneyType;

    private Integer tbarRecordSubject;

    private Integer tbarOrder;

    private Long tbarLongOrder;

    private String tbarRelate;

    private Integer tbarVoucher;

    private Integer tbarAdder;

    private Integer tbarEditor;

    private Integer tbarConfirmer;

    private Date tbarUpdateTime;

    private Date tbarAddTime;

    private Date tbarConfirmTime;

    private String tbarRemark;

    private Byte tbarStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbarId() {
        return tbarId;
    }

    public void setTbarId(Integer tbarId) {
        this.tbarId = tbarId;
    }

    public Short getTbarHost() {
        return tbarHost;
    }

    public void setTbarHost(Short tbarHost) {
        this.tbarHost = tbarHost;
    }

    public String getTbarTitle() {
        return tbarTitle;
    }

    public void setTbarTitle(String tbarTitle) {
        this.tbarTitle = tbarTitle == null ? null : tbarTitle.trim();
    }

    public Integer getTbarMember() {
        return tbarMember;
    }

    public void setTbarMember(Integer tbarMember) {
        this.tbarMember = tbarMember;
    }

    public Double getTbarCount() {
        return tbarCount;
    }

    public void setTbarCount(Double tbarCount) {
        this.tbarCount = tbarCount;
    }

    public Byte getTbarMoneyType() {
        return tbarMoneyType;
    }

    public void setTbarMoneyType(Byte tbarMoneyType) {
        this.tbarMoneyType = tbarMoneyType;
    }

    public Integer getTbarRecordSubject() {
        return tbarRecordSubject;
    }

    public void setTbarRecordSubject(Integer tbarRecordSubject) {
        this.tbarRecordSubject = tbarRecordSubject;
    }

    public Integer getTbarOrder() {
        return tbarOrder;
    }

    public void setTbarOrder(Integer tbarOrder) {
        this.tbarOrder = tbarOrder;
    }

    public Long getTbarLongOrder() {
        return tbarLongOrder;
    }

    public void setTbarLongOrder(Long tbarLongOrder) {
        this.tbarLongOrder = tbarLongOrder;
    }

    public String getTbarRelate() {
        return tbarRelate;
    }

    public void setTbarRelate(String tbarRelate) {
        this.tbarRelate = tbarRelate == null ? null : tbarRelate.trim();
    }

    public Integer getTbarVoucher() {
        return tbarVoucher;
    }

    public void setTbarVoucher(Integer tbarVoucher) {
        this.tbarVoucher = tbarVoucher;
    }

    public Integer getTbarAdder() {
        return tbarAdder;
    }

    public void setTbarAdder(Integer tbarAdder) {
        this.tbarAdder = tbarAdder;
    }

    public Integer getTbarEditor() {
        return tbarEditor;
    }

    public void setTbarEditor(Integer tbarEditor) {
        this.tbarEditor = tbarEditor;
    }

    public Integer getTbarConfirmer() {
        return tbarConfirmer;
    }

    public void setTbarConfirmer(Integer tbarConfirmer) {
        this.tbarConfirmer = tbarConfirmer;
    }

    public Date getTbarUpdateTime() {
        return tbarUpdateTime;
    }

    public void setTbarUpdateTime(Date tbarUpdateTime) {
        this.tbarUpdateTime = tbarUpdateTime;
    }

    public Date getTbarAddTime() {
        return tbarAddTime;
    }

    public void setTbarAddTime(Date tbarAddTime) {
        this.tbarAddTime = tbarAddTime;
    }

    public Date getTbarConfirmTime() {
        return tbarConfirmTime;
    }

    public void setTbarConfirmTime(Date tbarConfirmTime) {
        this.tbarConfirmTime = tbarConfirmTime;
    }

    public String getTbarRemark() {
        return tbarRemark;
    }

    public void setTbarRemark(String tbarRemark) {
        this.tbarRemark = tbarRemark == null ? null : tbarRemark.trim();
    }

    public Byte getTbarStatus() {
        return tbarStatus;
    }

    public void setTbarStatus(Byte tbarStatus) {
        this.tbarStatus = tbarStatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbarId=").append(tbarId);
        sb.append(", tbarHost=").append(tbarHost);
        sb.append(", tbarTitle=").append(tbarTitle);
        sb.append(", tbarMember=").append(tbarMember);
        sb.append(", tbarCount=").append(tbarCount);
        sb.append(", tbarMoneyType=").append(tbarMoneyType);
        sb.append(", tbarRecordSubject=").append(tbarRecordSubject);
        sb.append(", tbarOrder=").append(tbarOrder);
        sb.append(", tbarLongOrder=").append(tbarLongOrder);
        sb.append(", tbarRelate=").append(tbarRelate);
        sb.append(", tbarVoucher=").append(tbarVoucher);
        sb.append(", tbarAdder=").append(tbarAdder);
        sb.append(", tbarEditor=").append(tbarEditor);
        sb.append(", tbarConfirmer=").append(tbarConfirmer);
        sb.append(", tbarUpdateTime=").append(tbarUpdateTime);
        sb.append(", tbarAddTime=").append(tbarAddTime);
        sb.append(", tbarConfirmTime=").append(tbarConfirmTime);
        sb.append(", tbarRemark=").append(tbarRemark);
        sb.append(", tbarStatus=").append(tbarStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}