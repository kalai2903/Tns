package oxygencalculator;

import java.util.Scanner;

public class OxygenProductionMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the length of the room in meters:");
		double length=scanner.nextDouble();
		
		System.out.println("Enter the breadth of the room in meters:");
		double breadth=scanner.nextDouble();
		
		System.out.println("Enter the plant area in cm^2:");
		
		double plantArea=scanner.nextDouble()/(100*100);
	
		
		OxygenCalculator oxygenCalculator=new OxygenCalculator(length,breadth,plantArea);
		oxygenCalculator.calculatePlants();
		scanner.close();
		
		
		

	}

}
