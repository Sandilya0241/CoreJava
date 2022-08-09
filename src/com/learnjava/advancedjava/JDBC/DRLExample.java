package com.learnjava.advancedjava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DRLExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MORCL", "employees_admin", "employees_admin");
			Statement stmt = conn.createStatement();
			String drl = "SELECT * FROM EMP1";
			ResultSet rs = stmt.executeQuery(drl);
			
			while(rs.next()) {
				System.out.println("===========================================");
				System.out.println("ID : " + rs.getInt(1));
				System.out.println("NAME : " + rs.getString(2));
				System.out.println("DEPTNAME : " + rs.getString(3));
				System.out.println("DATE : " + rs.getDate(4));
				
			}
			System.out.println("===========================================");
			
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
