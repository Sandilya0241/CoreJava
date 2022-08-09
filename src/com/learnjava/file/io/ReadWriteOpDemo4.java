package com.learnjava.file.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteOpDemo4 {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("output2.txt");
			BufferedReader br1 = new BufferedReader(new FileReader("input2.txt"));
			String line1 = br1.readLine();
			while(line1 != null) {
				BufferedReader br2 = new BufferedReader(new FileReader("output2.txt"));
				String line2 = br2.readLine();
				boolean foundRecord = false;
				while(line2 != null) {
					if (line1.equals(line2)) {
						foundRecord = true;
						break;
					}
					line2 = br2.readLine();
				}
				if (!foundRecord) {
					pw.println(line1);
				}
				pw.flush();
				line1 = br1.readLine();
				br2.close();
			}
			
			pw.flush();
			br1.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
