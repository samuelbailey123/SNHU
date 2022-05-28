// @author Samuel Bailey

package SteppingStones;

import java.util.Scanner;

public class SteppingStone2_IngredientCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Assign the following variables with the appropriate data type and value:
         * 
         * VARIABLE NAME VALUE
         * 
         * nameOfIngredient ""
         * numberCups 0.0
         * numberCaloriesPerCup 0
         * totalCalories 0.0
         * 
         */

        // vars
        String nameOfIngredient = "";
        double numberCups = 0.0;
        int numberCaloriesPerCup = 0;
        double totalCalories = 0.0;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the name of the ingredient: ");
        nameOfIngredient = scnr.next();

        System.out.println("Please enter the number of cups of "
                + nameOfIngredient + " we'll need: ");
        numberCups = scnr.nextFloat();

        System.out.println("Please enter the name of calories per cup: ");
        numberCaloriesPerCup = scnr.nextInt();

        /**
         * Write an expression that multiplies the number of cups
         * by the Calories per cup.
         * Assign this value to totalCalories
         */
        totalCalories = numberCups * numberCaloriesPerCup;

        System.out.println(nameOfIngredient + " uses " + numberCups
                + " cups and has " + totalCalories + " calories.");

    }

}
