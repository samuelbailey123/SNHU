package SteppingStones;

import java.util.ArrayList;

public class Assignment_RecipeTest {

	/**
 	* @param args the command line arguments
 	*/
	public static void main(String[] args) {
		// Create two recipe objects first
		Assignment_Recipe myFirstRecipe = new Assignment_Recipe();
		ArrayList<Ingredient> recipeIngredients = new ArrayList(); 
		ArrayList<Ingredient> recipeIngredientsTwo = new ArrayList(); 
		String ingredientName = "Anchovies";
		Ingredient tempIngredient = new Ingredient().addNewIngredient(ingredientName);
		recipeIngredients.add(tempIngredient);
      
    	Assignment_Recipe mySecondRecipe = new Assignment_Recipe("Pizza", 2, recipeIngredients, 300);
   	 
    	// Initialize first recipe
		String ingredientNameTwo = "Noodles";
		Ingredient tempIngredientTwo = new Ingredient().addNewIngredient(ingredientNameTwo);
		recipeIngredientsTwo.add(tempIngredientTwo);

    	myFirstRecipe.setRecipeName("Ramen");
    	myFirstRecipe.setServings(2);
    	myFirstRecipe.setRecipeIngredients(recipeIngredientsTwo);
    	myFirstRecipe.setTotalRecipeCalories(150);
   	 
    	// Print details of both recipes
    	myFirstRecipe.printRecipe();
    	mySecondRecipe.printRecipe();
	}
    
}
