package com.sirma.itt.javacourse.regex.greedyregex;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Before;
import org.junit.Test;

import com.sirma.itt.javacourse.regex.greedyregex.Replacer;

/**
 * JUnit test class for testing the regEx pattern.
 * 
 * @author radoslav
 */
public class ReplacerTest {

	private InputStream input;
	private InputStream output;
	private BufferedReader readerInput;
	private BufferedReader readerOutput;

	/**
	 * Initializes variables.
	 */
	@Before
	public void init() {
		try {
			input = this.getClass().getResourceAsStream("/tests.in");
			output = this.getClass().getResourceAsStream("/tests.out");
		} catch (Exception e) {
			System.out.println("Error loading test files");
		}
		readerInput = new BufferedReader(new InputStreamReader(input));
		readerOutput = new BufferedReader(new InputStreamReader(output));
	}

	/**
	 * Loads some tests from test file and compare the result.
	 */
	@Test
	public void testReplace() {
		String inputLine = "";
		String outputLine = "";
		while (true) {
			try {
				inputLine = readerInput.readLine();
				outputLine = readerOutput.readLine();
			} catch (IOException e) {
				System.out.println("Error reading input file");
			}
			if (inputLine == null)
				break;
			assertEquals(outputLine, Replacer.replace(outputLine));
		}
	}

}
