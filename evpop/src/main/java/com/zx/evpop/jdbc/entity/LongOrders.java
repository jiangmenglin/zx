package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class LongOrders implements Serializable {
    private Long tbloId;

    private Long tbloHost;

    private String tbloNo;

    private Long tbloMenber;

    private Long tbloModel;

    private Long tbloCar;

    private Date tbloGetTime;

    private Date tbloReturnTime;

    private Date tbloJiTime;

    private Long tbloMenuTime;

    private Double tbloOrderRent;

    private Long tbloGetOutlets;

    private Long tbloReturnOutlets;

    private Double tbloCouponReduction;

    private Double tbloActualRent;

    private String tbloOverTimes;

    private Double tbloOverRent;

    private Short tbloOverPay;

    private Date tbloOverPaytime;

    private String tbloImglist;

    private String tbloReturnImg;

    private Short tbloPayType;

    private Date tbloPayTime;

    private String tbloTakelatlng;

    private String tbloReturnlatlng;

    private String tbloSrc;

    private Long tbloUpdateUser;

    private Date tbloUpdateTime;

    private Long tbloCreateUser;

    private Date tbloAddTime;

    private Short tbloStatus;

    private String tbloText;

    private static final long serialVersionUID = 1L;

    public Long getTbloId() {
        return tbloId;
    }

    public void setTbloId(Long tbloId) {
        this.tbloId = tbloId;
    }

    public Long getTbloHost() {
        return tbloHost;
    }

    public void setTbloHost(Long tbloHost) {
        this.tbloHost = tbloHost;
    }

    public String getTbloNo() {
        return tbloNo;
    }

    public void setTbloNo(String tbloNo) {
        this.tbloNo = tbloNo == null ? null : tbloNo.trim();
    }

    public Long getTbloMenber() {
        return tbloMenber;
    }

    public void setTbloMenber(Long tbloMenber) {
        this.tbloMenber = tbloMenber;
    }

    public Long getTbloModel() {
        return tbloModel;
    }

    public void setTbloModel(Long tbloModel) {
        this.tbloModel = tbloModel;
    }

    public Long getTbloCar() {
        return tbloCar;
    }

    public void setTbloCar(Long tbloCar) {
        this.tbloCar = tbloCar;
    }

    public Date getTbloGetTime() {
        return tbloGetTime;
    }

    public void setTbloGetTime(Date tbloGetTime) {
        this.tbloGetTime = tbloGetTime;
    }

    public Date getTbloReturnTime() {
        return tbloReturnTime;
    }

    public void setTbloReturnTime(Date tbloReturnTime) {
        this.tbloReturnTime = tbloReturnTime;
    }

    public Date getTbloJiTime() {
        return tbloJiTime;
    }

    public void setTbloJiTime(Date tbloJiTime) {
        this.tbloJiTime = tbloJiTime;
    }

    public Long getTbloMenuTime() {
        return tbloMenuTime;
    }

    public void setTbloMenuTime(Long tbloMenuTime) {
        this.tbloMenuTime = tbloMenuTime;
    }

    public Double getTbloOrderRent() {
        return tbloOrderRent;
    }

    public void setTbloOrderRent(Double tbloOrderRent) {
        this.tbloOrderRent = tbloOrderRent;
    }

    public Long getTbloGetOutlets() {
        return tbloGetOutlets;
    }

    public void setTbloGetOutlets(Long tbloGetOutlets) {
        this.tbloGetOutlets = tbloGetOutlets;
    }

    public Long getTbloReturnOutlets() {
        return tbloReturnOutlets;
    }

    public void setTbloReturnOutlets(Long tbloReturnOutlets) {
        this.tbloReturnOutlets = tbloReturnOutlets;
    }

    public Double getTbloCouponReduction() {
        return tbloCouponReduction;
    }

    public void setTbloCouponReduction(Double tbloCouponReduction) {
        this.tbloCouponReduction = tbloCouponReduction;
    }

    public Double getTbloActualRent() {
        return tbloActualRent;
    }

    public void setTbloActualRent(Double tbloActualRent) {
        this.tbloActualRent = tbloActualRent;
    }

    public String getTbloOverTimes() {
        return tbloOverTimes;
    }

    public void setTbloOverTimes(String tbloOverTimes) {
        this.tbloOverTimes = tbloOverTimes == null ? null : tbloOverTimes.trim();
    }

    public Double getTbloOverRent() {
        return tbloOverRent;
    }

    public void setTbloOverRent(Double tbloOverRent) {
        this.tbloOverRent = tbloOverRent;
    }

    public Short getTbloOverPay() {
        return tbloOverPay;
    }

    public void setTbloOverPay(Short tbloOverPay) {
        this.tbloOverPay = tbloOverPay;
    }

    public Date getTbloOverPaytime() {
        return tbloOverPaytime;
    }

    public void setTbloOverPaytime(Date tbloOverPaytime) {
        this.tbloOverPaytime = tbloOverPaytime;
    }

    public String getTbloImglist() {
        return tbloImglist;
    }

    public void setTbloImglist(String tbloImglist) {
        this.tbloImglist = tbloImglist == null ? null : tbloImglist.trim();
    }

    public String getTbloReturnImg() {
        return tbloReturnImg;
    }

    public void setTbloReturnImg(String tbloReturnImg) {
        this.tbloReturnImg = tbloReturnImg == null ? null : tbloReturnImg.trim();
    }

    public Short getTbloPayType() {
        return tbloPayType;
    }

    public void setTbloPayType(Short tbloPayType) {
        this.tbloPayType = tbloPayType;
    }

    public Date getTbloPayTime() {
        return tbloPayTime;
    }

    public void setTbloPayTime(Date tbloPayTime) {
        this.tbloPayTime = tbloPayTime;
    }

    public String getTbloTakelatlng() {
        return tbloTakelatlng;
    }

    public void setTbloTakelatlng(String tbloTakelatlng) {
        this.tbloTakelatlng = tbloTakelatlng == null ? null : tbloTakelatlng.trim();
    }

    public String getTbloReturnlatlng() {
        return tbloReturnlatlng;
    }

    public void setTbloReturnlatlng(String tbloReturnlatlng) {
        this.tbloReturnlatlng = tbloReturnlatlng == null ? null : tbloReturnlatlng.trim();
    }

    public String getTbloSrc() {
        return tbloSrc;
    }

    public void setTbloSrc(String tbloSrc) {
        this.tbloSrc = tbloSrc == null ? null : tbloSrc.trim();
    }

    public Long getTbloUpdateUser() {
        return tbloUpdateUser;
    }

    public void setTbloUpdateUser(Long tbloUpdateUser) {
        this.tbloUpdateUser = tbloUpdateUser;
    }

    public Date getTbloUpdateTime() {
        return tbloUpdateTime;
    }

    public void setTbloUpdateTime(Date tbloUpdateTime) {
        this.tbloUpdateTime = tbloUpdateTime;
    }

    public Long getTbloCreateUser() {
        return tbloCreateUser;
    }

    public void setTbloCreateUser(Long tbloCreateUser) {
        this.tbloCreateUser = tbloCreateUser;
    }

    public Date getTbloAddTime() {
        return tbloAddTime;
    }

    public void setTbloAddTime(Date tbloAddTime) {
        this.tbloAddTime = tbloAddTime;
    }

    public Short getTbloStatus() {
        return tbloStatus;
    }

    public void setTbloStatus(Short tbloStatus) {
        this.tbloStatus = tbloStatus;
    }

    public String getTbloText() {
        return tbloText;
    }

    public void setTbloText(String tbloText) {
        this.tbloText = tbloText == null ? null : tbloText.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbloId=").append(tbloId);
        sb.append(", tbloHost=").append(tbloHost);
        sb.append(", tbloNo=").append(tbloNo);
        sb.append(", tbloMenber=").append(tbloMenber);
        sb.append(", tbloModel=").append(tbloModel);
        sb.append(", tbloCar=").append(tbloCar);
        sb.append(", tbloGetTime=").append(tbloGetTime);
        sb.append(", tbloReturnTime=").append(tbloReturnTime);
        sb.append(", tbloJiTime=").append(tbloJiTime);
        sb.append(", tbloMenuTime=").append(tbloMenuTime);
        sb.append(", tbloOrderRent=").append(tbloOrderRent);
        sb.append(", tbloGetOutlets=").append(tbloGetOutlets);
        sb.append(", tbloReturnOutlets=").append(tbloReturnOutlets);
        sb.append(", tbloCouponReduction=").append(tbloCouponReduction);
        sb.append(", tbloActualRent=").append(tbloActualRent);
        sb.append(", tbloOverTimes=").append(tbloOverTimes);
        sb.append(", tbloOverRent=").append(tbloOverRent);
        sb.append(", tbloOverPay=").append(tbloOverPay);
        sb.append(", tbloOverPaytime=").append(tbloOverPaytime);
        sb.append(", tbloImglist=").append(tbloImglist);
        sb.append(", tbloReturnImg=").append(tbloReturnImg);
        sb.append(", tbloPayType=").append(tbloPayType);
        sb.append(", tbloPayTime=").append(tbloPayTime);
        sb.append(", tbloTakelatlng=").append(tbloTakelatlng);
        sb.append(", tbloReturnlatlng=").append(tbloReturnlatlng);
        sb.append(", tbloSrc=").append(tbloSrc);
        sb.append(", tbloUpdateUser=").append(tbloUpdateUser);
        sb.append(", tbloUpdateTime=").append(tbloUpdateTime);
        sb.append(", tbloCreateUser=").append(tbloCreateUser);
        sb.append(", tbloAddTime=").append(tbloAddTime);
        sb.append(", tbloStatus=").append(tbloStatus);
        sb.append(", tbloText=").append(tbloText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}