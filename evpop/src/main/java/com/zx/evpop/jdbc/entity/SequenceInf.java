package com.zx.evpop.jdbc.entity;

import java.io.Serializable;

public class SequenceInf implements Serializable {
    private String seqName;

    private String seqFeature;

    private Integer seqValue;

    private static final long serialVersionUID = 1L;

    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName == null ? null : seqName.trim();
    }

    public String getSeqFeature() {
        return seqFeature;
    }

    public void setSeqFeature(String seqFeature) {
        this.seqFeature = seqFeature == null ? null : seqFeature.trim();
    }

    public Integer getSeqValue() {
        return seqValue;
    }

    public void setSeqValue(Integer seqValue) {
        this.seqValue = seqValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seqName=").append(seqName);
        sb.append(", seqFeature=").append(seqFeature);
        sb.append(", seqValue=").append(seqValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}