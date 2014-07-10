package com.github.laserchicken;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa umożliwia poddanie transformacji każdego elementu listy. 
 * @author mkmiecinski
 *
 * @param <I>
 */
final public class Map<I> {
	
	/**
	 * Aplikacja map na liscie.
	 * @param transformation funkcja zamienia element 
	 *  listy typu I na element typu O
	 * @param list lista poddawana transformacji
	 * @return lista wyników transformacji 
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
