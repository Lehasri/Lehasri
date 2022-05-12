package com.chainsys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AlterTable {

	public static void main(String[] args) {
		try {
            Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system" ,"oracle" );
            Statement mystat = myCon.createStatement();
            String Query=("alter table projects add register_no int;");
             mystat.execute(Query);
            
             mystat.execute(Query);
            myCon.close();
        } catch (Exception err) {
            err.printStackTrace();
        }

	}

}
