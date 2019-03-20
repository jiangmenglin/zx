package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class UserFeedback implements Serializable {
    private Long tbufId;

    private String tbufBackType;

    private String tbufBackContent;

    private String tbufDealDetail;

    private Long tbufMember;

    private Date tbufAddTime;

    private Date tbufUpdateTime;

    private Byte tbufStatus;

    private String tbufMobilePlatform;

    private String tbufSystemVersion;

    private String tbufAppVersion;

    private Byte tbufSource;

    private String tbufHardwareaddress;

    private String tbufUic;

    private static final long serialVersionUID = 1L;

    public Long getTbufId() {
        return tbufId;
    }

    public void setTbufId(Long tbufId) {
        this.tbufId = tbufId;
    }

    public String getTbufBackType() {
        return tbufBackType;
    }

    public void setTbufBackType(String tbufBackType) {
        this.tbufBackType = tbufBackType == null ? null : tbufBackType.trim();
    }

    public String getTbufBackContent() {
        return tbufBackContent;
    }

    public void setTbufBackContent(String tbufBackContent) {
        this.tbufBackContent = tbufBackContent == null ? null : tbufBackContent.trim();
    }

    public String getTbufDealDetail() {
        return tbufDealDetail;
    }

    public void setTbufDealDetail(String tbufDealDetail) {
        this.tbufDealDetail = tbufDealDetail == null ? null : tbufDealDetail.trim();
    }

    public Long getTbufMember() {
        return tbufMember;
    }

    public void setTbufMember(Long tbufMember) {
        this.tbufMember = tbufMember;
    }

    public Date getTbufAddTime() {
        return tbufAddTime;
    }

    public void setTbufAddTime(Date tbufAddTime) {
        this.tbufAddTime = tbufAddTime;
    }

    public Date getTbufUpdateTime() {
        return tbufUpdateTime;
    }

    public void setTbufUpdateTime(Date tbufUpdateTime) {
        this.tbufUpdateTime = tbufUpdateTime;
    }

    public Byte getTbufStatus() {
        return tbufStatus;
    }

    public void setTbufStatus(Byte tbufStatus) {
        this.tbufStatus = tbufStatus;
    }

    public String getTbufMobilePlatform() {
        return tbufMobilePlatform;
    }

    public void setTbufMobilePlatform(String tbufMobilePlatform) {
        this.tbufMobilePlatform = tbufMobilePlatform == null ? null : tbufMobilePlatform.trim();
    }

    public String getTbufSystemVersion() {
        return tbufSystemVersion;
    }

    public void setTbufSystemVersion(String tbufSystemVersion) {
        this.tbufSystemVersion = tbufSystemVersion == null ? null : tbufSystemVersion.trim();
    }

    public String getTbufAppVersion() {
        return tbufAppVersion;
    }

    public void setTbufAppVersion(String tbufAppVersion) {
        this.tbufAppVersion = tbufAppVersion == null ? null : tbufAppVersion.trim();
    }

    public Byte getTbufSource() {
        return tbufSource;
    }

    public void setTbufSource(Byte tbufSource) {
        this.tbufSource = tbufSource;
    }

    public String getTbufHardwareaddress() {
        return tbufHardwareaddress;
    }

    public void setTbufHardwareaddress(String tbufHardwareaddress) {
        this.tbufHardwareaddress = tbufHardwareaddress == null ? null : tbufHardwareaddress.trim();
    }

    public String getTbufUic() {
        return tbufUic;
    }

    public void setTbufUic(String tbufUic) {
        this.tbufUic = tbufUic == null ? null : tbufUic.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbufId=").append(tbufId);
        sb.append(", tbufBackType=").append(tbufBackType);
        sb.append(", tbufBackContent=").append(tbufBackContent);
        sb.append(", tbufDealDetail=").append(tbufDealDetail);
        sb.append(", tbufMember=").append(tbufMember);
        sb.append(", tbufAddTime=").append(tbufAddTime);
        sb.append(", tbufUpdateTime=").append(tbufUpdateTime);
        sb.append(", tbufStatus=").append(tbufStatus);
        sb.append(", tbufMobilePlatform=").append(tbufMobilePlatform);
        sb.append(", tbufSystemVersion=").append(tbufSystemVersion);
        sb.append(", tbufAppVersion=").append(tbufAppVersion);
        sb.append(", tbufSource=").append(tbufSource);
        sb.append(", tbufHardwareaddress=").append(tbufHardwareaddress);
        sb.append(", tbufUic=").append(tbufUic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}