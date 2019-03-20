package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Update implements Serializable {
    private Integer tbuId;

    private String tbuName;

    private String tbuVersion;

    private Byte tbuType;

    private Byte tbuMode;

    private String tbuFile;

    private String tbuDescript;

    private Date tbuUpdateTime;

    private Date tbuAddTime;

    private Byte tbuStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTbuId() {
        return tbuId;
    }

    public void setTbuId(Integer tbuId) {
        this.tbuId = tbuId;
    }

    public String getTbuName() {
        return tbuName;
    }

    public void setTbuName(String tbuName) {
        this.tbuName = tbuName == null ? null : tbuName.trim();
    }

    public String getTbuVersion() {
        return tbuVersion;
    }

    public void setTbuVersion(String tbuVersion) {
        this.tbuVersion = tbuVersion == null ? null : tbuVersion.trim();
    }

    public Byte getTbuType() {
        return tbuType;
    }

    public void setTbuType(Byte tbuType) {
        this.tbuType = tbuType;
    }

    public Byte getTbuMode() {
        return tbuMode;
    }

    public void setTbuMode(Byte tbuMode) {
        this.tbuMode = tbuMode;
    }

    public String getTbuFile() {
        return tbuFile;
    }

    public void setTbuFile(String tbuFile) {
        this.tbuFile = tbuFile == null ? null : tbuFile.trim();
    }

    public String getTbuDescript() {
        return tbuDescript;
    }

    public void setTbuDescript(String tbuDescript) {
        this.tbuDescript = tbuDescript == null ? null : tbuDescript.trim();
    }

    public Date getTbuUpdateTime() {
        return tbuUpdateTime;
    }

    public void setTbuUpdateTime(Date tbuUpdateTime) {
        this.tbuUpdateTime = tbuUpdateTime;
    }

    public Date getTbuAddTime() {
        return tbuAddTime;
    }

    public void setTbuAddTime(Date tbuAddTime) {
        this.tbuAddTime = tbuAddTime;
    }

    public Byte getTbuStatus() {
        return tbuStatus;
    }

    public void setTbuStatus(Byte tbuStatus) {
        this.tbuStatus = tbuStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbuId=").append(tbuId);
        sb.append(", tbuName=").append(tbuName);
        sb.append(", tbuVersion=").append(tbuVersion);
        sb.append(", tbuType=").append(tbuType);
        sb.append(", tbuMode=").append(tbuMode);
        sb.append(", tbuFile=").append(tbuFile);
        sb.append(", tbuDescript=").append(tbuDescript);
        sb.append(", tbuUpdateTime=").append(tbuUpdateTime);
        sb.append(", tbuAddTime=").append(tbuAddTime);
        sb.append(", tbuStatus=").append(tbuStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}