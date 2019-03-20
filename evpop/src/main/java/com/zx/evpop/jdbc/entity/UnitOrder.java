package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class UnitOrder implements Serializable {
    private Long tbuoId;

    private Long tbuoHost;

    private Long tbuoOrder;

    private Long tbuoUnitInfo;

    private Long tbuoUnitGroup;

    private Long tbuoCar;

    private Long tbuoPerson;

    private String tbuoName;

    private String tbuoAlias;

    private String tbuoMobile;

    private String tbuoProfile;

    private String tbuoIdcard;

    private Date tbuoStartTime;

    private Date tbuoFinishTime;

    private Date tbuoRetTime;

    private String tbuoRemark;

    private Date tbuoAddTime;

    private Date tbuoUpdateTime;

    private Double tbuoMileage;

    private Double tbuoSettlement;

    private Long tbuoStatement;

    private String tbuoFrom;

    private Date tbuoCheckTime;

    private String tbuoChecker;

    private Short tbuoState;

    private static final long serialVersionUID = 1L;

    public Long getTbuoId() {
        return tbuoId;
    }

    public void setTbuoId(Long tbuoId) {
        this.tbuoId = tbuoId;
    }

    public Long getTbuoHost() {
        return tbuoHost;
    }

    public void setTbuoHost(Long tbuoHost) {
        this.tbuoHost = tbuoHost;
    }

    public Long getTbuoOrder() {
        return tbuoOrder;
    }

    public void setTbuoOrder(Long tbuoOrder) {
        this.tbuoOrder = tbuoOrder;
    }

    public Long getTbuoUnitInfo() {
        return tbuoUnitInfo;
    }

    public void setTbuoUnitInfo(Long tbuoUnitInfo) {
        this.tbuoUnitInfo = tbuoUnitInfo;
    }

    public Long getTbuoUnitGroup() {
        return tbuoUnitGroup;
    }

    public void setTbuoUnitGroup(Long tbuoUnitGroup) {
        this.tbuoUnitGroup = tbuoUnitGroup;
    }

    public Long getTbuoCar() {
        return tbuoCar;
    }

    public void setTbuoCar(Long tbuoCar) {
        this.tbuoCar = tbuoCar;
    }

    public Long getTbuoPerson() {
        return tbuoPerson;
    }

    public void setTbuoPerson(Long tbuoPerson) {
        this.tbuoPerson = tbuoPerson;
    }

    public String getTbuoName() {
        return tbuoName;
    }

    public void setTbuoName(String tbuoName) {
        this.tbuoName = tbuoName == null ? null : tbuoName.trim();
    }

    public String getTbuoAlias() {
        return tbuoAlias;
    }

    public void setTbuoAlias(String tbuoAlias) {
        this.tbuoAlias = tbuoAlias == null ? null : tbuoAlias.trim();
    }

    public String getTbuoMobile() {
        return tbuoMobile;
    }

    public void setTbuoMobile(String tbuoMobile) {
        this.tbuoMobile = tbuoMobile == null ? null : tbuoMobile.trim();
    }

    public String getTbuoProfile() {
        return tbuoProfile;
    }

    public void setTbuoProfile(String tbuoProfile) {
        this.tbuoProfile = tbuoProfile == null ? null : tbuoProfile.trim();
    }

    public String getTbuoIdcard() {
        return tbuoIdcard;
    }

    public void setTbuoIdcard(String tbuoIdcard) {
        this.tbuoIdcard = tbuoIdcard == null ? null : tbuoIdcard.trim();
    }

    public Date getTbuoStartTime() {
        return tbuoStartTime;
    }

    public void setTbuoStartTime(Date tbuoStartTime) {
        this.tbuoStartTime = tbuoStartTime;
    }

    public Date getTbuoFinishTime() {
        return tbuoFinishTime;
    }

    public void setTbuoFinishTime(Date tbuoFinishTime) {
        this.tbuoFinishTime = tbuoFinishTime;
    }

    public Date getTbuoRetTime() {
        return tbuoRetTime;
    }

    public void setTbuoRetTime(Date tbuoRetTime) {
        this.tbuoRetTime = tbuoRetTime;
    }

    public String getTbuoRemark() {
        return tbuoRemark;
    }

    public void setTbuoRemark(String tbuoRemark) {
        this.tbuoRemark = tbuoRemark == null ? null : tbuoRemark.trim();
    }

    public Date getTbuoAddTime() {
        return tbuoAddTime;
    }

    public void setTbuoAddTime(Date tbuoAddTime) {
        this.tbuoAddTime = tbuoAddTime;
    }

    public Date getTbuoUpdateTime() {
        return tbuoUpdateTime;
    }

    public void setTbuoUpdateTime(Date tbuoUpdateTime) {
        this.tbuoUpdateTime = tbuoUpdateTime;
    }

    public Double getTbuoMileage() {
        return tbuoMileage;
    }

    public void setTbuoMileage(Double tbuoMileage) {
        this.tbuoMileage = tbuoMileage;
    }

    public Double getTbuoSettlement() {
        return tbuoSettlement;
    }

    public void setTbuoSettlement(Double tbuoSettlement) {
        this.tbuoSettlement = tbuoSettlement;
    }

    public Long getTbuoStatement() {
        return tbuoStatement;
    }

    public void setTbuoStatement(Long tbuoStatement) {
        this.tbuoStatement = tbuoStatement;
    }

    public String getTbuoFrom() {
        return tbuoFrom;
    }

    public void setTbuoFrom(String tbuoFrom) {
        this.tbuoFrom = tbuoFrom == null ? null : tbuoFrom.trim();
    }

    public Date getTbuoCheckTime() {
        return tbuoCheckTime;
    }

    public void setTbuoCheckTime(Date tbuoCheckTime) {
        this.tbuoCheckTime = tbuoCheckTime;
    }

    public String getTbuoChecker() {
        return tbuoChecker;
    }

    public void setTbuoChecker(String tbuoChecker) {
        this.tbuoChecker = tbuoChecker == null ? null : tbuoChecker.trim();
    }

    public Short getTbuoState() {
        return tbuoState;
    }

    public void setTbuoState(Short tbuoState) {
        this.tbuoState = tbuoState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbuoId=").append(tbuoId);
        sb.append(", tbuoHost=").append(tbuoHost);
        sb.append(", tbuoOrder=").append(tbuoOrder);
        sb.append(", tbuoUnitInfo=").append(tbuoUnitInfo);
        sb.append(", tbuoUnitGroup=").append(tbuoUnitGroup);
        sb.append(", tbuoCar=").append(tbuoCar);
        sb.append(", tbuoPerson=").append(tbuoPerson);
        sb.append(", tbuoName=").append(tbuoName);
        sb.append(", tbuoAlias=").append(tbuoAlias);
        sb.append(", tbuoMobile=").append(tbuoMobile);
        sb.append(", tbuoProfile=").append(tbuoProfile);
        sb.append(", tbuoIdcard=").append(tbuoIdcard);
        sb.append(", tbuoStartTime=").append(tbuoStartTime);
        sb.append(", tbuoFinishTime=").append(tbuoFinishTime);
        sb.append(", tbuoRetTime=").append(tbuoRetTime);
        sb.append(", tbuoRemark=").append(tbuoRemark);
        sb.append(", tbuoAddTime=").append(tbuoAddTime);
        sb.append(", tbuoUpdateTime=").append(tbuoUpdateTime);
        sb.append(", tbuoMileage=").append(tbuoMileage);
        sb.append(", tbuoSettlement=").append(tbuoSettlement);
        sb.append(", tbuoStatement=").append(tbuoStatement);
        sb.append(", tbuoFrom=").append(tbuoFrom);
        sb.append(", tbuoCheckTime=").append(tbuoCheckTime);
        sb.append(", tbuoChecker=").append(tbuoChecker);
        sb.append(", tbuoState=").append(tbuoState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}