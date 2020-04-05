package primeDecomposition;

public class PrimeDecomposition {
	
	public String primeFactors(int n) {
		int powerOfTwo = 0;
		int powerOfThree = 0;
		int remainder = n;
		String answer = "";
		while(remainder > 1) {
			if (remainder % 2 == 0) {
				remainder = remainder/2;
				powerOfTwo += 1;
			} else if(remainder % 3 == 0) {
				remainder = remainder/3;
				powerOfThree += 1;
			} else {
				return "(11)";
			}
			System.out.println(remainder);
		}
		if(powerOfTwo > 0) {
			if(powerOfTwo == 1) {
				answer = "(2)";
			} else {
				answer = "(2**" + powerOfTwo + ")";
			}
		}
		if(powerOfThree > 0) {
			if(powerOfThree == 1) {
				answer = answer + "(3)";
			} else {
				answer = answer + "(3**" + powerOfThree + ")";

			}
		};
		return answer;
	}
	
}
