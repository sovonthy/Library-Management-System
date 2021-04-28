package com.javaclass.library.view;

import com.javaclass.library.controller.UserRepository;
import com.javaclass.library.model.User;
import com.javaclass.library.model.UserModel;
import com.javaclass.library.utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryApplication {
    public static String username;
    public static String position;
    public static String password;
    Connection cnn = DBConnection.initDB();
    public static void register() throws SQLException, ClassNotFoundException{
        UserRepository UserRepo = new UserModel();
        System.out.println("Register New Account");
        System.out.println("Input username:");
        Scanner scanner = new Scanner(System.in);
        //Get username
        username = scanner.nextLine();
        System.out.println("Input position:");
        //Get position
        position = scanner.nextLine();
        System.out.println("Password:");
        Scanner scanner2 = new Scanner(System.in);
        //Get password
        password = scanner2.nextLine();
        User user = new User(0, username, password, position);
        if (UserRepo.insert(user)) {
            System.out.println("Register Successfully!");
        } else {
            System.out.println("Register not successfully");
        }
    }
    public static void main(String args[]) throws SQLException, ClassNotFoundException, InputMismatchException {
        System.out.println("---------------------------------");
        System.out.println("   Library Management System");
        System.out.println("---------------------------------");
        System.out.println("      MENUS");
        System.out.println("1. Register Account");
        System.out.println("2. Login Admin User");
        System.out.println("3. Login Normal User");
        // User //
//        UserRepository UserRepo = new UserModel();
        Connection cnn = DBConnection.initDB();
        Scanner scanner = new Scanner(System.in);
        String decision;
        boolean yn = true;
        while (yn) {

            if (scanner.nextInt() == 1) {
                register();

                System.out.println("Do you want to register more account? (yes or no)");
                decision = scanner.nextLine();
                switch (decision){
                    case "yes":
                        register();
                    case "no":
                        yn = false;
                }

            } else if (scanner.nextInt() == 3){
                System.out.println("Username:");
                Scanner scanner1 = new Scanner(System.in);
                username = scanner1.nextLine();
                System.out.println("Password:");
                Scanner scanner2 = new Scanner(System.in);
                password = scanner2.nextLine();
                //* represents all columns
                PreparedStatement sql2 = cnn.prepareStatement("select * from users where username =" + "'" + username + "'" + "and password=" + "'" + password + "'");

                ResultSet resultSet = sql2.executeQuery();
                if(resultSet.next() == true){
                    System.out.println("You have as normal user successfully");
                }else {
                    System.out.println("Your username or password is not correct!!!");
                }
            }else if (scanner.nextInt() == 2){
                System.out.println("Username:");
                Scanner scanner1 = new Scanner(System.in);
                username = scanner1.nextLine();
                System.out.println("Password:");
                Scanner scanner2 = new Scanner(System.in);
                password = scanner2.nextLine();
                //* represents all columns
                PreparedStatement sql2 = cnn.prepareStatement("select * from users where username =" + "'" + username + "'" + "and password=" + "'" + password + "'");

                ResultSet resultSet = sql2.executeQuery();
                if(resultSet.next() == true){
                    System.out.println("You have as admin user successfully");
                }else {
                    System.out.println("Your username or password is not correct!!!");
                }
            }
        }
    }
}

