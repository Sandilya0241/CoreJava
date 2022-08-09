package com.learnjava.java8features.lambdaexpression;

@FunctionalInterface
interface FunctionalInterfInher3 {
	public void m1();
}
@FunctionalInterface
interface FunctionalInterfInher3Child extends  FunctionalInterfInher3 {
	public void m2();
}