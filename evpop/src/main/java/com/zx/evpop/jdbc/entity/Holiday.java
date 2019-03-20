package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Holiday implements Serializable {
    private Long tbhId;

    private Long tbhHost;

    private String tbhName;

    private Date tbhDate;

    private static final long serialVersionUID = 1L;

    public Long getTbhId() {
        return tbhId;
    }

    public void setTbhId(Long tbhId) {
        this.tbhId = tbhId;
    }

    public Long getTbhHost() {
        return tbhHost;
    }

    public void setTbhHost(Long tbhHost) {
        this.tbhHost = tbhHost;
    }

    public String getTbhName() {
        return tbhName;
    }

    public void setTbhName(String tbhName) {
        this.tbhName = tbhName == null ? null : tbhName.trim();
    }

    public Date getTbhDate() {
        return tbhDate;
    }

    public void setTbhDate(Date tbhDate) {
        this.tbhDate = tbhDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbhId=").append(tbhId);
        sb.append(", tbhHost=").append(tbhHost);
        sb.append(", tbhName=").append(tbhName);
        sb.append(", tbhDate=").append(tbhDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}