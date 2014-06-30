package com.sirma.itt.javacourse.reflection.interandparent;

/**
 * Main to run it.
 * 
 * @author radoslav
 */
public class Main {

	public static void main(String[] args) {
		Bread bread = new Bread();

		InfoReader reader = new InfoReader(bread.getClass());
		reader.printInfo();
	}
}
