package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderDetail implements Serializable {
    private Integer tbodId;

    private Short tbodHost;

    private String tbodProfile;

    private Integer tbodGoods;

    private Long tbodOrder;

    private Date tbodStart;

    private Date tbodEnd;

    private Double tbodCount;

    private Double tbodPrice;

    private Double tbodMoney;

    private Double tbodRebate;

    private String tbodRemark;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbodId() {
        return tbodId;
    }

    public void setTbodId(Integer tbodId) {
        this.tbodId = tbodId;
    }

    public Short getTbodHost() {
        return tbodHost;
    }

    public void setTbodHost(Short tbodHost) {
        this.tbodHost = tbodHost;
    }

    public String getTbodProfile() {
        return tbodProfile;
    }

    public void setTbodProfile(String tbodProfile) {
        this.tbodProfile = tbodProfile == null ? null : tbodProfile.trim();
    }

    public Integer getTbodGoods() {
        return tbodGoods;
    }

    public void setTbodGoods(Integer tbodGoods) {
        this.tbodGoods = tbodGoods;
    }

    public Long getTbodOrder() {
        return tbodOrder;
    }

    public void setTbodOrder(Long tbodOrder) {
        this.tbodOrder = tbodOrder;
    }

    public Date getTbodStart() {
        return tbodStart;
    }

    public void setTbodStart(Date tbodStart) {
        this.tbodStart = tbodStart;
    }

    public Date getTbodEnd() {
        return tbodEnd;
    }

    public void setTbodEnd(Date tbodEnd) {
        this.tbodEnd = tbodEnd;
    }

    public Double getTbodCount() {
        return tbodCount;
    }

    public void setTbodCount(Double tbodCount) {
        this.tbodCount = tbodCount;
    }

    public Double getTbodPrice() {
        return tbodPrice;
    }

    public void setTbodPrice(Double tbodPrice) {
        this.tbodPrice = tbodPrice;
    }

    public Double getTbodMoney() {
        return tbodMoney;
    }

    public void setTbodMoney(Double tbodMoney) {
        this.tbodMoney = tbodMoney;
    }

    public Double getTbodRebate() {
        return tbodRebate;
    }

    public void setTbodRebate(Double tbodRebate) {
        this.tbodRebate = tbodRebate;
    }

    public String getTbodRemark() {
        return tbodRemark;
    }

    public void setTbodRemark(String tbodRemark) {
        this.tbodRemark = tbodRemark == null ? null : tbodRemark.trim();
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
        sb.append(", tbodId=").append(tbodId);
        sb.append(", tbodHost=").append(tbodHost);
        sb.append(", tbodProfile=").append(tbodProfile);
        sb.append(", tbodGoods=").append(tbodGoods);
        sb.append(", tbodOrder=").append(tbodOrder);
        sb.append(", tbodStart=").append(tbodStart);
        sb.append(", tbodEnd=").append(tbodEnd);
        sb.append(", tbodCount=").append(tbodCount);
        sb.append(", tbodPrice=").append(tbodPrice);
        sb.append(", tbodMoney=").append(tbodMoney);
        sb.append(", tbodRebate=").append(tbodRebate);
        sb.append(", tbodRemark=").append(tbodRemark);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}