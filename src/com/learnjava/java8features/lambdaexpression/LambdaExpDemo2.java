package com.learnjava.java8features.lambdaexpression;

@FunctionalInterface
interface LambdaExprInterface1 {
	public void add(int a, int b);
}


class LambdaExprInterface1Impl implements LambdaExprInterface1 {
	@Override
	public void add(int a, int b) {
		System.out.println("The sum is : " + (a + b));
	}
}

public class LambdaExpDemo2 {

	public static void main(String[] args) {
		LambdaExprInterface1 lei = new LambdaExprInterface1Impl();
		System.out.println("-------------Normal way-------------");
		lei.add(10, 20);
		
		System.out.println("-------------By using Lambda expression-------------");
		LambdaExprInterface1 lei2 = (a, b ) -> System.out.println("The sum is : " + (a + b)); 
		lei2.add(10, 20);
		lei2.add(100, 200);
		lei2.add(1000, 2000);
	}
}
