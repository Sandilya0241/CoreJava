package com.learnjava.multithreading;
class MyThreadEnhancements4 extends Thread {
	MyThreadEnhancements4(ThreadGroup tg, String name) {
		super(tg, name);
	}
	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie) {
		}
	}
}
class MultiThreadingEnhancements4 {
	public static void main(String[] args) throws InterruptedException{
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		MyThreadEnhancements4 t1 = new MyThreadEnhancements4(pg, "First Thread");
		MyThreadEnhancements4 t2 = new MyThreadEnhancements4(pg, "Second Thread");
		t1.start();
		t2.start();
		pg.list();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		Thread.sleep(10000);
		pg.list();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		
	}
}