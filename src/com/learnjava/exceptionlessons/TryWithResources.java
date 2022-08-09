package com.learnjava.exceptionlessons;
import java.io.*;
public class TryWithResources {
	public static void main(String[] args) throws IOException{
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
			br = new BufferedReader(new FileReader("output.txt"));
		}
	}
}