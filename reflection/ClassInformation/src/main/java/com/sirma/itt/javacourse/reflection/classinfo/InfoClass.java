package com.sirma.itt.javacourse.reflection.classinfo;

/**
 * A class with random names, modifiers and values.
 * 
 * @author radoslav
 */

public class InfoClass {

	private int foodCount;
	public boolean hungry;
	private int TYPE;
	public int quantity;
	protected int refrigerator;

	public InfoClass() {
		TYPE = 0;
	}

	/**
	 * Getter for foodCount.
	 * 
	 * @return foodCount variable.
	 */
	public int getFoodCount() {
		return foodCount;
	}

	/**
	 * Getter for TYPE
	 * 
	 * @return type of the food.
	 */
	private int getTYPE() {
		return TYPE;
	}

	/**
	 * Setter for quantity
	 * 
	 * @param quantity
	 *            the quantity of the food.
	 */
	public void setFoodQuantity(int quantity) {
		this.quantity = quantity;
	}
}
