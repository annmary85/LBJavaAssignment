package com.array.arraylist.model;

public class VariableLengthArgumentList {
	
	public static int product(int ...numbers) 
    { 
        System.out.println("Number of arguments: " + numbers.length); 
        int product=1;
        for (int i: numbers) {
            System.out.print("The arguments are " + i + " "); 
            System.out.println(); 
            product*=i;}
        System.out.println("Product of series of integers is " +product);
        return product;
    } 

	public static void main(String[] args) {
		product(30);
		product(20,10);
		product(10,20,2,3,4);
		product(1,2,3,4,5,6,7,8,9,10);

	}

}
