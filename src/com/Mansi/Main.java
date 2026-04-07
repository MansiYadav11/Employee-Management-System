package com.Mansi;

import java.util.Scanner;

public class Main {
	
	EmployeeService service=new EmployeeService();
	static boolean ordering=true;
	
	public static void menu() {
		System.out.println("*******************Welcome to Employee Management System*******************");
		System.out.print("\n1. Add Employee"
				+ "\n2. View Employee"
				+ "\n3. Update Emloyee"
				+"\n4. Delete Employee"
				+"\n5. View All Employee"
				+"\n6. Exit\n");
		
	}
	
	public static void main(String[] args) {
		EmployeeService service=new EmployeeService();
		Scanner sc=new Scanner(System.in);
		do {
			menu();
			System.out.println("Enter your choice : ");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Add Employee");
				service.addEmployee();
				break;
				
			case 2:
				System.out.println("View Employee");
				service.viewEmp();
				break;
				
			case 3:
				System.out.println("Update Emloyee");
				service.updateEmloyee();
				break;
				
			case 4:
				System.out.println("Delete Employee");
				service.deleteEmpolyee();
				break;
				
			case 5:
				System.out.println("View All Employee");
				service.viewALLEmps();
				break;
				
			case 6:
				System.out.println("Thank you for using this Application");
				System.exit(0);
				break;
				
			default:
				System.out.println("Please enter a valid choice");
				
			}
			
		}while(ordering);
		
	}
	

}
