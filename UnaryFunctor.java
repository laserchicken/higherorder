package com.github.laserchicken;

/**
 * Functor (function object), emuluje funkcje wyższego rzędu (higher-order function),
 * jeden argument.
 * 
 * @author mkmiecinski
 *
 * @param <I> typ argumentu wejsciowego
 * @param <O> typ argumentu wyjściowego
 */
public interface UnaryFunctor<I,O> {
	O eval(I i);
}
