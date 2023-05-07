package com.upskill.assignment_2;

public class Assignment_2_6 {

	/* Problem 6. Write a java program to find the prime number from 1 to 100 and print them.*/
	
	public static void main(String[] args) {
		int i, j;
        boolean isPrime;

        // Loop through numbers 1 to 100
        for (i = 2; i <= 100; i++) {
            isPrime = true;

            // Check if current number is prime
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If number is prime, print it
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
	 }
}
