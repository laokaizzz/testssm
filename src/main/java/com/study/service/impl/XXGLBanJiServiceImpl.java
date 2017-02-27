package com.study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.XXGLBanJiDao;
import com.study.entity.XXGLBanJi;
import com.study.service.XXGLBanJiService;

/**
 * @author zhengkai
 *
 *  @date 2017年2月27日 下午4:04:18
 */
@Service
public class XXGLBanJiServiceImpl implements XXGLBanJiService {

	@Autowired
	private XXGLBanJiDao xxglBanJiDao;
	
	@Override
	public int add(XXGLBanJi model) {
		// TODO Auto-generated method stub
		return xxglBanJiDao.insert(model);
	}

	@Override
	public XXGLBanJi update(XXGLBanJi model) {
		// TODO Auto-generated method stub
		return null;
	}

}
