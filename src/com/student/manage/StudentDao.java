package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class StudentDao {

	public static boolean insertStudentToDao(Student st) {
		boolean flag = false;
		try {
			
      // JDBC code
			Connection con = ConnectionProvider.createConnection();
			String q = "insert into students( sname,sphone, city) values(?,?,?)";
			
//			PreparedStatement for dynamic query
			PreparedStatement pstmt = con.prepareStatement(q);
			
//			Set the value of parameters
			pstmt.setString(1, st.getStname());
			pstmt.setString(2, st.getStph());
			pstmt.setString(3, st.getStcity());
			
//			Execute
			pstmt.executeUpdate();
			flag = true;
		} catch (Exception e) {
			
		e.printStackTrace();
		}
		return flag;
	}
	
	public static boolean deleteStudent(int userID) {
		boolean flag = false;
		
		try {
//		JDBC	 code
			Connection con1 = ConnectionProvider.createConnection();
			String q = "delete from students where sid = ?";
			
			//PreparedStatement 
			PreparedStatement pstmt = con1.prepareStatement(q);
			pstmt.setInt(1, userID);
			
//			Execute.....
			pstmt.executeUpdate();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public static void showAllStudents() {
		
		try {
			
//		Creating Connection
			Connection con2 = ConnectionProvider.createConnection();
			
//		Setting query
			String q = "select * from students";
			
//			using Statement
			java.sql.Statement stmt=  con2.createStatement();
			ResultSet rs = stmt.executeQuery(q);
			while(rs.next()) {
				int id =rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String city = rs.getString(4);
				
				System.out.println(id +" " + name +" " + phone +" " + city);
			}
			
		} catch (Exception e) {
			
		}
		
		
	}

	public static boolean updateStudents() {
		boolean flag = false;
		try {
			Connection con = ConnectionProvider.createConnection();
			String q = "update students set sname = ?, sphone = ? where sid = ?";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, "Payel Bhowmick");
			pstmt.setString(2, "6290741162");
			pstmt.setInt(3, 2);
			pstmt.executeUpdate();
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}

}
