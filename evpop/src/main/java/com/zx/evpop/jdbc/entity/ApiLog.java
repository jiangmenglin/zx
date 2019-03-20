package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class ApiLog implements Serializable {
    private Long salId;

    private Long salClient;

    private String salApi;

    private Long salMember;

    private Double salLat;

    private Double salLng;

    private Date salInvokeTime;

    private Short salStatus;

    private String salParams;

    private String salReturn;

    private static final long serialVersionUID = 1L;

    public Long getSalId() {
        return salId;
    }

    public void setSalId(Long salId) {
        this.salId = salId;
    }

    public Long getSalClient() {
        return salClient;
    }

    public void setSalClient(Long salClient) {
        this.salClient = salClient;
    }

    public String getSalApi() {
        return salApi;
    }

    public void setSalApi(String salApi) {
        this.salApi = salApi == null ? null : salApi.trim();
    }

    public Long getSalMember() {
        return salMember;
    }

    public void setSalMember(Long salMember) {
        this.salMember = salMember;
    }

    public Double getSalLat() {
        return salLat;
    }

    public void setSalLat(Double salLat) {
        this.salLat = salLat;
    }

    public Double getSalLng() {
        return salLng;
    }

    public void setSalLng(Double salLng) {
        this.salLng = salLng;
    }

    public Date getSalInvokeTime() {
        return salInvokeTime;
    }

    public void setSalInvokeTime(Date salInvokeTime) {
        this.salInvokeTime = salInvokeTime;
    }

    public Short getSalStatus() {
        return salStatus;
    }

    public void setSalStatus(Short salStatus) {
        this.salStatus = salStatus;
    }

    public String getSalParams() {
        return salParams;
    }

    public void setSalParams(String salParams) {
        this.salParams = salParams == null ? null : salParams.trim();
    }

    public String getSalReturn() {
        return salReturn;
    }

    public void setSalReturn(String salReturn) {
        this.salReturn = salReturn == null ? null : salReturn.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", salId=").append(salId);
        sb.append(", salClient=").append(salClient);
        sb.append(", salApi=").append(salApi);
        sb.append(", salMember=").append(salMember);
        sb.append(", salLat=").append(salLat);
        sb.append(", salLng=").append(salLng);
        sb.append(", salInvokeTime=").append(salInvokeTime);
        sb.append(", salStatus=").append(salStatus);
        sb.append(", salParams=").append(salParams);
        sb.append(", salReturn=").append(salReturn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}