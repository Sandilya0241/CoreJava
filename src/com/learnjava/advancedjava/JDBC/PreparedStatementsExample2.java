package com.learnjava.advancedjava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class PreparedStatementsExample2 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclgdb","employees_admin","employees_admin");
			PreparedStatement pst =  conn.prepareStatement("SELECT * FROM EMP1 WHERE ID = ?");
			
			pst.setInt(1, 127);
			
			ResultSet rs = pst.executeQuery();
			ResultSetMetaData rmd = rs.getMetaData();
			int colCount = rmd.getColumnCount();
			while(rs.next()) {
				for (int cnt = 1; cnt <= colCount; cnt++) {
					if (cnt != 1) {
						System.out.print("; ");
					}
					System.out.print(rmd.getColumnName(cnt) + " : " + rs.getObject(cnt)) ;
				}
				System.out.println("");
			}
			System.out.println("Debug point 1");
			rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("Debug point 2");
				System.out.println(rs.getString("ENAME"));
			}
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		try {
			if(conn != null && conn.isClosed() != true) {
				conn.close();
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
