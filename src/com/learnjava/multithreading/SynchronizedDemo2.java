package com.learnjava.multithreading;
class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good morning : ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
			}
			System.out.println(name);
		}
	}
}
class MyThread19 extends Thread {
	Display d;
	String name;
	MyThread19(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
public class SynchronizedDemo2 {
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread19 t1 = new MyThread19(d1, "Dhoni");
		MyThread19 t2 = new MyThread19(d2, "YuvRaj");
		t1.start();
		t2.start();
	}
}
