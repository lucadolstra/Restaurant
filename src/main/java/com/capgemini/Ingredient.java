package com.capgemini;

public class Ingredient {

    private int ingredientId;
    private String ingredientName;
    private int ingredientGrams;
    private double ingredientPrice;

    public Ingredient(String ingredientName, int ingredientId, int ingredientGrams, double ingredientPrice) {
        this.ingredientId = ingredientId;
        this.ingredientName = ingredientName;
        this.ingredientGrams = ingredientGrams;
        this.ingredientPrice = ingredientPrice;
    }

    //get an ingredient
    public String getIngredient() {
        return ingredientId + " " + ingredientName;
    }


    //getters and setters

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public void setIngredientGrams(int ingredientGrams) {
        this.ingredientGrams = ingredientGrams;
    }

    public void setIngredientPrice(double ingredientPrice) {
        this.ingredientPrice = ingredientPrice;
    }



    public int getIngredientId() {
        return ingredientId;
    }


    public String getIngredientName() {
        return ingredientName;
    }

    public int getIngredientGrams() {
        return ingredientGrams;
    }

    public double getIngredientPrice() {
        return ingredientPrice;
    }


}
