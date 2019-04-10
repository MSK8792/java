package labTest;

import java.sql.*;
import java.util.*;

public class test {
	public static void main(String args[]) {
		Connection com= null;
		Statement stmt =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("After loading sql server driver");
			final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
			final String USER="root";
			final String PASS="";
			final String DB_URL="jdbc:mysql://localhost:3306/student";
			com=DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected with default host");
			System.out.println("Inserting records into table");
			stmt=com.createStatement();
			String sql = "insert into records"+" values(1,'msk','aj',40)";
			stmt.executeUpdate(sql);
			 sql = "insert into records"+" values(2,'mohan','kiran',50)";
			stmt.executeUpdate(sql);
			sql = "insert into records"+" values(3,'limbo','ga',45)";
			stmt.executeUpdate(sql);
			sql = "insert into records"+" values(4,'kiran','aj',40)";
			stmt.executeUpdate(sql);
			sql = "insert into records"+" values(5,'pooja','rani',50)";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into table");
			ResultSet rs = stmt.executeQuery("Select * from records");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
		catch (SQLException se) {
			se.printStackTrace();
		}
		catch (Exception se) {
			se.printStackTrace();
		}
		finally {
			try {
				if(stmt!=null)
				com.close();
			}
			catch(SQLException se)
			{}
			try {
				if(com!=null)
					com.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("Goodbye");
	}
}
