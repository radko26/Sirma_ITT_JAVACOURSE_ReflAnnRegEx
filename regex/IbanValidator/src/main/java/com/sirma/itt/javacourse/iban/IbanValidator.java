package com.sirma.itt.javacourse.iban;

import java.util.ArrayList;

/**
 * Replace part of a string which satisfies the pattern.
 * 
 * Da pitam za //d
 * 
 * @author radoslav
 */

public class IbanValidator {
	/**
	 * Replace the found pattern with ****.
	 * 
	 * @param input
	 * @return the string
	 */
	private static String makeValid(String input) {
		return input
				.replaceAll("BG[0-9]{2} BNBG \\d{4} \\d{4} \\d{4} ", "****");
	}

	public static ArrayList<String> getValid(ArrayList<String> text) {
		for (int i = 0; i < text.size(); i++) {
			// System.out.println(i);
			String tempHolder = makeValid(text.get(i));
			text.remove(i);
			text.add(i, tempHolder);
		}
		return text;
	}
}
