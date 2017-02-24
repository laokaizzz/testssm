package com.study.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.XXGLClassDao;
import com.study.entity.XXGLClass;
import com.study.service.XXGLClassService;

/**
 * @author zhengkai
 *
 *  @date 2017年2月24日 上午11:50:51
 */
@Service
public class XXGLClassServiceImpl implements XXGLClassService {

	@Resource
	private XXGLClassDao xxglClassDao;
	
	@Override
	public int add(XXGLClass model) {
		// TODO Auto-generated method stub
		return xxglClassDao.insert(model);
	}

	@Override
	public XXGLClass update(XXGLClass model) {
		// TODO Auto-generated method stub
		return null;
	}

}
