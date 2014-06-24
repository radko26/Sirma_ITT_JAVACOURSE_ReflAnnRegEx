package com.sirma.itt.javacourse.iban;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main to run it. Reads information from the standart input.
 * 
 * @author radoslav
 */

public class Main {

	public static void main(String[] args) {
		ArrayList<String> inputString = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String line = null;
		int i = 0;
		do {
			line = input.nextLine();
			inputString.add(line);
		} while (!(inputString.get(i++).matches("^</bankAccounts>$")));
		input.close();
		inputString = IbanValidator.getValid(inputString);

		for (i = 0; i < inputString.size(); i++) {
			System.out.println(inputString.get(i));
		}

	}

}
