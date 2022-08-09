package com.learnjava.java8features;

import java.util.function.Supplier;
import java.util.Date;

public class SupplierFIDemo1 {
	public static void main(String[] args) {
		Supplier<Date> suplr = () -> new Date();
		System.out.println(suplr.get());
	}
}
