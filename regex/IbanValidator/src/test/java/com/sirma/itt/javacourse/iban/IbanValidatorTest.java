package com.sirma.itt.javacourse.iban;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test class for testing the regEx pattern.
 * 
 * @author radoslav
 */
public class IbanValidatorTest {

	private InputStream input;
	private InputStream output;
	private BufferedReader readerInput;
	private BufferedReader readerOutput;

	/**
	 * Initializes variables
	 */
	@Before
	public void init() {
		try {
			input = this.getClass().getResourceAsStream("/tests.in");
			output = this.getClass().getResourceAsStream("/tests.out");
			readerInput = new BufferedReader(new InputStreamReader(input));
			readerOutput = new BufferedReader(new InputStreamReader(output));
		} catch (Exception e) {
			System.out.println("Error loading test files");
			System.exit(1);
		}

	}

	/**
	 * Loads some tests from test file and compare the result.
	 */
	@Test
	public void testGetValid() {
		String inputLine = "";
		String outputLine = "";
		while (true) {
			try {
				inputLine = readerInput.readLine();
				outputLine = readerOutput.readLine();
			} catch (IOException e) {
				System.out.println("Error reading input file");
			}
			if (inputLine == null) {
				break;
			}
			assertEquals(outputLine, IbanValidator.makeValid(inputLine));
		}
	}
}
