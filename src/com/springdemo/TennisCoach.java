package com.springdemo;

import org.springframework.stereotype.Component;

//ADD COMPONENT - ANNOTATION
@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
