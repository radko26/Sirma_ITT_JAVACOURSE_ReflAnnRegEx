package com.sirma.itt.javacourse.reflection.classinfo;

/**
 * Main class to run it.
 * 
 * @author radoslav
 */
public class Main {
	public static void main(String[] args) {

		InfoClass info = new InfoClass();
		info.setFoodQuantity(100);

		ReadInfoFromClass reader = new ReadInfoFromClass(info.getClass());

		reader.printMethods(reader.getMethods());
		System.out.println("");
		reader.printFields(reader.getFields(), info);

	}

}
