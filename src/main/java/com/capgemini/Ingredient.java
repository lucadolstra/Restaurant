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

    // carlijn
    public void setIngredientId (int i) {
        if (i > 0) {
            this.ingredientId = i;
        }
    }

    public int getIngredientId() {
        return ingredientId ;
    }
    public void setIngredientName (String str) {
        if(str != null && !str.isEmpty()) {
            this.ingredientName = str;
        }
    }

    public String getIngredientName() {
        return ingredientName ;
    }

    public void setIngredientGrams (int i) {
        if (i > 0) {
            this.ingredientGrams = i;
        }
    }

    public int getIngredientGrams() {
        return ingredientGrams ;
    }

    public void setIngredientPrice (float i) {
        if (i > 0) {
            this.ingredientPrice = i;
        }
    }

    public float getIngredientPrice() {
        return ingredientPrice;
    }



}
