package com.AE.springdemo;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;


//using create annotation feature
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
public @interface CourseCode2 {
	
	//define default course code
	public String value() default "LUV";
	
	
	//define default error message
	public String message() default "must start with LUV";

}
