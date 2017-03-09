package com.study.entity;

import java.util.List;

public class XXGLBanJi {
    private String banjiGuid;

    private String banjiName;

    private String address;

    private String remark;
    
    private List<XXGLXueSheng> lsXueSheng;

    private String className;
    
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

	public List<XXGLXueSheng> getLsXueSheng() {
		return lsXueSheng;
	}

	public void setLsXueSheng(List<XXGLXueSheng> lsXueSheng) {
		this.lsXueSheng = lsXueSheng;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}