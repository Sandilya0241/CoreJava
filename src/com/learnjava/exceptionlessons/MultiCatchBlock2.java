package com.learnjava.exceptionlessons;
public class MultiCatchBlock2 {
	public static void main(String[] args){
		try {
			
		} catch (ArithmeticException|Exception e) {
			System.out.println(e);
		}
	}
}