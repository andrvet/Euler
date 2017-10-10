Repository contains four classes and three jUnit tests with solution of three Euler project problems:

1) SumPrimesEuler10.java 
	https://projecteuler.net/problem=10
	Summation of primes 
	The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. 
	Find the sum of all the primes below two million.

output: 
 sum of all primes below 2000000: 1179908154 
 Execution time: 746 milliseconds

2) PowerDigitSumEuler16.java 
	https://projecteuler.net/problem=16
	Power digit sum
	2 ^ 15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	What is the sum of the digits of the number 2 ^ 1000?
 
output:
 Sum of digits of (2^1000) number:1366
 Execution time: 2 mlliseconds
 
3) LargeSumEuler13.java
https://projecteuler.net/problem=13
Large sum 
Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
	3710728753390210279879799822083759024651013574025
   	46376937677490009712648124896970078050417018260538
  	etc

output:
 First ten digits of the sum:5537376230 
 Execution time: 4 milliseconds
 
4) LargeSumEuler13File.java
same as #3 but input data (100 lines of large numbers (as strings) are being read from inputEuler13.txt file

output:
 First ten digits of the sum:5537376230
 Execution time:35 milliseconds

 
Three of the four classes contains corresponding jUnit tests under /test/ dir:
1) SumPrimesEuler10Test.java
2) LargeSumEuler13Test.java
3) PowerDigitSumEuler16Test.java

Questions from the assignment: 
1) A sample output - see above in each class
2) Why I chose these three? - Each is interesting
3) A description of the process you followed in solving the problem
Wrote psuedocode first; then implmeneted in java language; then generated junot test for each of the method of each class
4) What references I used if any 
stackoverflow, wikipedia
5) how much tiem I spent on teh exercise
1-2 hours for each class; around 30 minutes per each test class; total around 8 hours




