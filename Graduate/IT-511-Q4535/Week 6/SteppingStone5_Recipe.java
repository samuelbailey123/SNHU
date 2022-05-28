package SteppingStones;

import java.util.Scanner;
import java.util.ArrayList;

public class SteppingStone5_Recipe {
    
    private String recipeName;
    private int servings;
    private ArrayList<String> recipeIngredients;
    private int totalRecipeCalories;

    public getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(ArrayList<String> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public getTotalRecipeCalories() {
        return totalRecipeCalories;
    }

    public void setTotalRecipeCalories(int totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public SteppingStone5_Recipe() {
        this.recipeName = "";
        this.servings = 0;
        this.recipeIngredients = new ArrayList<String>();
        this.totalRecipeCalories = 0;
        
    }
    public SteppingStone5_Recipe(String recipeName, int servings, 
    	ArrayList<String> recipeIngredients, double totalRecipeCalories) {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public void printRecipe() {
        int singleServingCalories = totalRecipeCalories / servings;
        System.out.println("Recipe: " + recipeName);
        System.out.println("Serves: " + servings);
        System.out.println("Ingredients: ");
        for (int i = 0; i < recipeIngredients.size(); i++) {
            System.out.println(recipeIngredients.get(i));
        }
        System.out.println("Each serving has " + singleServingCalories + " Calories.");
    }
    
    
    public static void main(String[] args) {
        int totalRecipeCalories = 0;
        ArrayList <String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");
        int servings = scnr.nextInt();
        
                
        do {
            System.out.println("Please enter the ingredient name 
                or type end if you are finished entering ingredients: ");
            String ingredientName = scnr.next();
            if (ingredientName.toLowerCase().equals("end")) {
                addMoreIngredients = false;
            } else {

                recipeIngredients.add(ingredientName);
        
                System.out.println("Please enter the ingredient amount: ");
                float ingredientAmount = scnr.nextFloat();
            
                System.out.println("Please enter the ingredient Calories: ");
                int ingredientCalories = scnr.nextInt();
                
                totalRecipeCalories += (ingredientCalories * ingredientAmount);
            
            }
           
       } while (!reply.equals("n") ;
        
        SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(recipeName, 
            servings, recipeIngredients, totalRecipeCalories);
        recipe1.printRecipe();
    }
}


/**
 * Final Project
 * 
 * For your Final Project:
 * 
 * 1. Modify this code to develop a Recipe class:
 *	a. change the void main method createNewRecipe() that returns a Recipe 
 * 	 
 * 2. FOR FINAL SUBMISSION ONLY:Change the ArrayList type to an 
 *		Ingredient object.  When a user adds an ingredient to the recipe, 
 * 		instead of adding just the ingredient name, you will be adding the 
 *		actual ingredient including name, amount, measurement type, calories.
 *	For the Milestone Two submission, the recipeIngredients ArrayList can
 *	remain as a String type.
 *
 * 3. Adapt the printRecipe() method to print the amount and measurement
 * 	type as well as the ingredient name.
 *
 * 4. Create a custom method in the Recipe class. 
 *      Choose one of the following options:
 *
 * 	a. print out a recipe with amounts adjusted for a different 
 * 		number of servings
 * 
 * 	b. create an additional list or ArrayList that allow users to 
 * 		insert step-by-step recipe instructions
 *
 * 	c. conversion of ingredient amounts from 
 * 		English to metric (or vice versa)
 *
 * 	d. calculate select nutritional information 
 *
 * 	e. calculate recipe cost
 * 
 *      f. propose a suitable alternative to your instructor
 * 
 */ 

