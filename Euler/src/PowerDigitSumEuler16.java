package src;
/** PowerDigitSumEuler16 class calculates sum of digits of the number 2 power 1000
 * as described at https://projecteuler.net/problem=16
 * 2 power 15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2 power 1000?
 *
 * @author avetushko
 * 
 * output:
 *
 * Sum of digits of (2^1000) number:1366
 * Execution time: 2 mlliseconds
 *
 */

import java.math.BigInteger;

public class PowerDigitSumEuler16 {

	/**
	 * getSumOfDigits
	 * 
	 * @param s
	 *            a String repsenetation of the BigInteger number
	 * @return sum of digits of the Bignumber
	 */
	public static long getSumOfDigits(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			Character c = new Character(s.charAt(i));
			String z = c.toString();
			int j = Integer.parseInt(z);
			sum += j;
		}

		return sum;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);

		long result = getSumOfDigits(n.toString());

		System.out.println("Sum of digits of (2^1000) number:" + result);

		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end - start) + " mlliseconds");
	}
}
