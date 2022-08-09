package com.learnjava.file.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) {
		try {
			File f = new File("abc.properties");
			char[] chars = new char[(int)f.length()];
			FileReader fr = new FileReader("abc.properties");
			fr.read(chars);
			for(char c : chars) {
				System.out.print((char)c);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
