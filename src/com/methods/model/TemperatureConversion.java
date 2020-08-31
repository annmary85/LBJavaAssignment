package com.methods.model;

public class TemperatureConversion {
	private double celcius,faherenheit;
	
	public double calculateCelcius(double fahrenheit) {
		return  5.0 / 9.0 * ( fahrenheit - 32 ); 
	}
	
	public double calculateFahrenheits(double celcius) {
		return  ((9*celcius)/5)+32;
	}

	public static void main(String[] args) {
		TemperatureConversion temp = new TemperatureConversion();
		System.out.println("The Celcius temperature is :" +temp.calculateCelcius(110));
		System.out.println("The Fahrenheit temperature is :" + temp.calculateFahrenheits(32)); 

	}

}
