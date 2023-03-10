package com.Bachir.springConfigWithJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {
		
		//Read Spring Config Java File
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve spring bean
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

		
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
	
		//close the context
		context.close();
	
	}
}
