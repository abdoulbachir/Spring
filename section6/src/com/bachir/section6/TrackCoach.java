package com.bachir.section6;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		super();
	}
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it! "+fortuneService.getFortune();
	}
	
	
	//add an init method 
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inisde method doMyStartupStuff");
	}
	//add a destroy method
	
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inisde method doMyCleanupStuffYoYo");
	}
}
