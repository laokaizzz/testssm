package com.study.service;

import com.study.entity.XXGLClass;

/**
 * @author zhengkai
 *
 *  @date 2017年2月27日 下午4:03:06
 */
public interface XXGLClassService {
	/**
	 * 新增
	 * @param model
	 * @return
	 * @author zhengkai
	 * @date 2017年2月24日 上午11:48:19
	 */
	public int add(XXGLClass model);
	
	/**
	 * 更新
	 * @param model
	 * @return
	 * @author zhengkai
	 * @date 2017年2月24日 上午11:48:19
	 */
	public int update(XXGLClass model);

	/**
	 * 查询通过guid
	 * @param string
	 * @return
	 * @author zhengkai
	 * @date 2017年2月27日 下午5:02:48
	 */
	public XXGLClass queryDetailByGuid(String string);
}
