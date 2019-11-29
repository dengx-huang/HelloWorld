package com.hdx.bean;

public class TbNuon {
    private String nuonId;

    private String nuonName;

    public String getNuonId() {
        return nuonId;
    }

    public void setNuonId(String nuonId) {
        this.nuonId = nuonId == null ? null : nuonId.trim();
    }

    public String getNuonName() {
        return nuonName;
    }

    public void setNuonName(String nuonName) {
        this.nuonName = nuonName == null ? null : nuonName.trim();
    }

    @Override
    public String toString() {
        return "{" +
                "nuonId:'" + nuonId + '\'' +
                ", nuonName:'" + nuonName + '\'' +
                '}';
    }
}