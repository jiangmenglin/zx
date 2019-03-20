package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Annual implements Serializable {
    private Integer tbaiId;

    private Short tbaiHost;

    private Integer tbaCar;

    private Date tbaiAnnualDate;

    private Date tbaiAnnualReal;

    private Integer tbaiEditor;

    private Date tbaiUpdateTime;

    private Date tbaiAddTime;

    private String tbaiRemark;

    private Byte tbaiStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbaiId() {
        return tbaiId;
    }

    public void setTbaiId(Integer tbaiId) {
        this.tbaiId = tbaiId;
    }

    public Short getTbaiHost() {
        return tbaiHost;
    }

    public void setTbaiHost(Short tbaiHost) {
        this.tbaiHost = tbaiHost;
    }

    public Integer getTbaCar() {
        return tbaCar;
    }

    public void setTbaCar(Integer tbaCar) {
        this.tbaCar = tbaCar;
    }

    public Date getTbaiAnnualDate() {
        return tbaiAnnualDate;
    }

    public void setTbaiAnnualDate(Date tbaiAnnualDate) {
        this.tbaiAnnualDate = tbaiAnnualDate;
    }

    public Date getTbaiAnnualReal() {
        return tbaiAnnualReal;
    }

    public void setTbaiAnnualReal(Date tbaiAnnualReal) {
        this.tbaiAnnualReal = tbaiAnnualReal;
    }

    public Integer getTbaiEditor() {
        return tbaiEditor;
    }

    public void setTbaiEditor(Integer tbaiEditor) {
        this.tbaiEditor = tbaiEditor;
    }

    public Date getTbaiUpdateTime() {
        return tbaiUpdateTime;
    }

    public void setTbaiUpdateTime(Date tbaiUpdateTime) {
        this.tbaiUpdateTime = tbaiUpdateTime;
    }

    public Date getTbaiAddTime() {
        return tbaiAddTime;
    }

    public void setTbaiAddTime(Date tbaiAddTime) {
        this.tbaiAddTime = tbaiAddTime;
    }

    public String getTbaiRemark() {
        return tbaiRemark;
    }

    public void setTbaiRemark(String tbaiRemark) {
        this.tbaiRemark = tbaiRemark == null ? null : tbaiRemark.trim();
    }

    public Byte getTbaiStatus() {
        return tbaiStatus;
    }

    public void setTbaiStatus(Byte tbaiStatus) {
        this.tbaiStatus = tbaiStatus;
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
        sb.append(", tbaiId=").append(tbaiId);
        sb.append(", tbaiHost=").append(tbaiHost);
        sb.append(", tbaCar=").append(tbaCar);
        sb.append(", tbaiAnnualDate=").append(tbaiAnnualDate);
        sb.append(", tbaiAnnualReal=").append(tbaiAnnualReal);
        sb.append(", tbaiEditor=").append(tbaiEditor);
        sb.append(", tbaiUpdateTime=").append(tbaiUpdateTime);
        sb.append(", tbaiAddTime=").append(tbaiAddTime);
        sb.append(", tbaiRemark=").append(tbaiRemark);
        sb.append(", tbaiStatus=").append(tbaiStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}