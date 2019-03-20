package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderComment implements Serializable {
    private Integer tbocId;

    private Short tbocHost;

    private String tbocContent;

    private String tbocImage;

    private Integer tbocMember;

    private Long tbocOrder;

    private Short tbocScore;

    private Date tbocUpdateTime;

    private Date tbocAddTime;

    private Byte tbocStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbocId() {
        return tbocId;
    }

    public void setTbocId(Integer tbocId) {
        this.tbocId = tbocId;
    }

    public Short getTbocHost() {
        return tbocHost;
    }

    public void setTbocHost(Short tbocHost) {
        this.tbocHost = tbocHost;
    }

    public String getTbocContent() {
        return tbocContent;
    }

    public void setTbocContent(String tbocContent) {
        this.tbocContent = tbocContent == null ? null : tbocContent.trim();
    }

    public String getTbocImage() {
        return tbocImage;
    }

    public void setTbocImage(String tbocImage) {
        this.tbocImage = tbocImage == null ? null : tbocImage.trim();
    }

    public Integer getTbocMember() {
        return tbocMember;
    }

    public void setTbocMember(Integer tbocMember) {
        this.tbocMember = tbocMember;
    }

    public Long getTbocOrder() {
        return tbocOrder;
    }

    public void setTbocOrder(Long tbocOrder) {
        this.tbocOrder = tbocOrder;
    }

    public Short getTbocScore() {
        return tbocScore;
    }

    public void setTbocScore(Short tbocScore) {
        this.tbocScore = tbocScore;
    }

    public Date getTbocUpdateTime() {
        return tbocUpdateTime;
    }

    public void setTbocUpdateTime(Date tbocUpdateTime) {
        this.tbocUpdateTime = tbocUpdateTime;
    }

    public Date getTbocAddTime() {
        return tbocAddTime;
    }

    public void setTbocAddTime(Date tbocAddTime) {
        this.tbocAddTime = tbocAddTime;
    }

    public Byte getTbocStatus() {
        return tbocStatus;
    }

    public void setTbocStatus(Byte tbocStatus) {
        this.tbocStatus = tbocStatus;
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
        sb.append(", tbocId=").append(tbocId);
        sb.append(", tbocHost=").append(tbocHost);
        sb.append(", tbocContent=").append(tbocContent);
        sb.append(", tbocImage=").append(tbocImage);
        sb.append(", tbocMember=").append(tbocMember);
        sb.append(", tbocOrder=").append(tbocOrder);
        sb.append(", tbocScore=").append(tbocScore);
        sb.append(", tbocUpdateTime=").append(tbocUpdateTime);
        sb.append(", tbocAddTime=").append(tbocAddTime);
        sb.append(", tbocStatus=").append(tbocStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}