package com.github.laserchicken;

import java.util.ArrayList;
import java.util.List;

/**
 * Filter list by a predicate
 * @author mkmiecinski
 *
 * @param <T>
 */
final public class Filter<T> {

	/**
	 * Apply filter to a list. 
	 * @param predicate function, if true include the element
	 * @param list list to filter
	 * @return new filtered list
	 */
	public List<T> apply(UnaryFunctor<T,Boolean> predicate, List<T> list) {
		List<T> result = new ArrayList<T>();
		for(T element : list) {
			if(predicate.eval(element))
				result.add(element);
		}
		return result;
	}
}
