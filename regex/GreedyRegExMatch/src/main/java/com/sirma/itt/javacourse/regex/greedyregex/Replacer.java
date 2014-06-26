package com.sirma.itt.javacourse.regex.greedyregex;

/**
 * Replace the information between {<x> </x>}tags with other info.
 * 
 * @author radoslav
 */
public class Replacer {

	public static String replace(String input) {
		return input.replaceAll("<x>[^<x>|</x>]+?</x>", "<x/>");
	}
}
