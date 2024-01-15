package com.telusko.jdbc.main;
import java.sql.*;

import com.telusko.jdbc.utility.jdbcUtility;
public class jdbcMain {

	public static void main(String[] args) {
		Connection connect=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			connect=jdbcUtility.jdbcConnection();
			if(connect!=null)
				stmt=connect.createStatement();
			String query="SELECT * FROM personalinfo";
			boolean status=stmt.execute(query);
			
			if(status==true) {
				rs=stmt.getResultSet();
				if(stmt!=null) {
					System.out.println("ID\tName\tCITY");
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3));
					}
			}
			}
			else {
				int rowsAffected=stmt.getUpdateCount();
				System.out.println("No of rows Affected: "+rowsAffected);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				jdbcUtility.closeResources(connect, stmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}

}
