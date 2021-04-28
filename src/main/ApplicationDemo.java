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
					int choice;
					  do {
						  System.out.println("\n=======Menu Admin Users=======");
							System.out.println("1. Add new book.");
							System.out.println("2. Update book.");
							System.out.println("3. List all book.");
							System.out.println("4. List all user borrow book.");
							System.out.println("5. Delete book.");
							System.out.println("6. Delete user.");
							System.out.println("\nEnter a choice (1-6): ");
							choice=input.nextInt();
							switch (choice){
							case 1 :
								System.out.println("Add new book.");
								break;
							case 2 :
								System.out.println("Update book.");
								break;
							case 3 :
								System.out.println("List all book.");
								break;
							case 4 :
								System.out.println("List all users borrow book.");
								break;
							case 5 :
								System.out.println("Delete book.");
								break;
							case 6 :
								System.out.println(" Delete user.");
								break;
							default:
								System.out.println("Invalid input");
								
								break; 
							}
//							System.out.println("Do you want to choice option more? (1/0)");
							
					  }while(choice!=0);
					break;
				case 3:
					System.out.println("Login Normal User");
					int chooses;
					  do {
						  System.out.println("\n=======Menu Normal Users=======");
							System.out.println("1. List all book");
							System.out.println("2. Read Book");
							System.out.println("3. Borrow Book");
							System.out.println("\nEnter a choice (1-3): ");
							chooses=input.nextInt();
							switch (chooses){
							case 1 :
								System.out.println("List all book.");
								break;
							case 2 :
								System.out.println("Read Book");
								break;
							case 3 :
								System.out.println("Borrow Book.");
								break;
							default:
								System.out.println("Invalid input");
								
								break; 
							}
//							System.out.println("Do you want to choice option more? (1/0)");
							
					  }while(chooses!=0);
					break;
//					
				default:
					System.out.println("Invalid input");
					
					break;
			}
			
		}while(choose!=0);
	}
}
