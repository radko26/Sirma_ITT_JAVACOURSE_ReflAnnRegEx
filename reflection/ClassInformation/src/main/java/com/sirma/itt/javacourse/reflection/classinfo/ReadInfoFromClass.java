package com.sirma.itt.javacourse.reflection.classinfo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Class which reads the info of a class.
 * 
 * @author radoslav
 */

public class ReadInfoFromClass {
	private Class input;

	/**
	 * Constructor for passing the value.
	 * 
	 * @param input
	 */
	public ReadInfoFromClass(Class input) {
		this.input = input;
	}

	/**
	 * Get array of methods of the current class.
	 * 
	 * @return the array
	 */
	public Method[] getMethods() {
		Method[] methods = input.getDeclaredMethods();
		return methods;
	}

	/**
	 * Print methods
	 * 
	 * @param methods
	 * 
	 */
	public void printMethods(Method[] methods) {
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
	}

	/**
	 * Get array of Fields of the current class.
	 * 
	 * @return the array
	 */
	public Field[] getFields() {
		Field[] fields = input.getDeclaredFields();
		return fields;
	}

	/**
	 * Print all fields
	 * 
	 * @param fields
	 *            array of fields
	 * @param instance
	 *            instance of the class
	 */
	public void printFields(Field[] fields, Object instance) {
		for (int i = 0; i < fields.length; i++) {
			System.out.print(fields[i] + " : ");
			try {
				fields[i].setAccessible(true);
				System.out.println(fields[i].get(instance));
			} catch (IllegalArgumentException e) {
				System.out.println("IllegalArgumentException");
			} catch (IllegalAccessException e) {
				System.out.println("IllegalAccessException");
			}
		}
	}

}
