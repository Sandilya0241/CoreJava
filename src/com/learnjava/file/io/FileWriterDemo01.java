package com.learnjava.file.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo01 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("abc_def.txt",true);
			fw.write(100);
			fw.write("Sandilya\nSripathi");
			fw.write('\n');
			
			char[] ch = {'a', 'b', 'c'};
			fw.write(ch);
			fw.write('\n');
			
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
