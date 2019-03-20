package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class State implements Serializable {
    private Integer tbsId;

    private Short tbsHost;

    private String tbsNumber;

    private Long tbsCar;

    private String tbsRented;

    private String tbsWarn;

    private String tbsRfid;

    private String tbsRfidDte;

    private String tbsObdMile;

    private Integer tbsEngineT;

    private Integer tbsMileage;

    private Short tbsSpeed;

    private Short tbsMotor;

    private String tbsOil;

    private Short tbsPower;

    private Short tbsEvBattery;

    private Byte tbsCharging;

    private String tbsFuelMileage;

    private String tbsElectricMileage;

    private Short tbsEndurance;

    private Integer tbsTemperature;

    private Short tbsCsq;

    private String tbsPowerConsumption;

    private BigDecimal tbsLongitude;

    private BigDecimal tbsLatitude;

    private Short tbsDir;

    private Byte tbsCircular;

    private Byte tbsPtc;

    private Byte tbsCompres;

    private Byte tbsFan;

    private Byte tbsSaving;

    private Byte tbsDoor;

    private Short tbsLock;

    private Integer tbsLight;

    private Short tbsEngine;

    private Integer tbsBaseLac;

    private Integer tbsBaseCi;

    private String tbsOrder;

    private String tbsMoData;

    private Date tbsAddTime;

    private Date tbsCurrentTime;

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

    public String getTbsNumber() {
        return tbsNumber;
    }

    public void setTbsNumber(String tbsNumber) {
        this.tbsNumber = tbsNumber == null ? null : tbsNumber.trim();
    }

    public Long getTbsCar() {
        return tbsCar;
    }

    public void setTbsCar(Long tbsCar) {
        this.tbsCar = tbsCar;
    }

    public String getTbsRented() {
        return tbsRented;
    }

    public void setTbsRented(String tbsRented) {
        this.tbsRented = tbsRented == null ? null : tbsRented.trim();
    }

    public String getTbsWarn() {
        return tbsWarn;
    }

    public void setTbsWarn(String tbsWarn) {
        this.tbsWarn = tbsWarn == null ? null : tbsWarn.trim();
    }

    public String getTbsRfid() {
        return tbsRfid;
    }

    public void setTbsRfid(String tbsRfid) {
        this.tbsRfid = tbsRfid == null ? null : tbsRfid.trim();
    }

    public String getTbsRfidDte() {
        return tbsRfidDte;
    }

    public void setTbsRfidDte(String tbsRfidDte) {
        this.tbsRfidDte = tbsRfidDte == null ? null : tbsRfidDte.trim();
    }

    public String getTbsObdMile() {
        return tbsObdMile;
    }

    public void setTbsObdMile(String tbsObdMile) {
        this.tbsObdMile = tbsObdMile == null ? null : tbsObdMile.trim();
    }

    public Integer getTbsEngineT() {
        return tbsEngineT;
    }

    public void setTbsEngineT(Integer tbsEngineT) {
        this.tbsEngineT = tbsEngineT;
    }

    public Integer getTbsMileage() {
        return tbsMileage;
    }

    public void setTbsMileage(Integer tbsMileage) {
        this.tbsMileage = tbsMileage;
    }

    public Short getTbsSpeed() {
        return tbsSpeed;
    }

    public void setTbsSpeed(Short tbsSpeed) {
        this.tbsSpeed = tbsSpeed;
    }

    public Short getTbsMotor() {
        return tbsMotor;
    }

    public void setTbsMotor(Short tbsMotor) {
        this.tbsMotor = tbsMotor;
    }

    public String getTbsOil() {
        return tbsOil;
    }

    public void setTbsOil(String tbsOil) {
        this.tbsOil = tbsOil == null ? null : tbsOil.trim();
    }

    public Short getTbsPower() {
        return tbsPower;
    }

    public void setTbsPower(Short tbsPower) {
        this.tbsPower = tbsPower;
    }

    public Short getTbsEvBattery() {
        return tbsEvBattery;
    }

    public void setTbsEvBattery(Short tbsEvBattery) {
        this.tbsEvBattery = tbsEvBattery;
    }

    public Byte getTbsCharging() {
        return tbsCharging;
    }

    public void setTbsCharging(Byte tbsCharging) {
        this.tbsCharging = tbsCharging;
    }

    public String getTbsFuelMileage() {
        return tbsFuelMileage;
    }

    public void setTbsFuelMileage(String tbsFuelMileage) {
        this.tbsFuelMileage = tbsFuelMileage == null ? null : tbsFuelMileage.trim();
    }

    public String getTbsElectricMileage() {
        return tbsElectricMileage;
    }

    public void setTbsElectricMileage(String tbsElectricMileage) {
        this.tbsElectricMileage = tbsElectricMileage == null ? null : tbsElectricMileage.trim();
    }

    public Short getTbsEndurance() {
        return tbsEndurance;
    }

    public void setTbsEndurance(Short tbsEndurance) {
        this.tbsEndurance = tbsEndurance;
    }

    public Integer getTbsTemperature() {
        return tbsTemperature;
    }

    public void setTbsTemperature(Integer tbsTemperature) {
        this.tbsTemperature = tbsTemperature;
    }

    public Short getTbsCsq() {
        return tbsCsq;
    }

    public void setTbsCsq(Short tbsCsq) {
        this.tbsCsq = tbsCsq;
    }

    public String getTbsPowerConsumption() {
        return tbsPowerConsumption;
    }

    public void setTbsPowerConsumption(String tbsPowerConsumption) {
        this.tbsPowerConsumption = tbsPowerConsumption == null ? null : tbsPowerConsumption.trim();
    }

    public BigDecimal getTbsLongitude() {
        return tbsLongitude;
    }

    public void setTbsLongitude(BigDecimal tbsLongitude) {
        this.tbsLongitude = tbsLongitude;
    }

    public BigDecimal getTbsLatitude() {
        return tbsLatitude;
    }

    public void setTbsLatitude(BigDecimal tbsLatitude) {
        this.tbsLatitude = tbsLatitude;
    }

    public Short getTbsDir() {
        return tbsDir;
    }

    public void setTbsDir(Short tbsDir) {
        this.tbsDir = tbsDir;
    }

    public Byte getTbsCircular() {
        return tbsCircular;
    }

    public void setTbsCircular(Byte tbsCircular) {
        this.tbsCircular = tbsCircular;
    }

    public Byte getTbsPtc() {
        return tbsPtc;
    }

    public void setTbsPtc(Byte tbsPtc) {
        this.tbsPtc = tbsPtc;
    }

    public Byte getTbsCompres() {
        return tbsCompres;
    }

    public void setTbsCompres(Byte tbsCompres) {
        this.tbsCompres = tbsCompres;
    }

    public Byte getTbsFan() {
        return tbsFan;
    }

    public void setTbsFan(Byte tbsFan) {
        this.tbsFan = tbsFan;
    }

    public Byte getTbsSaving() {
        return tbsSaving;
    }

    public void setTbsSaving(Byte tbsSaving) {
        this.tbsSaving = tbsSaving;
    }

    public Byte getTbsDoor() {
        return tbsDoor;
    }

    public void setTbsDoor(Byte tbsDoor) {
        this.tbsDoor = tbsDoor;
    }

    public Short getTbsLock() {
        return tbsLock;
    }

    public void setTbsLock(Short tbsLock) {
        this.tbsLock = tbsLock;
    }

    public Integer getTbsLight() {
        return tbsLight;
    }

    public void setTbsLight(Integer tbsLight) {
        this.tbsLight = tbsLight;
    }

    public Short getTbsEngine() {
        return tbsEngine;
    }

    public void setTbsEngine(Short tbsEngine) {
        this.tbsEngine = tbsEngine;
    }

    public Integer getTbsBaseLac() {
        return tbsBaseLac;
    }

    public void setTbsBaseLac(Integer tbsBaseLac) {
        this.tbsBaseLac = tbsBaseLac;
    }

    public Integer getTbsBaseCi() {
        return tbsBaseCi;
    }

    public void setTbsBaseCi(Integer tbsBaseCi) {
        this.tbsBaseCi = tbsBaseCi;
    }

    public String getTbsOrder() {
        return tbsOrder;
    }

    public void setTbsOrder(String tbsOrder) {
        this.tbsOrder = tbsOrder == null ? null : tbsOrder.trim();
    }

    public String getTbsMoData() {
        return tbsMoData;
    }

    public void setTbsMoData(String tbsMoData) {
        this.tbsMoData = tbsMoData == null ? null : tbsMoData.trim();
    }

    public Date getTbsAddTime() {
        return tbsAddTime;
    }

    public void setTbsAddTime(Date tbsAddTime) {
        this.tbsAddTime = tbsAddTime;
    }

    public Date getTbsCurrentTime() {
        return tbsCurrentTime;
    }

    public void setTbsCurrentTime(Date tbsCurrentTime) {
        this.tbsCurrentTime = tbsCurrentTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbsId=").append(tbsId);
        sb.append(", tbsHost=").append(tbsHost);
        sb.append(", tbsNumber=").append(tbsNumber);
        sb.append(", tbsCar=").append(tbsCar);
        sb.append(", tbsRented=").append(tbsRented);
        sb.append(", tbsWarn=").append(tbsWarn);
        sb.append(", tbsRfid=").append(tbsRfid);
        sb.append(", tbsRfidDte=").append(tbsRfidDte);
        sb.append(", tbsObdMile=").append(tbsObdMile);
        sb.append(", tbsEngineT=").append(tbsEngineT);
        sb.append(", tbsMileage=").append(tbsMileage);
        sb.append(", tbsSpeed=").append(tbsSpeed);
        sb.append(", tbsMotor=").append(tbsMotor);
        sb.append(", tbsOil=").append(tbsOil);
        sb.append(", tbsPower=").append(tbsPower);
        sb.append(", tbsEvBattery=").append(tbsEvBattery);
        sb.append(", tbsCharging=").append(tbsCharging);
        sb.append(", tbsFuelMileage=").append(tbsFuelMileage);
        sb.append(", tbsElectricMileage=").append(tbsElectricMileage);
        sb.append(", tbsEndurance=").append(tbsEndurance);
        sb.append(", tbsTemperature=").append(tbsTemperature);
        sb.append(", tbsCsq=").append(tbsCsq);
        sb.append(", tbsPowerConsumption=").append(tbsPowerConsumption);
        sb.append(", tbsLongitude=").append(tbsLongitude);
        sb.append(", tbsLatitude=").append(tbsLatitude);
        sb.append(", tbsDir=").append(tbsDir);
        sb.append(", tbsCircular=").append(tbsCircular);
        sb.append(", tbsPtc=").append(tbsPtc);
        sb.append(", tbsCompres=").append(tbsCompres);
        sb.append(", tbsFan=").append(tbsFan);
        sb.append(", tbsSaving=").append(tbsSaving);
        sb.append(", tbsDoor=").append(tbsDoor);
        sb.append(", tbsLock=").append(tbsLock);
        sb.append(", tbsLight=").append(tbsLight);
        sb.append(", tbsEngine=").append(tbsEngine);
        sb.append(", tbsBaseLac=").append(tbsBaseLac);
        sb.append(", tbsBaseCi=").append(tbsBaseCi);
        sb.append(", tbsOrder=").append(tbsOrder);
        sb.append(", tbsMoData=").append(tbsMoData);
        sb.append(", tbsAddTime=").append(tbsAddTime);
        sb.append(", tbsCurrentTime=").append(tbsCurrentTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}