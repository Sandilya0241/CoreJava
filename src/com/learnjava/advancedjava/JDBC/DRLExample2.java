package com.learnjava.advancedjava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DRLExample2 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclgdb", "employees_admin", "employees_admin");
			Statement stmt = conn.createStatement();
			String drl = "SELECT * FROM EMP1";
			ResultSet rs = stmt.executeQuery(drl);
			ResultSetMetaData rMD = rs.getMetaData();
			int colCount = rMD.getColumnCount();
			System.out.println(colCount);
			while(rs.next()) {
				for (int cnt = 1; cnt <= colCount; cnt++) {
					if (cnt != 1) {
						System.out.print("; ");
					}
					System.out.print(rMD.getColumnName(cnt) + " : " + rs.getObject(cnt)) ;
				}
				System.out.println("");
			}
			
			
			
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
