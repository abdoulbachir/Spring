package com.bachir.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		//Initialize variables
		String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezome=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to database: "+jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection Successful!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
