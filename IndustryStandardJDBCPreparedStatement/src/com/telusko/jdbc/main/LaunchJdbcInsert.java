package com.telusko.jdbc.main;

import java.sql.*;
import java.util.Scanner;

import com.telusko.jdbc.utility.LaunchJdbcUtility;

public class LaunchJdbcInsert {

	public static void main(String[] args) {
		Connection connect=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		Scanner scan=null;
		
		try {
			connect=LaunchJdbcUtility.jdbcConnection();
			String query="INSERT INTO personalinfo (id,name,city) "
					+ "VALUES(?,?,?)";
			if(connect!=null) {
				stmt=connect.prepareStatement(query);
				scan=new Scanner(System.in);
				System.out.println("Enter id");
				Integer id=scan.nextInt();
				System.out.println("Enter Name");
				String name=scan.next();
				System.out.println("Enter City");
				String city=scan.next();
				
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, city);
				int rowsAffected=stmt.executeUpdate();
				if(rowsAffected!=0) {
					System.out.println("Update was successfully done");
				}
				else {
					System.out.println("Update failed");
				}
			}
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				LaunchJdbcUtility.closeResources(connect, stmt, rs);
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
