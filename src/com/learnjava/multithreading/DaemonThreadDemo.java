package com.learnjava.multithreading;
public class DaemonThreadDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
//		Thread.currentThread().setDaemon(true);	//java.lang.IllegalThreadStateException
		Thread t1 = new Thread();
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
	}
}

/*
false
false
true
*/