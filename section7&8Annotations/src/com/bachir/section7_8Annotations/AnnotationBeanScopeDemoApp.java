package com.bachir.section7_8Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach alphaCoach = context.getBean("thatSillyCoach", Coach.class);
		
		//check to see if they're the same object
		
		boolean result =(theCoach==alphaCoach);
		
		//print out the results
		System.out.println("\nPointing to the same object: "+result);
		
		System.out.println("\nMemory location for theCoach: "+theCoach);
		System.out.println("\nMemory location for alphaCoach: "+alphaCoach);
		
		//close context
		context.close();
	}

}
