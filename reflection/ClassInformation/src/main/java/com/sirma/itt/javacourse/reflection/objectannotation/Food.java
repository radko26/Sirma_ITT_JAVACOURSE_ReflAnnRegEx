package com.sirma.itt.javacourse.reflection.objectannotation;

/**
 * Class which describes some food characteristics.
 * 
 * @author radoslav
 */
public class Food {

	protected Types TYPE;
	protected int quantity;
	protected boolean sweet;
	protected int healthiness;

	/**
	 * Eat something and decrease the value.
	 */
	protected void eatIt() {
		quantity--;
	}

	protected void cutInHalf() {

	}

	protected void boilIt() {

	}

	protected void waitToUnfreeze() {

	}

}
