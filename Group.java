package com.github.laserchicken;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <PRE>
 * Prerequisite: input list is sorted, so the similar elements (similarityPredicate) are adjacent
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
		//special case, we need to add the last group
		result.add(group);
		return result;		
	}
}
