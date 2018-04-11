package com.capgemini;

public class Food extends MenuItem {

    private Ingredient[] listOfIngredients;

    public Food(int newId, String newName, double newPrice, Ingredient[] newListOfIngredients) {
        super(newId, newName, newPrice);
        this.listOfIngredients = newListOfIngredients;
    }

    public Ingredient[] getListOfIngredients(){
        return this.listOfIngredients;
    }

    @Override
    public void printMenuItem() {
        super.printMenuItem();
        System.out.println(getListOfIngredients());
    }


    //    private int foodId;
//    private EMain foodName;
//    private EIngredient ingredientName;        //every food has a list of ingredients
//
//
//    //constructor that initialises a food wih a single ingredient (simpler version)
//    public Food(int foodId, EMain foodName, EIngredient ingredientName) {
//        this.foodId = foodId;
//        this.foodName = foodName;
//        this.ingredientName = ingredientName;
//    }
//
//
//    //Getters and setters for Food
//
//    //public void setFoodId(int foodId) {
//    //    this.foodId = foodId;
//    //}
//
//    public int getFoodId() {
//        return this.foodId;
//    }
//
//    //public void setFoodName(EMain setFoodName) {
//    //    this.foodName = foodName;
//    //}
//
//    public EMain getFoodName() {
//        return this.foodName;
//    }
//
//    //TODO: change this to make a list using a loop
//    //public void setIngredient(EIngredient ingredientName) {
//    //    this.ingredientName = ingredientName;
//    //}
//
//    public EIngredient getIngredient() {
//        return this.ingredientName;
//    }

}
