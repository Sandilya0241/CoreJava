package com.learnjava.exceptionlessons;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class ExceptionClass101 {
	public static void main(String[] args) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");
		System.out.println(10/0);
	}
}

/*CE:
 * unreported exception FileNotFoundException; must be caught or declared to be thrown
 * PrintWriter pw = new PrintWriter("abc.txt");
 * */