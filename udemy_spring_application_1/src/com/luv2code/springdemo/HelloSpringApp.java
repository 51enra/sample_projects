package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("Starting HelloSpringApp...");
		
		// retrieve the bean from spring container
//		Coach theCoach = context.getBean("myCricketCoach", Coach.class);
//		System.out.println(theCoach);		
		// call methods on the bean (methods defined in interface)
//		System.out.println(theCoach.getDailyWorkout());	
//		System.out.println(theCoach.getDailyFortune());
		
		// call methods on the bean (methods defined in interface)
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(theCricketCoach);
		System.out.println(theCricketCoach.getDailyWorkout());	
		System.out.println(theCricketCoach.getDailyFortune());
		System.out.println(theCricketCoach.getEmailAddress());
		System.out.println(theCricketCoach.getTeam());
		
		// close the context
        context.close();
	}

}
