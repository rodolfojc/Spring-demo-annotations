package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//ADD COMPONENT - ANNOTATION
//@Component("thatSillyCoach")

@Component //DEFAULT BEAN ID - FIRST LETTER LOWER CASE
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService FortuneService) {
		this.fortuneService = FortuneService;
	}*/
	
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside Default Constructor");
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>TennisCoach: inside setFortuneService() Setter");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
