
/* 
	The Luhn algorithm, also known as the modulus 10 or mod 10 algorithm, is a simple checksum formula used to validate a variety of identification numbers, such as credit card numbers, IMEI numbers, Canadian Social Insurance Numbers.
   
	Step 1 – Starting from the rightmost digit double the value of every second digit,
	Step 2 – If doubling of a number results in a two digits number i.e greater than 9(e.g., 6 × 2 = 12), then add the digits of the product (e.g., 12: 1 + 2 = 3, 15: 1 + 5 = 6), to get a single digit number.
	Step 3 – Now take the sum of all the digits.
	Step 4 – If the total modulo 10 is equal to 0 (if the total ends in zero) then the number is valid according to the Luhn formula; else it is not valid.
		
	@author Joao Pedro Affonso de Almeida 
	@author 18145957
	@version 02/10/2018 
*/

import java.util.*;

public class Lab1_luhnAlgorithm {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in); // get input from the user
		System.out.print("Please enter credit card number: "); // print this message on the screen
		String number = input.nextLine(); // set the input to the variable number
		System.out.println();

		int total = 0; // create a variable total to store the value of the sum

		for (int i = 0; i < number.length() - 1; i++) { // for loop excluding the last digit
			// convert string to integer and check every digit from right to left, excluding
			// the last digit
			int digit = Integer.parseInt("" + number.charAt(number.length() - 2 - i));
			if (i % 2 == 0) { // double the value of every second digit
				digit = digit * 2;
			}
			if (digit > 9) { // if the value is more than nine, subtract from nine (the same thing of adding
												// the two digits)
				digit = digit - 9;
			}
			total += digit; // sum total of all the digits
		}
		if ((total + Integer.parseInt("" + number.charAt(number.length() - 1))) % 10 == 0) { // add the last digit and check
																																													// if it is multiple of ten
			System.out.println("Valid"); // if so the Credit Card is valid
		} else {
			System.out.println("Invalid"); // otherwise is invalid
		}
	}
}
