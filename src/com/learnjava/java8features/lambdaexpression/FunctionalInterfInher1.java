package com.learnjava.java8features.lambdaexpression;

@FunctionalInterface
interface FunctionalInterfInher1 {
	public void m1();
}
@FunctionalInterface
interface FunctionalInterfInher1Child extends  FunctionalInterfInher1 {
}