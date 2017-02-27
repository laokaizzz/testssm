package com.study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.XXGLXueShengDao;
import com.study.entity.XXGLXueSheng;
import com.study.service.XXGLXueShengService;

/**
 * @author zhengkai
 *
 *  @date 2017年2月27日 下午4:00:53
 */
@Service
public class XXGLXueShengServiceImpl implements XXGLXueShengService {

	@Autowired
	private XXGLXueShengDao xxglXueShengDao;
	
	@Override
	public int add(XXGLXueSheng model) {
		// TODO Auto-generated method stub
		return xxglXueShengDao.insert(model);
	}

	@Override
	public XXGLXueSheng update(XXGLXueSheng model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XXGLXueSheng queryByGuid(String guid) {
		// TODO Auto-generated method stub
		return xxglXueShengDao.selectByPrimaryKey(guid);
	}

}
