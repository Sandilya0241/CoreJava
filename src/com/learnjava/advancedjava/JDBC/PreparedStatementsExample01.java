package com.learnjava.advancedjava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class PreparedStatementsExample01 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclgdb","employees_admin","employees_admin");
			PreparedStatement pst =  conn.prepareStatement("INSERT INTO EMP1 VALUES (?, ?, ?, ?)");
			
			pst.setInt(1, 127);
			pst.setString(2, "Sandy5");
			pst.setString(3, "DEPT2");
			pst.setDate(4, java.sql.Date.valueOf("1991-02-28"));
			pst.executeUpdate();
			
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
			
			while(rs.next()) {
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
