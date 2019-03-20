package com.zx.evpop.jdbc.entity;

import java.io.Serializable;

public class Attribute implements Serializable {
    private Integer saId;

    private Long saHost;

    private String saTel;

    private String saSmsFix;

    private Integer saRefundDay;

    private Integer saInvoceMny;

    private Integer saCancelOrderLimit;

    private Integer saDistance;

    private Integer saPowerTip;

    private Integer saPowerOffline;

    private Byte saStatus;

    private static final long serialVersionUID = 1L;

    public Integer getSaId() {
        return saId;
    }

    public void setSaId(Integer saId) {
        this.saId = saId;
    }

    public Long getSaHost() {
        return saHost;
    }

    public void setSaHost(Long saHost) {
        this.saHost = saHost;
    }

    public String getSaTel() {
        return saTel;
    }

    public void setSaTel(String saTel) {
        this.saTel = saTel == null ? null : saTel.trim();
    }

    public String getSaSmsFix() {
        return saSmsFix;
    }

    public void setSaSmsFix(String saSmsFix) {
        this.saSmsFix = saSmsFix == null ? null : saSmsFix.trim();
    }

    public Integer getSaRefundDay() {
        return saRefundDay;
    }

    public void setSaRefundDay(Integer saRefundDay) {
        this.saRefundDay = saRefundDay;
    }

    public Integer getSaInvoceMny() {
        return saInvoceMny;
    }

    public void setSaInvoceMny(Integer saInvoceMny) {
        this.saInvoceMny = saInvoceMny;
    }

    public Integer getSaCancelOrderLimit() {
        return saCancelOrderLimit;
    }

    public void setSaCancelOrderLimit(Integer saCancelOrderLimit) {
        this.saCancelOrderLimit = saCancelOrderLimit;
    }

    public Integer getSaDistance() {
        return saDistance;
    }

    public void setSaDistance(Integer saDistance) {
        this.saDistance = saDistance;
    }

    public Integer getSaPowerTip() {
        return saPowerTip;
    }

    public void setSaPowerTip(Integer saPowerTip) {
        this.saPowerTip = saPowerTip;
    }

    public Integer getSaPowerOffline() {
        return saPowerOffline;
    }

    public void setSaPowerOffline(Integer saPowerOffline) {
        this.saPowerOffline = saPowerOffline;
    }

    public Byte getSaStatus() {
        return saStatus;
    }

    public void setSaStatus(Byte saStatus) {
        this.saStatus = saStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saId=").append(saId);
        sb.append(", saHost=").append(saHost);
        sb.append(", saTel=").append(saTel);
        sb.append(", saSmsFix=").append(saSmsFix);
        sb.append(", saRefundDay=").append(saRefundDay);
        sb.append(", saInvoceMny=").append(saInvoceMny);
        sb.append(", saCancelOrderLimit=").append(saCancelOrderLimit);
        sb.append(", saDistance=").append(saDistance);
        sb.append(", saPowerTip=").append(saPowerTip);
        sb.append(", saPowerOffline=").append(saPowerOffline);
        sb.append(", saStatus=").append(saStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}