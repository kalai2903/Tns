package oxygencalculator;

public class OxygenCalculator {
	private double length;
	private double breadth;
	private double plantArea;
	public OxygenCalculator(double length, double breadth, double plantArea) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.plantArea = plantArea;
	}
	
	public void calculatePlants() {
		if(length<=0) {
			System.out.println("Invalid length");
			return;
		}
		if(breadth<=0) {
			System.out.println("Invalid breadth");
			return;
		}
		if (plantArea<=0) {
			System.out.println("Invalid plant area");
			return;
		}
		double roomArea=length*breadth;
		int plantSets =(int) Math.floor(roomArea/(plantArea*10));
		int totalPlants=plantSets*10;
		double oxygenProduction =totalPlants*0.9;
		
		System.out.printf("Total number of plants:%d%n", totalPlants);
		System.out.printf("%.2f",oxygenProduction);
	}

}
