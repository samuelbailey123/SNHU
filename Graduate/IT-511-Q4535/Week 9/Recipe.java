package final_assignment;

import java.util.Scanner;
import java.util.ArrayList;

public class Assignment_Recipe {
    
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
    
    public Assignment_Recipe() {
        this.recipeName = "";
        this.servings = 0;
        this.recipeIngredients = new ArrayList<String>();
        this.totalRecipeCalories = 0;
        
    }
    public Assignment_Recipe(String recipeName, int servings, 
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
    
    public void printRecipeWithServings(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many servings would you like to make?");
        int servings = keyboard.nextInt();
        int singleServingCalories = totalRecipeCalories / servings;
        System.out.println("Recipe: " + recipeName);
        System.out.println("Serves: " + servings);
        System.out.println("Ingredients: ");
        for (int i = 0; i < recipeIngredients.size(); i++) {
            System.out.println(recipeIngredients.get(i));
        }
        System.out.println("Each serving has " + singleServingCalories + " Calories.");
    }
    
    public void createNewRecipe() {
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
        
        Assignment_Recipe recipe1 = new Assignment_Recipe(recipeName, 
            servings, recipeIngredients, totalRecipeCalories);
        recipe1.printRecipe();
    }
}
