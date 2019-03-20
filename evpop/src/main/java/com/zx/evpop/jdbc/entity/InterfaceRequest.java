package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InterfaceRequest implements Serializable {
    private String requestNo;

    private String sessionId;

    private String channel;

    private String txNo;

    private String version;

    private String uic;

    private String uid;

    private BigDecimal lng;

    private BigDecimal lat;

    private String clientIp;

    private Integer clientPort;

    private Integer orderStatus;

    private String responseNo;

    private Date createDate;

    private Date lastUpdateDate;

    private String innerMessage;

    private String outerMessage;

    private static final long serialVersionUID = 1L;

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getTxNo() {
        return txNo;
    }

    public void setTxNo(String txNo) {
        this.txNo = txNo == null ? null : txNo.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getUic() {
        return uic;
    }

    public void setUic(String uic) {
        this.uic = uic == null ? null : uic.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public Integer getClientPort() {
        return clientPort;
    }

    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getResponseNo() {
        return responseNo;
    }

    public void setResponseNo(String responseNo) {
        this.responseNo = responseNo == null ? null : responseNo.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getInnerMessage() {
        return innerMessage;
    }

    public void setInnerMessage(String innerMessage) {
        this.innerMessage = innerMessage == null ? null : innerMessage.trim();
    }

    public String getOuterMessage() {
        return outerMessage;
    }

    public void setOuterMessage(String outerMessage) {
        this.outerMessage = outerMessage == null ? null : outerMessage.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", requestNo=").append(requestNo);
        sb.append(", sessionId=").append(sessionId);
        sb.append(", channel=").append(channel);
        sb.append(", txNo=").append(txNo);
        sb.append(", version=").append(version);
        sb.append(", uic=").append(uic);
        sb.append(", uid=").append(uid);
        sb.append(", lng=").append(lng);
        sb.append(", lat=").append(lat);
        sb.append(", clientIp=").append(clientIp);
        sb.append(", clientPort=").append(clientPort);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", responseNo=").append(responseNo);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", innerMessage=").append(innerMessage);
        sb.append(", outerMessage=").append(outerMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}