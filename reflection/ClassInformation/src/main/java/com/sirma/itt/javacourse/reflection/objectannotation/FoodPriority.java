package com.sirma.itt.javacourse.reflection.objectannotation;

import java.lang.annotation.*;

/**
 * Declares an annotation for priority
 * 
 * @author radoslav
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FoodPriority {
	public int priority();
}
