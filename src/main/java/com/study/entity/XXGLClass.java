package com.study.entity;

public class XXGLClass {
    private String classGuid;

    private String className;

    private String address;

    private String remark;

    public String getClassGuid() {
        return classGuid;
    }

    public void setClassGuid(String classGuid) {
        this.classGuid = classGuid == null ? null : classGuid.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
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