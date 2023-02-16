package com.bachir.section7_8Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve spring bean
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach thisCoach = context.getBean("footballCoach", Coach.class);
		
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(thisCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(thisCoach.getDailyFortune());
		
	
		//close the context
		context.close();
	}

}