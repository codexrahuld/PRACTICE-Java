

package com.masai.assignment.day15.q4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> collection = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("...Welcome to Employee Management System....");
		
		while(true) {
			
			System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
			
			String choice1 = input.next();
			
			int i=1;
			
			if(choice1.equalsIgnoreCase("y")) {
				
				System.out.println("Enter the Employee Details: "+i);
				
				System.out.println("Enter the Employee Id:");
				
				int empId = input.nextInt();
				
				System.out.println("Enter the Employee Name:");
				
				String empName = input.next();
				
				System.out.println("Enter the Employee Salary:");
				
				double empSal = input.nextDouble();
				
				System.out.println("Enter the Department Id:");
				
				int dpId = input.nextInt();
				
				System.out.println("Enter the Department Name:");
				
			    String dpName = input.next();
			    
			    Department d = new Department(dpId, dpName);
			    
			    Employee E = new Employee(empId, empName, empSal, d);
			    
			    collection.add(E);
			    
			    System.out.println("Employee Details added successfully..");
			    i++;
			}
			else if(choice1.equalsIgnoreCase("n")) {
				System.out.println("Thank you---");
				break;
			}
		}
		
		
		
		
		while(true) {
			
			System.out.println("Enter the your choice");
			System.out.println("1: Find Employee in Particular Department");
			System.out.println("2: Remove Particular Employee");
			System.out.println("3: Print Employees in All Departments");
			
			int choice2 = input.nextInt();
			
			if(choice2 == 1) {
				System.out.println("Enter the Department Id:");
			    
				int DpId = input.nextInt();
				System.out.println("Employee in Department: "+DpId);
				for(int i=0;i<collection.size();i++) {
					if(collection.get(i).getDepartment().getDepartmentId() == DpId) {
						System.out.println("Employee Name: "+collection.get(i).getEmployeeName());
						System.out.println("Employee Id: "+collection.get(i).getEmployeeId());
						System.out.println("Employee Salary: "+collection.get(i).getEmployeeSalary());
						System.out.println("==========================");
					}
				}
			}
			else if(choice2 == 2) {
				System.out.println("Enter the Employee Id:");
				
				int empId = input.nextInt();
				
				for(Employee i:collection) {
					if(i.getEmployeeId() == empId) {
						collection.remove(i);
					}
				}
			}
			else if(choice2 == 3) {
				if(collection.size()==0) {
					System.out.println("Employee doesn't exists..");
				}
				else {
					System.out.println(collection);
				}
			}
			
			System.out.println("Do you want to Exit: ? (Y/N)");
			
			String choice3 = input.next();
			
			if(choice3.equalsIgnoreCase("y")) {
				System.out.println("Thank you...");
				break;
			}else {
				continue;
			}
		}
		
	}

}