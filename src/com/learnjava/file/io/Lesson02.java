package com.learnjava.file.io;

import java.io.File;

public class Lesson02 {

	public static void printFiles() {
		File f = new File(".");
		int count = 0;
		String[] files = f.list();
		
		for (String file : files) {
			File tmpFile = new File(f, file);
			if(tmpFile.isFile()) {
				count++;
				System.out.println(file);
			}
		}
		
		System.out.println("File(s) count : " + count);
	}
	
	public static void printDirectories() {
		File f = new File(".");
		int count = 0;
		String[] files = f.list();
		
		for (String file : files) {
			File tmpFile = new File(f, file);
			if(tmpFile.isDirectory()) {
				count++;
				System.out.println(file);
			}
		}
		
		System.out.println("File(s) count : " + count);
	}
	
	public static void printAll() {
		File f = new File(".");
		System.out.println(f.getAbsolutePath());
		
		System.out.println("--------------------------------Printing all files in above folder -----------------------");
		
		String[] files = f.list();
		
		for (String file : files) {
			System.out.println(file);
		}
		
		System.out.println("File(s) count : " + files.length);
	}
	
	public static void main(String[] args) {
		printDirectories();
	}
}
