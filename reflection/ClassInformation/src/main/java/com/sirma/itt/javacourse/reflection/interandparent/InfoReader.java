package com.sirma.itt.javacourse.reflection.interandparent;

/**
 * Reads information about a given class.
 * 
 * @author radoslav
 */
public class InfoReader {

	private Class input;
	private Class[] interfaces;

	public InfoReader(Class input) {
		this.input = input;
		interfaces = input.getInterfaces();
	}

	/**
	 * Getter for the super class
	 * 
	 * @return the super class
	 */
	private Class getSuperclass() {
		return input.getSuperclass();
	}

	/**
	 * Prints the info
	 */
	public void printInfo() {
		System.out.println(getSuperclass());
		for (int i = 0; i < interfaces.length; i++) {
			System.out.println(interfaces[i]);
		}
	}
}
