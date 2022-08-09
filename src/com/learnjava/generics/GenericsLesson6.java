package com.learnjava.generics;
public class GenericsLesson6 {	
	public static void main(String[] args) {
	}
	
	/*
	 * Valid
	 */
	public <T>void m1() {
	}
	
	/*
	 * Valid
	 */
	public <T extends Number>void m2() {
	}
	
	/*
	 * Valid
	 */
	public <T extends Runnable>void m3() {
	}
	
	/*
	 * Valid
	 */
	public <T extends Number & Runnable>void m4() {
	}
	
	/*
	 * Valid
	 */
	public <T extends Comparable & Runnable>void m5() {
	}
	
	/*
	 * Valid
	 */
	public <T extends Number & Comparable & Runnable>void m6() {
	}
	
	/*CE: GenericsLesson6.java:17: error: interface expected here
        public <T extends Runnable & Number>void m7() {
    */
	public <T extends Runnable & Number>void m7() {
	}
	
	/*
	 * CE: GenericsLesson6.java:19: error: interface expected here
        public <T extends Thread & Number>void m8() {
	 */
	public <T extends Thread & Number>void m8() {
	}
}

