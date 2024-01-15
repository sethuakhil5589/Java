package com.telusko.jdbc.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.telusko.jdbc.utility.LaunchJdbcUtility;

public class LaunchJdbcFetch {

	public static void main(String[] args) {
		Connection connect=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		Scanner scan=null;
		
		try {
			connect=LaunchJdbcUtility.jdbcConnection();
			String query="SELECT * FROM personalinfo WHERE id=?";
			if(connect!=null) {
				stmt=connect.prepareStatement(query);
				scan=new Scanner(System.in);
				System.out.println("Enter id");
				Integer id=scan.nextInt();
				
				stmt.setInt(1, id);
				
				 rs=stmt.executeQuery();
				 System.out.println("ID\tName\tCITY");
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3));
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
