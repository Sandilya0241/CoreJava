package com.learnjava.multithreading;
class MultiThreadingEnhancements5 {
	public static void main(String[] args) {
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent() ;
		Thread[] list = new Thread[system.activeCount()];
		system.enumerate(list);
		for (Thread thrd : list) {
			System.out.println(thrd.getName() + " ------------ " + thrd.isDaemon());
		}
	}
}

