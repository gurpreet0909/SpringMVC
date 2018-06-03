package com.gurpreet.studentadmissioncontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {

	private String listofValidHobbies;
	@Override
	public void initialize(IsValidHobby isValidHobby) {

		this.listofValidHobbies = isValidHobby.listOfValidHobbies();
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext arg1) {

		if (studentHobby == null) {
			return false;
		}

		if (studentHobby.matches(listofValidHobbies)) {
			return true;
		}

		return false;
	}

}
