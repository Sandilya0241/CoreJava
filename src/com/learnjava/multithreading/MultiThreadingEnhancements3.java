package com.learnjava.multithreading;
class MultiThreadingEnhancements3 {
	public static void main(String[] args) {
		ThreadGroup g1 = new ThreadGroup("TG");
		Thread t1 = new Thread(g1, "First Thread");
		Thread t2 = new Thread(g1, "Second Thread");
		g1.setMaxPriority(3);
		Thread t3 = new Thread(g1, "Third Thread");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}
}