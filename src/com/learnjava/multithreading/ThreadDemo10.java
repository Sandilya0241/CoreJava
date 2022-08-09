package com.learnjava.multithreading;

public class ThreadDemo10{
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		Thread t = new Thread();
		System.out.println(t.getName());
		Thread.currentThread().setName("Sandy Thread");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}
}
