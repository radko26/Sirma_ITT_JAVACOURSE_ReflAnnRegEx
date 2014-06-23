package com.sirma.itt.javacourse.reflection.objectannotation;

/**
 * 
 * @author radoslav
 */
@FoodPriority(priority = 3)
public class Chicken extends Food {

	public Chicken() {
		TYPE = Types.MEAT;
	}

}
