package com.sirma.itt.javacourse.regex.evalidate;

/**
 * Static class which compare the given email with the valid pattern
 * 
 * @author radoslav
 */

public class Validator {

	/**
	 * Checks if the given email contains the pattern
	 * 
	 * @param email
	 * @return true for valid and false for invalid
	 */
	public static boolean isValid(String email) {
		return email.matches("^[a-zA-Z][a-zA-Z0-9-.]+@[a-zA-Z][a-zA-Z0-9-.]+$");
	}

}
