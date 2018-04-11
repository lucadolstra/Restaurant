package com.capgemini;

public class Food {

    private int foodId;
    private EFood foodName;
    private EIngredient ingredientName;        //every food has a list of ingredients


    //constructor that initialises a food wih a single ingredient (simpler version)
    public Food(int foodId, EFood foodName, EIngredient ingredientName) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.ingredientName = ingredientName;
    }


    //Getters and setters for Food

    //public void setFoodId(int foodId) {
    //    this.foodId = foodId;
    //}

    public int getFoodId() {
        return this.foodId;
    }

    //public void setFoodName(EFood setFoodName) {
    //    this.foodName = foodName;
    //}

    public EFood getFoodName() {
        return this.foodName;
    }

    //TODO: change this to make a list using a loop
    //public void setIngredient(EIngredient ingredientName) {
    //    this.ingredientName = ingredientName;
    //}

    public EIngredient getIngredient() {
        return this.ingredientName;
    }

}
