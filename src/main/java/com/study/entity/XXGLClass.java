package com.study.entity;

public class XXGLClass {
    private String classGuid;

    private String className;

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
}