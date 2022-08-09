package com.learnjava.advancedjava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Type2DriverTest {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		System.loadLibrary("C:\\app\\saakh\\product\\11.2.0\\dbhome_1\\BIN\\ocijdbc11");
		Connection conn = DriverManager.getConnection("jdbc:oracle:oci:@localhost:1521:orclgdb","employees_admin","employees_admin");
		System.out.println(conn);
	}
}
