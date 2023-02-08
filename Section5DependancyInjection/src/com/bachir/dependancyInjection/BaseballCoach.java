package com.bachir.dependancyInjection;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting practice";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
