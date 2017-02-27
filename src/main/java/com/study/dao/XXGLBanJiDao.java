package com.study.dao;

import com.study.entity.XXGLBanJi;

public interface XXGLBanJiDao {
    int deleteByPrimaryKey(String banjiGuid);

    int insert(XXGLBanJi record);

    int insertSelective(XXGLBanJi record);

    XXGLBanJi selectByPrimaryKey(String banjiGuid);

    int updateByPrimaryKeySelective(XXGLBanJi record);

    int updateByPrimaryKey(XXGLBanJi record);
}