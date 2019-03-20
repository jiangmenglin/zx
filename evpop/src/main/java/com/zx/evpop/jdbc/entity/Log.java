package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {
    private Long slId;

    private Long slHost;

    private String slName;

    private Long slModel;

    private Long slType;

    private Long slUser;

    private String slClass;

    private Long slRelate;

    private Date slAddTime;

    private String slDetail;

    private static final long serialVersionUID = 1L;

    public Long getSlId() {
        return slId;
    }

    public void setSlId(Long slId) {
        this.slId = slId;
    }

    public Long getSlHost() {
        return slHost;
    }

    public void setSlHost(Long slHost) {
        this.slHost = slHost;
    }

    public String getSlName() {
        return slName;
    }

    public void setSlName(String slName) {
        this.slName = slName == null ? null : slName.trim();
    }

    public Long getSlModel() {
        return slModel;
    }

    public void setSlModel(Long slModel) {
        this.slModel = slModel;
    }

    public Long getSlType() {
        return slType;
    }

    public void setSlType(Long slType) {
        this.slType = slType;
    }

    public Long getSlUser() {
        return slUser;
    }

    public void setSlUser(Long slUser) {
        this.slUser = slUser;
    }

    public String getSlClass() {
        return slClass;
    }

    public void setSlClass(String slClass) {
        this.slClass = slClass == null ? null : slClass.trim();
    }

    public Long getSlRelate() {
        return slRelate;
    }

    public void setSlRelate(Long slRelate) {
        this.slRelate = slRelate;
    }

    public Date getSlAddTime() {
        return slAddTime;
    }

    public void setSlAddTime(Date slAddTime) {
        this.slAddTime = slAddTime;
    }

    public String getSlDetail() {
        return slDetail;
    }

    public void setSlDetail(String slDetail) {
        this.slDetail = slDetail == null ? null : slDetail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", slId=").append(slId);
        sb.append(", slHost=").append(slHost);
        sb.append(", slName=").append(slName);
        sb.append(", slModel=").append(slModel);
        sb.append(", slType=").append(slType);
        sb.append(", slUser=").append(slUser);
        sb.append(", slClass=").append(slClass);
        sb.append(", slRelate=").append(slRelate);
        sb.append(", slAddTime=").append(slAddTime);
        sb.append(", slDetail=").append(slDetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}