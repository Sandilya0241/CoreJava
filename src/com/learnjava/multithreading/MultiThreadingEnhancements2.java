package com.learnjava.multithreading;

public class MultiThreadingEnhancements2 {
	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("First Group");
		System.out.println("g group name : " + g.getName());
		System.out.println("g's parent group name : " + g.getParent().getName());
		
		ThreadGroup g1 = new ThreadGroup (g, "Second Group");
		System.out.println("g1 group name : " + g1.getName());
		System.out.println("g1's parent group name : " + g1.getParent().getName());
	}
}