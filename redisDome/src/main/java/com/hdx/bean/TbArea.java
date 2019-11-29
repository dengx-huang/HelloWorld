package com.hdx.bean;

public class TbArea {
    private String areaId;

    private String areaName;

    private String nuonId;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getNuonId() {
        return nuonId;
    }

    public void setNuonId(String nuonId) {
        this.nuonId = nuonId == null ? null : nuonId.trim();
    }

    @Override
    public String toString() {
        return "{" +
                "areaId:'" + areaId + '\'' +
                ", areaName:'" + areaName + '\'' +
                ", nuonId:'" + nuonId + '\'' +
                '}';
    }
}