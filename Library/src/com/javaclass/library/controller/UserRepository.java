package com.javaclass.library.controller;

import java.util.ArrayList;

import com.javaclass.library.model.User;

public interface UserRepository {

//	boolean MainMenu();
//	boolean totalBook();

	boolean insert(User user);
	ArrayList<User> findAll();


	boolean update(User user);
	boolean deleteById(int id);
	User findById(int id);

}
