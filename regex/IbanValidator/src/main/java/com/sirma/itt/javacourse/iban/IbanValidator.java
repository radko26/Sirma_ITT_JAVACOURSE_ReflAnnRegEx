package com.sirma.itt.javacourse.iban;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Replace part of a string which satisfies the pattern.
 * 
 * @author radoslav
 */

public class IbanValidator {

	private static Pattern PATTERN = Pattern
			.compile("BG[0-9]{2} BNBG \\d{4} \\d{4} \\d{4} ");

	/**
	 * Replace the found pattern with ****.
	 * 
	 * @param input
	 *            the input string
	 * @return the changed string
	 */
	public static String makeValid(String input) {
		return PATTERN.matcher(input).replaceAll("****");
	}
}
