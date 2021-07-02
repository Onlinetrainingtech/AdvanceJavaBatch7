package com.xyz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the Spring Configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive bean from Spring Container
		
		Coach theCoach=context.getBean("t1",Coach.class);
		
		Coach theCoach1=context.getBean("t2",Coach.class);
		
		//Call the method
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach1.getDailyWorkout());

		//Close the context
		
		context.close();
	}

}
