package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Secure implements Serializable {
    private Integer tbsId;

    private Short tbsHost;

    private Integer tbsCar;

    private String tbsVin;

    private String tbsCipnum;

    private String tbsCipcompany;

    private Date tbsTiUnit;

    private String tbsCipimage;

    private Date tbsBiUnit;

    private String tbsBiImage;

    private String tbsBiType;

    private String tbsBinum;

    private String tbsBicompany;

    private Double tbsBiLimit;

    private String tbsBiCompany;

    private Integer tbsEditor;

    private Date tbsUpdateTime;

    private Date tbsAddTime;

    private String tbsRemark;

    private Byte tbsStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbsId() {
        return tbsId;
    }

    public void setTbsId(Integer tbsId) {
        this.tbsId = tbsId;
    }

    public Short getTbsHost() {
        return tbsHost;
    }

    public void setTbsHost(Short tbsHost) {
        this.tbsHost = tbsHost;
    }

    public Integer getTbsCar() {
        return tbsCar;
    }

    public void setTbsCar(Integer tbsCar) {
        this.tbsCar = tbsCar;
    }

    public String getTbsVin() {
        return tbsVin;
    }

    public void setTbsVin(String tbsVin) {
        this.tbsVin = tbsVin == null ? null : tbsVin.trim();
    }

    public String getTbsCipnum() {
        return tbsCipnum;
    }

    public void setTbsCipnum(String tbsCipnum) {
        this.tbsCipnum = tbsCipnum == null ? null : tbsCipnum.trim();
    }

    public String getTbsCipcompany() {
        return tbsCipcompany;
    }

    public void setTbsCipcompany(String tbsCipcompany) {
        this.tbsCipcompany = tbsCipcompany == null ? null : tbsCipcompany.trim();
    }

    public Date getTbsTiUnit() {
        return tbsTiUnit;
    }

    public void setTbsTiUnit(Date tbsTiUnit) {
        this.tbsTiUnit = tbsTiUnit;
    }

    public String getTbsCipimage() {
        return tbsCipimage;
    }

    public void setTbsCipimage(String tbsCipimage) {
        this.tbsCipimage = tbsCipimage == null ? null : tbsCipimage.trim();
    }

    public Date getTbsBiUnit() {
        return tbsBiUnit;
    }

    public void setTbsBiUnit(Date tbsBiUnit) {
        this.tbsBiUnit = tbsBiUnit;
    }

    public String getTbsBiImage() {
        return tbsBiImage;
    }

    public void setTbsBiImage(String tbsBiImage) {
        this.tbsBiImage = tbsBiImage == null ? null : tbsBiImage.trim();
    }

    public String getTbsBiType() {
        return tbsBiType;
    }

    public void setTbsBiType(String tbsBiType) {
        this.tbsBiType = tbsBiType == null ? null : tbsBiType.trim();
    }

    public String getTbsBinum() {
        return tbsBinum;
    }

    public void setTbsBinum(String tbsBinum) {
        this.tbsBinum = tbsBinum == null ? null : tbsBinum.trim();
    }

    public String getTbsBicompany() {
        return tbsBicompany;
    }

    public void setTbsBicompany(String tbsBicompany) {
        this.tbsBicompany = tbsBicompany == null ? null : tbsBicompany.trim();
    }

    public Double getTbsBiLimit() {
        return tbsBiLimit;
    }

    public void setTbsBiLimit(Double tbsBiLimit) {
        this.tbsBiLimit = tbsBiLimit;
    }

    public String getTbsBiCompany() {
        return tbsBiCompany;
    }

    public void setTbsBiCompany(String tbsBiCompany) {
        this.tbsBiCompany = tbsBiCompany == null ? null : tbsBiCompany.trim();
    }

    public Integer getTbsEditor() {
        return tbsEditor;
    }

    public void setTbsEditor(Integer tbsEditor) {
        this.tbsEditor = tbsEditor;
    }

    public Date getTbsUpdateTime() {
        return tbsUpdateTime;
    }

    public void setTbsUpdateTime(Date tbsUpdateTime) {
        this.tbsUpdateTime = tbsUpdateTime;
    }

    public Date getTbsAddTime() {
        return tbsAddTime;
    }

    public void setTbsAddTime(Date tbsAddTime) {
        this.tbsAddTime = tbsAddTime;
    }

    public String getTbsRemark() {
        return tbsRemark;
    }

    public void setTbsRemark(String tbsRemark) {
        this.tbsRemark = tbsRemark == null ? null : tbsRemark.trim();
    }

    public Byte getTbsStatus() {
        return tbsStatus;
    }

    public void setTbsStatus(Byte tbsStatus) {
        this.tbsStatus = tbsStatus;
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
        sb.append(", tbsId=").append(tbsId);
        sb.append(", tbsHost=").append(tbsHost);
        sb.append(", tbsCar=").append(tbsCar);
        sb.append(", tbsVin=").append(tbsVin);
        sb.append(", tbsCipnum=").append(tbsCipnum);
        sb.append(", tbsCipcompany=").append(tbsCipcompany);
        sb.append(", tbsTiUnit=").append(tbsTiUnit);
        sb.append(", tbsCipimage=").append(tbsCipimage);
        sb.append(", tbsBiUnit=").append(tbsBiUnit);
        sb.append(", tbsBiImage=").append(tbsBiImage);
        sb.append(", tbsBiType=").append(tbsBiType);
        sb.append(", tbsBinum=").append(tbsBinum);
        sb.append(", tbsBicompany=").append(tbsBicompany);
        sb.append(", tbsBiLimit=").append(tbsBiLimit);
        sb.append(", tbsBiCompany=").append(tbsBiCompany);
        sb.append(", tbsEditor=").append(tbsEditor);
        sb.append(", tbsUpdateTime=").append(tbsUpdateTime);
        sb.append(", tbsAddTime=").append(tbsAddTime);
        sb.append(", tbsRemark=").append(tbsRemark);
        sb.append(", tbsStatus=").append(tbsStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}