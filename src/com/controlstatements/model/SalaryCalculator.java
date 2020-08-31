package com.controlstatements.model;

import java.util.Scanner;

public class SalaryCalculator {

	private double hours, hourlyPay;
    private double extraHours,grossPay;

    public void setHours(double hours){
        this.hours = hours;
    }
    
    public void setHourlyPay(double hourlyPay){
        this.hourlyPay = hourlyPay;
    }
    
    public double employeeGrossPay(){
      if(hours > 40 )
      {  
    	 System.out.println("Hours Exceeded");
    	 extraHours = hours - 40;
         grossPay = ( 40 * hourlyPay ) + ( extraHours * hourlyPay );
      }
      else
         grossPay = hours * hourlyPay;   
         return grossPay;
     }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        SalaryCalculator salaryCalc = new SalaryCalculator();

        for(int i=1; i<4; i++){
            System.out.println("Employee " + i + " Total hours:");
            salaryCalc.setHours(sc.nextDouble());

            System.out.println("Employee" + "" + i + " hourly pay: ");
            salaryCalc.setHourlyPay(sc.nextDouble());

            System.out.println("Employee " + i + " Gross Pay:"  + salaryCalc.employeeGrossPay());
        }

	}

}
