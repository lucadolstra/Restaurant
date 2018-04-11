package com.capgemini;

/*
Restaurant application
*/

public class App {
    private MenuItem menuItem;

    //right now, we print ingredients.
    //todo redo the structure: MenuItem has a Food, a Food has Ingredients.

    public static void main(String[] args) {
        System.out.println("***Menu****");
        System.out.println();

        Drink drink = new Drink(1, EMenuItem.Drink, "Carlsberg", 2);
        drink.printMenuItem();


    }
}