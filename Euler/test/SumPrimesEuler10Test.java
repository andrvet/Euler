package test;

import org.junit.Assert;
import org.junit.Test;

import src.SumPrimesEuler10;

public class SumPrimesEuler10Test {

	@Test
	public void testIsPrime() {
		// 2 + 3 + 5
		boolean actual = SumPrimesEuler10.isPrime(2);
		Assert.assertTrue("2 is prime", actual);

		actual = SumPrimesEuler10.isPrime(10);
		Assert.assertTrue("10 is NOT prime", !actual);

		actual = SumPrimesEuler10.isPrime(5);
		Assert.assertTrue("5 is prime", actual);
	}

	@Test
	public void testGetPrimerSumBelow() {
		int actual = SumPrimesEuler10.getPrimerSumBelow(10);
		int expected = 17;
		Assert.assertEquals("sum of primes below 10 is 2 + 3 + 5 + 7 = 17", expected, actual);
	}

}
