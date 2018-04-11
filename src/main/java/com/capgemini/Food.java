package com.capgemini;

public class Food {

    private int foodId;
    private String foodName;
    private Ingredient[] ingredient;        //every food has a list of ingredients
    private Ingredient singleIngredient;


    //constructor that initialises a food wih a single ingredient (simpler version)
    public Food(int foodId, String foodName, Ingredient singleIngredient){
        this.foodId = foodId;
        this.foodName = foodName;
        this.singleIngredient = singleIngredient;
    }

    //constructor that initializes a food with a list of ingredients (more advanced)
    public Food(int foodId, String foodName, Ingredient[] ingredient){
        this.foodId = foodId;
        this.foodName = foodName;
        this.ingredient= ingredient;
    }


    //Getters and setters for Food

    public void setFoodId(int foodId){
        this.foodId = foodId;
    }

    public int getFoodId(){
        return foodId;
    }

    public void setFoodName(String setFoodName){
        this.foodName = foodName;
    }

    public String getFoodName(){
        return foodName;
    }

   //TODO: change this to make a list using a loop
    public void setIngredient(Ingredient[] ingredient){
        this.ingredient = ingredient;
    }

    public Ingredient[] getIngredient(){
        return ingredient;
    }

    public void setSingleIngredient(Ingredient singleIngredient){
        this.singleIngredient = singleIngredient;
    }

    public Ingredient getSingleIngredient(){
        return singleIngredient;
    }
}
