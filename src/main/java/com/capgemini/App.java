package com.capgemini;

/*
Restaurant application
*/

import java.sql.SQLOutput;

public class App
{
    private Menu menu;

    //right now, we print ingredients.
    //todo redo the structure: Menu has a Food, a Food has Ingredients.

    public static void main( String[] args )
    {
        Ingredient ingredient1 = new Ingredient(EIngredient.Basil, 15, 200, 1.59f);
        //System.out.println(ingredient1.getIngredient());

        Food food1 = new Food(1,EFood.Kebap, EIngredient.Pepper);

        Drink drink1 = new Drink(14, EDrink.Beer);

        Menu menu = new Menu(1, "pagaplus Restaurant", food1, drink1);

        System.out.println("This is the menu of " + menu.getMenuName());
        System.out.println("******************");

        System.out.println("These are the dishes of the menu: ");
        System.out.println(food1.getFoodId() + " "  + food1.getFoodName());
        System.out.println("******************");

        System.out.println("These are the ingredients of "+ food1.getFoodName());
        System.out.println(ingredient1.getIngredientId() + " " + ingredient1.getIngredientName());
        System.out.println("******************");

        System.out.println("These are the drinks of the menu");
        System.out.println(drink1.getDrinkId() +" "+ drink1.getDrinkName());
        System.out.println("******************");



    }
}