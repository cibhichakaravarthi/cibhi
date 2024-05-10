package com.example.hrtest;
//import hr package
import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create instance of employee
		Employee employee=new Employee("Cibhi",01,30000);
		//call methods to print name and salary
		employee.printName();
		employee.printSalary();

	}

}
