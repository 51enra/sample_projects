package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from the Spring container
		Coach myCoach = (Coach) context.getBean("tennisCoach");
		
		// call a method on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println("\n"+myCoach.getDailyFortune());		
		// close the context
		context.close();

	}

}
