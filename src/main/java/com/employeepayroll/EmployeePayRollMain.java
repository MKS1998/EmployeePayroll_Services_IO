package com.employeepayroll;

/*
 * Creating class for employeePayrollMain 
 */
public class EmployeePayrollMain {
	//main method
	public static void main(String[] args) {
		//creating the object for accessing the method
		EmployeePayRollImpl employeePayrollService = new EmployeePayRollImpl();
		System.out.println("Welcolme to employee payRoll");
		employeePayrollService.readEmployeeDataFromConsole();
		employeePayrollService.writeEmployeeDataInConsole();
	}
}