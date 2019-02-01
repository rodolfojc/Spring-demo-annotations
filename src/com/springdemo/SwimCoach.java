package com.springdemo;

//NO @COMPONENT ADDED
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService FortuneService) {
		this.fortuneService = FortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 1000 meter as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
