package com.learnjava.multithreading;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.*;
class PrintJob implements Runnable {
	String name;
	PrintJob(String name) {
		this.name = name;
	}
	public void run() {
		System.out.println(name + "'s job started by thread " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
		}
		System.out.println(name + "'s job completed by thread " + Thread.currentThread().getName());
	}
}
public class ThreadPoolDemo {
	public static void main(String[] args) {
		
		ExecutorService svc = Executors.newFixedThreadPool(3);
		PrintJob[] pJobs = {new PrintJob("A"),
							new PrintJob("B"),
							new PrintJob("C"),
							new PrintJob("D"),
							new PrintJob("E"),
							new PrintJob("F")};
		
		for (PrintJob job : pJobs) {
			svc.submit(job);
		}
		
		svc.shutdown();
	}
}
