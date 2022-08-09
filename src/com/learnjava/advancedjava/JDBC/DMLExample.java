package com.learnjava.advancedjava.JDBC;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class DMLExample {

	public static void main(String[] args) {
		Connection conn = null;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "employees_admin", "employees_admin");
			Statement stmt = conn.createStatement();
			conn.setAutoCommit(false);
			int noOfRows = stmt.executeUpdate("INSERT INTO EMP1 VALUES (2, 'SANDY2', 'DEPT1', to_date('" + sdf.format(d) + "','yyyy-mm-dd hh24:mi:ss'))");
			System.out.println("Number of rows updated : " + noOfRows);
			conn.commit();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		try {
			if(conn != null && !conn.isClosed())
				conn.close();
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}

}
