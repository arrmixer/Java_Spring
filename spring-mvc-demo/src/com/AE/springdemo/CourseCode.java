package com.AE.springdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//created from add interface feature

@Constraint(validatedBy = CourseCodeConstraintValidator.class) //business logic validator by this class
@Target({ElementType.METHOD, ElementType.FIELD}) // where to apply
@Retention(RetentionPolicy.RUNTIME) // how long you want to keep it
public @interface CourseCode {

	//define default course code
	public String value() default "LUV";
	
	//define default error message
	public String message() default "must start with LUV";
	
	// define default groups
	public Class<?>[] groups() default {};
	
	// define default payloads
	public Class<? extends Payload>[] payload() default {};
	
}
