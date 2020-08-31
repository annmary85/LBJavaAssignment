package com.array.arraylist.model;

public class OneDimensionalArray {

	public static void main(String[] args) {
		
		
		  // Set the 10 elements of integer array counts to zero
       
		int zeroArray[]={0,0,0,0,0,0,0,0,0,0}; 
		System.out.println("Zero array is set ");
             
        // Add one to each of the 15 elements of integer array bonus.
        int bonusArray[];
        bonusArray=new int[15]; 
 
           for(int i=0;i<15;i++){ 
               bonusArray[i]+=1;
               System.out.println("Bonus Array elements " +bonusArray[i]);
           }
             
        // Display the five values of integer array bestScores in column format.
        int bestScores[]={10,20,30,40,50};  
                                        
        for (int i=0;i<5;i++){
            System.out.printf("%d\t", bestScores[i]);         }
    }

}

