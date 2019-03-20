package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CouponType implements Serializable {
    private Integer tbctId;

    private String tbctName;

    private String tbctFlag;

    private Byte tbctSystem;

    private Date tbctUpdateTime;

    private Date tbctStart;

    private Date tbctEnd;

    private String tbctRemark;

    private Integer tbctCount;

    private Integer tbctAmout;

    private Byte tbctLimit;

    private BigDecimal tbctMin;

    private String tbctOrderParams;

    private String tbctOrderProfile;

    private Byte tbctValidity;

    private Date tbctAddTime;

    private Byte tbctStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbctId() {
        return tbctId;
    }

    public void setTbctId(Integer tbctId) {
        this.tbctId = tbctId;
    }

    public String getTbctName() {
        return tbctName;
    }

    public void setTbctName(String tbctName) {
        this.tbctName = tbctName == null ? null : tbctName.trim();
    }

    public String getTbctFlag() {
        return tbctFlag;
    }

    public void setTbctFlag(String tbctFlag) {
        this.tbctFlag = tbctFlag == null ? null : tbctFlag.trim();
    }

    public Byte getTbctSystem() {
        return tbctSystem;
    }

    public void setTbctSystem(Byte tbctSystem) {
        this.tbctSystem = tbctSystem;
    }

    public Date getTbctUpdateTime() {
        return tbctUpdateTime;
    }

    public void setTbctUpdateTime(Date tbctUpdateTime) {
        this.tbctUpdateTime = tbctUpdateTime;
    }

    public Date getTbctStart() {
        return tbctStart;
    }

    public void setTbctStart(Date tbctStart) {
        this.tbctStart = tbctStart;
    }

    public Date getTbctEnd() {
        return tbctEnd;
    }

    public void setTbctEnd(Date tbctEnd) {
        this.tbctEnd = tbctEnd;
    }

    public String getTbctRemark() {
        return tbctRemark;
    }

    public void setTbctRemark(String tbctRemark) {
        this.tbctRemark = tbctRemark == null ? null : tbctRemark.trim();
    }

    public Integer getTbctCount() {
        return tbctCount;
    }

    public void setTbctCount(Integer tbctCount) {
        this.tbctCount = tbctCount;
    }

    public Integer getTbctAmout() {
        return tbctAmout;
    }

    public void setTbctAmout(Integer tbctAmout) {
        this.tbctAmout = tbctAmout;
    }

    public Byte getTbctLimit() {
        return tbctLimit;
    }

    public void setTbctLimit(Byte tbctLimit) {
        this.tbctLimit = tbctLimit;
    }

    public BigDecimal getTbctMin() {
        return tbctMin;
    }

    public void setTbctMin(BigDecimal tbctMin) {
        this.tbctMin = tbctMin;
    }

    public String getTbctOrderParams() {
        return tbctOrderParams;
    }

    public void setTbctOrderParams(String tbctOrderParams) {
        this.tbctOrderParams = tbctOrderParams == null ? null : tbctOrderParams.trim();
    }

    public String getTbctOrderProfile() {
        return tbctOrderProfile;
    }

    public void setTbctOrderProfile(String tbctOrderProfile) {
        this.tbctOrderProfile = tbctOrderProfile == null ? null : tbctOrderProfile.trim();
    }

    public Byte getTbctValidity() {
        return tbctValidity;
    }

    public void setTbctValidity(Byte tbctValidity) {
        this.tbctValidity = tbctValidity;
    }

    public Date getTbctAddTime() {
        return tbctAddTime;
    }

    public void setTbctAddTime(Date tbctAddTime) {
        this.tbctAddTime = tbctAddTime;
    }

    public Byte getTbctStatus() {
        return tbctStatus;
    }

    public void setTbctStatus(Byte tbctStatus) {
        this.tbctStatus = tbctStatus;
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
        sb.append(", tbctId=").append(tbctId);
        sb.append(", tbctName=").append(tbctName);
        sb.append(", tbctFlag=").append(tbctFlag);
        sb.append(", tbctSystem=").append(tbctSystem);
        sb.append(", tbctUpdateTime=").append(tbctUpdateTime);
        sb.append(", tbctStart=").append(tbctStart);
        sb.append(", tbctEnd=").append(tbctEnd);
        sb.append(", tbctRemark=").append(tbctRemark);
        sb.append(", tbctCount=").append(tbctCount);
        sb.append(", tbctAmout=").append(tbctAmout);
        sb.append(", tbctLimit=").append(tbctLimit);
        sb.append(", tbctMin=").append(tbctMin);
        sb.append(", tbctOrderParams=").append(tbctOrderParams);
        sb.append(", tbctOrderProfile=").append(tbctOrderProfile);
        sb.append(", tbctValidity=").append(tbctValidity);
        sb.append(", tbctAddTime=").append(tbctAddTime);
        sb.append(", tbctStatus=").append(tbctStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}