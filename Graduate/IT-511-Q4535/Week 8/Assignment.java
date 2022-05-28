package SteppingStones;

import java.util.ArrayList;

public class SteppingStone6_RecipeBox {
	
	private ArrayList<SteppingStone6_Recipe> listOfRecipes;
    
	public ArrayList<SteppingStone6_Recipe> getListOfRecipes() {
		return listOfRecipes;
	}

	public SteppingStone6_RecipeBox() {
		listOfRecipes = new ArrayList<SteppingStone6_Recipe>();
	}
	 
	public void printAllRecipeDetails(SteppingStone6_Recipe selectedRecipe) {
		selectedRecipe.printRecipe();
	}

	public void printAllRecipeNames() {
		for (SteppingStone6_Recipe recipe : listOfRecipes) {
			System.out.println(recipe.getRecipeName());
		}
	}
	  
	public void addRecipe(SteppingStone6_Recipe tmpRecipe) {
		listOfRecipes.add(tmpRecipe);
	}

	//new menu item
	public void addMenuItem(SteppingStone6_Recipe selectedRecipe, SteppingStone6_MenuItem tmpMenuItem) {
		selectedRecipe.addMenuItem(tmpMenuItem);
	}

	//get an item from the menu
	public void getMenuItems(SteppingStone6_Recipe selectedRecipe) {
		selectedRecipe.getMenuItems();
	}
	
	public statis main(String[] args) {
		SteppingStone6_RecipeBox recipeBox = new SteppingStone6_RecipeBox();
    		
        Scanner menuScnr = new Scanner(System.in);
        
		
		
		// Print a menu for the user to select one of the three options:
		
		
		System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
            System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
            int input = menuScnr.nextInt();
            
			/**
			* The code below has two variations:
			* 	1. Code used with the SteppingStone6_RecipeBox_tester.
			*	2. Code used with the public static main() method
			*
			* One of the sections should be commented out depending on the use. 
			*/
			
			/**
			* This could should remain uncommented when using the
			* SteppingStone6_RecipeBox_tester.
			* 
			* Comment out this section when using the
			*		public static main() method
			*/
			
			if (input == 1) {
                newRecipe();
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                printAllRecipeDetails(selectedRecipeName);
            } else if (input == 3) {
                
				
				for (int j = 0; j < listOfRecipes.size(); j++) { 
                    System.out.println((j + 1) + ": " + listOfRecipes.get(j).getRecipeName()); 
                }
            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }
            
			/**
			* This could should be uncommented when using the
			* 		public static main() method
			* 
			* Comment out this section when using the
			* 		SteppingStone6_RecipeBox_tester.
			*		
			
			
			if (input == 1) {
                myRecipeBox.newRecipe();
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                myRecipesBox.printAllRecipeDetails(selectedRecipeName);
            } else if (input == 3) {		
				for (int j = 0; j < myRecipesBox.listOfRecipes.size(); j++) { 
                    System.out.println((j + 1) + ": " + myRecipesBox.listOfRecipes.get(j).getRecipeName());
				}
            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }
			
			*
			*/
			
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
		}   
	}
}
