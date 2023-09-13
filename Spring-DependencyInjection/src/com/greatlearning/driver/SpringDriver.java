package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceImpl.GkTeacher;

public class SpringDriver {

	public static void main(String[] args) {
		
		//1. Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2. retrieve from the spring container
		Teacher teacher = context.getBean("teacher",GkTeacher.class); // bean id, class name with.class extension
		
		//3 . call methods on the bean
		System.out.println(teacher.getHomeWork());
		System.out.println(teacher.getExamTip());
		
		//4. close the context
        context.close();
	}

}
