package com.strings.characters.regularexpression;

import java.util.Scanner;

public class ComparingStrings {
	public static void main( String args[] ) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first string");
		String s1 = scan.next();
		System.out.println("Enter your second string");
		String s2 = scan.next();
		int compare =s1.compareTo(s2);
//use compareTo
		System.out.printf("Compare First and Second String using compareTo :\n\n", compare);
		
		if (compare < 0) {
			System.out.println("First string " + s1 + " is greater than Second string " + s2 + "");
        }
		else if (compare == 0) {
            System.out.println("First string " + s1 + " is equal to Second string " + s2 + "");
            
        } else if (compare > 0) {
            System.out.println("First string " + s1 + " is less than Second string " + s2 + "");
        }

	}

}
