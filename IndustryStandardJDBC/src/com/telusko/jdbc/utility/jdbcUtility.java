package com.telusko.jdbc.utility;
import java.sql.*;
public class jdbcUtility {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		System.out.println("Connection was established");
	}
	
	public static Connection jdbcConnection() throws SQLException {
		String url="jdbc:mysql://localhost:3306/telusko";
		String user="root";
		String password="Akhil@5589";

		return DriverManager.getConnection(url, user, password);
		
	}
	public static void closeResources(Connection c ,Statement stmt, ResultSet rs) throws SQLException {
		if(c!=null)
			c.close();
		if(stmt!=null)
			stmt.close();
		if(rs!=null)
			rs.close();
	}

}
