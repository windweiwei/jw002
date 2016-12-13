package com.shsxt.test;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.shsxt.controller.UserController;
import com.shsxt.dao.UserDao;
import com.shsxt.service.UserService;


@SuppressWarnings("all")
public class TestSpring01 {

	@Test
	public void test01() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		UserDao userDao=(UserDao) ac.getBean("userDao");
		userDao.save();
		
		
		
		UserService userService=(UserService) ac.getBean("userService");//相对路径 大部分采用第一种加载bean 容器
		userService.save();
		UserController userController=(UserController) ac.getBean("userController");
		
		userController.save();
		
		
		
	}
	
	
	
	
	
	

}
