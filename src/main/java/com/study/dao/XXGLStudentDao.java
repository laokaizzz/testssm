package com.study.dao;

import com.study.entity.XXGLStudent;

public interface XXGLStudentDao {
    int deleteByPrimaryKey(String stuGuid);

    int insert(XXGLStudent record);

    int insertSelective(XXGLStudent record);

    XXGLStudent selectByPrimaryKey(String stuGuid);

    int updateByPrimaryKeySelective(XXGLStudent record);

    int updateByPrimaryKey(XXGLStudent record);
}