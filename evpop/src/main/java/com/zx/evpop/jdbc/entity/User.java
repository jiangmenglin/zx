package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer suId;

    private String suHost;

    private Integer suGroup;

    private String suUsername;

    private String suPassword;

    private String suRealName;

    private String suMobile;

    private String suEmail;

    private String suShortcut;

    private Date suAddTime;

    private Date suLastTime;

    private String suLastIp;

    private Byte suStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getSuId() {
        return suId;
    }

    public void setSuId(Integer suId) {
        this.suId = suId;
    }

    public String getSuHost() {
        return suHost;
    }

    public void setSuHost(String suHost) {
        this.suHost = suHost == null ? null : suHost.trim();
    }

    public Integer getSuGroup() {
        return suGroup;
    }

    public void setSuGroup(Integer suGroup) {
        this.suGroup = suGroup;
    }

    public String getSuUsername() {
        return suUsername;
    }

    public void setSuUsername(String suUsername) {
        this.suUsername = suUsername == null ? null : suUsername.trim();
    }

    public String getSuPassword() {
        return suPassword;
    }

    public void setSuPassword(String suPassword) {
        this.suPassword = suPassword == null ? null : suPassword.trim();
    }

    public String getSuRealName() {
        return suRealName;
    }

    public void setSuRealName(String suRealName) {
        this.suRealName = suRealName == null ? null : suRealName.trim();
    }

    public String getSuMobile() {
        return suMobile;
    }

    public void setSuMobile(String suMobile) {
        this.suMobile = suMobile == null ? null : suMobile.trim();
    }

    public String getSuEmail() {
        return suEmail;
    }

    public void setSuEmail(String suEmail) {
        this.suEmail = suEmail == null ? null : suEmail.trim();
    }

    public String getSuShortcut() {
        return suShortcut;
    }

    public void setSuShortcut(String suShortcut) {
        this.suShortcut = suShortcut == null ? null : suShortcut.trim();
    }

    public Date getSuAddTime() {
        return suAddTime;
    }

    public void setSuAddTime(Date suAddTime) {
        this.suAddTime = suAddTime;
    }

    public Date getSuLastTime() {
        return suLastTime;
    }

    public void setSuLastTime(Date suLastTime) {
        this.suLastTime = suLastTime;
    }

    public String getSuLastIp() {
        return suLastIp;
    }

    public void setSuLastIp(String suLastIp) {
        this.suLastIp = suLastIp == null ? null : suLastIp.trim();
    }

    public Byte getSuStatus() {
        return suStatus;
    }

    public void setSuStatus(Byte suStatus) {
        this.suStatus = suStatus;
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
        sb.append(", suId=").append(suId);
        sb.append(", suHost=").append(suHost);
        sb.append(", suGroup=").append(suGroup);
        sb.append(", suUsername=").append(suUsername);
        sb.append(", suPassword=").append(suPassword);
        sb.append(", suRealName=").append(suRealName);
        sb.append(", suMobile=").append(suMobile);
        sb.append(", suEmail=").append(suEmail);
        sb.append(", suShortcut=").append(suShortcut);
        sb.append(", suAddTime=").append(suAddTime);
        sb.append(", suLastTime=").append(suLastTime);
        sb.append(", suLastIp=").append(suLastIp);
        sb.append(", suStatus=").append(suStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}