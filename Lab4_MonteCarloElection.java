
/*    
    Given the election odds from https://www.paddypower.com/politics, 
    calculate what are the probabilities for each of the politicians being  elected. 
    You should use the Monte Carlo Method.
   
    Source: http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/07/compute-pi.html
   
    @author Joao Pedro Affonso de Almeida 
    @author 18145957
    @version 22/10/2018 
*/

import java.util.*;

public class Lab4_MonteCarloElection {
  public static void main(String[] args) {
    int nElection = 0; // election counter
    double nSuccess = 0; // success counter

    double x; // it will latter generate a ramdom number to target the vote in a candidate

    for (int i = 1; i <= 100; i++) // 100 Election simulations
    {
      nElection++; // elections counter
      // each election every candidate start with 0 votes each
      // odds from https://www.paddypower.com/politics
      double michaelVotes = 0; // P=(89%); (x>0.0 && x<=89.0)
      double seanVotes = 0; // P(4.3%); (x>89.0 && x<=93.3)
      double liadhVotes = 0; // P(2.7%); (x>93.3 && x<=96.0)
      double peterVotes = 0; // P(2.2%); (x>96.0 && x<=98.2)
      double joanVotes = 0; // P(0.9%); (x>98.2 && x<=99.1)
      double gavinVotes = 0; // P(0.9%); (x>99.1 && x<=100.0)

      for (int j = 0; j < 3000000; j++) // vote simulation: 1 Election = 3000000 people voting
      {
        x = (double) (Math.random() * (100.0)); // choose a ramdom x number

        if (x > 0.0 && x <= 89.0) {
          michaelVotes++;
        }

        else if (x > 89.0 && x <= 93.3) {
          seanVotes++;
        }

        else if (x > 93.3 && x <= 96.0) {
          liadhVotes++;
        }

        else if (x > 96.0 && x <= 98.2) {
          peterVotes++;
        }

        else if (x > 98.2 && x <= 99.1) {
          joanVotes++;
        }

        else if (x > 99.1 && x <= 100.0) {
          gavinVotes++;
        }
      }

      if ((michaelVotes > seanVotes) && (seanVotes > liadhVotes) && (liadhVotes > peterVotes)
          && (peterVotes > joanVotes) && (joanVotes > gavinVotes)) {
        nSuccess++;
        System.out.println(nElection + ": List Match!");
      } else {
        System.out.println(nElection + ": List Doesn't Match!");
      }
    }

    double p = nSuccess / nElection; // probability of the election to endup in the order above, for n election
                                     // simulation
    System.out
        .println("\n" + "Success: " + nSuccess + "\nElections: " + nElection + "\nPROBABILITY = " + (p * 100.0) + " %");
  }
}