package com.learnjava.java8features.lambdaexpression;

public class FuntionalInterfaceDemo1 {

	public static void main(String[] args) {
		Runnable r = () -> {
			for (int loop = 0; loop < 10; loop++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int loop = 0; loop < 10; loop++) {
			System.out.println("Main Thread");
		}
	}

}
