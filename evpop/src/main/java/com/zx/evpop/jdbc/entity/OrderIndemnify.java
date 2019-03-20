package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderIndemnify implements Serializable {
    private Long tboiId;

    private String tboiOrderid;

    private Long tboiUserid;

    private String tboiCarno;

    private Short tboiFault;

    private Double tboiMoney;

    private String tboiHead;

    private Date tboiStime;

    private Date tboiPaytime;

    private Short tboiPaystatus;

    private Long tboiRelationmessage;

    private static final long serialVersionUID = 1L;

    public Long getTboiId() {
        return tboiId;
    }

    public void setTboiId(Long tboiId) {
        this.tboiId = tboiId;
    }

    public String getTboiOrderid() {
        return tboiOrderid;
    }

    public void setTboiOrderid(String tboiOrderid) {
        this.tboiOrderid = tboiOrderid == null ? null : tboiOrderid.trim();
    }

    public Long getTboiUserid() {
        return tboiUserid;
    }

    public void setTboiUserid(Long tboiUserid) {
        this.tboiUserid = tboiUserid;
    }

    public String getTboiCarno() {
        return tboiCarno;
    }

    public void setTboiCarno(String tboiCarno) {
        this.tboiCarno = tboiCarno == null ? null : tboiCarno.trim();
    }

    public Short getTboiFault() {
        return tboiFault;
    }

    public void setTboiFault(Short tboiFault) {
        this.tboiFault = tboiFault;
    }

    public Double getTboiMoney() {
        return tboiMoney;
    }

    public void setTboiMoney(Double tboiMoney) {
        this.tboiMoney = tboiMoney;
    }

    public String getTboiHead() {
        return tboiHead;
    }

    public void setTboiHead(String tboiHead) {
        this.tboiHead = tboiHead == null ? null : tboiHead.trim();
    }

    public Date getTboiStime() {
        return tboiStime;
    }

    public void setTboiStime(Date tboiStime) {
        this.tboiStime = tboiStime;
    }

    public Date getTboiPaytime() {
        return tboiPaytime;
    }

    public void setTboiPaytime(Date tboiPaytime) {
        this.tboiPaytime = tboiPaytime;
    }

    public Short getTboiPaystatus() {
        return tboiPaystatus;
    }

    public void setTboiPaystatus(Short tboiPaystatus) {
        this.tboiPaystatus = tboiPaystatus;
    }

    public Long getTboiRelationmessage() {
        return tboiRelationmessage;
    }

    public void setTboiRelationmessage(Long tboiRelationmessage) {
        this.tboiRelationmessage = tboiRelationmessage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tboiId=").append(tboiId);
        sb.append(", tboiOrderid=").append(tboiOrderid);
        sb.append(", tboiUserid=").append(tboiUserid);
        sb.append(", tboiCarno=").append(tboiCarno);
        sb.append(", tboiFault=").append(tboiFault);
        sb.append(", tboiMoney=").append(tboiMoney);
        sb.append(", tboiHead=").append(tboiHead);
        sb.append(", tboiStime=").append(tboiStime);
        sb.append(", tboiPaytime=").append(tboiPaytime);
        sb.append(", tboiPaystatus=").append(tboiPaystatus);
        sb.append(", tboiRelationmessage=").append(tboiRelationmessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}