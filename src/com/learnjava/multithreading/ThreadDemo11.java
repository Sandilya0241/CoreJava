package com.learnjava.multithreading;
class MyThread8 extends Thread {
	public void run() {
		System.out.println("run method() executed by : " + Thread.currentThread().getName());
	}
}
public class ThreadDemo11{
	public static void main(String[] args) {
		MyThread8 t = new MyThread8();
		t.start();
		System.out.println("Active Thread count : " + Thread.activeCount());
		System.out.println("main() method executed by : " + Thread.currentThread().getName());
	}
}
