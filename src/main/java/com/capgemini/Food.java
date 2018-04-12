package com.capgemini;

public class Food extends MenuItem {

    //Food inherits from MenuItem, but also has an Ingredient or a list of Ingredients.

    private EIngredient[] listOfIngredients;


    public Food(int newId, EMenuItem newItem, String newName, double newPrice, EIngredient[] newListOfIngredients) {
        super(newId, newItem, newName, newPrice);
        this.listOfIngredients = newListOfIngredients;
    }


    public EIngredient[] getListOfIngredients() {
        return listOfIngredients;
}

    public void setListOfIngredients(EIngredient[] listOfIngredients) {
        this.listOfIngredients = listOfIngredients;
    }

    public void printListOfIngredients() {
        System.out.println("Ingredients: ");
        for (EIngredient currentIngredient : this.listOfIngredients ) {
            System.out.println(currentIngredient);
        }
    }

    @Override
    public void printMenuItem() {
        //super.printMenuItem();
        printListOfIngredients();
    }


}
