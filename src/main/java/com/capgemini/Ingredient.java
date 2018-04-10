package com.capgemini;

public class Ingredient {

    private int ingredientId;
    private String ingredientName;


    // Constructor that makes sure we add an id and a name for every ingredient we make

    public Ingredient(int ingredientId, String ingredientName) {
        this.ingredientId = ingredientId;
        this.ingredientName = ingredientName;

    }

    //get an ingredient
    public String getIngredient() {
        return ingredientId + " " + ingredientName;
    }


}
