package primeDecomposition;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeDecompositionTest {

	private static PrimeDecomposition test = new PrimeDecomposition();
	
	@Test
	public void primeFactors_2_returnCorrectPrimeFactors() {
		assertEquals("2*1", test.primeFactors(2));
	}

}
