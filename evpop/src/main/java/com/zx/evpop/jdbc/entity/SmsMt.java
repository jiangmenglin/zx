package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class SmsMt implements Serializable {
    private Long tbsmId;

    private Long tbsmHost;

    private Short tbsmType;

    private String tbsmMobile;

    private String tbsmContent;

    private Long tbsmEditor;

    private Long tbsmChannel;

    private Date tbsmUpdateTime;

    private Date tbsmAddTime;

    private String tbsmRemark;

    private Short tbsmStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbsmId() {
        return tbsmId;
    }

    public void setTbsmId(Long tbsmId) {
        this.tbsmId = tbsmId;
    }

    public Long getTbsmHost() {
        return tbsmHost;
    }

    public void setTbsmHost(Long tbsmHost) {
        this.tbsmHost = tbsmHost;
    }

    public Short getTbsmType() {
        return tbsmType;
    }

    public void setTbsmType(Short tbsmType) {
        this.tbsmType = tbsmType;
    }

    public String getTbsmMobile() {
        return tbsmMobile;
    }

    public void setTbsmMobile(String tbsmMobile) {
        this.tbsmMobile = tbsmMobile == null ? null : tbsmMobile.trim();
    }

    public String getTbsmContent() {
        return tbsmContent;
    }

    public void setTbsmContent(String tbsmContent) {
        this.tbsmContent = tbsmContent == null ? null : tbsmContent.trim();
    }

    public Long getTbsmEditor() {
        return tbsmEditor;
    }

    public void setTbsmEditor(Long tbsmEditor) {
        this.tbsmEditor = tbsmEditor;
    }

    public Long getTbsmChannel() {
        return tbsmChannel;
    }

    public void setTbsmChannel(Long tbsmChannel) {
        this.tbsmChannel = tbsmChannel;
    }

    public Date getTbsmUpdateTime() {
        return tbsmUpdateTime;
    }

    public void setTbsmUpdateTime(Date tbsmUpdateTime) {
        this.tbsmUpdateTime = tbsmUpdateTime;
    }

    public Date getTbsmAddTime() {
        return tbsmAddTime;
    }

    public void setTbsmAddTime(Date tbsmAddTime) {
        this.tbsmAddTime = tbsmAddTime;
    }

    public String getTbsmRemark() {
        return tbsmRemark;
    }

    public void setTbsmRemark(String tbsmRemark) {
        this.tbsmRemark = tbsmRemark == null ? null : tbsmRemark.trim();
    }

    public Short getTbsmStatus() {
        return tbsmStatus;
    }

    public void setTbsmStatus(Short tbsmStatus) {
        this.tbsmStatus = tbsmStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbsmId=").append(tbsmId);
        sb.append(", tbsmHost=").append(tbsmHost);
        sb.append(", tbsmType=").append(tbsmType);
        sb.append(", tbsmMobile=").append(tbsmMobile);
        sb.append(", tbsmContent=").append(tbsmContent);
        sb.append(", tbsmEditor=").append(tbsmEditor);
        sb.append(", tbsmChannel=").append(tbsmChannel);
        sb.append(", tbsmUpdateTime=").append(tbsmUpdateTime);
        sb.append(", tbsmAddTime=").append(tbsmAddTime);
        sb.append(", tbsmRemark=").append(tbsmRemark);
        sb.append(", tbsmStatus=").append(tbsmStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}