package com.learnjava.multithreading;
class Display5 {
	public void wish(String name) {
		;;;;;;;	// 1 lakh lines of code
		synchronized(Display5.class) {
			for (int i = 1; i <= 10; i++) {
				System.out.print("Good morning : ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException ie) {
				}
				System.out.println(name);
			}
		}
		;;;;;;;	// 1 lakh lines of code
	}
}
class MyThread23 extends Thread {
	Display5 d;
	String name;
	MyThread23(Display5 d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
public class SynchronizedDemo5 {
	public static void main(String[] args) {
		Display5 d1 = new Display5();
		Display5 d2 = new Display5();
		MyThread23 t1 = new MyThread23(d1, "Dhoni");
		MyThread23 t2 = new MyThread23(d2, "YuvRaj");
		t1.start();
		t2.start();
	}
}
