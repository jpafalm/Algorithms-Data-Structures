
/*
	Problem Statement: The goal is to read a list of integers into an array and output the one which the median, that is,
	the one which if you put them all in order would be in the middle. If there are two in the middle then take the average of
	those two. For example the median of 4,8,2,3 and 5 is 4, because if you put them all in order 4 would be the middle value.
	The median of 2,7,4, and 9 is 5.5 because 5.5 is the average of 4 and 7.

	@author Joao Pedro Affonso de Almeida 
	@author 18145957
	@version 07/11/2018
*/

import java.util.Scanner;

public class Lab5_BubbleSort {

	public static int[] getInputArray(int size, String numbers) { // size = array.length

		String[] stringArr = numbers.split(" "); // store numbers splitted by space in a String array
		int[] intArr = new int[size]; // create a new integer array with with length = size

		for (int z = 0; z < size; z++) {
			intArr[z] = Integer.parseInt(stringArr[z]); // fill integer array with data converted from String array
		}
		return intArr; // return intArray
	}

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in); // Scanner for quantity of numbers
		System.out.println("Enter the number of inputs: "); // quantity of numbers in the sequence
		int N = sc1.nextInt(); // set the integer input value to "N"

		Scanner sc2 = new Scanner(System.in); // Scanner for the sequence of numbers
		System.out.println("Enter sequence of numbers separated by space: "); // sequence of numbers separated by space
		String n = sc2.nextLine(); // set the String input value to "n"

		int[] myArray = getInputArray(N, n); // call method getInputArray

		// sort the numbers from myArray from lowest to highest
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < N - 1 - i; j++) {
				if (myArray[j] > myArray[j + 1]) {
					int temp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = temp;
				}
			}
		}

		sc1.close(); // to prevent resource leaks
		sc2.close(); // to prevent resource leaks

		// print myArray sequence sorted
		for (int k = 0; k < N; k++) {
			System.out.print(myArray[k] + " ");
		}
		// if the size of the array is even do this
		if (N % 2 == 0) {
			double outputEven = (myArray[N / 2 - 1] + myArray[N / 2]) / 2.0;
			System.err.println("\n" + outputEven);
		}
		// if the size of the array is odd do this
		else {
			double outputOdd = myArray[N / 2];
			System.err.println("\n" + outputOdd);
		}
	}
}
