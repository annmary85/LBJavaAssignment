package com.polymorphism.model;


public class Employee {
private String name;
private Date birthdate;
private int salary;

public String getName() {
	return name;
}

public Date getBirthdate() {
	return birthdate;
}

public int getSalary() {
	return salary;
}


public Employee(String name,Date birthdate,int salary) {
	this.name=name;
	this.birthdate=birthdate;
	this.salary=salary;
   
  }

}
