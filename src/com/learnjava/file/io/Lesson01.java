package com.learnjava.file.io;

import java.io.File;
import java.io.IOException;

public class Lesson01 {

	public static void main(String[] args) {
		File f = new File("abc_24_11_2020.txt");
		System.out.println("file exists? " + f.exists());
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("file exists? " + f.exists());
	}
}
