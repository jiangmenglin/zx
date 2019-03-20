package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class InterfaceResponse implements Serializable {
    private String responseNo;

    private Integer rspType;

    private String innerRspCode;

    private String innerRspDesc;

    private String outerRspCode;

    private String outerRspDesc;

    private String requestNo;

    private Date createDate;

    private Date lastUpdateDate;

    private String innerMessage;

    private String outerMessage;

    private String causeStackTrace;

    private String causeMessage;

    private static final long serialVersionUID = 1L;

    public String getResponseNo() {
        return responseNo;
    }

    public void setResponseNo(String responseNo) {
        this.responseNo = responseNo == null ? null : responseNo.trim();
    }

    public Integer getRspType() {
        return rspType;
    }

    public void setRspType(Integer rspType) {
        this.rspType = rspType;
    }

    public String getInnerRspCode() {
        return innerRspCode;
    }

    public void setInnerRspCode(String innerRspCode) {
        this.innerRspCode = innerRspCode == null ? null : innerRspCode.trim();
    }

    public String getInnerRspDesc() {
        return innerRspDesc;
    }

    public void setInnerRspDesc(String innerRspDesc) {
        this.innerRspDesc = innerRspDesc == null ? null : innerRspDesc.trim();
    }

    public String getOuterRspCode() {
        return outerRspCode;
    }

    public void setOuterRspCode(String outerRspCode) {
        this.outerRspCode = outerRspCode == null ? null : outerRspCode.trim();
    }

    public String getOuterRspDesc() {
        return outerRspDesc;
    }

    public void setOuterRspDesc(String outerRspDesc) {
        this.outerRspDesc = outerRspDesc == null ? null : outerRspDesc.trim();
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
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

    public String getCauseStackTrace() {
        return causeStackTrace;
    }

    public void setCauseStackTrace(String causeStackTrace) {
        this.causeStackTrace = causeStackTrace == null ? null : causeStackTrace.trim();
    }

    public String getCauseMessage() {
        return causeMessage;
    }

    public void setCauseMessage(String causeMessage) {
        this.causeMessage = causeMessage == null ? null : causeMessage.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", responseNo=").append(responseNo);
        sb.append(", rspType=").append(rspType);
        sb.append(", innerRspCode=").append(innerRspCode);
        sb.append(", innerRspDesc=").append(innerRspDesc);
        sb.append(", outerRspCode=").append(outerRspCode);
        sb.append(", outerRspDesc=").append(outerRspDesc);
        sb.append(", requestNo=").append(requestNo);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", innerMessage=").append(innerMessage);
        sb.append(", outerMessage=").append(outerMessage);
        sb.append(", causeStackTrace=").append(causeStackTrace);
        sb.append(", causeMessage=").append(causeMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}