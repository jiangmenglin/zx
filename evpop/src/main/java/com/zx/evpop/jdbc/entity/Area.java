package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Area implements Serializable {
    private Integer tbaId;

    private Short tbaHost;

    private String tbaName;

    private String tbaContact;

    private String tbaAddress;

    private Integer tbaPosCount;

    private BigDecimal tbaLon;

    private BigDecimal tbaLat;

    private String tbaRange;

    private Byte tbaStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbaId() {
        return tbaId;
    }

    public void setTbaId(Integer tbaId) {
        this.tbaId = tbaId;
    }

    public Short getTbaHost() {
        return tbaHost;
    }

    public void setTbaHost(Short tbaHost) {
        this.tbaHost = tbaHost;
    }

    public String getTbaName() {
        return tbaName;
    }

    public void setTbaName(String tbaName) {
        this.tbaName = tbaName == null ? null : tbaName.trim();
    }

    public String getTbaContact() {
        return tbaContact;
    }

    public void setTbaContact(String tbaContact) {
        this.tbaContact = tbaContact == null ? null : tbaContact.trim();
    }

    public String getTbaAddress() {
        return tbaAddress;
    }

    public void setTbaAddress(String tbaAddress) {
        this.tbaAddress = tbaAddress == null ? null : tbaAddress.trim();
    }

    public Integer getTbaPosCount() {
        return tbaPosCount;
    }

    public void setTbaPosCount(Integer tbaPosCount) {
        this.tbaPosCount = tbaPosCount;
    }

    public BigDecimal getTbaLon() {
        return tbaLon;
    }

    public void setTbaLon(BigDecimal tbaLon) {
        this.tbaLon = tbaLon;
    }

    public BigDecimal getTbaLat() {
        return tbaLat;
    }

    public void setTbaLat(BigDecimal tbaLat) {
        this.tbaLat = tbaLat;
    }

    public String getTbaRange() {
        return tbaRange;
    }

    public void setTbaRange(String tbaRange) {
        this.tbaRange = tbaRange == null ? null : tbaRange.trim();
    }

    public Byte getTbaStatus() {
        return tbaStatus;
    }

    public void setTbaStatus(Byte tbaStatus) {
        this.tbaStatus = tbaStatus;
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
        sb.append(", tbaId=").append(tbaId);
        sb.append(", tbaHost=").append(tbaHost);
        sb.append(", tbaName=").append(tbaName);
        sb.append(", tbaContact=").append(tbaContact);
        sb.append(", tbaAddress=").append(tbaAddress);
        sb.append(", tbaPosCount=").append(tbaPosCount);
        sb.append(", tbaLon=").append(tbaLon);
        sb.append(", tbaLat=").append(tbaLat);
        sb.append(", tbaRange=").append(tbaRange);
        sb.append(", tbaStatus=").append(tbaStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}