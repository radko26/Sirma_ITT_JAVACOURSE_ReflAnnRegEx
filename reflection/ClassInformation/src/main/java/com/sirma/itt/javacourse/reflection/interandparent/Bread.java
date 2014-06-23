package com.sirma.itt.javacourse.reflection.interandparent;

/**
 * Some actions related with bread.
 * 
 * @author radoslav
 */
public class Bread extends Food implements IFood {
	public void insertFoodIntoTheFridge(Object food) {
		// what to do before inserting it
		cutInHalf();

	}

	public void takeFoodFromTheFridge(Object food) {
		// what to do after taking it
		waitToUnfreeze();
	}
}
