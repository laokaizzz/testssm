package com.study.entity;

public class XXGLStudent {
    private String stuGuid;

    private String stuName;

    private Boolean sex;

    private String remark;

    private String classGuid;

    public String getStuGuid() {
        return stuGuid;
    }

    public void setStuGuid(String stuGuid) {
        this.stuGuid = stuGuid == null ? null : stuGuid.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
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

    public String getClassGuid() {
        return classGuid;
    }

    public void setClassGuid(String classGuid) {
        this.classGuid = classGuid == null ? null : classGuid.trim();
    }
}