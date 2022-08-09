package com.learnjava.multithreading;
public class ThreadLocalDemo2 {
	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal() {
			public Object initialValue() {
				return "Sandy (Default)";
			}
		};
		System.out.println(tl.get());
		tl.set("Sandy");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}
}
