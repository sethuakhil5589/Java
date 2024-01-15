package com.telusko.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchJDBC2 {

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
				String query="INSERT INTO personalinfo (id,name,city) "
						+ "values (8, 'Arjun','Khammam')";
				
				int rowsAffected=stmt.executeUpdate(query);
				System.out.println("Query executed");
				
				if(rowsAffected!=0) {
					System.out.println("Check DB to look into Updates");
				}
				else {
					System.out.println("Update Fail");
				}

	}

}
