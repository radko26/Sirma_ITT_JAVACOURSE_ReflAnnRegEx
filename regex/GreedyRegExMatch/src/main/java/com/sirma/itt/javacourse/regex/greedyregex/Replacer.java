package com.sirma.itt.javacourse.regex.greedyregex;

import java.util.regex.Pattern;

/**
 * Replace the information between {<x> </x>}tags with other info.
 * 
 * @author radoslav
 */
public class Replacer {

	private static Pattern PATTERN = Pattern.compile("<x>[^<x>|</x>]+?</x>");
	
	public static String replace(String input) {
		return PATTERN.matcher(input).replaceAll("<x/>");
	}
}
