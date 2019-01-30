package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//READ SPRING CONFIG FILE
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//GET THE BEAN FROM THE SPRING CONTATINER
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
				
		//CALL METHOD
		System.out.println(theCoach.getDailyWorkout());
		
		//CLOSE CONTEXT
		context.close();
	}

}
