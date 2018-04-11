package com.capgemini;

public class Food extends MenuItem {

    //Food inherits from MenuItem, but also has an Ingredient or a list of Ingredients.

    private Ingredient[] listOfIngredients;

    public Food(int newId, EMenuItem newItem, String newName, double newPrice, Ingredient[] newListOfIngredients) {
        super(newId, newItem, newName, newPrice);
        this.listOfIngredients = newListOfIngredients;
    }

    public Food(int newId, EMenuItem newItem, String newName, double newPrice, Ingredient newIngredient) {
        super(newId, newItem, newName, newPrice);

        // maak een Ingredient array aan met size 1
        Ingredient[] ingredients = new Ingredient[1];

        // voeg het ingredient toe aan de nieuwe array
        ingredients[0] = newIngredient;

        // set de array op this.listOfIngredients
        this.listOfIngredients = ingredients;
    }


    public void printListOfIngredients() {
        for (Ingredient currentIngredient : this.listOfIngredients ) {
            System.out.println(currentIngredient.getIngredientName());
        }
    }

    @Override
    public void printMenuItem() {
        super.printMenuItem();
        printListOfIngredients();
    }


}
