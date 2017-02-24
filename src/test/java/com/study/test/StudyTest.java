package com.study.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.entity.XXGLStudent;
import com.study.service.XXGLStudentService;

/**
 * @author zhengkai
 *
 *  @date 2017年2月24日 下午2:12:36
 */
@RunWith(SpringJUnit4ClassRunner.class)//表示在spring容器下测试
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class StudyTest {
	private static Logger logger=Logger.getLogger(StudyTest.class);
	
	@Autowired
	private XXGLStudentService xxglStudentService;
	
	@Test
	public void test1(){
		XXGLStudent model=new XXGLStudent();
		model.setRemark("嘿嘿");
		model.setSex(true);
		model.setStuName("学生1");
		xxglStudentService.add(model);
		
		//logger.info(message);
	}
}
