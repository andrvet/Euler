package test;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import src.LargeSumEuler13;

public class LargeSumEuler13Test {

	@Test
	public void testInitializeTheBigIntArray() {
		BigInteger[] bigArray = new BigInteger[100];
		LargeSumEuler13.initializeTheBigIntArray(bigArray);

		BigInteger expectedFirstElement = new BigInteger("37107287533902102798797998220837590246510135740250");

		Assert.assertEquals(expectedFirstElement, bigArray[0]);

		Assert.assertEquals("length of the array is 100", 100, bigArray.length);
	}
	@Test
	public void testCalculateSum() {
		BigInteger firstBigInt = new BigInteger("37107287533902102798797998220837590246510135740250");
		BigInteger secondBigInt = new BigInteger("46376937677490009712648124896970078050417018260538");
		// System.out.println(firstBigInt);
		// System.out.println(secondBigInt);
		BigInteger[] twoElemnentsArray = new BigInteger[]{firstBigInt, secondBigInt};

		BigInteger sum = firstBigInt.add(secondBigInt);
		// System.out.println(sum);
		BigInteger sumOfElelemnt = LargeSumEuler13.calculateSum(twoElemnentsArray);
		// System.out.println(sumOfElelemnt);
		Assert.assertEquals(sum, sumOfElelemnt);

	}
	@Test
	public void testGetNFristDigits() {

		String firstThreeCharsOfBigInt = LargeSumEuler13.getNFristDigits(new BigInteger("37107287533902102798797998220837590246510135740250"), 3);
		// System.out.println(firstThreeCharsOfBigInt);
		Assert.assertEquals("371", firstThreeCharsOfBigInt);
	}

}
