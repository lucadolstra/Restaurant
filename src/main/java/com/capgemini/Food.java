package com.capgemini;

public class Food extends MenuItem {

    //Food inherits from MenuItem, but also has an Ingredient or a list of Ingredients.

    private Ingredient[] listOfIngredients;
    private Ingredient ingredient;

    public Food(int newId, EMenuItem newItem, String newName, double newPrice, Ingredient[] newListOfIngredients) {
        super(newId, newItem, newName, newPrice);
        this.listOfIngredients = newListOfIngredients;
    }
    public Food(int newId, EMenuItem newItem, String newName, double newPrice, Ingredient newIngredient) {
        super(newId, newItem, newName, newPrice);
        this.ingredient = newIngredient ;
    }


    public Ingredient[] getListOfIngredients() {
        return this.listOfIngredients;
    }

    @Override
    public void printMenuItem() {
        super.printMenuItem();
        System.out.println(getListOfIngredients());
    }


}
