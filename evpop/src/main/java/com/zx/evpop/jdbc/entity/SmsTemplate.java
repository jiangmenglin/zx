package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class SmsTemplate implements Serializable {
    private Integer tbstId;

    private Integer tbstHost;

    private String tbstName;

    private String tbstContent;

    private Byte tbstType;

    private String tbstFlag;

    private Integer tbstEditor;

    private Date tbstUpdateTime;

    private Date tbstAddTime;

    private Byte tbstStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbstId() {
        return tbstId;
    }

    public void setTbstId(Integer tbstId) {
        this.tbstId = tbstId;
    }

    public Integer getTbstHost() {
        return tbstHost;
    }

    public void setTbstHost(Integer tbstHost) {
        this.tbstHost = tbstHost;
    }

    public String getTbstName() {
        return tbstName;
    }

    public void setTbstName(String tbstName) {
        this.tbstName = tbstName == null ? null : tbstName.trim();
    }

    public String getTbstContent() {
        return tbstContent;
    }

    public void setTbstContent(String tbstContent) {
        this.tbstContent = tbstContent == null ? null : tbstContent.trim();
    }

    public Byte getTbstType() {
        return tbstType;
    }

    public void setTbstType(Byte tbstType) {
        this.tbstType = tbstType;
    }

    public String getTbstFlag() {
        return tbstFlag;
    }

    public void setTbstFlag(String tbstFlag) {
        this.tbstFlag = tbstFlag == null ? null : tbstFlag.trim();
    }

    public Integer getTbstEditor() {
        return tbstEditor;
    }

    public void setTbstEditor(Integer tbstEditor) {
        this.tbstEditor = tbstEditor;
    }

    public Date getTbstUpdateTime() {
        return tbstUpdateTime;
    }

    public void setTbstUpdateTime(Date tbstUpdateTime) {
        this.tbstUpdateTime = tbstUpdateTime;
    }

    public Date getTbstAddTime() {
        return tbstAddTime;
    }

    public void setTbstAddTime(Date tbstAddTime) {
        this.tbstAddTime = tbstAddTime;
    }

    public Byte getTbstStatus() {
        return tbstStatus;
    }

    public void setTbstStatus(Byte tbstStatus) {
        this.tbstStatus = tbstStatus;
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
        sb.append(", tbstId=").append(tbstId);
        sb.append(", tbstHost=").append(tbstHost);
        sb.append(", tbstName=").append(tbstName);
        sb.append(", tbstContent=").append(tbstContent);
        sb.append(", tbstType=").append(tbstType);
        sb.append(", tbstFlag=").append(tbstFlag);
        sb.append(", tbstEditor=").append(tbstEditor);
        sb.append(", tbstUpdateTime=").append(tbstUpdateTime);
        sb.append(", tbstAddTime=").append(tbstAddTime);
        sb.append(", tbstStatus=").append(tbstStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}