package com.gurpreet.studentadmissioncontroller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {
	
	String listOfValidHobbies() default "music|football|cricket|hockey";
	
	String message() default "please provide valid hobby;" +
	                " accepted hobbies are - music, football,cricket and hockey (choose anyone)";

	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
}
