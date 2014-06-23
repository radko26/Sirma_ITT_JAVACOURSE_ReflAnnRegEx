package com.sirma.itt.javacourse.reflection.objectannotation;

/**
 * 
 * @author radoslav
 */
@FoodPriority(priority = 1)
public class Cheese extends Food {

	public Cheese() {
		TYPE = Types.MILKY;
	}
}
