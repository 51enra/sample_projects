package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	// define private fields for the dependencies
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	// we also CAN define an "empty" constructor (not mandatory)
	public CricketCoach() {
		super();
		System.out.println("CricketCoach: Now inside constructor.");
	}	
	
	// define setter methods for dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Now inside setter method - setFortuneService.");
		this.fortuneService = fortuneService;
	}	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Now inside setter method - setEmailAddress.");
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: Now inside setter method - setTeam.");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice fast bowling for 15 min.";
	}	
	@Override
	public String getDailyFortune() {
		return "Mind that: " + fortuneService.getFortune();
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

}
