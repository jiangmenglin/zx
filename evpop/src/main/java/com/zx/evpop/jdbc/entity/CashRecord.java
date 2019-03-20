package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class CashRecord implements Serializable {
    private Long tbcrId;

    private Long tbcrHost;

    private String tbcrTradeNo;

    private Double tbcrAmmount;

    private String tbcrTitle;

    private String tbcrVoucher;

    private String tbcrImage;

    private Long tbcrAdder;

    private Long tbcrChecker;

    private String tbcrRemark;

    private Date tbcrUpdateTime;

    private Date tbcrAddTime;

    private Short tbcrStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbcrId() {
        return tbcrId;
    }

    public void setTbcrId(Long tbcrId) {
        this.tbcrId = tbcrId;
    }

    public Long getTbcrHost() {
        return tbcrHost;
    }

    public void setTbcrHost(Long tbcrHost) {
        this.tbcrHost = tbcrHost;
    }

    public String getTbcrTradeNo() {
        return tbcrTradeNo;
    }

    public void setTbcrTradeNo(String tbcrTradeNo) {
        this.tbcrTradeNo = tbcrTradeNo == null ? null : tbcrTradeNo.trim();
    }

    public Double getTbcrAmmount() {
        return tbcrAmmount;
    }

    public void setTbcrAmmount(Double tbcrAmmount) {
        this.tbcrAmmount = tbcrAmmount;
    }

    public String getTbcrTitle() {
        return tbcrTitle;
    }

    public void setTbcrTitle(String tbcrTitle) {
        this.tbcrTitle = tbcrTitle == null ? null : tbcrTitle.trim();
    }

    public String getTbcrVoucher() {
        return tbcrVoucher;
    }

    public void setTbcrVoucher(String tbcrVoucher) {
        this.tbcrVoucher = tbcrVoucher == null ? null : tbcrVoucher.trim();
    }

    public String getTbcrImage() {
        return tbcrImage;
    }

    public void setTbcrImage(String tbcrImage) {
        this.tbcrImage = tbcrImage == null ? null : tbcrImage.trim();
    }

    public Long getTbcrAdder() {
        return tbcrAdder;
    }

    public void setTbcrAdder(Long tbcrAdder) {
        this.tbcrAdder = tbcrAdder;
    }

    public Long getTbcrChecker() {
        return tbcrChecker;
    }

    public void setTbcrChecker(Long tbcrChecker) {
        this.tbcrChecker = tbcrChecker;
    }

    public String getTbcrRemark() {
        return tbcrRemark;
    }

    public void setTbcrRemark(String tbcrRemark) {
        this.tbcrRemark = tbcrRemark == null ? null : tbcrRemark.trim();
    }

    public Date getTbcrUpdateTime() {
        return tbcrUpdateTime;
    }

    public void setTbcrUpdateTime(Date tbcrUpdateTime) {
        this.tbcrUpdateTime = tbcrUpdateTime;
    }

    public Date getTbcrAddTime() {
        return tbcrAddTime;
    }

    public void setTbcrAddTime(Date tbcrAddTime) {
        this.tbcrAddTime = tbcrAddTime;
    }

    public Short getTbcrStatus() {
        return tbcrStatus;
    }

    public void setTbcrStatus(Short tbcrStatus) {
        this.tbcrStatus = tbcrStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbcrId=").append(tbcrId);
        sb.append(", tbcrHost=").append(tbcrHost);
        sb.append(", tbcrTradeNo=").append(tbcrTradeNo);
        sb.append(", tbcrAmmount=").append(tbcrAmmount);
        sb.append(", tbcrTitle=").append(tbcrTitle);
        sb.append(", tbcrVoucher=").append(tbcrVoucher);
        sb.append(", tbcrImage=").append(tbcrImage);
        sb.append(", tbcrAdder=").append(tbcrAdder);
        sb.append(", tbcrChecker=").append(tbcrChecker);
        sb.append(", tbcrRemark=").append(tbcrRemark);
        sb.append(", tbcrUpdateTime=").append(tbcrUpdateTime);
        sb.append(", tbcrAddTime=").append(tbcrAddTime);
        sb.append(", tbcrStatus=").append(tbcrStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}