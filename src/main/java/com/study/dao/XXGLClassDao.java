package com.study.dao;

import com.study.entity.XXGLClass;

public interface XXGLClassDao {
    int deleteByPrimaryKey(String classGuid);

    int insert(XXGLClass record);

    int insertSelective(XXGLClass record);

    XXGLClass selectByPrimaryKey(String classGuid);

    int updateByPrimaryKeySelective(XXGLClass record);

    int updateByPrimaryKey(XXGLClass record);
}