package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OperRecord implements Serializable {
    private Integer tborId;

    private Short tborHost;

    private String tborTitle;

    private Byte tborMoneyType;

    private Byte tborRecordType;

    private BigDecimal tborIn;

    private BigDecimal tborOut;

    private Integer tborRecord;

    private Integer tborMember;

    private Long tborOrder;

    private Long tborLongOrder;

    private String tborObject;

    private String tborIndemnify;

    private Date tborDateTime;

    private Long tborCashNo;

    private Integer tborAdder;

    private Byte tborStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTborId() {
        return tborId;
    }

    public void setTborId(Integer tborId) {
        this.tborId = tborId;
    }

    public Short getTborHost() {
        return tborHost;
    }

    public void setTborHost(Short tborHost) {
        this.tborHost = tborHost;
    }

    public String getTborTitle() {
        return tborTitle;
    }

    public void setTborTitle(String tborTitle) {
        this.tborTitle = tborTitle == null ? null : tborTitle.trim();
    }

    public Byte getTborMoneyType() {
        return tborMoneyType;
    }

    public void setTborMoneyType(Byte tborMoneyType) {
        this.tborMoneyType = tborMoneyType;
    }

    public Byte getTborRecordType() {
        return tborRecordType;
    }

    public void setTborRecordType(Byte tborRecordType) {
        this.tborRecordType = tborRecordType;
    }

    public BigDecimal getTborIn() {
        return tborIn;
    }

    public void setTborIn(BigDecimal tborIn) {
        this.tborIn = tborIn;
    }

    public BigDecimal getTborOut() {
        return tborOut;
    }

    public void setTborOut(BigDecimal tborOut) {
        this.tborOut = tborOut;
    }

    public Integer getTborRecord() {
        return tborRecord;
    }

    public void setTborRecord(Integer tborRecord) {
        this.tborRecord = tborRecord;
    }

    public Integer getTborMember() {
        return tborMember;
    }

    public void setTborMember(Integer tborMember) {
        this.tborMember = tborMember;
    }

    public Long getTborOrder() {
        return tborOrder;
    }

    public void setTborOrder(Long tborOrder) {
        this.tborOrder = tborOrder;
    }

    public Long getTborLongOrder() {
        return tborLongOrder;
    }

    public void setTborLongOrder(Long tborLongOrder) {
        this.tborLongOrder = tborLongOrder;
    }

    public String getTborObject() {
        return tborObject;
    }

    public void setTborObject(String tborObject) {
        this.tborObject = tborObject == null ? null : tborObject.trim();
    }

    public String getTborIndemnify() {
        return tborIndemnify;
    }

    public void setTborIndemnify(String tborIndemnify) {
        this.tborIndemnify = tborIndemnify == null ? null : tborIndemnify.trim();
    }

    public Date getTborDateTime() {
        return tborDateTime;
    }

    public void setTborDateTime(Date tborDateTime) {
        this.tborDateTime = tborDateTime;
    }

    public Long getTborCashNo() {
        return tborCashNo;
    }

    public void setTborCashNo(Long tborCashNo) {
        this.tborCashNo = tborCashNo;
    }

    public Integer getTborAdder() {
        return tborAdder;
    }

    public void setTborAdder(Integer tborAdder) {
        this.tborAdder = tborAdder;
    }

    public Byte getTborStatus() {
        return tborStatus;
    }

    public void setTborStatus(Byte tborStatus) {
        this.tborStatus = tborStatus;
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
        sb.append(", tborId=").append(tborId);
        sb.append(", tborHost=").append(tborHost);
        sb.append(", tborTitle=").append(tborTitle);
        sb.append(", tborMoneyType=").append(tborMoneyType);
        sb.append(", tborRecordType=").append(tborRecordType);
        sb.append(", tborIn=").append(tborIn);
        sb.append(", tborOut=").append(tborOut);
        sb.append(", tborRecord=").append(tborRecord);
        sb.append(", tborMember=").append(tborMember);
        sb.append(", tborOrder=").append(tborOrder);
        sb.append(", tborLongOrder=").append(tborLongOrder);
        sb.append(", tborObject=").append(tborObject);
        sb.append(", tborIndemnify=").append(tborIndemnify);
        sb.append(", tborDateTime=").append(tborDateTime);
        sb.append(", tborCashNo=").append(tborCashNo);
        sb.append(", tborAdder=").append(tborAdder);
        sb.append(", tborStatus=").append(tborStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}