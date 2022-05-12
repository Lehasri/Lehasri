package com.chainsys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection con = null;
	        PreparedStatement prSt = null;
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system" ,"oracle");
	            String query = "insert into emp4(name,salary) values(?,?)";
	            prSt = con.prepareStatement(query);
	            prSt.setString(1, "John");
	            prSt.setInt(2, 10000);
	            //count will give you how many records got updated
	            int count = prSt.executeUpdate();
	            //Run the same query with different values
	            prSt.setString(1, "Cric");
	            prSt.setInt(2, 5000);
	            count = prSt.executeUpdate();
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } finally{
	            try{
	                if(prSt != null) prSt.close();
	                if(con != null) con.close();
	            } catch(Exception ex){}
	        }
	    }
	

	}

}
