package com.classes.objects.com;


public class Rectangle {
	
	private double length;
    private double width;

    public Rectangle() {
    	this.length =1;
    	this.width=1;}

    public Rectangle(double length, double width) {
        this.length = validateLengthWidthValue(length);
        this.width = validateLengthWidthValue(width);
    }

    public double getLength() {
        return length;}

    public double getWidth() {
    	return width;}

    public void setLength(double length) {
        this.length = validateLengthWidthValue(length); }

    public void setWidth(double width) {
        this.width = validateLengthWidthValue(width);}

    public double calculateRectanglePerimeter() {
        double perimeter = (length * 2) + (width * 2);
        System.out.println("Perimeter of Rectangle is :" + perimeter); 
        return perimeter;}

    public double calculateRectangleArea() {
    	double area= length * width;
    	System.out.println("Area of Rectangle is :" + area);
    	return area;
    	}

    private double validateLengthWidthValue(double value) {
    	if ((value > 0.0) && (value <= 20.0)) 
    		return value;
        else
        	System.out.println("Value is not within limits 0.0 and 20.0");
		return 0;    
    }

	public static void main(String[] args) {
		 Rectangle rec = new Rectangle();
	     System.out.println("Area and perimeter of default rectangle ");
	     rec.calculateRectangleArea();
	     rec.calculateRectanglePerimeter();
	     rec = new Rectangle(21, 8);
	     System.out.println("Area and perimeter of new rectangle");
	     rec.calculateRectangleArea();
	     rec.calculateRectanglePerimeter();

	}

}
