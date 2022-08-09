package com.learnjava.declarationsandaccessmodifiers;

import static java.lang.System.out;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;
class Test {
	static String s = "JAVA";
}

public class DclrNAcssMod002 {
	static int MAX_VALUE = 999;
	public static void main(String[] args) {
//		out.println(Test.s.length());
		out.println(MAX_VALUE);	// Ref to MAX_VALUE is ambiguous
	}
}
