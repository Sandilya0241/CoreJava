package com.learnjava.collections;

import java.util.HashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		HashMap m = new HashMap();
		Test1 t = new Test1();
		m.put(t, "Sandy");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}

class Test1 {
	public String toString() {
		return "Test1";
	}
	public void finalize() {
		System.out.println("Test finalize method got called");
	}
}