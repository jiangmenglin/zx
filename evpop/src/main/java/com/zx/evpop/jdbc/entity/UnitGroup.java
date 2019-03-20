package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UnitGroup implements Serializable {
    private Integer tbugId;

    private Short tbugHost;

    private Integer tbugInfo;

    private Integer tbugPerson;

    private String tbugName;

    private BigDecimal tbugQuota;

    private String tbugRemark;

    private String tbugMemo;

    private Date tbugUpdateTime;

    private Date tbugAddTime;

    private Byte tbugStatus;

    private Date createtime;

    private Date modifydate;

    private String tbugData;

    private static final long serialVersionUID = 1L;

    public Integer getTbugId() {
        return tbugId;
    }

    public void setTbugId(Integer tbugId) {
        this.tbugId = tbugId;
    }

    public Short getTbugHost() {
        return tbugHost;
    }

    public void setTbugHost(Short tbugHost) {
        this.tbugHost = tbugHost;
    }

    public Integer getTbugInfo() {
        return tbugInfo;
    }

    public void setTbugInfo(Integer tbugInfo) {
        this.tbugInfo = tbugInfo;
    }

    public Integer getTbugPerson() {
        return tbugPerson;
    }

    public void setTbugPerson(Integer tbugPerson) {
        this.tbugPerson = tbugPerson;
    }

    public String getTbugName() {
        return tbugName;
    }

    public void setTbugName(String tbugName) {
        this.tbugName = tbugName == null ? null : tbugName.trim();
    }

    public BigDecimal getTbugQuota() {
        return tbugQuota;
    }

    public void setTbugQuota(BigDecimal tbugQuota) {
        this.tbugQuota = tbugQuota;
    }

    public String getTbugRemark() {
        return tbugRemark;
    }

    public void setTbugRemark(String tbugRemark) {
        this.tbugRemark = tbugRemark == null ? null : tbugRemark.trim();
    }

    public String getTbugMemo() {
        return tbugMemo;
    }

    public void setTbugMemo(String tbugMemo) {
        this.tbugMemo = tbugMemo == null ? null : tbugMemo.trim();
    }

    public Date getTbugUpdateTime() {
        return tbugUpdateTime;
    }

    public void setTbugUpdateTime(Date tbugUpdateTime) {
        this.tbugUpdateTime = tbugUpdateTime;
    }

    public Date getTbugAddTime() {
        return tbugAddTime;
    }

    public void setTbugAddTime(Date tbugAddTime) {
        this.tbugAddTime = tbugAddTime;
    }

    public Byte getTbugStatus() {
        return tbugStatus;
    }

    public void setTbugStatus(Byte tbugStatus) {
        this.tbugStatus = tbugStatus;
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

    public String getTbugData() {
        return tbugData;
    }

    public void setTbugData(String tbugData) {
        this.tbugData = tbugData == null ? null : tbugData.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbugId=").append(tbugId);
        sb.append(", tbugHost=").append(tbugHost);
        sb.append(", tbugInfo=").append(tbugInfo);
        sb.append(", tbugPerson=").append(tbugPerson);
        sb.append(", tbugName=").append(tbugName);
        sb.append(", tbugQuota=").append(tbugQuota);
        sb.append(", tbugRemark=").append(tbugRemark);
        sb.append(", tbugMemo=").append(tbugMemo);
        sb.append(", tbugUpdateTime=").append(tbugUpdateTime);
        sb.append(", tbugAddTime=").append(tbugAddTime);
        sb.append(", tbugStatus=").append(tbugStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", tbugData=").append(tbugData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}