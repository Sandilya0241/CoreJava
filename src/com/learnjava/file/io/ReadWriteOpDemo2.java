package com.learnjava.file.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteOpDemo2 {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("File4.txt");
			BufferedReader br1 = new BufferedReader(new FileReader("File1.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("File2.txt"));
			
			while(true) {
				String line1 = br1.readLine();
				String line2 = br2.readLine();
				if(line1 == null && line2 == null) {
					break;
				}
				if(line1 != null) {
					pw.println(line1);
				}
				if(line2 != null) {
					pw.println(line2);
				}
			}
			
			pw.flush();
			br1.close();
			br2.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
