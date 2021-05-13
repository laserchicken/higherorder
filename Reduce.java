package com.github.laserchicken;

import java.util.List;

/**
 * 
 * @author mkmiecinski
 * @param <T>
 */
final public class Reduce <T> {

	/**
	 *  Apply reduce to a list
	 *  <p>
	 *  Example:
	 *  aggregate function - +
	 *  initValue - 0
	 *  apply is equivalent to:
	 *  <br>
	 * 	int result = 0;
	 *  <br>
	 *	for(int element : list) {
	 *		result = element + result;
	 *	}
	 *  <br>
	 * 	return result;
	 * 
	 * @param aggregation aggregate function, two arguments
	 * @param list list of elements to aggregate
	 * @param initValue initial aggregation value
	 * @return
	 */
	public T apply(BinaryFunctor<T,T> aggregation, List<T> list, T initValue) {
		T result = initValue;
		for(T element : list) {
			result = aggregation.eval(element,result);
		}
		return result;
	}
}
