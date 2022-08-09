package com.learnjava.file.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo01 {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter("abc.log");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(100);
			bw.newLine();
			
			bw.write(new char[] {'a', 'd', 'd', 'f'});
			bw.newLine();
			
			bw.write("Sandilya");
			bw.newLine();
			
			bw.write("Sripathi");
			bw.newLine();
			
			bw.flush();
			
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
