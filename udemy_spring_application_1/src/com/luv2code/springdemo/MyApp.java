package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		System.out.println("Starting myApp...");

		// create the object
		// Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}
