package com.github.laserchicken;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa umożliwia filtrowanie danej listy elementów według zadanego predykatu.
 * @author mkmiecinski
 *
 * @param <T>
 */
final public class Filter<T> {

	/**
	 * Aplikacja filtru na liscie. 
	 * @param predicate funkcja boolowska, jesli dla danego elementu zwraca true
	 * 	to element przechodzi przez filtr
	 * @param list list do filtrowania
	 * @return nowa, odfiltrowana lista
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
