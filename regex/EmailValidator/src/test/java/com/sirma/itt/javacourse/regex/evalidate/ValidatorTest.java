package com.sirma.itt.javacourse.regex.evalidate;

import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;

public class ValidatorTest {

	private InputStream inputStream;
	private BufferedReader reader;

	/**
	 * Reads from a file that contains valid e-mails.
	 */
	@Test
	public void testIsValidWithValidData() {
		try {
			inputStream = this.getClass()
					.getResourceAsStream("/testsValid.txt");
			reader = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = reader.readLine()) != null) {
				assertEquals(true, Validator.isValid(line));
			}
		} catch (Exception e) {
			System.out.println("File not found!");
			System.exit(1);
		} finally {
			try {
				inputStream.close();
				reader.close();
			} catch (IOException e) {
				System.out.println("Error closing");
				System.exit(1);
			}
		}
	}

	/**
	 * Reads from a file that contains invalid e-mails.
	 */
	@Test
	public void testIsValidWithWrongData() {
		try {
			inputStream = getClass().getResourceAsStream("/testsInvalid.txt");
			reader = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = reader.readLine()) != null) {
				assertEquals(false, Validator.isValid(line));
			}
		} catch (Exception e) {
			System.out.println("File not found!");
			System.exit(1);
		} finally {
			try {
				inputStream.close();
				reader.close();
			} catch (IOException e) {
				System.out.println("Error closing");
				System.exit(1);
			}
		}
	}

}