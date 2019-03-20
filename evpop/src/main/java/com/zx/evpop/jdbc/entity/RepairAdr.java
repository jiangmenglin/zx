package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class RepairAdr implements Serializable {
    private Integer tbraId;

    private Short tbraHost;

    private String tbraName;

    private BigDecimal tbraLat;

    private BigDecimal tbraLng;

    private String tbraAddress;

    private Byte tbraStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTbraId() {
        return tbraId;
    }

    public void setTbraId(Integer tbraId) {
        this.tbraId = tbraId;
    }

    public Short getTbraHost() {
        return tbraHost;
    }

    public void setTbraHost(Short tbraHost) {
        this.tbraHost = tbraHost;
    }

    public String getTbraName() {
        return tbraName;
    }

    public void setTbraName(String tbraName) {
        this.tbraName = tbraName == null ? null : tbraName.trim();
    }

    public BigDecimal getTbraLat() {
        return tbraLat;
    }

    public void setTbraLat(BigDecimal tbraLat) {
        this.tbraLat = tbraLat;
    }

    public BigDecimal getTbraLng() {
        return tbraLng;
    }

    public void setTbraLng(BigDecimal tbraLng) {
        this.tbraLng = tbraLng;
    }

    public String getTbraAddress() {
        return tbraAddress;
    }

    public void setTbraAddress(String tbraAddress) {
        this.tbraAddress = tbraAddress == null ? null : tbraAddress.trim();
    }

    public Byte getTbraStatus() {
        return tbraStatus;
    }

    public void setTbraStatus(Byte tbraStatus) {
        this.tbraStatus = tbraStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbraId=").append(tbraId);
        sb.append(", tbraHost=").append(tbraHost);
        sb.append(", tbraName=").append(tbraName);
        sb.append(", tbraLat=").append(tbraLat);
        sb.append(", tbraLng=").append(tbraLng);
        sb.append(", tbraAddress=").append(tbraAddress);
        sb.append(", tbraStatus=").append(tbraStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}