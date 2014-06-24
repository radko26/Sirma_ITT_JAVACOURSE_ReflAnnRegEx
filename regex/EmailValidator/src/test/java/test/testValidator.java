package test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;

import com.sirma.itt.javacourse.regex.evalidate.Validator;

public class testValidator {

	private InputStream inputStream;
	private BufferedReader reader;

	@Test
	/**
	 * Reads from a file that contains valid e-mails.
	 */
	public void testIsValidWithValidData() {
		try {
			inputStream = getClass().getResourceAsStream("/testsValid.txt");
			reader = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = reader.readLine()) != null) {
				assertEquals(true, Validator.isValid(line));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
				reader.close();
			} catch (IOException e) {
				System.out.println("Error closing");
				// e.printStackTrace();
			}

		}
	}

	@Test
	/**
	 * Reads from a file that contains invalid e-mails.
	 */
	public void testIsValidWithWrongData() {
		try {
			inputStream = getClass().getResourceAsStream("/testsInvalid.txt");
			reader = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = reader.readLine()) != null) {
				assertEquals(false, Validator.isValid(line));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
				reader.close();
			} catch (IOException e) {
				System.out.println("Error closing");
				// e.printStackTrace();
			}
		}
	}

}