package com.github.laserchicken;

/**
 * Functor (function object), emulates higher-order function,
 * two arguments.
 * 
 * @author mkmiecinski
 *
 * 
 * @param <I> input arguments type
 * @param <O> output argument type
 */
public interface BinaryFunctor<I,O> {
	O eval(I i1, I i2);
}
