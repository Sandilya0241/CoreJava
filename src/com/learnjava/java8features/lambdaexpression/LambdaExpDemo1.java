package com.learnjava.java8features.lambdaexpression;

@FunctionalInterface
interface LambdaExprInterface {
	public void m1();
}


class Test implements LambdaExprInterface {
	@Override
	public void m1() {
		System.out.println("Hello Lambda Expression ... ");
	}
}

public class LambdaExpDemo1 {

	public static void main(String[] args) {
		LambdaExprInterface lei = new Test();
		lei.m1();
		
		LambdaExprInterface lei2 = () ->System.out.println("Hello Lambda Expression ... by using Lambda expression"); 
		lei2.m1();
	}
}
