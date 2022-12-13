package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

public class ConnectionProvider {
	 static Connection con;
	public static Connection createConnection() {

		try {
			
        // Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
	   // Create Connection
			
			
			String user = "root";
			String password = "root1234";
			String url = "jdbc:mysql://localhost:3306/student_manage_jdbc";
			
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  con;
	}
}
