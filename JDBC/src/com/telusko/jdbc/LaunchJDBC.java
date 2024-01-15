package com.telusko.jdbc;
import java.sql.*;

public class LaunchJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load class and register the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is registered");
		
		//Establish the connection
		
		String url="jdbc:mysql://localhost:3306/telusko";
		String user="root";
		String password="Akhil@5589";
		
		Connection connect=DriverManager.getConnection(url, user, password);
		System.out.println("Connection was established");
		
		Statement stmt=connect.createStatement();
		System.out.println("Statment is ready");
		
		String query="select * from personalinfo";
		ResultSet rs=stmt.executeQuery(query);
		System.out.println("Statement object is ready");
		
		System.out.println("ID\tName\tCITY");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3));
		}
		
		rs.close();
		stmt.close();
		connect.close();

	}

}
