package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Member implements Serializable {
    private Integer tbmId;

    private Short tbmHost;

    private String tbmMobile;

    private String tbmName;

    private Byte tbmType;

    private Short tbmUserType;

    private Byte tbmIncome;

    private String tbmHeader;

    private String tbmEmail;

    private String tbmInviteCode;

    private Integer tbmInviteUser;

    private Date tbmUpdateTime;

    private Date tbmAddTime;

    private Date tbmDepositAddtime;

    private Date tbmLdepositAddtime;

    private Date tbmCheckTime;

    private Date tbmLastTime;

    private Integer tbmLoginS;

    private BigDecimal tbmLat;

    private BigDecimal tbmLng;

    private Date tbmFirstUse;

    private Date tbmLastUse;

    private BigDecimal tbmAllRecharge;

    private Integer tbmAllOrderS;

    private Integer tbmAllamounts;

    private BigDecimal tbmAllUseTime;

    private Integer tbmAllViolatS;

    private Integer tbmUnViolatS;

    private Integer tbmAllTroubleS;

    private Date tbmFirstRecharge;

    private Date tbmRefundTime;

    private Byte tbmFrom;

    private Byte tbmCertifyType;

    private String tbmCertifyNum;

    private String tbmCertifyImage;

    private Date tbmCertifyExpire;

    private String tbmIdFront;

    private String tbmIdBack;

    private String tbmDriverFront;

    private String tbmDriverBack;

    private String tbmCheckImage;

    private String tbmCompany;

    private String tbmCertifyInfo;

    private String tbmHoldImage;

    private String tbmDriverImage;

    private Date tbmDriverExpire;

    private String tbmDriverType;

    private String tbmDriverInfo;

    private Byte tbmSex;

    private Date tbmBirthday;

    private String tbmNation;

    private String tbmAddress;

    private String tbmPostil;

    private String tbmRemark;

    private Byte tbmCanOrder;

    private Byte tbmState;

    private Byte tbmStatus;

    private String tbmMobilePlatform;

    private String tbmSystemVersion;

    private String tbmAppVersion;

    private String tbmProtocolIds;

    private String tbmSysMsgIds;

    private Integer tbmCertifyCount;

    private Date createtime;

    private Date modifydate;

    private Long tbmInfo;

    private static final long serialVersionUID = 1L;

    public Integer getTbmId() {
        return tbmId;
    }

    public void setTbmId(Integer tbmId) {
        this.tbmId = tbmId;
    }

    public Short getTbmHost() {
        return tbmHost;
    }

    public void setTbmHost(Short tbmHost) {
        this.tbmHost = tbmHost;
    }

    public String getTbmMobile() {
        return tbmMobile;
    }

    public void setTbmMobile(String tbmMobile) {
        this.tbmMobile = tbmMobile == null ? null : tbmMobile.trim();
    }

    public String getTbmName() {
        return tbmName;
    }

    public void setTbmName(String tbmName) {
        this.tbmName = tbmName == null ? null : tbmName.trim();
    }

    public Byte getTbmType() {
        return tbmType;
    }

    public void setTbmType(Byte tbmType) {
        this.tbmType = tbmType;
    }

    public Short getTbmUserType() {
        return tbmUserType;
    }

    public void setTbmUserType(Short tbmUserType) {
        this.tbmUserType = tbmUserType;
    }

    public Byte getTbmIncome() {
        return tbmIncome;
    }

    public void setTbmIncome(Byte tbmIncome) {
        this.tbmIncome = tbmIncome;
    }

    public String getTbmHeader() {
        return tbmHeader;
    }

    public void setTbmHeader(String tbmHeader) {
        this.tbmHeader = tbmHeader == null ? null : tbmHeader.trim();
    }

    public String getTbmEmail() {
        return tbmEmail;
    }

    public void setTbmEmail(String tbmEmail) {
        this.tbmEmail = tbmEmail == null ? null : tbmEmail.trim();
    }

    public String getTbmInviteCode() {
        return tbmInviteCode;
    }

    public void setTbmInviteCode(String tbmInviteCode) {
        this.tbmInviteCode = tbmInviteCode == null ? null : tbmInviteCode.trim();
    }

    public Integer getTbmInviteUser() {
        return tbmInviteUser;
    }

    public void setTbmInviteUser(Integer tbmInviteUser) {
        this.tbmInviteUser = tbmInviteUser;
    }

    public Date getTbmUpdateTime() {
        return tbmUpdateTime;
    }

    public void setTbmUpdateTime(Date tbmUpdateTime) {
        this.tbmUpdateTime = tbmUpdateTime;
    }

    public Date getTbmAddTime() {
        return tbmAddTime;
    }

    public void setTbmAddTime(Date tbmAddTime) {
        this.tbmAddTime = tbmAddTime;
    }

    public Date getTbmDepositAddtime() {
        return tbmDepositAddtime;
    }

    public void setTbmDepositAddtime(Date tbmDepositAddtime) {
        this.tbmDepositAddtime = tbmDepositAddtime;
    }

    public Date getTbmLdepositAddtime() {
        return tbmLdepositAddtime;
    }

    public void setTbmLdepositAddtime(Date tbmLdepositAddtime) {
        this.tbmLdepositAddtime = tbmLdepositAddtime;
    }

    public Date getTbmCheckTime() {
        return tbmCheckTime;
    }

    public void setTbmCheckTime(Date tbmCheckTime) {
        this.tbmCheckTime = tbmCheckTime;
    }

    public Date getTbmLastTime() {
        return tbmLastTime;
    }

    public void setTbmLastTime(Date tbmLastTime) {
        this.tbmLastTime = tbmLastTime;
    }

    public Integer getTbmLoginS() {
        return tbmLoginS;
    }

    public void setTbmLoginS(Integer tbmLoginS) {
        this.tbmLoginS = tbmLoginS;
    }

    public BigDecimal getTbmLat() {
        return tbmLat;
    }

    public void setTbmLat(BigDecimal tbmLat) {
        this.tbmLat = tbmLat;
    }

    public BigDecimal getTbmLng() {
        return tbmLng;
    }

    public void setTbmLng(BigDecimal tbmLng) {
        this.tbmLng = tbmLng;
    }

    public Date getTbmFirstUse() {
        return tbmFirstUse;
    }

    public void setTbmFirstUse(Date tbmFirstUse) {
        this.tbmFirstUse = tbmFirstUse;
    }

    public Date getTbmLastUse() {
        return tbmLastUse;
    }

    public void setTbmLastUse(Date tbmLastUse) {
        this.tbmLastUse = tbmLastUse;
    }

    public BigDecimal getTbmAllRecharge() {
        return tbmAllRecharge;
    }

    public void setTbmAllRecharge(BigDecimal tbmAllRecharge) {
        this.tbmAllRecharge = tbmAllRecharge;
    }

    public Integer getTbmAllOrderS() {
        return tbmAllOrderS;
    }

    public void setTbmAllOrderS(Integer tbmAllOrderS) {
        this.tbmAllOrderS = tbmAllOrderS;
    }

    public Integer getTbmAllamounts() {
        return tbmAllamounts;
    }

    public void setTbmAllamounts(Integer tbmAllamounts) {
        this.tbmAllamounts = tbmAllamounts;
    }

    public BigDecimal getTbmAllUseTime() {
        return tbmAllUseTime;
    }

    public void setTbmAllUseTime(BigDecimal tbmAllUseTime) {
        this.tbmAllUseTime = tbmAllUseTime;
    }

    public Integer getTbmAllViolatS() {
        return tbmAllViolatS;
    }

    public void setTbmAllViolatS(Integer tbmAllViolatS) {
        this.tbmAllViolatS = tbmAllViolatS;
    }

    public Integer getTbmUnViolatS() {
        return tbmUnViolatS;
    }

    public void setTbmUnViolatS(Integer tbmUnViolatS) {
        this.tbmUnViolatS = tbmUnViolatS;
    }

    public Integer getTbmAllTroubleS() {
        return tbmAllTroubleS;
    }

    public void setTbmAllTroubleS(Integer tbmAllTroubleS) {
        this.tbmAllTroubleS = tbmAllTroubleS;
    }

    public Date getTbmFirstRecharge() {
        return tbmFirstRecharge;
    }

    public void setTbmFirstRecharge(Date tbmFirstRecharge) {
        this.tbmFirstRecharge = tbmFirstRecharge;
    }

    public Date getTbmRefundTime() {
        return tbmRefundTime;
    }

    public void setTbmRefundTime(Date tbmRefundTime) {
        this.tbmRefundTime = tbmRefundTime;
    }

    public Byte getTbmFrom() {
        return tbmFrom;
    }

    public void setTbmFrom(Byte tbmFrom) {
        this.tbmFrom = tbmFrom;
    }

    public Byte getTbmCertifyType() {
        return tbmCertifyType;
    }

    public void setTbmCertifyType(Byte tbmCertifyType) {
        this.tbmCertifyType = tbmCertifyType;
    }

    public String getTbmCertifyNum() {
        return tbmCertifyNum;
    }

    public void setTbmCertifyNum(String tbmCertifyNum) {
        this.tbmCertifyNum = tbmCertifyNum == null ? null : tbmCertifyNum.trim();
    }

    public String getTbmCertifyImage() {
        return tbmCertifyImage;
    }

    public void setTbmCertifyImage(String tbmCertifyImage) {
        this.tbmCertifyImage = tbmCertifyImage == null ? null : tbmCertifyImage.trim();
    }

    public Date getTbmCertifyExpire() {
        return tbmCertifyExpire;
    }

    public void setTbmCertifyExpire(Date tbmCertifyExpire) {
        this.tbmCertifyExpire = tbmCertifyExpire;
    }

    public String getTbmIdFront() {
        return tbmIdFront;
    }

    public void setTbmIdFront(String tbmIdFront) {
        this.tbmIdFront = tbmIdFront == null ? null : tbmIdFront.trim();
    }

    public String getTbmIdBack() {
        return tbmIdBack;
    }

    public void setTbmIdBack(String tbmIdBack) {
        this.tbmIdBack = tbmIdBack == null ? null : tbmIdBack.trim();
    }

    public String getTbmDriverFront() {
        return tbmDriverFront;
    }

    public void setTbmDriverFront(String tbmDriverFront) {
        this.tbmDriverFront = tbmDriverFront == null ? null : tbmDriverFront.trim();
    }

    public String getTbmDriverBack() {
        return tbmDriverBack;
    }

    public void setTbmDriverBack(String tbmDriverBack) {
        this.tbmDriverBack = tbmDriverBack == null ? null : tbmDriverBack.trim();
    }

    public String getTbmCheckImage() {
        return tbmCheckImage;
    }

    public void setTbmCheckImage(String tbmCheckImage) {
        this.tbmCheckImage = tbmCheckImage == null ? null : tbmCheckImage.trim();
    }

    public String getTbmCompany() {
        return tbmCompany;
    }

    public void setTbmCompany(String tbmCompany) {
        this.tbmCompany = tbmCompany == null ? null : tbmCompany.trim();
    }

    public String getTbmCertifyInfo() {
        return tbmCertifyInfo;
    }

    public void setTbmCertifyInfo(String tbmCertifyInfo) {
        this.tbmCertifyInfo = tbmCertifyInfo == null ? null : tbmCertifyInfo.trim();
    }

    public String getTbmHoldImage() {
        return tbmHoldImage;
    }

    public void setTbmHoldImage(String tbmHoldImage) {
        this.tbmHoldImage = tbmHoldImage == null ? null : tbmHoldImage.trim();
    }

    public String getTbmDriverImage() {
        return tbmDriverImage;
    }

    public void setTbmDriverImage(String tbmDriverImage) {
        this.tbmDriverImage = tbmDriverImage == null ? null : tbmDriverImage.trim();
    }

    public Date getTbmDriverExpire() {
        return tbmDriverExpire;
    }

    public void setTbmDriverExpire(Date tbmDriverExpire) {
        this.tbmDriverExpire = tbmDriverExpire;
    }

    public String getTbmDriverType() {
        return tbmDriverType;
    }

    public void setTbmDriverType(String tbmDriverType) {
        this.tbmDriverType = tbmDriverType == null ? null : tbmDriverType.trim();
    }

    public String getTbmDriverInfo() {
        return tbmDriverInfo;
    }

    public void setTbmDriverInfo(String tbmDriverInfo) {
        this.tbmDriverInfo = tbmDriverInfo == null ? null : tbmDriverInfo.trim();
    }

    public Byte getTbmSex() {
        return tbmSex;
    }

    public void setTbmSex(Byte tbmSex) {
        this.tbmSex = tbmSex;
    }

    public Date getTbmBirthday() {
        return tbmBirthday;
    }

    public void setTbmBirthday(Date tbmBirthday) {
        this.tbmBirthday = tbmBirthday;
    }

    public String getTbmNation() {
        return tbmNation;
    }

    public void setTbmNation(String tbmNation) {
        this.tbmNation = tbmNation == null ? null : tbmNation.trim();
    }

    public String getTbmAddress() {
        return tbmAddress;
    }

    public void setTbmAddress(String tbmAddress) {
        this.tbmAddress = tbmAddress == null ? null : tbmAddress.trim();
    }

    public String getTbmPostil() {
        return tbmPostil;
    }

    public void setTbmPostil(String tbmPostil) {
        this.tbmPostil = tbmPostil == null ? null : tbmPostil.trim();
    }

    public String getTbmRemark() {
        return tbmRemark;
    }

    public void setTbmRemark(String tbmRemark) {
        this.tbmRemark = tbmRemark == null ? null : tbmRemark.trim();
    }

    public Byte getTbmCanOrder() {
        return tbmCanOrder;
    }

    public void setTbmCanOrder(Byte tbmCanOrder) {
        this.tbmCanOrder = tbmCanOrder;
    }

    public Byte getTbmState() {
        return tbmState;
    }

    public void setTbmState(Byte tbmState) {
        this.tbmState = tbmState;
    }

    public Byte getTbmStatus() {
        return tbmStatus;
    }

    public void setTbmStatus(Byte tbmStatus) {
        this.tbmStatus = tbmStatus;
    }

    public String getTbmMobilePlatform() {
        return tbmMobilePlatform;
    }

    public void setTbmMobilePlatform(String tbmMobilePlatform) {
        this.tbmMobilePlatform = tbmMobilePlatform == null ? null : tbmMobilePlatform.trim();
    }

    public String getTbmSystemVersion() {
        return tbmSystemVersion;
    }

    public void setTbmSystemVersion(String tbmSystemVersion) {
        this.tbmSystemVersion = tbmSystemVersion == null ? null : tbmSystemVersion.trim();
    }

    public String getTbmAppVersion() {
        return tbmAppVersion;
    }

    public void setTbmAppVersion(String tbmAppVersion) {
        this.tbmAppVersion = tbmAppVersion == null ? null : tbmAppVersion.trim();
    }

    public String getTbmProtocolIds() {
        return tbmProtocolIds;
    }

    public void setTbmProtocolIds(String tbmProtocolIds) {
        this.tbmProtocolIds = tbmProtocolIds == null ? null : tbmProtocolIds.trim();
    }

    public String getTbmSysMsgIds() {
        return tbmSysMsgIds;
    }

    public void setTbmSysMsgIds(String tbmSysMsgIds) {
        this.tbmSysMsgIds = tbmSysMsgIds == null ? null : tbmSysMsgIds.trim();
    }

    public Integer getTbmCertifyCount() {
        return tbmCertifyCount;
    }

    public void setTbmCertifyCount(Integer tbmCertifyCount) {
        this.tbmCertifyCount = tbmCertifyCount;
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

    public Long getTbmInfo() {
        return tbmInfo;
    }

    public void setTbmInfo(Long tbmInfo) {
        this.tbmInfo = tbmInfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbmId=").append(tbmId);
        sb.append(", tbmHost=").append(tbmHost);
        sb.append(", tbmMobile=").append(tbmMobile);
        sb.append(", tbmName=").append(tbmName);
        sb.append(", tbmType=").append(tbmType);
        sb.append(", tbmUserType=").append(tbmUserType);
        sb.append(", tbmIncome=").append(tbmIncome);
        sb.append(", tbmHeader=").append(tbmHeader);
        sb.append(", tbmEmail=").append(tbmEmail);
        sb.append(", tbmInviteCode=").append(tbmInviteCode);
        sb.append(", tbmInviteUser=").append(tbmInviteUser);
        sb.append(", tbmUpdateTime=").append(tbmUpdateTime);
        sb.append(", tbmAddTime=").append(tbmAddTime);
        sb.append(", tbmDepositAddtime=").append(tbmDepositAddtime);
        sb.append(", tbmLdepositAddtime=").append(tbmLdepositAddtime);
        sb.append(", tbmCheckTime=").append(tbmCheckTime);
        sb.append(", tbmLastTime=").append(tbmLastTime);
        sb.append(", tbmLoginS=").append(tbmLoginS);
        sb.append(", tbmLat=").append(tbmLat);
        sb.append(", tbmLng=").append(tbmLng);
        sb.append(", tbmFirstUse=").append(tbmFirstUse);
        sb.append(", tbmLastUse=").append(tbmLastUse);
        sb.append(", tbmAllRecharge=").append(tbmAllRecharge);
        sb.append(", tbmAllOrderS=").append(tbmAllOrderS);
        sb.append(", tbmAllamounts=").append(tbmAllamounts);
        sb.append(", tbmAllUseTime=").append(tbmAllUseTime);
        sb.append(", tbmAllViolatS=").append(tbmAllViolatS);
        sb.append(", tbmUnViolatS=").append(tbmUnViolatS);
        sb.append(", tbmAllTroubleS=").append(tbmAllTroubleS);
        sb.append(", tbmFirstRecharge=").append(tbmFirstRecharge);
        sb.append(", tbmRefundTime=").append(tbmRefundTime);
        sb.append(", tbmFrom=").append(tbmFrom);
        sb.append(", tbmCertifyType=").append(tbmCertifyType);
        sb.append(", tbmCertifyNum=").append(tbmCertifyNum);
        sb.append(", tbmCertifyImage=").append(tbmCertifyImage);
        sb.append(", tbmCertifyExpire=").append(tbmCertifyExpire);
        sb.append(", tbmIdFront=").append(tbmIdFront);
        sb.append(", tbmIdBack=").append(tbmIdBack);
        sb.append(", tbmDriverFront=").append(tbmDriverFront);
        sb.append(", tbmDriverBack=").append(tbmDriverBack);
        sb.append(", tbmCheckImage=").append(tbmCheckImage);
        sb.append(", tbmCompany=").append(tbmCompany);
        sb.append(", tbmCertifyInfo=").append(tbmCertifyInfo);
        sb.append(", tbmHoldImage=").append(tbmHoldImage);
        sb.append(", tbmDriverImage=").append(tbmDriverImage);
        sb.append(", tbmDriverExpire=").append(tbmDriverExpire);
        sb.append(", tbmDriverType=").append(tbmDriverType);
        sb.append(", tbmDriverInfo=").append(tbmDriverInfo);
        sb.append(", tbmSex=").append(tbmSex);
        sb.append(", tbmBirthday=").append(tbmBirthday);
        sb.append(", tbmNation=").append(tbmNation);
        sb.append(", tbmAddress=").append(tbmAddress);
        sb.append(", tbmPostil=").append(tbmPostil);
        sb.append(", tbmRemark=").append(tbmRemark);
        sb.append(", tbmCanOrder=").append(tbmCanOrder);
        sb.append(", tbmState=").append(tbmState);
        sb.append(", tbmStatus=").append(tbmStatus);
        sb.append(", tbmMobilePlatform=").append(tbmMobilePlatform);
        sb.append(", tbmSystemVersion=").append(tbmSystemVersion);
        sb.append(", tbmAppVersion=").append(tbmAppVersion);
        sb.append(", tbmProtocolIds=").append(tbmProtocolIds);
        sb.append(", tbmSysMsgIds=").append(tbmSysMsgIds);
        sb.append(", tbmCertifyCount=").append(tbmCertifyCount);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", tbmInfo=").append(tbmInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}