package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Violat implements Serializable {
    private Integer tbvId;

    private Short tbvHost;

    private Long tbvOrder;

    private Integer tbvMember;

    private Integer tbvCar;

    private Double tbvMoney;

    private Integer tbvScore;

    private Date tbvHappenTime;

    private Date tbvDealTime;

    private String tbvAddress;

    private String tbvDecipt;

    private Byte tbvNotice;

    private Date tbvCutoffTime;

    private Byte tbvType;

    private Double tbvPrice;

    private Byte tbvBranch;

    private Byte tbvPostType;

    private String tbvPostAddr;

    private String tbvRemark;

    private Integer tbvAccepter;

    private Integer tbvAdder;

    private Date tbvUpdateTime;

    private Date tbvAddTime;

    private Byte tbvDealFlag;

    private Integer tbvQueryCount;

    private Byte tbvStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbvId() {
        return tbvId;
    }

    public void setTbvId(Integer tbvId) {
        this.tbvId = tbvId;
    }

    public Short getTbvHost() {
        return tbvHost;
    }

    public void setTbvHost(Short tbvHost) {
        this.tbvHost = tbvHost;
    }

    public Long getTbvOrder() {
        return tbvOrder;
    }

    public void setTbvOrder(Long tbvOrder) {
        this.tbvOrder = tbvOrder;
    }

    public Integer getTbvMember() {
        return tbvMember;
    }

    public void setTbvMember(Integer tbvMember) {
        this.tbvMember = tbvMember;
    }

    public Integer getTbvCar() {
        return tbvCar;
    }

    public void setTbvCar(Integer tbvCar) {
        this.tbvCar = tbvCar;
    }

    public Double getTbvMoney() {
        return tbvMoney;
    }

    public void setTbvMoney(Double tbvMoney) {
        this.tbvMoney = tbvMoney;
    }

    public Integer getTbvScore() {
        return tbvScore;
    }

    public void setTbvScore(Integer tbvScore) {
        this.tbvScore = tbvScore;
    }

    public Date getTbvHappenTime() {
        return tbvHappenTime;
    }

    public void setTbvHappenTime(Date tbvHappenTime) {
        this.tbvHappenTime = tbvHappenTime;
    }

    public Date getTbvDealTime() {
        return tbvDealTime;
    }

    public void setTbvDealTime(Date tbvDealTime) {
        this.tbvDealTime = tbvDealTime;
    }

    public String getTbvAddress() {
        return tbvAddress;
    }

    public void setTbvAddress(String tbvAddress) {
        this.tbvAddress = tbvAddress == null ? null : tbvAddress.trim();
    }

    public String getTbvDecipt() {
        return tbvDecipt;
    }

    public void setTbvDecipt(String tbvDecipt) {
        this.tbvDecipt = tbvDecipt == null ? null : tbvDecipt.trim();
    }

    public Byte getTbvNotice() {
        return tbvNotice;
    }

    public void setTbvNotice(Byte tbvNotice) {
        this.tbvNotice = tbvNotice;
    }

    public Date getTbvCutoffTime() {
        return tbvCutoffTime;
    }

    public void setTbvCutoffTime(Date tbvCutoffTime) {
        this.tbvCutoffTime = tbvCutoffTime;
    }

    public Byte getTbvType() {
        return tbvType;
    }

    public void setTbvType(Byte tbvType) {
        this.tbvType = tbvType;
    }

    public Double getTbvPrice() {
        return tbvPrice;
    }

    public void setTbvPrice(Double tbvPrice) {
        this.tbvPrice = tbvPrice;
    }

    public Byte getTbvBranch() {
        return tbvBranch;
    }

    public void setTbvBranch(Byte tbvBranch) {
        this.tbvBranch = tbvBranch;
    }

    public Byte getTbvPostType() {
        return tbvPostType;
    }

    public void setTbvPostType(Byte tbvPostType) {
        this.tbvPostType = tbvPostType;
    }

    public String getTbvPostAddr() {
        return tbvPostAddr;
    }

    public void setTbvPostAddr(String tbvPostAddr) {
        this.tbvPostAddr = tbvPostAddr == null ? null : tbvPostAddr.trim();
    }

    public String getTbvRemark() {
        return tbvRemark;
    }

    public void setTbvRemark(String tbvRemark) {
        this.tbvRemark = tbvRemark == null ? null : tbvRemark.trim();
    }

    public Integer getTbvAccepter() {
        return tbvAccepter;
    }

    public void setTbvAccepter(Integer tbvAccepter) {
        this.tbvAccepter = tbvAccepter;
    }

    public Integer getTbvAdder() {
        return tbvAdder;
    }

    public void setTbvAdder(Integer tbvAdder) {
        this.tbvAdder = tbvAdder;
    }

    public Date getTbvUpdateTime() {
        return tbvUpdateTime;
    }

    public void setTbvUpdateTime(Date tbvUpdateTime) {
        this.tbvUpdateTime = tbvUpdateTime;
    }

    public Date getTbvAddTime() {
        return tbvAddTime;
    }

    public void setTbvAddTime(Date tbvAddTime) {
        this.tbvAddTime = tbvAddTime;
    }

    public Byte getTbvDealFlag() {
        return tbvDealFlag;
    }

    public void setTbvDealFlag(Byte tbvDealFlag) {
        this.tbvDealFlag = tbvDealFlag;
    }

    public Integer getTbvQueryCount() {
        return tbvQueryCount;
    }

    public void setTbvQueryCount(Integer tbvQueryCount) {
        this.tbvQueryCount = tbvQueryCount;
    }

    public Byte getTbvStatus() {
        return tbvStatus;
    }

    public void setTbvStatus(Byte tbvStatus) {
        this.tbvStatus = tbvStatus;
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
        sb.append(", tbvId=").append(tbvId);
        sb.append(", tbvHost=").append(tbvHost);
        sb.append(", tbvOrder=").append(tbvOrder);
        sb.append(", tbvMember=").append(tbvMember);
        sb.append(", tbvCar=").append(tbvCar);
        sb.append(", tbvMoney=").append(tbvMoney);
        sb.append(", tbvScore=").append(tbvScore);
        sb.append(", tbvHappenTime=").append(tbvHappenTime);
        sb.append(", tbvDealTime=").append(tbvDealTime);
        sb.append(", tbvAddress=").append(tbvAddress);
        sb.append(", tbvDecipt=").append(tbvDecipt);
        sb.append(", tbvNotice=").append(tbvNotice);
        sb.append(", tbvCutoffTime=").append(tbvCutoffTime);
        sb.append(", tbvType=").append(tbvType);
        sb.append(", tbvPrice=").append(tbvPrice);
        sb.append(", tbvBranch=").append(tbvBranch);
        sb.append(", tbvPostType=").append(tbvPostType);
        sb.append(", tbvPostAddr=").append(tbvPostAddr);
        sb.append(", tbvRemark=").append(tbvRemark);
        sb.append(", tbvAccepter=").append(tbvAccepter);
        sb.append(", tbvAdder=").append(tbvAdder);
        sb.append(", tbvUpdateTime=").append(tbvUpdateTime);
        sb.append(", tbvAddTime=").append(tbvAddTime);
        sb.append(", tbvDealFlag=").append(tbvDealFlag);
        sb.append(", tbvQueryCount=").append(tbvQueryCount);
        sb.append(", tbvStatus=").append(tbvStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}