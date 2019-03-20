package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Dynamic implements Serializable {
    private Long tbdId;

    private Long tbdHost;

    private String tbdTitle;

    private String tbdRelate;

    private Date tbdUpdateTime;

    private Date tbdAddTime;

    private Short tbdStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbdId() {
        return tbdId;
    }

    public void setTbdId(Long tbdId) {
        this.tbdId = tbdId;
    }

    public Long getTbdHost() {
        return tbdHost;
    }

    public void setTbdHost(Long tbdHost) {
        this.tbdHost = tbdHost;
    }

    public String getTbdTitle() {
        return tbdTitle;
    }

    public void setTbdTitle(String tbdTitle) {
        this.tbdTitle = tbdTitle == null ? null : tbdTitle.trim();
    }

    public String getTbdRelate() {
        return tbdRelate;
    }

    public void setTbdRelate(String tbdRelate) {
        this.tbdRelate = tbdRelate == null ? null : tbdRelate.trim();
    }

    public Date getTbdUpdateTime() {
        return tbdUpdateTime;
    }

    public void setTbdUpdateTime(Date tbdUpdateTime) {
        this.tbdUpdateTime = tbdUpdateTime;
    }

    public Date getTbdAddTime() {
        return tbdAddTime;
    }

    public void setTbdAddTime(Date tbdAddTime) {
        this.tbdAddTime = tbdAddTime;
    }

    public Short getTbdStatus() {
        return tbdStatus;
    }

    public void setTbdStatus(Short tbdStatus) {
        this.tbdStatus = tbdStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbdId=").append(tbdId);
        sb.append(", tbdHost=").append(tbdHost);
        sb.append(", tbdTitle=").append(tbdTitle);
        sb.append(", tbdRelate=").append(tbdRelate);
        sb.append(", tbdUpdateTime=").append(tbdUpdateTime);
        sb.append(", tbdAddTime=").append(tbdAddTime);
        sb.append(", tbdStatus=").append(tbdStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}