package com.javaclass.library.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.javaclass.library.model.User;
import com.javaclass.library.utils.DBConnection;
import com.javaclass.library.controller.UserRepository;

public class UserModel implements UserRepository {

	private Connection cnn;
	private String sql;
	private PreparedStatement pstmt;
	private ResultSet rs;

	
	public UserModel() {
		cnn = DBConnection.initDB();
	}

	@Override
	public boolean insert(User user) {
		sql = "INSERT INTO users (username, password, position) values (?,?,?)";
		
		try {
			pstmt = cnn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3,user.getPosition());

			if(pstmt.executeUpdate() != 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	@Override
	public ArrayList<User> findAll() {
		sql = "SELECT * FROM users";
		ArrayList<User> students = new ArrayList<>();
		User student = null;
		try {
			
			pstmt = cnn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				
				students.add(
						new User(
								rs.getInt("id"),
								rs.getString("username"),
								rs.getString("password"),
								rs.getString("position")
								)
							
						);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return students;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
