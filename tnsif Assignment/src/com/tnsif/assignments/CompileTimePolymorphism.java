package com.tnsif.assignments;

class ShapeAreaCalculator {
	public void CalculateArea(int sideLength) {
		int area=sideLength*sideLength;
		System.out.println("Area of square:"+ area);
	}
	public void CalculateArea(int length,int width) {
		int area=length*width;
		System.out.println("Area of rectangle: "+ area);
	}
	public void CalculateArea(double radius) {
		double area=Math.PI*radius*radius;
		System.out.println("Area of circle:" + area);
	}
}

public class CompileTimePolymorphism{
	public static void main(String[] args) {
		ShapeAreaCalculator calculator=new ShapeAreaCalculator();
		calculator.CalculateArea(5);
		calculator.CalculateArea(3,7);
		calculator.CalculateArea(4,5);
		
		
	}
}
