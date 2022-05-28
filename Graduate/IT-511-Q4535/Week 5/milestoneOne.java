package ingredientList;

import java.util.Scanner; 

public class RecipeItem { //class 
    public static void main(String[] args){// main method

        Scanner scnr = new Scanner(System.in); //scanner
        Collection ingredients = new Collection(); //collection
        System.out.println("Welcome to the recipe list!");
        System.out.println("Please enter the name of the ingredient: ");
        String ingredientName = scnr.nextLine(); //recipe name
        if (ingredientName.equals("")){ //if name is empty
            System.out.println("Name cannot be empty.");
            ingredientName = scnr.nextLine();
        }
        System.out.println("Please enter the amount for " + ingredientName + ": ");
        String amount = scnr.nextLine(); //ingredients list
        if (amount.equals("")){ //if ingredients list is empty
            System.out.println("Amount cannot be empty.");
            amount = scnr.nextLine();
        }
        System.out.println("Please enter the unit for " + ingredientName + ": ");
        String unit = scnr.nextLine(); //unit
        if (unit.equals("")){ //if unit is empty
            System.out.println("Unit cannot be empty.");
            unit = scnr.nextLine();
        }
        System.out.println("Please enter the calories for " + ingredientName + ": ");
        String calories = scnr.nextLine(); //calories
        if (calories.equals("")){ //if calories is empty
            System.out.println("Calories cannot be empty.");
            calories = scnr.nextLine();
        }

        ingredients.setName(ingredientName); //set name
        ingredients.setAmount(amount); //set amount
        ingredients.setUnitOfMeasure(unit); //set unit
        ingredients.setCalories(calories); //set calories

    }
}

public class Collection {
    //vars
    String name; 
    double amount; 
    String unitOfMeasure;
    int calories;

    //setters and getters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public Collection(String name, double amount, String unitOfMeasure, int calories) {
        this.name = name;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
        this.calories = calories;
    }

    public Collection() {
        this.name = "";
        this.amount = -1;
        this.unitOfMeasure = "";
        this.calories = -1;
    }
}
