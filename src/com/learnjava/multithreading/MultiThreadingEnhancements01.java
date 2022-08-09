package com.learnjava.multithreading;

public class MultiThreadingEnhancements01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
	}
}


/*Output:
main
system
*/