package com.controlstatements.model;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		 long fact=1;
		  Scanner scan = new Scanner (System.in);
		  System.out.println("Enter the number :");
		  long number= scan.nextInt();  
		  
		  for(long i=1;i<=number;i++){    
		      fact=fact*i;    
		  }   
		  System.out.println("----------------------------------");
		  System.out.println("Factorial of "+number+ " is:"); 
		  System.out.println("----------------------------------");
		  System.out.println(fact);  
		  System.out.println("-----------------------------------");
		 }  
		}  

