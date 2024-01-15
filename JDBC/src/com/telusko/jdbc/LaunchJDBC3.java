package com.telusko.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchJDBC3 {
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
		
		Statement stmt = connect.createStatement();
		
//		String query="UPDATE personalinfo set city='warangal' where id=8";
		String query="DELETE from personalinfo where id=1";
		int rowsAffected=stmt.executeUpdate(query);
		System.out.println("Rows Affected: "+rowsAffected);
		
		if(rowsAffected!=0)
//			System.out.println("Update successful");
			System.out.println("Delete successful");
		else
//			System.out.println("Update unsuccessful");
			System.out.println("Delete unsuccessful");
		
		stmt.close();
		connect.close();
}
}
