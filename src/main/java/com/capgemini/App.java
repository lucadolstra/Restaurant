package com.capgemini;

/*
Restaurant application
*/

public class App
{

    //right now, we print ingredients.
    //todo redo the structure: Menu has a Food, a Food has Ingredients.

    public static void main( String[] args )
    {
        Ingredient listingredients = new Ingredient(1, "pasta");
        System.out.println(listingredients.getIngredient());

    }
}