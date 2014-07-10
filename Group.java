package com.github.laserchicken;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <PRE>
 * Warunek wstepny: lista wejsciowa jest posortowana, tak że elementy podobne (similarityPredicate) sa obok siebie (adjacent)
 * @author mkmiecinski
 *
 * @param <T>
 */
final public class Group<T> {
	
	public List<List<T>> apply(BinaryFunctor<T,Boolean> similarityPredicate, List<T> list) {
		List<List<T>> result = new ArrayList<List<T>>();
		List<T> group = new ArrayList<T>();
		Iterator<T> iter = list.iterator();
		T element1 = iter.next();
		group.add(element1);

		while(iter.hasNext()) {
			T element2 = iter.next();
			if( ! similarityPredicate.eval(element1, element2) ) {
				result.add(group);
				group = new ArrayList<T>();
			}
			group.add(element2);
			element1 = element2;			
		}
		//przypadek specjalny, nalezy dodac ostatina grupe
		result.add(group);
		return result;		
	}
}
