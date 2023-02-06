package com.bachir.dependancyInjection;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting practice";
	}
}
