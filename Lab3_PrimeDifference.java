
/*  
	Finding the difference between prime numbers. You'll be given a number N, and you need ot output the difference between the nearest prime below N and the nearest prime above N.
	For example, if you were given input 10, the nearest prime numbers are 7 and 11. 11-7=4 so your output will be 4.

	Note1: In this example we were considering the minimum user input > 2. In case input is equals 0 or 1 it will not give you the right output.
	Note2: In this example we were considering that if the user input is equals a prime number, then the output will be (following prime - previous prime). Line 39 and Line 47.

	Sieve of Eratosthenes
	
    @author Joao Pedro Affonso de Almeida 
    @author 18145957
    @version 16/10/2018
*/

import java.util.*;

public class Lab3_PrimeDifference {

	public static boolean isPrime(int x) // method to check if the number is prime or not
	{
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // get input from the user
		System.out.print("Please enter a number: ");
		int n = input.nextInt(); // set the input to the variable n
		System.out.println();

		int prime1 = 1, prime2 = 1;
		for (int i = n + 1;/* i<=1000 */; i++) // find the nearest prime above n
		{
			if (isPrime(i)) {
				prime1 = i;
				break;
			}
		}
		for (int i = n - 1; i >= 2; i--) // find the nearest prime below n
		{
			if (isPrime(i)) {
				prime2 = i;
				break;
			}
		}

		System.out.println("The nearest prime below " + n + " is: " + prime2);
		System.out.println("The nearest prime above " + n + " is: " + prime1);
		System.out.println("The difference between the nearest prime below " + n + " and the nearest prime above " + n
				+ " is: " + (prime1 - prime2));
		System.out.println("");
	}
}