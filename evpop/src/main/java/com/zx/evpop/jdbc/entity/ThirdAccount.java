package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class ThirdAccount implements Serializable {
    private Integer tbtaId;

    private Integer tbtaMember;

    private String tbtaThirdId;

    private Date tbtaCreateTime;

    private Date tbtaLastLoginTime;

    private static final long serialVersionUID = 1L;

    public Integer getTbtaId() {
        return tbtaId;
    }

    public void setTbtaId(Integer tbtaId) {
        this.tbtaId = tbtaId;
    }

    public Integer getTbtaMember() {
        return tbtaMember;
    }

    public void setTbtaMember(Integer tbtaMember) {
        this.tbtaMember = tbtaMember;
    }

    public String getTbtaThirdId() {
        return tbtaThirdId;
    }

    public void setTbtaThirdId(String tbtaThirdId) {
        this.tbtaThirdId = tbtaThirdId == null ? null : tbtaThirdId.trim();
    }

    public Date getTbtaCreateTime() {
        return tbtaCreateTime;
    }

    public void setTbtaCreateTime(Date tbtaCreateTime) {
        this.tbtaCreateTime = tbtaCreateTime;
    }

    public Date getTbtaLastLoginTime() {
        return tbtaLastLoginTime;
    }

    public void setTbtaLastLoginTime(Date tbtaLastLoginTime) {
        this.tbtaLastLoginTime = tbtaLastLoginTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbtaId=").append(tbtaId);
        sb.append(", tbtaMember=").append(tbtaMember);
        sb.append(", tbtaThirdId=").append(tbtaThirdId);
        sb.append(", tbtaCreateTime=").append(tbtaCreateTime);
        sb.append(", tbtaLastLoginTime=").append(tbtaLastLoginTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}