package com.study.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.XXGLClassDao;
import com.study.dao.XXGLStudentDao;
import com.study.entity.XXGLStudent;
import com.study.service.XXGLStudentService;

/**
 * @author zhengkai
 *
 *  @date 2017年2月24日 上午11:51:18
 */
@Service
public class XXGLStudentImpl implements XXGLStudentService {

	@Resource
	private XXGLStudentDao xxglStudentDao;
	
	@Override
	public int add(XXGLStudent model) {
		// TODO Auto-generated method stub
		return xxglStudentDao.insert(model);
	}

	@Override
	public XXGLStudent update(XXGLStudent model) {
		// TODO Auto-generated method stub
		return null;
	}



}
