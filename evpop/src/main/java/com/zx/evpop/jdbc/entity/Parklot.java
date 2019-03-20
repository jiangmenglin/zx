package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Parklot implements Serializable {
    private Integer tbpId;

    private Short tbpHost;

    private String tbpCode;

    private Integer tbpOutlets;

    private Date tbpUpdateTime;

    private Date tbpAddTime;

    private Byte tbpStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbpId() {
        return tbpId;
    }

    public void setTbpId(Integer tbpId) {
        this.tbpId = tbpId;
    }

    public Short getTbpHost() {
        return tbpHost;
    }

    public void setTbpHost(Short tbpHost) {
        this.tbpHost = tbpHost;
    }

    public String getTbpCode() {
        return tbpCode;
    }

    public void setTbpCode(String tbpCode) {
        this.tbpCode = tbpCode == null ? null : tbpCode.trim();
    }

    public Integer getTbpOutlets() {
        return tbpOutlets;
    }

    public void setTbpOutlets(Integer tbpOutlets) {
        this.tbpOutlets = tbpOutlets;
    }

    public Date getTbpUpdateTime() {
        return tbpUpdateTime;
    }

    public void setTbpUpdateTime(Date tbpUpdateTime) {
        this.tbpUpdateTime = tbpUpdateTime;
    }

    public Date getTbpAddTime() {
        return tbpAddTime;
    }

    public void setTbpAddTime(Date tbpAddTime) {
        this.tbpAddTime = tbpAddTime;
    }

    public Byte getTbpStatus() {
        return tbpStatus;
    }

    public void setTbpStatus(Byte tbpStatus) {
        this.tbpStatus = tbpStatus;
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
        sb.append(", tbpId=").append(tbpId);
        sb.append(", tbpHost=").append(tbpHost);
        sb.append(", tbpCode=").append(tbpCode);
        sb.append(", tbpOutlets=").append(tbpOutlets);
        sb.append(", tbpUpdateTime=").append(tbpUpdateTime);
        sb.append(", tbpAddTime=").append(tbpAddTime);
        sb.append(", tbpStatus=").append(tbpStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}