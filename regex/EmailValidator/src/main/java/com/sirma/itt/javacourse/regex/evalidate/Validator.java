package com.sirma.itt.javacourse.regex.evalidate;

import java.util.regex.Pattern;

/**
 * Static class which compare the given email with the valid pattern
 * 
 * @author radoslav
 */

public class Validator {

	private static Pattern PATTERN = Pattern
			.compile("^[a-zA-Z][a-zA-Z0-9-.]+@[a-zA-Z][a-zA-Z0-9-.]+$");

	/**
	 * Checks if the given email contains the pattern
	 * 
	 * @param email
	 * @return true for valid and false for invalid
	 */
	public static boolean isValid(String email) {
		return PATTERN.matcher(email).matches();
	}

}
