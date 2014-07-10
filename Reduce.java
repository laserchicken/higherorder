package com.github.laserchicken;

import java.util.List;

/**
 * 
 * @author mkmiecinski
 * @param <T>
 */
final public class Reduce <T> {

	/**
	 * 	Aplikacja reduce na liscie.
	 *  <p>
	 *  Przyklad dla:
	 *  funkcja aggregujaca - +
	 *  initValue - 0
	 *  apply będzie rownowazne nastepującej konstrukcji:
	 *  <br>
	 * 	int result = 0;
	 *  <br>
	 *	for(int element : list) {
	 *		result = element + result;
	 *	}
	 *  <br>
	 * 	return result;
	 * 
	 * @param aggregation funkcja agregujaca, dwuargumentowa
	 * @param list lista agregowanych elementow
	 * @param initValue wartosc inicjalizujaca agregacje
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
