package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Group implements Serializable {
    private Integer sgId;

    private String sgName;

    private Integer sgParent;

    private String sgFamily;

    private String sgFlag;

    private Byte sgStatus;

    private Integer sgUser;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getSgId() {
        return sgId;
    }

    public void setSgId(Integer sgId) {
        this.sgId = sgId;
    }

    public String getSgName() {
        return sgName;
    }

    public void setSgName(String sgName) {
        this.sgName = sgName == null ? null : sgName.trim();
    }

    public Integer getSgParent() {
        return sgParent;
    }

    public void setSgParent(Integer sgParent) {
        this.sgParent = sgParent;
    }

    public String getSgFamily() {
        return sgFamily;
    }

    public void setSgFamily(String sgFamily) {
        this.sgFamily = sgFamily == null ? null : sgFamily.trim();
    }

    public String getSgFlag() {
        return sgFlag;
    }

    public void setSgFlag(String sgFlag) {
        this.sgFlag = sgFlag == null ? null : sgFlag.trim();
    }

    public Byte getSgStatus() {
        return sgStatus;
    }

    public void setSgStatus(Byte sgStatus) {
        this.sgStatus = sgStatus;
    }

    public Integer getSgUser() {
        return sgUser;
    }

    public void setSgUser(Integer sgUser) {
        this.sgUser = sgUser;
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
        sb.append(", sgId=").append(sgId);
        sb.append(", sgName=").append(sgName);
        sb.append(", sgParent=").append(sgParent);
        sb.append(", sgFamily=").append(sgFamily);
        sb.append(", sgFlag=").append(sgFlag);
        sb.append(", sgStatus=").append(sgStatus);
        sb.append(", sgUser=").append(sgUser);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}