package com.polymorphism.model;


public class EmployeePayrollLionBridge extends EmployeePayroll {
	
	public void calculatePayroll(Employee[] employees )
	{
		String name="";
		int salary;
		java.util.Date birthdate=null;
		java.util.Date curentDate = new java.util.Date();
		for(int i=0;i<employees.length;i++)
		{
			name=employees[i].getName();
			salary=employees[i].getSalary();
			birthdate=employees[i].getBirthdate().getEmployeeBirthdate();
			if(birthdate.getMonth()==curentDate.getMonth())
			{
				salary=salary+100;
			}
		System.out.println("Employee "+name+" salary="+salary);
		}
		
	}

}
