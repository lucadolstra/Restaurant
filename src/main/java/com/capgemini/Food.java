package com.capgemini;

public class Food {

    private int foodId;
    private String foodName;
    private Ingredient[] ingredient;        //every food has a list of ingredients
    private Ingredient singleIngredient;


    //constructor that initialises a food wih a single ingredient (simpler version)
    public void Food(int foodId, String foodName, Ingredient singleIngredient){
        this.foodId = foodId;
        this.foodName = foodName;
        this.singleIngredient = singleIngredient;
    }

    //constructor that initializes a food with a list of ingredients (more advanced)
    public void Food(int foodId, String foodName, Ingredient[] ingredient){
        this.foodId = foodId;
        this.foodName = foodName;
        this.ingredient= ingredient;
    }


    //todo: create a get function getFood, where we create a food, just like in Ingredients.
    //however: here we want an array of inredients as well. Use a loop for this.
}
