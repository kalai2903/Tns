package numbername;

import java.util.Scanner;

public class NumberNamesPrinter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number(0-9):");
		
			int number=scanner.nextInt();
			if(number<0||number>9) {
				System.out.println("Invalid input Please Enter a valid number between 0 and 9.");	
				return;
			}
			printNumberName(number);
		}
		
		


	public static void printNumberName(int number) {
		String[] numberNames= {"Zero","One","two","three","four","five","six","seven","eight","nine"};
		System.out.println("Number name:"+numberNames[number]);
	}

}
