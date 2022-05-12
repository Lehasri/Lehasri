package com.chainsys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deleteValues {

	public static void main(String[] args) {
		try {
            Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system" ,"oracle" );
            Statement mystat = myCon.createStatement();
            String Query=("delete from emp6 where Name='Lekha sri'");
             mystat.execute(Query);
            
             mystat.execute(Query);
            myCon.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
		


	}

}
