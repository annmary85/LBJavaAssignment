package com.polymorphism.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {
	
private String employeeBirthdate;

public Date(String birthdate) {
	this.employeeBirthdate=birthdate;
   
  }

public java.util.Date getEmployeeBirthdate()
{
	 	//String sDate1="31/12/1998";  
	    try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(employeeBirthdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;  
}
}
