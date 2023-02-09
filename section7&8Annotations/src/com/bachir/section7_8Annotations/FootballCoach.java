package com.bachir.section7_8Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {


	private FortuneService fortuneService;

	//Default constructor
	public FootballCoach() {
		System.out.println(">>FootballCoach: inside default constractor");
	}
	
	//setter method for injection
	//@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println(">>FootballCoach: inside setFortuneService() method");
//		this.fortuneService = theFortuneService;
//	}
	
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">>FootballCoach: inside doSomeCrazyStuff() method");
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hit 100 freekicks";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	

	
}
