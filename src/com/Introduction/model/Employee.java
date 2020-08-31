package com.Introduction.model;

import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
  public Employee(){
		firstName = null;
		lastName = null;
		monthlySalary = 0.0;
		 }
	 
//Getter methods for instance variables
  public String getfirstName(){
	   return firstName;}
		  
  public String getlastName(){
	   return lastName;}
		   
  public double getSalary(){
	   return monthlySalary;}
 
//Setter methods for instance variables
  public void setfirstName(String first){
	    firstName = first;}
	    
  public void setlastName(String last){
	    lastName = last;}
	    
  public void setSalary(double salary){
	    monthlySalary = salary;}
		  
  
		   

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Scanner sc=new Scanner(System.in);
		
		  System.out.println("Enter First Name Employee1: ");
		  String first = sc.next();
		  emp1.setfirstName(first);

		  System.out.println("Enter Last Name of Employee1: ");
		  String last=sc.next();
		  emp1.setlastName(last);

		  System.out.println( "Enter Monthly Salary of Employee1: " );
		  double salary=sc.nextDouble();
		  emp1.setSalary(salary);
		  
		  System.out.println("Enter First Name of Employee2: ");
		  first=sc.next();
		  emp2.setfirstName(first);

		  System.out.println("Enter Last Name of Employee2: ");
		  last=sc.next();
		  emp2.setlastName(last);

		  System.out.println( "Enter Monthly Salary of Employee2: " );
		  salary=sc.nextDouble();
		  emp2.setSalary(salary);
		  
		  System.out.println("Employee1 Annual Salary.\n");
		  System.out.println(emp1.getSalary() * 12 + "\n" );
		  
		  System.out.println("Employee2 Annual Salary.\n");
		  System.out.println(emp2.getSalary() * 12 + "\n" );

		  System.out.println("Employee1 Annual Salary After 10% PayRaise.\n"+ "  " + (emp1.getSalary()*1.10 * 12 + "\n"));
		  System.out.println("Employee2 Annual Salary After 10% PayRaise.\n"+ "  " + (emp2.getSalary()*1.10 * 12 + "\n"));
		  }
	}


