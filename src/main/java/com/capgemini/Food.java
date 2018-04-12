package com.capgemini;

public class Food extends MenuItem {

    //Food inherits from MenuItem, but also has an Ingredient or a list of Ingredients.

    private Ingredient[] listOfIngredients;


    public Food(int newId, EMenuItem newItem, String newName, double newPrice, Ingredient[] newListOfIngredients) {
        super(newId, newItem, newName, newPrice);
        this.listOfIngredients = newListOfIngredients;
    }


    public Ingredient[] getListOfIngredients() {
        return listOfIngredients;
}

    public void setListOfIngredients(Ingredient[] listOfIngredients) {
        this.listOfIngredients = listOfIngredients;
    }

    public void printListOfIngredients() {
        System.out.println("Ingredients: ");
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
