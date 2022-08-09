package com.learnjava.multithreading;
class MyThread9 extends Thread {
	
}
public class ThreadDemo12{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(19);
		Thread.currentThread().setPriority(9);
		MyThread9 t = new MyThread9();
		System.out.println(t.getPriority());
	}
}
