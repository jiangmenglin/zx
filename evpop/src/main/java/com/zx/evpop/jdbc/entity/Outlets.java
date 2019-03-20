package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Outlets implements Serializable {
    private Integer tboId;

    private Short tboHost;

    private Long tboDistrict;

    private Integer tboArea;

    private String tboName;

    private BigDecimal tboLongitude;

    private BigDecimal tboLatitude;

    private String tboRange;

    private String tboAddress;

    private String tboSpace;

    private String tboDetails;

    private String tboDoorTime;

    private Double tboCost;

    private String tboPerson;

    private String tboContact;

    private Date tboUntil;

    private Date tboExpire;

    private Integer tboCarS;

    private Integer tboPositionS;

    private String tboImage;

    private Byte tboCanA;

    private Byte tboCanB;

    private Integer tboPriority;

    private Short tboOutletsType;

    private Integer tboVoteS;

    private String tboProfile;

    private Date tboUpdateTime;

    private Date tboAddTime;

    private Byte tboStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTboId() {
        return tboId;
    }

    public void setTboId(Integer tboId) {
        this.tboId = tboId;
    }

    public Short getTboHost() {
        return tboHost;
    }

    public void setTboHost(Short tboHost) {
        this.tboHost = tboHost;
    }

    public Long getTboDistrict() {
        return tboDistrict;
    }

    public void setTboDistrict(Long tboDistrict) {
        this.tboDistrict = tboDistrict;
    }

    public Integer getTboArea() {
        return tboArea;
    }

    public void setTboArea(Integer tboArea) {
        this.tboArea = tboArea;
    }

    public String getTboName() {
        return tboName;
    }

    public void setTboName(String tboName) {
        this.tboName = tboName == null ? null : tboName.trim();
    }

    public BigDecimal getTboLongitude() {
        return tboLongitude;
    }

    public void setTboLongitude(BigDecimal tboLongitude) {
        this.tboLongitude = tboLongitude;
    }

    public BigDecimal getTboLatitude() {
        return tboLatitude;
    }

    public void setTboLatitude(BigDecimal tboLatitude) {
        this.tboLatitude = tboLatitude;
    }

    public String getTboRange() {
        return tboRange;
    }

    public void setTboRange(String tboRange) {
        this.tboRange = tboRange == null ? null : tboRange.trim();
    }

    public String getTboAddress() {
        return tboAddress;
    }

    public void setTboAddress(String tboAddress) {
        this.tboAddress = tboAddress == null ? null : tboAddress.trim();
    }

    public String getTboSpace() {
        return tboSpace;
    }

    public void setTboSpace(String tboSpace) {
        this.tboSpace = tboSpace == null ? null : tboSpace.trim();
    }

    public String getTboDetails() {
        return tboDetails;
    }

    public void setTboDetails(String tboDetails) {
        this.tboDetails = tboDetails == null ? null : tboDetails.trim();
    }

    public String getTboDoorTime() {
        return tboDoorTime;
    }

    public void setTboDoorTime(String tboDoorTime) {
        this.tboDoorTime = tboDoorTime == null ? null : tboDoorTime.trim();
    }

    public Double getTboCost() {
        return tboCost;
    }

    public void setTboCost(Double tboCost) {
        this.tboCost = tboCost;
    }

    public String getTboPerson() {
        return tboPerson;
    }

    public void setTboPerson(String tboPerson) {
        this.tboPerson = tboPerson == null ? null : tboPerson.trim();
    }

    public String getTboContact() {
        return tboContact;
    }

    public void setTboContact(String tboContact) {
        this.tboContact = tboContact == null ? null : tboContact.trim();
    }

    public Date getTboUntil() {
        return tboUntil;
    }

    public void setTboUntil(Date tboUntil) {
        this.tboUntil = tboUntil;
    }

    public Date getTboExpire() {
        return tboExpire;
    }

    public void setTboExpire(Date tboExpire) {
        this.tboExpire = tboExpire;
    }

    public Integer getTboCarS() {
        return tboCarS;
    }

    public void setTboCarS(Integer tboCarS) {
        this.tboCarS = tboCarS;
    }

    public Integer getTboPositionS() {
        return tboPositionS;
    }

    public void setTboPositionS(Integer tboPositionS) {
        this.tboPositionS = tboPositionS;
    }

    public String getTboImage() {
        return tboImage;
    }

    public void setTboImage(String tboImage) {
        this.tboImage = tboImage == null ? null : tboImage.trim();
    }

    public Byte getTboCanA() {
        return tboCanA;
    }

    public void setTboCanA(Byte tboCanA) {
        this.tboCanA = tboCanA;
    }

    public Byte getTboCanB() {
        return tboCanB;
    }

    public void setTboCanB(Byte tboCanB) {
        this.tboCanB = tboCanB;
    }

    public Integer getTboPriority() {
        return tboPriority;
    }

    public void setTboPriority(Integer tboPriority) {
        this.tboPriority = tboPriority;
    }

    public Short getTboOutletsType() {
        return tboOutletsType;
    }

    public void setTboOutletsType(Short tboOutletsType) {
        this.tboOutletsType = tboOutletsType;
    }

    public Integer getTboVoteS() {
        return tboVoteS;
    }

    public void setTboVoteS(Integer tboVoteS) {
        this.tboVoteS = tboVoteS;
    }

    public String getTboProfile() {
        return tboProfile;
    }

    public void setTboProfile(String tboProfile) {
        this.tboProfile = tboProfile == null ? null : tboProfile.trim();
    }

    public Date getTboUpdateTime() {
        return tboUpdateTime;
    }

    public void setTboUpdateTime(Date tboUpdateTime) {
        this.tboUpdateTime = tboUpdateTime;
    }

    public Date getTboAddTime() {
        return tboAddTime;
    }

    public void setTboAddTime(Date tboAddTime) {
        this.tboAddTime = tboAddTime;
    }

    public Byte getTboStatus() {
        return tboStatus;
    }

    public void setTboStatus(Byte tboStatus) {
        this.tboStatus = tboStatus;
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
        sb.append(", tboId=").append(tboId);
        sb.append(", tboHost=").append(tboHost);
        sb.append(", tboDistrict=").append(tboDistrict);
        sb.append(", tboArea=").append(tboArea);
        sb.append(", tboName=").append(tboName);
        sb.append(", tboLongitude=").append(tboLongitude);
        sb.append(", tboLatitude=").append(tboLatitude);
        sb.append(", tboRange=").append(tboRange);
        sb.append(", tboAddress=").append(tboAddress);
        sb.append(", tboSpace=").append(tboSpace);
        sb.append(", tboDetails=").append(tboDetails);
        sb.append(", tboDoorTime=").append(tboDoorTime);
        sb.append(", tboCost=").append(tboCost);
        sb.append(", tboPerson=").append(tboPerson);
        sb.append(", tboContact=").append(tboContact);
        sb.append(", tboUntil=").append(tboUntil);
        sb.append(", tboExpire=").append(tboExpire);
        sb.append(", tboCarS=").append(tboCarS);
        sb.append(", tboPositionS=").append(tboPositionS);
        sb.append(", tboImage=").append(tboImage);
        sb.append(", tboCanA=").append(tboCanA);
        sb.append(", tboCanB=").append(tboCanB);
        sb.append(", tboPriority=").append(tboPriority);
        sb.append(", tboOutletsType=").append(tboOutletsType);
        sb.append(", tboVoteS=").append(tboVoteS);
        sb.append(", tboProfile=").append(tboProfile);
        sb.append(", tboUpdateTime=").append(tboUpdateTime);
        sb.append(", tboAddTime=").append(tboAddTime);
        sb.append(", tboStatus=").append(tboStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}