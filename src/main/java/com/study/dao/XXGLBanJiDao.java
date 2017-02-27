package com.study.dao;

import com.study.entity.XXGLBanJi;

public interface XXGLBanJiDao {
    int deleteByPrimaryKey(String banjiGuid);

    int insert(XXGLBanJi record);

    int insertSelective(XXGLBanJi record);

    XXGLBanJi queryById(String banjiGuid);

    int updateByPrimaryKeySelective(XXGLBanJi record);

    int updateByPrimaryKey(XXGLBanJi record);

    /**
     * 查询详情通过guid
     * @param guid
     * @return
     * @author zhengkai
     * @date 2017年2月27日 下午5:03:40
     */
	XXGLBanJi queryDetailByGuid(String banjiGuid);
}