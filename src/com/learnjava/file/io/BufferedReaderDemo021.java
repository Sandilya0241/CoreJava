package com.learnjava.file.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo021 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("abc.log");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
