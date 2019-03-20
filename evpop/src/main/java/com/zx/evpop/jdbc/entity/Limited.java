package com.zx.evpop.jdbc.entity;

import java.io.Serializable;

public class Limited implements Serializable {
    private Long slId;

    private Long slProject;

    private Long slUser;

    private Long slGroup;

    private Integer slLimit;

    private static final long serialVersionUID = 1L;

    public Long getSlId() {
        return slId;
    }

    public void setSlId(Long slId) {
        this.slId = slId;
    }

    public Long getSlProject() {
        return slProject;
    }

    public void setSlProject(Long slProject) {
        this.slProject = slProject;
    }

    public Long getSlUser() {
        return slUser;
    }

    public void setSlUser(Long slUser) {
        this.slUser = slUser;
    }

    public Long getSlGroup() {
        return slGroup;
    }

    public void setSlGroup(Long slGroup) {
        this.slGroup = slGroup;
    }

    public Integer getSlLimit() {
        return slLimit;
    }

    public void setSlLimit(Integer slLimit) {
        this.slLimit = slLimit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", slId=").append(slId);
        sb.append(", slProject=").append(slProject);
        sb.append(", slUser=").append(slUser);
        sb.append(", slGroup=").append(slGroup);
        sb.append(", slLimit=").append(slLimit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}