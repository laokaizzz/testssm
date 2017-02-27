package com.study.entity;

public class XXGLBanJi {
    private String banjiGuid;

    private String banjiName;

    private String address;

    private String remark;

    public String getBanjiGuid() {
        return banjiGuid;
    }

    public void setBanjiGuid(String banjiGuid) {
        this.banjiGuid = banjiGuid == null ? null : banjiGuid.trim();
    }

    public String getBanjiName() {
        return banjiName;
    }

    public void setBanjiName(String banjiName) {
        this.banjiName = banjiName == null ? null : banjiName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}