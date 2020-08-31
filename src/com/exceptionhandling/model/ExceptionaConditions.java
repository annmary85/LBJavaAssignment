package com.exceptionhandling.model;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileReader; 

public class ExceptionaConditions {

	public static void ArithmeticException () {
		try { 
            int a = 30, b = 0; 
            int c = a/b;  // cannot divide by zero 
            System.out.println ("Result = " + c); 
        } 
        catch(ArithmeticException e) { 
            System.out.println ("Can't divide a number by 0 exception caught"); 
        } 
	}
	
	public static void NullPointerException () {
		try { 
            String a = null; //null value 
            System.out.println(a.charAt(0)); 
        } catch(NullPointerException e) { 
            System.out.println ("NullPointerException caught.."); 
        } 
	}
	
	public static void ArrayIndexOutOfBoundsException () {
		try{ 
            int a[] = new int[5]; 
            a[6] = 9; // accessing 7th element in an array of 
                      // size 5 
        } 
        catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println ("Array Index is Out Of Bounds"); 
        } 
	}
	public static void StringIndexOutOfBoundsException () {
		try { 
            String a = "Mary had a little lamb "; // length is 22 
            char c = a.charAt(26); // accessing 26th element 
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println("StringIndexOutOfBoundsException caught"); 
        } 
	}
	
	public static void FileNotFoundException () {
		try { 
			  
            // Following file does not exist 
            File file = new File("E://ann.txt"); 
  
            FileReader fr = new FileReader(file); 
        } catch (FileNotFoundException e) { 
           System.out.println("File does not exist"); 
        } 
    } 
	
	
	public static void main(String[] args) {
		ArithmeticException();
		NullPointerException();
		StringIndexOutOfBoundsException();
		FileNotFoundException();
		ArrayIndexOutOfBoundsException();
		

	}

}
