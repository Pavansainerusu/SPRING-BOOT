package com.codinghub.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	//INSERT
	public static String insert() 
	{
		// TODO Auto-generated method stub
		int rows=0;
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/practice";
		String query="INSERT INTO STUDENT VALUES(?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, username, password);
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1, 101);
			pst.setString(2, "PAVAN");
			pst.setInt(3, 64551);
			pst.setString(4,"Pavan@gmail");
			rows=pst.executeUpdate();
			con.close();}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		return rows+"Row Inserted Succesfully";
	}
	//DELETE
	public static String delete(int id) {
		int rows = 0;
		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/practice";
		String query = "DELETE FROM STUDENT WHERE id = ?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			rows = pst.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return rows + " Row Deleted Successfully";
	}
	//UPDATE
	public static String update(int id, String name, int mobiel, String email) {
	    int rows = 0;
	    String username = "root";
	    String password = "root";
	    String url = "jdbc:mysql://localhost:3306/practice";
	    String query = "UPDATE STUDENT SET name = ?, mobiel = ?, email = ? WHERE id = ?";

	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection(url, username, password);
	        PreparedStatement pst = con.prepareStatement(query);

	        pst.setString(1, name);      // Use method parameter
	        pst.setInt(2, mobiel);       // Use method parameter
	        pst.setString(3, email);     // Use method parameter
	        pst.setInt(4, id);           // Use method parameter for WHERE

	        rows = pst.executeUpdate();
	        con.close();
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	    }

	    return rows + " Row(s) Updated Successfully";
	}
}
