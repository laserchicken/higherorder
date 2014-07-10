package com.github.laserchicken;

/**
 * Functor (function object), emuluje funkcje wyższego rzędu (higher-order function),
 * dwa argumenty.
 * 
 * @author mkmiecinski
 *
 * 
 * @param <I> typ argumentow wejsciowych
 * @param <O> typ argumentu wyjściowego
 */
public interface BinaryFunctor<I,O> {
	O eval(I i1, I i2);
}
