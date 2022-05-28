/**
 * @author samuel bailey
 **/

package final_assignment; 

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Create a new Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Create a new Recipe object
        Recipe recipe = new Recipe();
        
        // Prompt the user to enter the recipe name
        System.out.print("Enter the recipe name: ");
        
        // Read the recipe name from the keyboard
        String recipeName = keyboard.nextLine();
        
        // Set the recipe name
        recipe.setRecipeName(recipeName);
        
        // Prompt the user to enter the number of servings
        System.out.print("Enter the number of servings: ");
        
        // Read the number of servings from the keyboard
        int servings = keyboard.nextInt();
        
        // Set the number of servings
        recipe.setServings(servings);
        
        // Prompt the user to enter the recipe ingredients
        System.out.print("Enter the recipe ingredients: ");
        
        // Read the recipe ingredients from the keyboard
        String recipeIngredients = keyboard.nextLine();
        
        // Set the recipe ingredients
        recipe.setRecipeIngredients(recipeIngredients);
        
        // Prompt the user to enter the total recipe calories
        System.out.print("Enter the total recipe calories: ");
        
        // Read the total recipe calories from the keyboard
        int totalRecipeCalories = keyboard.nextInt();
        
        // Set the total recipe calories
        recipe.setTotalRecipeCalories(totalRecipeCalories);
        
        // Print the recipe
        recipe.printRecipe();
        
        // Close the keyboard/scanner
        keyboard.close();
    }
}