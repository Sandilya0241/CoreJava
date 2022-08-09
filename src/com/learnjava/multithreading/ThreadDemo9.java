package com.learnjava.multithreading;

public class ThreadDemo9{
	public static void main(String[] args) {
		MyThread7 mt = new MyThread7();
		Thread t = new Thread(mt);
		t.start();
		System.out.println("Main Thread");
	}
}

class MyThread7 extends Thread {
	public void run() {
		System.out.println("Child Thread");
	}
}

/*
 * Expected Outputs:
 * Expected Output 1:
 * 	Main Thread
 *  Child Thread
 *  
 *  Expected Output 2:
 * 	Child Thread
 *  Main Thread
 *  
 * O/P:
 * 	Main Thread
	Child Thread
 * 
 * 
 */