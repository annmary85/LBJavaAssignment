package com.controlstatements.model;

import java.util.Scanner;

public class CreditLimitCheck {

	public CreditLimitCheck() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
        int accountNumber = 1, accountBalance,totalCharge,totalCredits,creditLimit,newBalance;

        while(accountNumber != 0 ) {

          System.out.print("Enter Customer Account Number: ");
          accountNumber = scan.nextInt();             
          System.out.print("Enter Customer Balance at the beginning of month: ");
          accountBalance = scan.nextInt();

          System.out.print("Enter Customer total charges by customer: ");
          totalCharge = scan.nextInt();
          System.out.print("Enter Customer total Credits: ");
          totalCredits = scan.nextInt();
          
          System.out.print("Enter Customer Credit Limit: ");
          creditLimit = scan.nextInt();
 
          //New Balance

          newBalance = accountBalance + totalCharge - totalCredits;
          System.out.println("New Balance: " + newBalance);

          if ( newBalance > creditLimit){
                 System.out.println("Credit Limit Exceeded");
                break;

               }

          }

       }



	}


