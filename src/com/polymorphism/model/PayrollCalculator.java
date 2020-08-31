package com.polymorphism.model;

import java.text.ParseException;
public class PayrollCalculator {

	public static void main(String[] args) throws ParseException {
		
		Employee e1 =new Employee("Benjamin",new Date("31/08/1998"),1000);
		Employee e2 =new Employee("Deborah",new Date("31/12/1998"),1000);
		Employee e3 =new Employee("Mary",new Date("31/12/1998"),1000);
		Employee e4 =new Employee("Abraham",new Date("31/12/1998"),1000);
		Employee e5 =new Employee("James",new Date("31/12/1998"),1000);
		
		Employee[] employees = new Employee[5];
		employees[0]=e1;
		employees[1]=e2;
		employees[2]=e3;
		employees[3]=e4;
		employees[4]=e5;
		EmployeePayroll obj= new EmployeePayrollLionBridge();
		obj.calculatePayroll(employees);
		

	}

}
