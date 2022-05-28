/*
@authoer Samuel Bailey
 */
package SteppingStones;

import java.util.Scanner;


public class SteppingStone3_Branches {
    
    public static void main(String[] args) {
        int numberCups = -1;
        final int MAX_CUPS = 100;
        
       
       Scanner scnr = new Scanner(System.in);
       
       System.out.println("Please enter the number of cups (between 1 and 100): ");
       if (scnr.hasNextInt()) {
           numberCups = scnr.nextInt();
           if (numberCups <= MAX_CUPS){
               System.out.println(numberCups + " is a valid number of cups!");
           }
           else{
               System.out.println(numberCups + " is not a valid number of cups!");
               System.out.println("Please enter a number between 1 and 100.");
               numberCups = scnr.nextInt();
               if (numberCups <= MAX_CUPS){
                   System.out.println(numberCups + " is a valid number of cups!");
               }else if (numberCups < 1){
                   System.out.println(numberCups + " is less than 1. Sorry you are out of attempts.");
               }else{
                   System.out.println(numberCups + " is greater than 100. Sorry you are out of attempts.");
               }
           }
           }     
           }
       } else {
           System.out.println("Error: That is not a number. Try again.");
       }
    }
}

/**
 * 
 * For your Final Project, adapt your Ingredient java file to include
 * data-type validation steps for each of the variables in the class:
 * 
 * ingredientName (String)
 * ingredientAmount (float)
 * unitMeasurment (String)
 * number of Calories (double)
 * 
 */ 
