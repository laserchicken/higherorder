package com.github.laserchicken;

import java.util.ArrayList;
import java.util.List;

/**
 * Transforms each element of a list
 * @author mkmiecinski
 *
 * @param <I>
 */
final public class Map<I> {
	
	/**
	 * Apply map to a list.
	 * @param transformation function transforms a type I element to a type O element
	 * @param list list to transform
	 * @return list list of transformation results
	 */
	public <O> List<O> apply(UnaryFunctor<I, O> transformation, List<I> list) {
		List<O> result = new ArrayList<O>();
		for(I element : list) {
			//czy po wykonaniu eval nalezy sprawdzac czy wynik jest null i jesli tak to nie dodawac?
			result.add(transformation.eval(element));
		}
		return result;
	}
	
}
