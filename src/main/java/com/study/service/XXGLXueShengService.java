package com.study.service;

import com.study.entity.XXGLXueSheng;

/**
 * @author zhengkai
 *
 *  @date 2017年2月27日 下午3:59:57
 */
public interface XXGLXueShengService {
	/**
	 * 新增
	 * @param model
	 * @return
	 * @author zhengkai
	 * @date 2017年2月24日 上午11:48:19
	 */
	public int add(XXGLXueSheng model);
	
	/**
	 * 更新
	 * @param model
	 * @return
	 * @author zhengkai
	 * @date 2017年2月24日 上午11:48:19
	 */
	public XXGLXueSheng update(XXGLXueSheng model);

	/**
	 * 查询通过guid
	 * @param string
	 * @return
	 * @author zhengkai
	 * @date 2017年2月27日 下午4:17:08
	 */
	public XXGLXueSheng queryByGuid(String guid);
}
