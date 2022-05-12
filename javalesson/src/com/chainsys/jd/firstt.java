package com.chainsys.jd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class firstt {

	public static void main(String[] args) {
		try {
			Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"oracle");
			java.sql.Statement mystat = myCon.createStatement();
			ResultSet myRs = mystat.executeQuery("select * from employees");
			
			while (myRs.next()) {
				System.out.println(myRs.getInt("employee_id") + ", " + myRs.getString("first_name"));
			}
			myCon.close();
		} catch (Exception err) {
			err.printStackTrace();
		}
	}
}
