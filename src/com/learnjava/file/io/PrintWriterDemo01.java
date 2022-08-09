package com.learnjava.file.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo01 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("def.log");
			PrintWriter pw = new PrintWriter(fw);
			
			pw.write(100);
			pw.println(100);
			pw.println(true);
			pw.println('d');
			pw.println("Sandilya");
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
