package com.zx.evpop.jdbc.entity;

import java.io.Serializable;

public class RecordSubject implements Serializable {
    private Long tbrsId;

    private String tbrsName;

    private Byte tbrsIsIncome;

    private Byte tbrsIsOperIn;

    private Byte tbrsIsOperOut;

    private Byte tbrsIsUserIn;

    private Byte tbrsIsUserOut;

    private Byte tbrsIsArtif;

    private Byte tbrsIsOrder;

    private Byte tbrsIsInvoice;

    private static final long serialVersionUID = 1L;

    public Long getTbrsId() {
        return tbrsId;
    }

    public void setTbrsId(Long tbrsId) {
        this.tbrsId = tbrsId;
    }

    public String getTbrsName() {
        return tbrsName;
    }

    public void setTbrsName(String tbrsName) {
        this.tbrsName = tbrsName == null ? null : tbrsName.trim();
    }

    public Byte getTbrsIsIncome() {
        return tbrsIsIncome;
    }

    public void setTbrsIsIncome(Byte tbrsIsIncome) {
        this.tbrsIsIncome = tbrsIsIncome;
    }

    public Byte getTbrsIsOperIn() {
        return tbrsIsOperIn;
    }

    public void setTbrsIsOperIn(Byte tbrsIsOperIn) {
        this.tbrsIsOperIn = tbrsIsOperIn;
    }

    public Byte getTbrsIsOperOut() {
        return tbrsIsOperOut;
    }

    public void setTbrsIsOperOut(Byte tbrsIsOperOut) {
        this.tbrsIsOperOut = tbrsIsOperOut;
    }

    public Byte getTbrsIsUserIn() {
        return tbrsIsUserIn;
    }

    public void setTbrsIsUserIn(Byte tbrsIsUserIn) {
        this.tbrsIsUserIn = tbrsIsUserIn;
    }

    public Byte getTbrsIsUserOut() {
        return tbrsIsUserOut;
    }

    public void setTbrsIsUserOut(Byte tbrsIsUserOut) {
        this.tbrsIsUserOut = tbrsIsUserOut;
    }

    public Byte getTbrsIsArtif() {
        return tbrsIsArtif;
    }

    public void setTbrsIsArtif(Byte tbrsIsArtif) {
        this.tbrsIsArtif = tbrsIsArtif;
    }

    public Byte getTbrsIsOrder() {
        return tbrsIsOrder;
    }

    public void setTbrsIsOrder(Byte tbrsIsOrder) {
        this.tbrsIsOrder = tbrsIsOrder;
    }

    public Byte getTbrsIsInvoice() {
        return tbrsIsInvoice;
    }

    public void setTbrsIsInvoice(Byte tbrsIsInvoice) {
        this.tbrsIsInvoice = tbrsIsInvoice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbrsId=").append(tbrsId);
        sb.append(", tbrsName=").append(tbrsName);
        sb.append(", tbrsIsIncome=").append(tbrsIsIncome);
        sb.append(", tbrsIsOperIn=").append(tbrsIsOperIn);
        sb.append(", tbrsIsOperOut=").append(tbrsIsOperOut);
        sb.append(", tbrsIsUserIn=").append(tbrsIsUserIn);
        sb.append(", tbrsIsUserOut=").append(tbrsIsUserOut);
        sb.append(", tbrsIsArtif=").append(tbrsIsArtif);
        sb.append(", tbrsIsOrder=").append(tbrsIsOrder);
        sb.append(", tbrsIsInvoice=").append(tbrsIsInvoice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}