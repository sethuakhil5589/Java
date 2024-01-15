package com.telusko.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.telusko.jdbc.utility.LaunchJdbcUtility;

public class LaunchJdbcUpdate {

	public static void main(String[] args) {
		Connection connect=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		Scanner scan=null;
		
		try {
			connect=LaunchJdbcUtility.jdbcConnection();
			String query="UPDATE personalinfo set city=? where id=?";
			if(connect!=null) {
				stmt=connect.prepareStatement(query);
				scan=new Scanner(System.in);
				System.out.println("Enter id");
				Integer id=scan.nextInt();
				
				System.out.println("Enter City which you need to update");
				String city=scan.next();
				
				stmt.setInt(2, id);
				stmt.setString(1, city);
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


