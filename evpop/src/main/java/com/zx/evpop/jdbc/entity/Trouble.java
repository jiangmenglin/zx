package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Trouble implements Serializable {
    private Long tbtId;

    private Long tbtHost;

    private Long tbtOrder;

    private Long tbtMember;

    private String tbtDriverInfo;

    private Long tbtCar;

    private Byte tbtType;

    private Byte tbtRepairType;

    private Long tbtRepairAdr;

    private Date tbtRepairTime;

    private Long tbtArea;

    private Long tbtRepair;

    private String tbtReportNum;

    private Byte tbtInsureType;

    private Date tbtHappenTime;

    private Long tbtAdder;

    private Long tbtEditer;

    private Long tbtCaser;

    private Date tbtFinishTime;

    private Date tbtUpdateTime;

    private Date tbtAddTime;

    private Short tbtStatus;

    private Byte tbtTrailer;

    private Double tbtTrailerFee;

    private String tbtAuditor;

    private Double tbtAuditorFee;

    private Double tbtAuditorOther;

    private Double tbtAdvanceFee;

    private Double tbtDamageFee;

    private Double tbtInsureUp;

    private Double tbtFeeOther;

    private Date tbtChargeTime;

    private Byte tbtPayType;

    private String tbtTrackPeople;

    private String tbtThirdCarno;

    private Double tbtThirdLoss;

    private String tbtThirdInfo;

    private String tbtThirdInsure;

    private String tbtRemark;

    private String tbtRepairBill;

    private Date tbtSettleTime;

    private Double tbtClaimFee;

    private Double tbtRepairFee;

    private Double tbtNeedFee;

    private Double tbtRealFee;

    private String tbtDecipt;

    private static final long serialVersionUID = 1L;

    public Long getTbtId() {
        return tbtId;
    }

    public void setTbtId(Long tbtId) {
        this.tbtId = tbtId;
    }

    public Long getTbtHost() {
        return tbtHost;
    }

    public void setTbtHost(Long tbtHost) {
        this.tbtHost = tbtHost;
    }

    public Long getTbtOrder() {
        return tbtOrder;
    }

    public void setTbtOrder(Long tbtOrder) {
        this.tbtOrder = tbtOrder;
    }

    public Long getTbtMember() {
        return tbtMember;
    }

    public void setTbtMember(Long tbtMember) {
        this.tbtMember = tbtMember;
    }

    public String getTbtDriverInfo() {
        return tbtDriverInfo;
    }

    public void setTbtDriverInfo(String tbtDriverInfo) {
        this.tbtDriverInfo = tbtDriverInfo == null ? null : tbtDriverInfo.trim();
    }

    public Long getTbtCar() {
        return tbtCar;
    }

    public void setTbtCar(Long tbtCar) {
        this.tbtCar = tbtCar;
    }

    public Byte getTbtType() {
        return tbtType;
    }

    public void setTbtType(Byte tbtType) {
        this.tbtType = tbtType;
    }

    public Byte getTbtRepairType() {
        return tbtRepairType;
    }

    public void setTbtRepairType(Byte tbtRepairType) {
        this.tbtRepairType = tbtRepairType;
    }

    public Long getTbtRepairAdr() {
        return tbtRepairAdr;
    }

    public void setTbtRepairAdr(Long tbtRepairAdr) {
        this.tbtRepairAdr = tbtRepairAdr;
    }

    public Date getTbtRepairTime() {
        return tbtRepairTime;
    }

    public void setTbtRepairTime(Date tbtRepairTime) {
        this.tbtRepairTime = tbtRepairTime;
    }

    public Long getTbtArea() {
        return tbtArea;
    }

    public void setTbtArea(Long tbtArea) {
        this.tbtArea = tbtArea;
    }

    public Long getTbtRepair() {
        return tbtRepair;
    }

    public void setTbtRepair(Long tbtRepair) {
        this.tbtRepair = tbtRepair;
    }

    public String getTbtReportNum() {
        return tbtReportNum;
    }

    public void setTbtReportNum(String tbtReportNum) {
        this.tbtReportNum = tbtReportNum == null ? null : tbtReportNum.trim();
    }

    public Byte getTbtInsureType() {
        return tbtInsureType;
    }

    public void setTbtInsureType(Byte tbtInsureType) {
        this.tbtInsureType = tbtInsureType;
    }

    public Date getTbtHappenTime() {
        return tbtHappenTime;
    }

    public void setTbtHappenTime(Date tbtHappenTime) {
        this.tbtHappenTime = tbtHappenTime;
    }

    public Long getTbtAdder() {
        return tbtAdder;
    }

    public void setTbtAdder(Long tbtAdder) {
        this.tbtAdder = tbtAdder;
    }

    public Long getTbtEditer() {
        return tbtEditer;
    }

    public void setTbtEditer(Long tbtEditer) {
        this.tbtEditer = tbtEditer;
    }

    public Long getTbtCaser() {
        return tbtCaser;
    }

    public void setTbtCaser(Long tbtCaser) {
        this.tbtCaser = tbtCaser;
    }

    public Date getTbtFinishTime() {
        return tbtFinishTime;
    }

    public void setTbtFinishTime(Date tbtFinishTime) {
        this.tbtFinishTime = tbtFinishTime;
    }

    public Date getTbtUpdateTime() {
        return tbtUpdateTime;
    }

    public void setTbtUpdateTime(Date tbtUpdateTime) {
        this.tbtUpdateTime = tbtUpdateTime;
    }

    public Date getTbtAddTime() {
        return tbtAddTime;
    }

    public void setTbtAddTime(Date tbtAddTime) {
        this.tbtAddTime = tbtAddTime;
    }

    public Short getTbtStatus() {
        return tbtStatus;
    }

    public void setTbtStatus(Short tbtStatus) {
        this.tbtStatus = tbtStatus;
    }

    public Byte getTbtTrailer() {
        return tbtTrailer;
    }

    public void setTbtTrailer(Byte tbtTrailer) {
        this.tbtTrailer = tbtTrailer;
    }

    public Double getTbtTrailerFee() {
        return tbtTrailerFee;
    }

    public void setTbtTrailerFee(Double tbtTrailerFee) {
        this.tbtTrailerFee = tbtTrailerFee;
    }

    public String getTbtAuditor() {
        return tbtAuditor;
    }

    public void setTbtAuditor(String tbtAuditor) {
        this.tbtAuditor = tbtAuditor == null ? null : tbtAuditor.trim();
    }

    public Double getTbtAuditorFee() {
        return tbtAuditorFee;
    }

    public void setTbtAuditorFee(Double tbtAuditorFee) {
        this.tbtAuditorFee = tbtAuditorFee;
    }

    public Double getTbtAuditorOther() {
        return tbtAuditorOther;
    }

    public void setTbtAuditorOther(Double tbtAuditorOther) {
        this.tbtAuditorOther = tbtAuditorOther;
    }

    public Double getTbtAdvanceFee() {
        return tbtAdvanceFee;
    }

    public void setTbtAdvanceFee(Double tbtAdvanceFee) {
        this.tbtAdvanceFee = tbtAdvanceFee;
    }

    public Double getTbtDamageFee() {
        return tbtDamageFee;
    }

    public void setTbtDamageFee(Double tbtDamageFee) {
        this.tbtDamageFee = tbtDamageFee;
    }

    public Double getTbtInsureUp() {
        return tbtInsureUp;
    }

    public void setTbtInsureUp(Double tbtInsureUp) {
        this.tbtInsureUp = tbtInsureUp;
    }

    public Double getTbtFeeOther() {
        return tbtFeeOther;
    }

    public void setTbtFeeOther(Double tbtFeeOther) {
        this.tbtFeeOther = tbtFeeOther;
    }

    public Date getTbtChargeTime() {
        return tbtChargeTime;
    }

    public void setTbtChargeTime(Date tbtChargeTime) {
        this.tbtChargeTime = tbtChargeTime;
    }

    public Byte getTbtPayType() {
        return tbtPayType;
    }

    public void setTbtPayType(Byte tbtPayType) {
        this.tbtPayType = tbtPayType;
    }

    public String getTbtTrackPeople() {
        return tbtTrackPeople;
    }

    public void setTbtTrackPeople(String tbtTrackPeople) {
        this.tbtTrackPeople = tbtTrackPeople == null ? null : tbtTrackPeople.trim();
    }

    public String getTbtThirdCarno() {
        return tbtThirdCarno;
    }

    public void setTbtThirdCarno(String tbtThirdCarno) {
        this.tbtThirdCarno = tbtThirdCarno == null ? null : tbtThirdCarno.trim();
    }

    public Double getTbtThirdLoss() {
        return tbtThirdLoss;
    }

    public void setTbtThirdLoss(Double tbtThirdLoss) {
        this.tbtThirdLoss = tbtThirdLoss;
    }

    public String getTbtThirdInfo() {
        return tbtThirdInfo;
    }

    public void setTbtThirdInfo(String tbtThirdInfo) {
        this.tbtThirdInfo = tbtThirdInfo == null ? null : tbtThirdInfo.trim();
    }

    public String getTbtThirdInsure() {
        return tbtThirdInsure;
    }

    public void setTbtThirdInsure(String tbtThirdInsure) {
        this.tbtThirdInsure = tbtThirdInsure == null ? null : tbtThirdInsure.trim();
    }

    public String getTbtRemark() {
        return tbtRemark;
    }

    public void setTbtRemark(String tbtRemark) {
        this.tbtRemark = tbtRemark == null ? null : tbtRemark.trim();
    }

    public String getTbtRepairBill() {
        return tbtRepairBill;
    }

    public void setTbtRepairBill(String tbtRepairBill) {
        this.tbtRepairBill = tbtRepairBill == null ? null : tbtRepairBill.trim();
    }

    public Date getTbtSettleTime() {
        return tbtSettleTime;
    }

    public void setTbtSettleTime(Date tbtSettleTime) {
        this.tbtSettleTime = tbtSettleTime;
    }

    public Double getTbtClaimFee() {
        return tbtClaimFee;
    }

    public void setTbtClaimFee(Double tbtClaimFee) {
        this.tbtClaimFee = tbtClaimFee;
    }

    public Double getTbtRepairFee() {
        return tbtRepairFee;
    }

    public void setTbtRepairFee(Double tbtRepairFee) {
        this.tbtRepairFee = tbtRepairFee;
    }

    public Double getTbtNeedFee() {
        return tbtNeedFee;
    }

    public void setTbtNeedFee(Double tbtNeedFee) {
        this.tbtNeedFee = tbtNeedFee;
    }

    public Double getTbtRealFee() {
        return tbtRealFee;
    }

    public void setTbtRealFee(Double tbtRealFee) {
        this.tbtRealFee = tbtRealFee;
    }

    public String getTbtDecipt() {
        return tbtDecipt;
    }

    public void setTbtDecipt(String tbtDecipt) {
        this.tbtDecipt = tbtDecipt == null ? null : tbtDecipt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbtId=").append(tbtId);
        sb.append(", tbtHost=").append(tbtHost);
        sb.append(", tbtOrder=").append(tbtOrder);
        sb.append(", tbtMember=").append(tbtMember);
        sb.append(", tbtDriverInfo=").append(tbtDriverInfo);
        sb.append(", tbtCar=").append(tbtCar);
        sb.append(", tbtType=").append(tbtType);
        sb.append(", tbtRepairType=").append(tbtRepairType);
        sb.append(", tbtRepairAdr=").append(tbtRepairAdr);
        sb.append(", tbtRepairTime=").append(tbtRepairTime);
        sb.append(", tbtArea=").append(tbtArea);
        sb.append(", tbtRepair=").append(tbtRepair);
        sb.append(", tbtReportNum=").append(tbtReportNum);
        sb.append(", tbtInsureType=").append(tbtInsureType);
        sb.append(", tbtHappenTime=").append(tbtHappenTime);
        sb.append(", tbtAdder=").append(tbtAdder);
        sb.append(", tbtEditer=").append(tbtEditer);
        sb.append(", tbtCaser=").append(tbtCaser);
        sb.append(", tbtFinishTime=").append(tbtFinishTime);
        sb.append(", tbtUpdateTime=").append(tbtUpdateTime);
        sb.append(", tbtAddTime=").append(tbtAddTime);
        sb.append(", tbtStatus=").append(tbtStatus);
        sb.append(", tbtTrailer=").append(tbtTrailer);
        sb.append(", tbtTrailerFee=").append(tbtTrailerFee);
        sb.append(", tbtAuditor=").append(tbtAuditor);
        sb.append(", tbtAuditorFee=").append(tbtAuditorFee);
        sb.append(", tbtAuditorOther=").append(tbtAuditorOther);
        sb.append(", tbtAdvanceFee=").append(tbtAdvanceFee);
        sb.append(", tbtDamageFee=").append(tbtDamageFee);
        sb.append(", tbtInsureUp=").append(tbtInsureUp);
        sb.append(", tbtFeeOther=").append(tbtFeeOther);
        sb.append(", tbtChargeTime=").append(tbtChargeTime);
        sb.append(", tbtPayType=").append(tbtPayType);
        sb.append(", tbtTrackPeople=").append(tbtTrackPeople);
        sb.append(", tbtThirdCarno=").append(tbtThirdCarno);
        sb.append(", tbtThirdLoss=").append(tbtThirdLoss);
        sb.append(", tbtThirdInfo=").append(tbtThirdInfo);
        sb.append(", tbtThirdInsure=").append(tbtThirdInsure);
        sb.append(", tbtRemark=").append(tbtRemark);
        sb.append(", tbtRepairBill=").append(tbtRepairBill);
        sb.append(", tbtSettleTime=").append(tbtSettleTime);
        sb.append(", tbtClaimFee=").append(tbtClaimFee);
        sb.append(", tbtRepairFee=").append(tbtRepairFee);
        sb.append(", tbtNeedFee=").append(tbtNeedFee);
        sb.append(", tbtRealFee=").append(tbtRealFee);
        sb.append(", tbtDecipt=").append(tbtDecipt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}