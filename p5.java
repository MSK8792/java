
import java.sql.*;
import java.util.*;

public class p5 {

	private static void listDrivers() {
		Enumeration driverList = DriverManager.getDrivers();
		while(driverList.hasMoreElements()) {
			Driver driverClass = (Driver)driverList.nextElement();
			System.out.println(" "+ driverClass.getClass().getName());
		}
	}
	public static void main(String args[]) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("After loading SQL Server Driver");
			p5.listDrivers();
			final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
			final String USER = "root";
			final String PASS = "mysql";
			final String DB_URL = "jdbc:mysql://localhost:3306/book";
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected with default host");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM author");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
		catch(Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}
}
