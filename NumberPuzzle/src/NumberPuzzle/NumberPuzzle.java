package NumberPuzzle;

public class NumberPuzzle {
	public String solvePuzzle(int number) {
		if(isValidNumber(number)) {
	if(number>50) {
		return "Result:"+ findDifferenceBetweenDigits(number);
	}
	else {
		return "Result:"+ findDifferenceInReversedDigits(number);
	}
		}
		
	else {
		return "Invalid number";
		
	}
	
	
		
	}

	private boolean isValidNumber(int number) {
		return number>=10 && number<=99;
	}

private 
int findDifferenceBetweenDigits(int number) {
	int tensDigit=number/10;
	int unitsDigit=number%10;
	return Math.abs(tensDigit-unitsDigit);
}


private  int findDifferenceInReversedDigits(int number) {
	int reversedNumber=reverseNumber(number);
	
	return findDifferenceBetweenDigits(reversedNumber);
}

private  int reverseNumber(int number) {
	int reversedNumber=0;
	while(number!=0) {
		reversedNumber=reversedNumber*10+number%10;
		number/=10;
	
}
	return reversedNumber;
	

}
}



