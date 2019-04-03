
/*
    Create a program that calculates the chance of all students from a class having 
    the same birthday, using recursive method.
    
    With one person, the chance of all people having different birthdays is 100%
    (obviously). If you add a second person, that person has  a 364/365 chance of
    also having a distinct birthday. When you add a third person, that person has
    a 363/365 chance of having a birthday  distinct from the previous two. So as
    you keep adding more people, you keep track of the total chance of everyone
    having a distinct birthday by multiplying your current chance by (365-i)/365
    for each new person.

    @author Joao Pedro Affonso de Almeida 
    @author 18145957
    @version 11/12/2018
*/

import java.util.Scanner;

public class Lab10_BirthdayRecursion {
    public static void main(String args[]) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = myscanner.nextInt();
        System.out.printf("Same birthday chance: " + String.format("%.3f", (1 - birthday(n))));
    }

    public static double birthday(int n) {
        // fill in the recursive birthday method
        // x is the n decremented
        int x = n - 1;
        // here we use the formula (using the value of n) and set the result to the value
        double value = (365d - n + 1) / 365d;
        // here is the case when the n is equal 1 (100 percent) and n is 0 (Final case)
        // which is hundred percent as well
        if (n == 1 || n == 0) {
            return 1;

        } else {
            // here we return the value and recursively return it in the method
            return (value * birthday(x));
        }
    }
}
