package com.tnsif.assignments;

import java.util.Scanner;

class Employee{
	public void calculateSalary() {
		System.out.println("Calculating salary for Employee");
	}
}
	
	class Manager extends Employee{
		@Override
		public void calculateSalary(){
			System.out.println("Calculating salary for Manager");
			
		}
	}
	class Programmer extends Employee{
		@Override
		public void calculateSalary() {
			System.out.println("calculating salary for programmer");
			
		}
	}



public class RunTimePolymorphism {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int numOfEmployees = scanner.nextInt();

        Employee[] employees = new Employee[numOfEmployees];

        for (int i = 0; i < numOfEmployees; i++) {
            System.out.println("Enter the type of employee (1 for Manager, 2 for Programmer): ");
            int employeeType = scanner.nextInt();
            if (employeeType == 1) {
                employees[i] = new Manager();
            } else if (employeeType == 2) {
                employees[i] = new Programmer();
            } else {
                System.out.println("Invalid employee type. Please enter 1 or 2.");
                i--; // Decrementing i to repeat the loop for the same index
            }
        }

        // Invoke calculateSalary() method for each employee
        for (Employee emp : employees) {
            emp.calculateSalary(); // Demonstrating dynamic polymorphism
        }

        scanner.close();
    }

	}


