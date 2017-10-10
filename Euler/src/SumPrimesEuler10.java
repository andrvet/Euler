package src;
/**
 * Summation of primes Problem 10 The sum of the primes below 10 is 2 + 3 + 5 +
 * 7 = 17. Find the sum of all the primes below two million.
 * https://projecteuler.net/problem=10
 * 
 * @author avetushko
 *
 *         output: sum of all primes below 2000000: 1179908154 Execution time:
 *         746 milliseconds
 */

public class SumPrimesEuler10 {

	/**
	 * isPrime method checks if a given number is prime
	 * 
	 * @param n
	 *            nmber to check if it's prime
	 * @return true if n is prime. false otherwise. complexity O(sqrt(n)))
	 */
	public static boolean isPrime(int n) {
		// negative numbers, 0 and 1 are not prime be definition
		if (n <= 1)
			return false;
		// iterate through digits of n from 2 till sqrt(n)
		// if modulus(remender) of division of n by i is zero
		// then the number n is not prime and exits exit with false
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		// if we are here the n is prime
		return true;
	}

	/**
	 * getPrimerSumBelow calculates the sum of all prime numbers below n
	 * 
	 * @param n
	 * @return sum of all primes below n. complexity O(n*sqrt(N))
	 */
	public static int getPrimerSumBelow(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] a) {
		// execution start time
		long start = System.currentTimeMillis();
		final int LIMIT = 2000000;
		// System.out.println("actual:" + isPrime(53) + " expected:true");
		System.out.println("sum of all primes below " + LIMIT + ": " + getPrimerSumBelow(LIMIT));

		long end = System.currentTimeMillis();
		// print out execution time in millisec
		System.out.println("Execution time: " + (end - start) + " milliseconds");
	}

}