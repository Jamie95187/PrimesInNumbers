package primeDecomposition;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeDecompositionTest {

	private static PrimeDecomposition test = new PrimeDecomposition();
	
	@Test
	public void primeFactors_2_returnCorrectPrimeFactors() {
		assertEquals("(2)", test.primeFactors(2));
	}

	@Test
	public void primeFactors_4_returnCorrectPrimeFactors() {
		assertEquals("(2**2)", test.primeFactors(4));
	}
	
	@Test
	public void primeFactors_6_returnCorrectPrimeFactors() {
		assertEquals("(2)(3)", test.primeFactors(6));
	}
	
	@Test
	public void primeFactors_8_returnCorrectPrimeFactors() {
		assertEquals("(2**3)", test.primeFactors(8));
	}
	
	@Test
	public void primeFactors_9_returnCorrectPrimeFactors() {
		assertEquals("(3**2)", test.primeFactors(9));
	}
	
	@Test
	public void primeFactors_11_returnCorrectPrimeFactors() {
		assertEquals("(11)", test.primeFactors(11));
	}
	
	@Test
	public void primeFactors_21_returnCorrectPrimeFactors() {
		assertEquals("(3)(7)", test.primeFactors(21));
	}
	
	@Test
	public void primeFactors_31_returnCorrectPrimeFactors() {
		assertEquals("(31)", test.primeFactors(31));
	}
	
	@Test
	public void primeFactors_1001_returnCorrectPrimeFactors() {
		assertEquals("(7)(11)(13)", test.primeFactors(1001));
	}
	
	@Test
	public void primeFactors_86240_returnCorrectPrimeFactors() {
		assertEquals("(2**5)(5)(7**2)(11)", test.primeFactors(86240));
	}
	
	@Test
	public void primeFactors_100000_returnCorrectPrimeFactors() {
		assertEquals("(2**5)(5**5)", test.primeFactors(100000));
	}
}
