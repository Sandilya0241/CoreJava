package com.learnjava.multithreading;

public class ThreadDemo6 extends Thread{
	public static void main(String[] args) {
		MyThread5 t = new MyThread5();
		t.start();
		System.out.println("Main method");
	}
}

class MyThread5 extends Thread {
	public void start() {
		super.start();
		System.out.println("Start method");
	}
	public void run() {
		System.out.println("Run method");
	}
}

/*
 *	Possible outputs 
 * ===========================================
 *
 *	Possibility 1:
 *-----------------------------------
 *	Run method
 *  Start method
 *  Main Method
 *
 *
 *	Possibility 2:
 *-----------------------------------
 *	Start method
 *	Main Method
 *	Run method
 *
 *	Possibility 3:
 *-----------------------------------
 * 	Start method
 * 	Run method
 * 	Main Method
 * 
 * Output:
	Start method
	Main method
	Run method
 */