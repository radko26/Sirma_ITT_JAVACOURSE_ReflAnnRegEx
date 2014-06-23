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

	public int getFoodCount() {
		return foodCount;
	}
	
	private int getTYPE(){
		return TYPE;
	}

	public void setFoodQuantity(int quantity) {
		this.quantity = quantity;
	}
}
