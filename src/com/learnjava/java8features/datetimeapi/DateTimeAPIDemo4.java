package com.learnjava.java8features.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateTimeAPIDemo4 {

	public static void main(String[] args) {
		System.out.println("Enter year : ");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		Year yr= Year.of(y);
		if(yr.isLeap()) {
			System.out.println("Yes, it's leap year");
		} else {
			System.out.println("No, it's not a leap year");

		}
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zDT = ZonedDateTime.now(la);
		System.out.println(zDT);
	}
}
