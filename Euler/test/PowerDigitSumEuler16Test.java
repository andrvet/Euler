package test;

import org.junit.Assert;
import org.junit.Test;

import src.PowerDigitSumEuler16;

public class PowerDigitSumEuler16Test {

	@Test
	public void testGetSumOfDigits() {
		// 2 power 15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 =
		// 26
		long twoPower15 = (long) Math.pow(2, 15);
		long expected = 32768L;
		long actual = Long.valueOf(twoPower15);
		Assert.assertEquals(expected, actual);

		expected = 26;
		actual = PowerDigitSumEuler16.getSumOfDigits(String.valueOf(twoPower15));
		Assert.assertEquals(expected, actual);

	}

}
