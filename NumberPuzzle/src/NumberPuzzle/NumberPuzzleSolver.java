package NumberPuzzle;
import java.util.*;
public class NumberPuzzleSolver {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter a  two-digit number: ");
		int number=scanner.nextInt();
		
		NumberPuzzle puzzleSolver=new NumberPuzzle();
		String result=puzzleSolver.solvePuzzle(number);
		System.out.println(result);
		scanner.close();
	}
	
}


