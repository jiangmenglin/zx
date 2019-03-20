package com.zx.evpop.jdbc.entity;

import java.io.Serializable;

public class Price implements Serializable {
    private Long tbpId;

    private Long tbpHost;

    private Long tbpFeeType;

    private Long tbpGoods;

    private Long tbpModel;

    private Double tbpPrice;

    private static final long serialVersionUID = 1L;

    public Long getTbpId() {
        return tbpId;
    }

    public void setTbpId(Long tbpId) {
        this.tbpId = tbpId;
    }

    public Long getTbpHost() {
        return tbpHost;
    }

    public void setTbpHost(Long tbpHost) {
        this.tbpHost = tbpHost;
    }

    public Long getTbpFeeType() {
        return tbpFeeType;
    }

    public void setTbpFeeType(Long tbpFeeType) {
        this.tbpFeeType = tbpFeeType;
    }

    public Long getTbpGoods() {
        return tbpGoods;
    }

    public void setTbpGoods(Long tbpGoods) {
        this.tbpGoods = tbpGoods;
    }

    public Long getTbpModel() {
        return tbpModel;
    }

    public void setTbpModel(Long tbpModel) {
        this.tbpModel = tbpModel;
    }

    public Double getTbpPrice() {
        return tbpPrice;
    }

    public void setTbpPrice(Double tbpPrice) {
        this.tbpPrice = tbpPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbpId=").append(tbpId);
        sb.append(", tbpHost=").append(tbpHost);
        sb.append(", tbpFeeType=").append(tbpFeeType);
        sb.append(", tbpGoods=").append(tbpGoods);
        sb.append(", tbpModel=").append(tbpModel);
        sb.append(", tbpPrice=").append(tbpPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}