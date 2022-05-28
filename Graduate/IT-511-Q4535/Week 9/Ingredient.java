package final_assignment;

import java.util.Scanner; 

public class Ingredient {
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

    public Ingredient(String name, double amount, String unitOfMeasure, int calories) {
        this.name = name;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
        this.calories = calories;
    }

    public Ingredient() {
        this.name = "";
        this.amount = -1;
        this.unitOfMeasure = "";
        this.calories = -1;
    }
}
