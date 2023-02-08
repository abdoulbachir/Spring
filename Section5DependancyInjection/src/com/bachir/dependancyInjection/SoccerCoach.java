package com.bachir.dependancyInjection;

public class SoccerCoach implements Coach{

	private FortuneService fortuneService;
	
	
	public SoccerCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Hit 30 freekicks.";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	
}
