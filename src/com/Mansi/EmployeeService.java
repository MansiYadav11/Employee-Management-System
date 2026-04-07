package com.Mansi;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

	HashSet<Employee> empset=new HashSet<Employee>();
	
	Employee emp1=new Employee(101,"Shital",24,"Developer","IT",25000);
	Employee emp2=new Employee(102,"Meena",26,"Tester","CO",57000);
	Employee emp3=new Employee(103,"Bob",20,"DevOps Eng","Admin",5000);
	Employee emp4=new Employee(104,"Max",27,"System Eng","CO",70000);
	
	Scanner sc=new Scanner(System.in);
	boolean found=false;
	
	int id;
	String name;
	int age;
	String designation;
	String department;
	double sal;
	
	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
	}
	
	//view all employees
	public void viewALLEmps() {
		for(Employee emp: empset) {
			System.out.println(emp);
		}
	}
	
	//view employees based on id
	public void viewEmp() {
		
		System.out.println("Enter id:");
		id=sc.nextInt();
		for(Employee emp: empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}
		}
		
		if(!found) {
			System.out.println("Employee does'nt exist");
		}
	}
	
	public void updateEmloyee() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter Name : ");
				name=sc.next();
				System.out.println("Enter Salary : ");
				sal=sc.nextDouble();
				emp.setName(name);
				emp.setSalary(sal);
				System.out.println("Updated details of Employee : ");
				System.out.println(emp);
				found=true;
				
			}
		}
		
		if(!found) {
			System.out.println("Employee does'nt exist");
		}
	}
	
	public void deleteEmpolyee() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
		}
		
		if(!found) {
			System.out.println("Employee does'nt exist");
		}else {
			empset.remove(empdelete);
			System.out.println("Employee Deleted");
		}
	}
	
	public void addEmployee() {
		System.out.println("Enter id : ");
		id=sc.nextInt();
		System.out.println("Enter name : ");
		name=sc.next();
		System.out.println("Enter age : ");
		age=sc.nextInt();
		System.out.println("Enter designation : ");
		designation=sc.next();
		System.out.println("Enter department : ");
		department=sc.next();
		System.out.println("Enter salary : ");
		sal=sc.nextDouble();
		
		Employee emp=new Employee(id,name,age,designation,department,sal);
		empset.add(emp);
		System.out.println("Employee added successfully");
		
		
	}
	
}
