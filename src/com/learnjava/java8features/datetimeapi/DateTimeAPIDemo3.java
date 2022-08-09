package com.learnjava.java8features.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class DateTimeAPIDemo3 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yyyy = dt.getYear();
		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int n = dt.getNano();
		
		System.out.printf("%d-%d-%dT%d:%d:%d:%d", dd, mm, yyyy, h, m, s, n);

		LocalDateTime myDOS = LocalDateTime.of(1995, Month.MAY, 28, 12, 45);
		System.out.println(myDOS);
		System.out.println("After 6 months : " + myDOS.plusMonths(6));
		System.out.println("Before 6 months : " + myDOS.minusMonths(6));
		
		
		LocalDate date = LocalDate.of(1995, Month.MAY, 28);
		Period p = Period.between(date, LocalDate.now());
		System.out.printf("Period is %d Years %d Months and %d Days", p.getYears(), p.getMonths(), p.getDays());
	}

}
