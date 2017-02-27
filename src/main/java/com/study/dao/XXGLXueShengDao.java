package com.study.dao;

import com.study.entity.XXGLXueSheng;

public interface XXGLXueShengDao {
    int deleteByPrimaryKey(String xueshengGuid);

    int insert(XXGLXueSheng record);

    int insertSelective(XXGLXueSheng record);

    XXGLXueSheng selectByPrimaryKey(String xueshengGuid);

    int updateByPrimaryKeySelective(XXGLXueSheng record);

    int updateByPrimaryKey(XXGLXueSheng record);
}