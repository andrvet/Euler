package src;
import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;
/**
 * LargeSumEuler13 calculates first 10 digit of a sum of 100 50-digit numbers as
 * described at https://projecteuler.net/problem=13
 * 
 * Work out the first ten digits of the sum of the following one-hundred
 * 50-digit numbers.
 * 
 * The 100 numbers are written in inputEuler13.txt file. Make sure to change the
 * path to the file in your environment
 * 
 * @author avetushko
 * 
 *         output:
 * 
 *         First ten digits of the sum:5537376230 Execution time:35 milliseconds
 */
public class LargeSumEuler13File {

	/**
	 * 
	 * @return sum of all elements of the big array
	 */
	private static BigInteger calculateSum() {
		Scanner scanner = null;
		BigInteger sum = BigInteger.ZERO;
		try {
			scanner = new Scanner(new File("inputEuler13.txt"));

			// read data from file line by line in the loop until we reach end
			// of file
			while (scanner.hasNextLine()) {
				// creat new BigInteger object from String of a line from the
				// file
				// and add object to sum object
				sum = sum.add(new BigInteger(scanner.nextLine()));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner != null)
				scanner.close();
		}

		return sum;
	}

	/**
	 * calculateSumOfNfirstDigits
	 * 
	 * @param sum
	 *            The sum from which the method gets first numberOfFirstDigits
	 * @param numberOfFirstDigits
	 *            - the first number of digits to get from the sum
	 * @return String of the first number of digits
	 */
	private static String calculateSumOfNfirstDigits(BigInteger sum, int numberOfFirstDigits) {
		return sum.toString().substring(0, numberOfFirstDigits);
	}

	public static void main(String[] args) {
		// Start exection time
		long start = System.currentTimeMillis();
		int numberOfFirstDigits = 10;

		// calculate the sum of all elements
		BigInteger sumOfAllDigits = calculateSum();

		// get and print out the number Of First Digits of the sum
		String result = calculateSumOfNfirstDigits(sumOfAllDigits, numberOfFirstDigits);
		System.out.println("First " + numberOfFirstDigits + " digits of the sum:" + result);

		// get and print out executuon time
		long end = System.currentTimeMillis();
		System.out.println("Execution time:" + (end - start) + " milliseconds");
	}
}