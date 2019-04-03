
/*  
	The following iterative sequence is defined for the set of positive integers:
	n → n/2 (n is even) n → 3n + 1 (n is odd)
	Using the rule above and starting with 13, we generate the following sequence:
	13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
	Which starting number, under one million, produces the longest chain?
	NOTE: Once the chain starts the terms are allowed to go above one million.
		
	@author Joao Pedro Affonso de Almeida 
	@author 18145957
	@version 08/10/2018
*/

import java.util.Scanner;

public class Lab2_CollatzSequence {
	public static void main(String[] args) {

		long x = 0L; // set the initial x value to 0
		int count = 0; // to count the number of terms until 1

		Scanner input = new Scanner(System.in); // get input from the user
		System.out.println("Please enter your student number: ");
		x = input.nextLong(); // set this input to x
		System.out.println();

		while (x != 1) { // go for a loop until until x gets to 1
			if (x % 2 == 0) { // condition for even numbers
				x = x / 2;
				System.out.println(x);
				System.out.println();
			} else { // condition for odd numbers
				x = 3 * x + 1;
				System.out.println(x);
				System.out.println();
			}
			count++; // increment the count
		}
		System.out.println("The sequence contains: " + count + " terms");
	}
}