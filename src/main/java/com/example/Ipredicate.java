package com.example;

@FunctionalInterface
public interface Ipredicate<T> {
    
	boolean test(T t);
}
