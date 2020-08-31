package com.Introduction.model;

import java.util.Scanner;

public class Invoice {
	
	private String number;
    private String description ;
    private int quantity;
    double itemPrice;
    double amount;

	public Invoice() {
		number = "";
		description = "";
		quantity = 0;
		itemPrice = 0.0;
	}
	
    public String get_number()
    { 
    	  System.out.println(number);
    	return number;
    }
    
    public String get_description()
    { 
    	return description;
    }
    
    public int get_quantity()
    { 
    	return quantity;
    }
    
     public double get_itemPrice()
    {
        return itemPrice;
    }
    public void set_number(String num)
    {
        number= num;
        System.out.println(number);
    }
     public void set_description(String des)
    {
        description = des;
    }
    public void set_quantity(int quantityno)
    {
        quantity = quantityno;
    }
     public void set_itemPrice(double price )
    {
       itemPrice = price;
    }
    public double getInvoiceAmount()
    {
        amount = itemPrice*quantity;
        System.out.println(amount);
        return amount;
    }

	public static void main(String[] args) {
		 Invoice inv = new Invoice();

		  inv.get_number();
		  inv.get_description();
		  inv.get_quantity();
		  inv.get_itemPrice();
		 
		  
		  inv.set_number("1");
	      inv.set_description("LCD");
	      inv.set_quantity(10);
	      inv.set_itemPrice(30.0);
	      inv.getInvoiceAmount();
	      
	}

}
