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

	private Class getSuperclass() {
		return input.getSuperclass();
	}

	public void printInfo() {
		System.out.println(getSuperclass());
		for (int i = 0; i < interfaces.length; i++) {
			System.out.println(interfaces[i]);
		}
	}
}
