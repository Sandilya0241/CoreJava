package com.learnjava.multithreading;

public class ThreadDemo3 extends Thread{
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();
		System.out.println("Main Thread ends");
	}
}

class MyThread2 extends Thread {
	public void run() {
		System.out.println("No arg run method");
	}
	public void run(int i) {
		System.out.println("Int arg run method");
	}
}

/*
 * Output:
 * 
 * 	Main Thread ends
	No arg run method

 */