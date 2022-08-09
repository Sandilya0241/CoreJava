package com.learnjava.multithreading;
class Display4 {
	public void wish(String name) {
		;;;;;;;	// 1 lakh lines of code
		synchronized(this) {
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
class MyThread22 extends Thread {
	Display4 d;
	String name;
	MyThread22(Display4 d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
public class SynchronizedDemo4 {
	public static void main(String[] args) {
		Display4 d = new Display4();
		MyThread22 t1 = new MyThread22(d, "Dhoni");
		MyThread22 t2 = new MyThread22(d, "YuvRaj");
		t1.start();
		t2.start();
	}
}
