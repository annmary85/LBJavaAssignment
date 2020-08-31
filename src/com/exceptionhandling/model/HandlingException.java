package com.exceptionhandling.model;

public class HandlingException {
	

	public static void main(String[] args) {
			try
			{
			   throw new ExceptionB();
			}
			catch( ExceptionA e1 )
			{
				System.err.println("Caught exceptions of type ExceptionB.");}
			
			try
			{
				throw new ExceptionC();
			}
			catch( ExceptionA e2 )
			{
				System.err.println("Caught exceptions of type ExceptionC.");
			}
			
			}
		
	  }
   

   
