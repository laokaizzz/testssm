package com.study.service;

import com.study.entity.XXGLStudent;

/**
 * @author zhengkai
 *
 *  @date 2017年2月24日 上午11:44:38
 */
public interface XXGLStudentService {
	/**
	 * 新增
	 * @param model
	 * @return
	 * @author zhengkai
	 * @date 2017年2月24日 上午11:48:19
	 */
	public int add(XXGLStudent model);
	
	/**
	 * 更新
	 * @param model
	 * @return
	 * @author zhengkai
	 * @date 2017年2月24日 上午11:48:19
	 */
	public XXGLStudent update(XXGLStudent model);
}
