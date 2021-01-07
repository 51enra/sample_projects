package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config file
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// read spring config java class
		Class<SportConfig> sc = SportConfig.class;
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(sc);

		// get the bean from the Spring container
		TennisCoach myCoach = (TennisCoach) context.getBean("tennisCoach");
		
		// call a method on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println("\n" + myCoach.getEmail());
		System.out.println("\n" + myCoach.getTeam());
		System.out.println("\n"+myCoach.getDailyFortune());		
		// close the context
		context.close();

	}

}
