package com.capgemini;

public class Food extends MenuItem {

    private Ingredient[] listOfIngredients;

    public Food(int newId, EMenuItem newItem, String newName, double newPrice, Ingredient[] newListOfIngredients) {
        super(newId, newItem, newName, newPrice);
        this.listOfIngredients = newListOfIngredients;
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
