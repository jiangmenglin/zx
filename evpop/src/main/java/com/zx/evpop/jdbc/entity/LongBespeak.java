package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class LongBespeak implements Serializable {
    private Long tblbId;

    private Long tblbHost;

    private Long tblbMember;

    private Long tblbModel;

    private Date tblbGettime;

    private Integer tblbPackagetime;

    private Date tblbCreatetime;

    private Long tblbFounder;

    private Date tblbUpdatetime;

    private Long tblbModifier;

    private String tblbNote;

    private Short tblbStatus;

    private static final long serialVersionUID = 1L;

    public Long getTblbId() {
        return tblbId;
    }

    public void setTblbId(Long tblbId) {
        this.tblbId = tblbId;
    }

    public Long getTblbHost() {
        return tblbHost;
    }

    public void setTblbHost(Long tblbHost) {
        this.tblbHost = tblbHost;
    }

    public Long getTblbMember() {
        return tblbMember;
    }

    public void setTblbMember(Long tblbMember) {
        this.tblbMember = tblbMember;
    }

    public Long getTblbModel() {
        return tblbModel;
    }

    public void setTblbModel(Long tblbModel) {
        this.tblbModel = tblbModel;
    }

    public Date getTblbGettime() {
        return tblbGettime;
    }

    public void setTblbGettime(Date tblbGettime) {
        this.tblbGettime = tblbGettime;
    }

    public Integer getTblbPackagetime() {
        return tblbPackagetime;
    }

    public void setTblbPackagetime(Integer tblbPackagetime) {
        this.tblbPackagetime = tblbPackagetime;
    }

    public Date getTblbCreatetime() {
        return tblbCreatetime;
    }

    public void setTblbCreatetime(Date tblbCreatetime) {
        this.tblbCreatetime = tblbCreatetime;
    }

    public Long getTblbFounder() {
        return tblbFounder;
    }

    public void setTblbFounder(Long tblbFounder) {
        this.tblbFounder = tblbFounder;
    }

    public Date getTblbUpdatetime() {
        return tblbUpdatetime;
    }

    public void setTblbUpdatetime(Date tblbUpdatetime) {
        this.tblbUpdatetime = tblbUpdatetime;
    }

    public Long getTblbModifier() {
        return tblbModifier;
    }

    public void setTblbModifier(Long tblbModifier) {
        this.tblbModifier = tblbModifier;
    }

    public String getTblbNote() {
        return tblbNote;
    }

    public void setTblbNote(String tblbNote) {
        this.tblbNote = tblbNote == null ? null : tblbNote.trim();
    }

    public Short getTblbStatus() {
        return tblbStatus;
    }

    public void setTblbStatus(Short tblbStatus) {
        this.tblbStatus = tblbStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tblbId=").append(tblbId);
        sb.append(", tblbHost=").append(tblbHost);
        sb.append(", tblbMember=").append(tblbMember);
        sb.append(", tblbModel=").append(tblbModel);
        sb.append(", tblbGettime=").append(tblbGettime);
        sb.append(", tblbPackagetime=").append(tblbPackagetime);
        sb.append(", tblbCreatetime=").append(tblbCreatetime);
        sb.append(", tblbFounder=").append(tblbFounder);
        sb.append(", tblbUpdatetime=").append(tblbUpdatetime);
        sb.append(", tblbModifier=").append(tblbModifier);
        sb.append(", tblbNote=").append(tblbNote);
        sb.append(", tblbStatus=").append(tblbStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}