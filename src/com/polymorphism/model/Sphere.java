package com.polymorphism.model;

public class Sphere extends ThreeDimensionalShape {
	private double radius;
    
    public Sphere(double radius) {
        this.radius=radius;    
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
 
     
    @Override
    public double getVolume() {
        return (4/3)*Math.PI*Math.pow(getRadius(), 3);
       
    }

    @Override
    public double getArea() {
       return (1/3)*Math.PI*Math.pow(getRadius(), 2);
    }

}
