package com.array.arraylist.model;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElementElimination {
	
	public static void main(String args[])
	{
		ArrayList<Integer> eliminateDuplicateList=new ArrayList<Integer>();
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter Array Size:");
	    int arrayLength=scan.nextInt();
	    int getElements[]=new int[arrayLength];     
        System.out.println("Enter Array Elements:");
        Boolean flag =false;
        
        for(int i = 0; i < arrayLength; i++)
        {
        	getElements[i] = scan.nextInt();
        		 if(getElements[i]>=10 && getElements[i]<=100) {
                	}
        		 else {
        			 System.out.println("Elements are not within allowed limits");
        			 flag=true;
        		 }
        }
        if(!flag) {
        for (int i = 0; i < getElements.length; i++) { 
			  if(!eliminateDuplicateList.contains(getElements[i]))
			  {
				  eliminateDuplicateList.add(getElements[i]);
			  }
      }
		System.out.println("Unique Values are"+eliminateDuplicateList);}
	}
	
}

