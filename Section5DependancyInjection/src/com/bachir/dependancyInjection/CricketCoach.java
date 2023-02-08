package com.bachir.dependancyInjection;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	

	//No-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");

	}
	//our setter method
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
