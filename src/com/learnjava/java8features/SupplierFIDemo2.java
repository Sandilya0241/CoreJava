package com.learnjava.java8features;

import java.util.function.Supplier;
import java.util.Date;
import java.util.Random;

public class SupplierFIDemo2 {
	public static void main(String[] args) {
		Random r = new Random();
		Supplier<String> sOTP = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp += (int)(Math.random() * 10);
			}
			return otp;
		};
		for (int i = 0; i < 10; i++) {
			System.out.println(sOTP.get());
		}
	}
}
