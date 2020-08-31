package com.strings.characters.regularexpression;
import java.util.Scanner;
import java.util.StringTokenizer;


public class TokenizingTelephoneNumbers {

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner( System.in );
	        System.out.println( "Enter a telephone number :");
	        String telephoneNumber = scanner.nextLine();
	        String[] phoneNumber = telephoneNumber.split( "-" );
	        String areaCode=phoneNumber[0];
	        System.out.println("Area code is :" +areaCode);
	        String sevenDigitphoneNumber=phoneNumber[1]+phoneNumber[2];
	        System.out.println("The seven digit phone no is :" +sevenDigitphoneNumber);
	}
	    
}