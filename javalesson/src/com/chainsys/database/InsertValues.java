package com.chainsys.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertValues {

	public static void main(String[] args) {
		try {
            Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system" ,"oracle" );
            Statement mystat = myCon.createStatement();
            String Query=("insert into emp6 Values('Lekha sri',12000)");
             mystat.execute(Query);
             Query=("insert into emp6 Values('Uma shakthi',12000)");
             mystat.execute(Query);
             Query=("insert into emp6 Values('Dharshini Priya',12000)");
             mystat.execute(Query);
             Query=("insert into emp6 Values('Sree Nath',12000)");
             mystat.execute(Query);
            myCon.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
		

	}

}
