package com.javaclass.library.utils;

import java.sql.*;

public class DBConnection {

	public static Connection cnn;
//	public Connection connection;
	public PreparedStatement preparedStatement;

	public static Connection initDB() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cnn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/final_project",
					"root",
					""
			);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return cnn;
	}

}
