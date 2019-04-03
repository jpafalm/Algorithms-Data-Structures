
/*
    Program to show how many time we need to roll a dice in order to get a number 6 while bitcoin is mined.
    Monte Carlo priciple was used to solve this problem.
    
    @author Joao Pedro Affonso de Almeida 
    @author 18145957
    version 11/12/2018
*/


import java.util.*;

public class Lab11_MonteCarloDice {
    public static void main(String[] args)
   	{
   		
      int nGetSix = 0; // number of times we get '6'                                       
   	 	int nRollsTotal = 0; // rolls counter
   	 	int time = 0; // time counter

   	 	int dice = 0; // result of rolling the dice

   	 	for(int i=1; i<=1000000; i++) // 1000000 dice rolls.  
     {
     	nRollsTotal++;
     	time = nRollsTotal*3; // supposing it takes 3s to roll a dice
   		dice = (int) (6*Math.random()+1); // roll the dice

   		if (dice == 6 && time%600==0) // check if we get the number 6 while the bit coin is mined (600 s)
     {
        nGetSix++; // number of times I am getting 6 while a bitcoin is mined
   		}
   }
   	
        System.out.println("Number of rolls: " + nRollsTotal);
        System.out.println("Got Number six while one bit coin is mined: " + nGetSix);
        System.out.println("Rolls needed to get 6 while a bit coin is mined:  " + (double)nRollsTotal/(double)nGetSix);
     }
}