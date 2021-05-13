package com.github.laserchicken;

/**
 * Functor (function object), emulates higher-order function,
 * single argument.
 * 
 * @author mkmiecinski
 *
 * @param <I> input argument type
 * @param <O> output argument type
 */
public interface UnaryFunctor<I,O> {
	O eval(I i);
}
