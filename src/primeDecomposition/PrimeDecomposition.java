package primeDecomposition;

import java.util.Map;
import java.util.TreeMap;

public class PrimeDecomposition {
	
	public String primeFactors(int n) {
		if (isPrime(n)) {
			return "(" + n + ")";
		}
		int remainder = n;
		TreeMap<Integer, Integer> powers = new TreeMap<Integer, Integer>();
		for (int i = 2; i <= remainder; i++) {
			if (isPrime(i)) {
				isPrime(remainder);
				while (remainder % i == 0 && !isPrime(remainder)) {
					remainder = remainder/i;
					if (powers.containsKey(i)) {
						powers.put(i, powers.get(i)+1);
					} else {
						powers.put(i, 1);
					}
				}
			}
		}
		
		if(isPrime(remainder)) {
			if (powers.containsKey(remainder)) {
				powers.put(remainder, powers.get(remainder)+1);
			} else {
				powers.put(remainder, 1);
			}
		}
		
		String answer = "";
		for (Map.Entry<Integer, Integer> factor : powers.entrySet()) {
			if (factor.getValue() == 1) {
				answer = answer + "(" + (int)factor.getKey() + ")";
			} else {
				answer = answer + "(" + (int)factor.getKey() + "**" + (int)factor.getValue() + ")";  
			}
		}
		return answer;
	}
	
	public boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
