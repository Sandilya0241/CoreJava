package com.learnjava.multithreading;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class MyCallable implements Callable {
	int num;
	MyCallable(int num) {
		this.num = num;
	}
	public Object call() throws Exception {
		int sumValue = 0;
		System.out.println(Thread.currentThread().getName() + " is responsible for calculating sum of first " + num + " numbers");
		for (int i = 0; i <= num; i++) {
			sumValue += i;
		}
		return sumValue;
	}
}
public class MyCallableDemo {
	public static void main(String[] args) throws Exception{
		ExecutorService svc = Executors.newFixedThreadPool(3);
		MyCallable[] cJobs = {
								new MyCallable(10),
								new MyCallable(20),
								new MyCallable(30),
								new MyCallable(40),
								new MyCallable(50),
								new MyCallable(60)
							};
		for (MyCallable job : cJobs) {
			Future f = svc.submit(job);
			System.out.println(f.get());
		}
		svc.shutdown();
	}
}
