package com.capgemini;

public class Ingredient {

    private int ingredientId;
    private String ingredientName;
    private int ingredientGrams;
    private float ingredientPrice;


    // Constructor that makes sure we add an id and a name for every ingredient we make

    public Ingredient(int ingredientId, String ingredientName, int ingredientGrams, float ingredientPrice) {
        this.setIngredientId(ingredientId);
        this.setIngredientName(ingredientName);
        this.setIngredientGrams(ingredientGrams);
        this.setIngredientPrice(ingredientPrice);
    }

    //get an ingredient
    public String getIngredient() {
        return ingredientId + " " + ingredientName;
    }


    // getters and setters

    // carlijn
    // update by luca: changed names of local variables
    public void setIngredientId (int ingredientId) {
            this.ingredientId = ingredientId;
    }

    public int getIngredientId() {
        return ingredientId ;
    }

    //Luca: change if to a catch - try
    public void setIngredientName (String ingredientName) {
        if(ingredientName != null && !ingredientName.isEmpty()) {
            this.ingredientName = ingredientName;
        }
    }

    public String getIngredientName() {
        return ingredientName ;
    }

    //TODO: luca : change if statement to Try Catch
    public void setIngredientGrams (int ingredientGrams) {
        if (ingredientGrams > 0) {
            this.ingredientGrams = ingredientGrams;
        }
    }

    public int getIngredientGrams() {
        return ingredientGrams ;
    }

    public void setIngredientPrice (float ingredientPrice) {
        if (ingredientPrice > 0) {
            this.ingredientPrice = ingredientPrice;
        }
    }

    public float getIngredientPrice() {
        return ingredientPrice;
    }



}
