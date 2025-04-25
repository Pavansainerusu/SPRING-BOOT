package com.codinghub.Repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {

	public static String insert() {
		// TODO Auto-generated method stub
		 int rows=0;
		 String username="root";
		 String password="root";
		 String url="com.mysql.cj.jdbc.Driver";
		 String query="SELECT * FROM USER";
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection(query);
			 preparedStatement pst=
		 }
		 
		return rows+" update succesfully";
	}

}
