package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class LfeeType implements Serializable {
    private Long tbltId;

    private Long tbltHost;

    private String tbltName;

    private String tbltGoods;

    private String tbltModels;

    private Double tbltOn;

    private Double tbltOff;

    private Date tbltUpdateTime;

    private Date tbltAddTime;

    private Short tbltStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbltId() {
        return tbltId;
    }

    public void setTbltId(Long tbltId) {
        this.tbltId = tbltId;
    }

    public Long getTbltHost() {
        return tbltHost;
    }

    public void setTbltHost(Long tbltHost) {
        this.tbltHost = tbltHost;
    }

    public String getTbltName() {
        return tbltName;
    }

    public void setTbltName(String tbltName) {
        this.tbltName = tbltName == null ? null : tbltName.trim();
    }

    public String getTbltGoods() {
        return tbltGoods;
    }

    public void setTbltGoods(String tbltGoods) {
        this.tbltGoods = tbltGoods == null ? null : tbltGoods.trim();
    }

    public String getTbltModels() {
        return tbltModels;
    }

    public void setTbltModels(String tbltModels) {
        this.tbltModels = tbltModels == null ? null : tbltModels.trim();
    }

    public Double getTbltOn() {
        return tbltOn;
    }

    public void setTbltOn(Double tbltOn) {
        this.tbltOn = tbltOn;
    }

    public Double getTbltOff() {
        return tbltOff;
    }

    public void setTbltOff(Double tbltOff) {
        this.tbltOff = tbltOff;
    }

    public Date getTbltUpdateTime() {
        return tbltUpdateTime;
    }

    public void setTbltUpdateTime(Date tbltUpdateTime) {
        this.tbltUpdateTime = tbltUpdateTime;
    }

    public Date getTbltAddTime() {
        return tbltAddTime;
    }

    public void setTbltAddTime(Date tbltAddTime) {
        this.tbltAddTime = tbltAddTime;
    }

    public Short getTbltStatus() {
        return tbltStatus;
    }

    public void setTbltStatus(Short tbltStatus) {
        this.tbltStatus = tbltStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbltId=").append(tbltId);
        sb.append(", tbltHost=").append(tbltHost);
        sb.append(", tbltName=").append(tbltName);
        sb.append(", tbltGoods=").append(tbltGoods);
        sb.append(", tbltModels=").append(tbltModels);
        sb.append(", tbltOn=").append(tbltOn);
        sb.append(", tbltOff=").append(tbltOff);
        sb.append(", tbltUpdateTime=").append(tbltUpdateTime);
        sb.append(", tbltAddTime=").append(tbltAddTime);
        sb.append(", tbltStatus=").append(tbltStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}