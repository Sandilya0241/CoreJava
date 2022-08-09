package com.learnjava.multithreading;

public class SampleThreadingDemo1 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Main Thread started");
		Thread t = new Thread(new Runnable() {
			public void run() {
				
				System.out.println("My Child Thread : " + Thread.activeCount() + " - " + Thread.currentThread().getName());
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ie) {
				}
			}
		}, "Sharuk Thread");
		t.start();
		
		Thread.sleep(4000);
		System.out.println("Main thread ended : " + Thread.activeCount());
	}
}
