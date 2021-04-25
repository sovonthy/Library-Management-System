package main;

import java.util.Scanner;


public class ApplicationDemo {

	public static void main(String[] args) {
	

		Scanner input=new Scanner(System.in);
		
		int choose;
		
		do {
			System.out.println("\nMenu ");
			System.out.println("1. Register Account");
			System.out.println("2. Login Admin User");
			System.out.println("3. Login Normal User");
			System.out.println("\nEnter a choice (1-3): ");
			
			choose=input.nextInt();
			switch(choose) {
				case 1:
					
					System.out.println("Register Account");
					
					break;
				case 2:
					System.out.println("Login Admin User");
					
					break;
				case 3:
					System.out.println("Login Normal User");
					
					break;
//					
				default:
					System.out.println("Invalid input");
					
					break;
			}
			
		}while(choose!=0);
	}
}
