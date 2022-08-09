package com.learnjava.multithreading;

public class ThreadDemo5 extends Thread{
	public static void main(String[] args) {
		MyThread4 t = new MyThread4();
		t.start();
		System.out.println("Main method");
	}
}

class MyThread4 extends Thread {
	public void start() {
		System.out.println("Start method");
	}
	public void run() {
		System.out.println("Run method");
	}
}

/*
 * Output:
	Start method
	Main method
 */