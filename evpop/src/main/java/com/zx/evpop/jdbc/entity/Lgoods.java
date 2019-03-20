package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Lgoods implements Serializable {
    private Long tblId;

    private String tblName;

    private Short tblProduct;

    private String tblFlag;

    private Integer tblTime;

    private String tblPriority;

    private String tblExpre;

    private String tblMeas;

    private String tblProfile;

    private Date tblUpdateTime;

    private Date tblAddTime;

    private Short tblStatus;

    private static final long serialVersionUID = 1L;

    public Long getTblId() {
        return tblId;
    }

    public void setTblId(Long tblId) {
        this.tblId = tblId;
    }

    public String getTblName() {
        return tblName;
    }

    public void setTblName(String tblName) {
        this.tblName = tblName == null ? null : tblName.trim();
    }

    public Short getTblProduct() {
        return tblProduct;
    }

    public void setTblProduct(Short tblProduct) {
        this.tblProduct = tblProduct;
    }

    public String getTblFlag() {
        return tblFlag;
    }

    public void setTblFlag(String tblFlag) {
        this.tblFlag = tblFlag == null ? null : tblFlag.trim();
    }

    public Integer getTblTime() {
        return tblTime;
    }

    public void setTblTime(Integer tblTime) {
        this.tblTime = tblTime;
    }

    public String getTblPriority() {
        return tblPriority;
    }

    public void setTblPriority(String tblPriority) {
        this.tblPriority = tblPriority == null ? null : tblPriority.trim();
    }

    public String getTblExpre() {
        return tblExpre;
    }

    public void setTblExpre(String tblExpre) {
        this.tblExpre = tblExpre == null ? null : tblExpre.trim();
    }

    public String getTblMeas() {
        return tblMeas;
    }

    public void setTblMeas(String tblMeas) {
        this.tblMeas = tblMeas == null ? null : tblMeas.trim();
    }

    public String getTblProfile() {
        return tblProfile;
    }

    public void setTblProfile(String tblProfile) {
        this.tblProfile = tblProfile == null ? null : tblProfile.trim();
    }

    public Date getTblUpdateTime() {
        return tblUpdateTime;
    }

    public void setTblUpdateTime(Date tblUpdateTime) {
        this.tblUpdateTime = tblUpdateTime;
    }

    public Date getTblAddTime() {
        return tblAddTime;
    }

    public void setTblAddTime(Date tblAddTime) {
        this.tblAddTime = tblAddTime;
    }

    public Short getTblStatus() {
        return tblStatus;
    }

    public void setTblStatus(Short tblStatus) {
        this.tblStatus = tblStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tblId=").append(tblId);
        sb.append(", tblName=").append(tblName);
        sb.append(", tblProduct=").append(tblProduct);
        sb.append(", tblFlag=").append(tblFlag);
        sb.append(", tblTime=").append(tblTime);
        sb.append(", tblPriority=").append(tblPriority);
        sb.append(", tblExpre=").append(tblExpre);
        sb.append(", tblMeas=").append(tblMeas);
        sb.append(", tblProfile=").append(tblProfile);
        sb.append(", tblUpdateTime=").append(tblUpdateTime);
        sb.append(", tblAddTime=").append(tblAddTime);
        sb.append(", tblStatus=").append(tblStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}