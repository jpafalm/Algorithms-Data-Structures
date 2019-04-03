
/*
    Java program to find compound interest for given values. 
    
    @author Joao Pedro Affonso de Almeida 
    @author 18145957
    @version 11/12/2018

*/

import java.util.Scanner;

public class Lab10_InterestRecursion {
    public static void main(String args[]) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int y = myscanner.nextInt();
        System.out.print("Enter the interest rate: ");
        double i = myscanner.nextDouble();
        System.out.print("Enter the account balance: ");
        double x = myscanner.nextDouble();
        System.out.println(String.format("%.2f", compound(y, i, x)));
    }

    public static double compound(int y, double i, double x) {

        // formula of the factor (to calculate interest)
        double factor = 1 + (i / 100);

        // year will decrement one each time
        int one = y - 1;

        // interest rate keeps the same all the methods
        double two = i;

        // the account worth so far
        double three = x;

        // two base cases
        // year reaches 0 it will return the previous year
        if (y == 0)
            return x;

        // year reaches 1 multiplies the amount to factor
        if (y == 1) {
            return three * factor;
        }

        // it will do the recursion
        else
            return (factor * compound(one, two, three));
    }
}