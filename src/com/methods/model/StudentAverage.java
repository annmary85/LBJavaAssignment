package com.methods.model;

import java.util.Scanner;

public class StudentAverage {
	public double average;
	
	 public void setAverage(double Average){
		 average = Average;}
	
	public double qualityPoints()

    {
		if(average>=90 && average<=100) {
			System.out.println("Return 4");
            return 4;}
         
        else if (average>=80 && average<=89) {
        	System.out.println("Return 3");
        	return 3;}

        else if (average>=70 && average<=79) {
        	System.out.println("Return 2");
        	return 2;}

        else if (average>=60 && average<=69) {
        	System.out.println("Return 1");
        	return 1;}
        
        else if (average < 60)
        return 0;
		
		return average;

        }

	public static void main(String[] args) {
		StudentAverage average=new StudentAverage();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Student Average : ");
		average.setAverage(sc.nextDouble());
		average.qualityPoints();

	}

}
