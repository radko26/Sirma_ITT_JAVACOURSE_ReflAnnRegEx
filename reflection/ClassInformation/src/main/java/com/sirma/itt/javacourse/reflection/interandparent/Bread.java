package com.sirma.itt.javacourse.reflection.interandparent;

/**
 * Some actions related with bread.
 * 
 * @author radoslav
 */
public class Bread extends Food implements IFood {
	/**
	 * What to do before inserting. {@inheritDoc}
	 */
	public void insertFoodIntoTheFridge(Object food) {
		cutInHalf();
	}

	/**
	 * What to do after taking. {@inheritDoc}
	 */
	public void takeFoodFromTheFridge(Object food) {
		waitToUnfreeze();
	}
}
