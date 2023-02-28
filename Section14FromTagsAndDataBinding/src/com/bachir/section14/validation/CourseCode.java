package com.bachir.section14.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//define default course code
	public String value() default "LUV";
	
	//define default message
	public String message() default "must start with LUV";
	
	//define default groups
	public Class<?>[] groups() default {};
 	
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
}
