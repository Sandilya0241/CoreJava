package com.learnjava.java8features.lambdaexpression;

@FunctionalInterface
interface FunctionalInterfInher2 {
	public void m1();
}
@FunctionalInterface
interface FunctionalInterfInher2Child extends  FunctionalInterfInher2 {
	public void m1();
}