package com.study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.XXGLClassDao;
import com.study.entity.XXGLClass;
import com.study.service.XXGLClassService;

/**
 * @author zhengkai
 *
 *  @date 2017年2月27日 下午4:04:18
 */
@Service
public class XXGLClassServiceImpl implements XXGLClassService {

	@Autowired
	private XXGLClassDao xxglClassDao;

	@Override
	public int add(XXGLClass model) {
		// TODO Auto-generated method stub
		return xxglClassDao.insert(model);
	}

	@Override
	public int update(XXGLClass model) {
		// TODO Auto-generated method stub
		return xxglClassDao.updateByPrimaryKeySelective(model);
	}

	@Override
	public XXGLClass queryDetailByGuid(String classGuid) {
		// TODO Auto-generated method stub
		return xxglClassDao.selectByPrimaryKey(classGuid);
	}
	

}
