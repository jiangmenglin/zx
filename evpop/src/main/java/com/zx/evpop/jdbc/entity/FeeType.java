package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class FeeType implements Serializable {
    private Integer tbftId;

    private Short tbftHost;

    private String tbftName;

    private String tbftGoods;

    private String tbftModels;

    private Double tbftOn;

    private Double tbftOff;

    private Date tbftUpdateTime;

    private Date tbftAddTime;

    private Byte tbftStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTbftId() {
        return tbftId;
    }

    public void setTbftId(Integer tbftId) {
        this.tbftId = tbftId;
    }

    public Short getTbftHost() {
        return tbftHost;
    }

    public void setTbftHost(Short tbftHost) {
        this.tbftHost = tbftHost;
    }

    public String getTbftName() {
        return tbftName;
    }

    public void setTbftName(String tbftName) {
        this.tbftName = tbftName == null ? null : tbftName.trim();
    }

    public String getTbftGoods() {
        return tbftGoods;
    }

    public void setTbftGoods(String tbftGoods) {
        this.tbftGoods = tbftGoods == null ? null : tbftGoods.trim();
    }

    public String getTbftModels() {
        return tbftModels;
    }

    public void setTbftModels(String tbftModels) {
        this.tbftModels = tbftModels == null ? null : tbftModels.trim();
    }

    public Double getTbftOn() {
        return tbftOn;
    }

    public void setTbftOn(Double tbftOn) {
        this.tbftOn = tbftOn;
    }

    public Double getTbftOff() {
        return tbftOff;
    }

    public void setTbftOff(Double tbftOff) {
        this.tbftOff = tbftOff;
    }

    public Date getTbftUpdateTime() {
        return tbftUpdateTime;
    }

    public void setTbftUpdateTime(Date tbftUpdateTime) {
        this.tbftUpdateTime = tbftUpdateTime;
    }

    public Date getTbftAddTime() {
        return tbftAddTime;
    }

    public void setTbftAddTime(Date tbftAddTime) {
        this.tbftAddTime = tbftAddTime;
    }

    public Byte getTbftStatus() {
        return tbftStatus;
    }

    public void setTbftStatus(Byte tbftStatus) {
        this.tbftStatus = tbftStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbftId=").append(tbftId);
        sb.append(", tbftHost=").append(tbftHost);
        sb.append(", tbftName=").append(tbftName);
        sb.append(", tbftGoods=").append(tbftGoods);
        sb.append(", tbftModels=").append(tbftModels);
        sb.append(", tbftOn=").append(tbftOn);
        sb.append(", tbftOff=").append(tbftOff);
        sb.append(", tbftUpdateTime=").append(tbftUpdateTime);
        sb.append(", tbftAddTime=").append(tbftAddTime);
        sb.append(", tbftStatus=").append(tbftStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}