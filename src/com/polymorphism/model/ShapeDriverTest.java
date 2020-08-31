package com.polymorphism.model;

public class ShapeDriverTest {
	
	 public static void main(String[] args) {
	      
	        Shape shape[] = new Shape[3];
	        shape[0] = new Circle(4.0);
	        shape[1] = new Square(4.0);
	        shape[2] = new Sphere(1.0);
	        
	        for (Shape curentShape : shape) {
	            System.out.println("current shape is :" +curentShape);
	            if (curentShape instanceof TwoDimensionalShape) {
	            	TwoDimensionalShape twoDimentionalShape = (TwoDimensionalShape) curentShape;
	                System.out.printf("%sArea: %.2f\n\n", twoDimentionalShape.toString(), twoDimentionalShape.getArea());

	            } else if (curentShape instanceof ThreeDimensionalShape) {
	            	ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) curentShape;
	                System.out.printf("%sVolume: %.2f\n\n", threeDimensionalShape.toString(), threeDimensionalShape.getVolume());
	                System.out.printf("%sArea: %.2f\n\n", threeDimensionalShape.toString(), threeDimensionalShape.getArea());
	            }
}
}
	 
}
