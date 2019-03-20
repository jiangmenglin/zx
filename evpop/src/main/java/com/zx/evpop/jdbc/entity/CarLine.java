package com.zx.evpop.jdbc.entity;

import java.io.Serializable;

public class CarLine implements Serializable {
    private Long tbclId;

    private Long tbclHost;

    private Long tbclCar;

    private String tbclMonth;

    private String tbclDLine;

    private String tbclHLine;

    private Integer tbclDayS;

    private Integer tbclHourS;

    private Short tbclStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbclId() {
        return tbclId;
    }

    public void setTbclId(Long tbclId) {
        this.tbclId = tbclId;
    }

    public Long getTbclHost() {
        return tbclHost;
    }

    public void setTbclHost(Long tbclHost) {
        this.tbclHost = tbclHost;
    }

    public Long getTbclCar() {
        return tbclCar;
    }

    public void setTbclCar(Long tbclCar) {
        this.tbclCar = tbclCar;
    }

    public String getTbclMonth() {
        return tbclMonth;
    }

    public void setTbclMonth(String tbclMonth) {
        this.tbclMonth = tbclMonth == null ? null : tbclMonth.trim();
    }

    public String getTbclDLine() {
        return tbclDLine;
    }

    public void setTbclDLine(String tbclDLine) {
        this.tbclDLine = tbclDLine == null ? null : tbclDLine.trim();
    }

    public String getTbclHLine() {
        return tbclHLine;
    }

    public void setTbclHLine(String tbclHLine) {
        this.tbclHLine = tbclHLine == null ? null : tbclHLine.trim();
    }

    public Integer getTbclDayS() {
        return tbclDayS;
    }

    public void setTbclDayS(Integer tbclDayS) {
        this.tbclDayS = tbclDayS;
    }

    public Integer getTbclHourS() {
        return tbclHourS;
    }

    public void setTbclHourS(Integer tbclHourS) {
        this.tbclHourS = tbclHourS;
    }

    public Short getTbclStatus() {
        return tbclStatus;
    }

    public void setTbclStatus(Short tbclStatus) {
        this.tbclStatus = tbclStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbclId=").append(tbclId);
        sb.append(", tbclHost=").append(tbclHost);
        sb.append(", tbclCar=").append(tbclCar);
        sb.append(", tbclMonth=").append(tbclMonth);
        sb.append(", tbclDLine=").append(tbclDLine);
        sb.append(", tbclHLine=").append(tbclHLine);
        sb.append(", tbclDayS=").append(tbclDayS);
        sb.append(", tbclHourS=").append(tbclHourS);
        sb.append(", tbclStatus=").append(tbclStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}