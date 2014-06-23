package com.sirma.itt.javacourse.reflection.objectannotation;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Adds some food in an arrayList and then sort it by its priority given by an
 * annotation.
 * 
 * @author radoslav
 */

public class Main {

	public static void main(String[] args) {

		ArrayList<Food> fridge = new ArrayList<Food>();
		fridge.add(new Cheese());
		fridge.add(new Fish());
		fridge.add(new Chicken());

		fridge.sort(new Comparator<Food>() {
			public int compare(Food o1, Food o2) {
				FoodPriority priorityo1 = o1.getClass().getAnnotation(
						FoodPriority.class);

				int priorityo1Val = priorityo1.priority();
				FoodPriority priorityo2 = o2.getClass().getAnnotation(
						FoodPriority.class);
				int priorityo2Val = priorityo2.priority();

				return Integer.valueOf(priorityo1Val).compareTo(priorityo2Val);
			}
		});
		for (int i = 0; i < fridge.size(); i++) {
			System.out.println(fridge.get(i).getClass().getSimpleName());
		}
	}

}
