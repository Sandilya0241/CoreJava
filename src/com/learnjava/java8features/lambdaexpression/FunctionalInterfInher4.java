package com.learnjava.java8features.lambdaexpression;

@FunctionalInterface
interface FunctionalInterfInher4 {
	public void m1();
}

interface FunctionalInterfInher4Child extends  FunctionalInterfInher4 {
	public void m2();
}