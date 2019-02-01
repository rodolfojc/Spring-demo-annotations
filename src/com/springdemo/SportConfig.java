package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springdemo")
public class SportConfig {

	//DEFINE BEAN FOR SAD FORTUNE
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
		
	//DEFINE BEAN FOR SWIM COUCH AND NJEXT DEPENDENCY
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
	
}
