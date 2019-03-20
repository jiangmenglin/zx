package com.zx.evpop.jdbc.entity;

import java.io.Serializable;

public class Lprice implements Serializable {
    private Long tblId;

    private Long tblHost;

    private Long tblFeeType;

    private Long tblGoods;

    private Long tblModel;

    private Double tblPrice;

    private static final long serialVersionUID = 1L;

    public Long getTblId() {
        return tblId;
    }

    public void setTblId(Long tblId) {
        this.tblId = tblId;
    }

    public Long getTblHost() {
        return tblHost;
    }

    public void setTblHost(Long tblHost) {
        this.tblHost = tblHost;
    }

    public Long getTblFeeType() {
        return tblFeeType;
    }

    public void setTblFeeType(Long tblFeeType) {
        this.tblFeeType = tblFeeType;
    }

    public Long getTblGoods() {
        return tblGoods;
    }

    public void setTblGoods(Long tblGoods) {
        this.tblGoods = tblGoods;
    }

    public Long getTblModel() {
        return tblModel;
    }

    public void setTblModel(Long tblModel) {
        this.tblModel = tblModel;
    }

    public Double getTblPrice() {
        return tblPrice;
    }

    public void setTblPrice(Double tblPrice) {
        this.tblPrice = tblPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tblId=").append(tblId);
        sb.append(", tblHost=").append(tblHost);
        sb.append(", tblFeeType=").append(tblFeeType);
        sb.append(", tblGoods=").append(tblGoods);
        sb.append(", tblModel=").append(tblModel);
        sb.append(", tblPrice=").append(tblPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}