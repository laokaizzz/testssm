package com.study.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.study.entity.XXGLXueSheng;
import com.study.service.XXGLXueShengService;

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
	private XXGLXueShengService xxglXueShengService;
/*	
	@Test
	public void test1(){
		XXGLXueSheng model=new XXGLXueSheng();
		model.setRemark("嘿嘿");
		model.setSex(true);
		model.setXueshengName("学生1");
		xxglXueShengService.add(model);
		
		
		
	    logger.info(JSON.toJSONString(model));  
		//logger.info(message);
	}*/
	
	@Test
	public void test2(){
		XXGLXueSheng model= xxglXueShengService.queryByGuid("46d3f6cdfcc511e6a4e1e03f4947f22f");
		logger.info(JSON.toJSONString(model));  
	}
}
