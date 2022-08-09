package com.learnjava.multithreading;

public class ThreadDemo4 extends Thread{
	public static void main(String[] args) {
		MyThread3 t = new MyThread3();
		t.start();
	}
}

class MyThread3 extends Thread {
	
}

/*
 * No Output:

 */