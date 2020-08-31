package com.controlstatements.model;

import java.util.Scanner;

public class Sales {
	private static double totalRetailPrice=0;
	private static int productNumber;
	private static int quantitySold;
	
	public static void calculateSales() {
		Scanner sc =new Scanner(System.in);
		
		while(true){
		System.out.println("Enter product number: ");
		productNumber=sc.nextInt();
		
		if(productNumber > 5) 
			break;
		
		System.out.println("Enter quantity sold: ");
		quantitySold=sc.nextInt();
		
		switch(productNumber){
		case 1:
		totalRetailPrice = 2.98*quantitySold;
		break;
		case 2:
		totalRetailPrice =4.50*quantitySold;
		break;
		case 3:
		totalRetailPrice =9.98*quantitySold;
		break;
		case 4:
		totalRetailPrice =4.49*quantitySold;
		break;
		case 5:
		totalRetailPrice =6.87*quantitySold;
		break;
		}
			
		System.out.println("\nThe total Sale of products is $" +totalRetailPrice);
		}
	}
	

	public static void main(String[] args) {

		calculateSales();

	}
}


