package com.study.entity;

public class XXGLXueSheng {
    private String xueshengGuid;

    private String xueshengName;

    private Boolean sex;

    private String remark;

    private String banjiGuid;

    private XXGLBanJi banJi;
    
    public String getXueshengGuid() {
        return xueshengGuid;
    }

    public void setXueshengGuid(String xueshengGuid) {
        this.xueshengGuid = xueshengGuid == null ? null : xueshengGuid.trim();
    }

    public String getXueshengName() {
        return xueshengName;
    }

    public void setXueshengName(String xueshengName) {
        this.xueshengName = xueshengName == null ? null : xueshengName.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBanjiGuid() {
        return banjiGuid;
    }

    public void setBanjiGuid(String banjiGuid) {
        this.banjiGuid = banjiGuid == null ? null : banjiGuid.trim();
    }

	public XXGLBanJi getBanJi() {
		return banJi;
	}

	public void setBanJi(XXGLBanJi banJi) {
		this.banJi = banJi;
	}
}