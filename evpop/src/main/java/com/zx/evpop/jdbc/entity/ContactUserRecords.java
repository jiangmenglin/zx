package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class ContactUserRecords implements Serializable {
    private Long tbcurId;

    private Long tbcurHost;

    private Long tbcurUser;

    private Long tbcurManage;

    private Long tbcurOrder;

    private Long tbcurCarNo;

    private Date tbcurAddTime;

    private static final long serialVersionUID = 1L;

    public Long getTbcurId() {
        return tbcurId;
    }

    public void setTbcurId(Long tbcurId) {
        this.tbcurId = tbcurId;
    }

    public Long getTbcurHost() {
        return tbcurHost;
    }

    public void setTbcurHost(Long tbcurHost) {
        this.tbcurHost = tbcurHost;
    }

    public Long getTbcurUser() {
        return tbcurUser;
    }

    public void setTbcurUser(Long tbcurUser) {
        this.tbcurUser = tbcurUser;
    }

    public Long getTbcurManage() {
        return tbcurManage;
    }

    public void setTbcurManage(Long tbcurManage) {
        this.tbcurManage = tbcurManage;
    }

    public Long getTbcurOrder() {
        return tbcurOrder;
    }

    public void setTbcurOrder(Long tbcurOrder) {
        this.tbcurOrder = tbcurOrder;
    }

    public Long getTbcurCarNo() {
        return tbcurCarNo;
    }

    public void setTbcurCarNo(Long tbcurCarNo) {
        this.tbcurCarNo = tbcurCarNo;
    }

    public Date getTbcurAddTime() {
        return tbcurAddTime;
    }

    public void setTbcurAddTime(Date tbcurAddTime) {
        this.tbcurAddTime = tbcurAddTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbcurId=").append(tbcurId);
        sb.append(", tbcurHost=").append(tbcurHost);
        sb.append(", tbcurUser=").append(tbcurUser);
        sb.append(", tbcurManage=").append(tbcurManage);
        sb.append(", tbcurOrder=").append(tbcurOrder);
        sb.append(", tbcurCarNo=").append(tbcurCarNo);
        sb.append(", tbcurAddTime=").append(tbcurAddTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}