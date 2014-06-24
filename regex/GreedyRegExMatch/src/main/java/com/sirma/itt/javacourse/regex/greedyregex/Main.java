package com.sirma.itt.javacourse.regex.greedyregex;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Main class to run it and enter string from console.
 * 
 * @author radoslav
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		String line;

		while (true) {
			try {
				line = input.nextLine();
				builder.append(line);
			} catch (NoSuchElementException e) {
				break;
			}
		}
		input.close();

		String ans = Replacer.replace(builder.toString());
		System.out.println(ans);
	}

}
