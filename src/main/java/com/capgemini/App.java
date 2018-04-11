package com.capgemini;

/*
Restaurant application
*/

public class App
{
    private MenuItem menuItem;

    //right now, we print ingredients.
    //todo redo the structure: MenuItem has a Food, a Food has Ingredients.

    public static void main( String[] args )
    {
        MenuItem menuItem = new MenuItem(1, EDrink.Beer, 5);



//        Ingredient ingredient1 = new Ingredient(EIngredient.Basil, 15, 200, 1.59f);
//        //System.out.println(ingredient1.getIngredient());
//
//        Food food1 = new Food(1,EMain.Kebap, EIngredient.Pepper);
//
//        Drink drink1 = new Drink(14, EDrink.Beer);
//
//        MenuItem menuItem = new MenuItem(1, "pagaplus Restaurant", food1, drink1);
//
//        System.out.println("This is the menuItem of " + menuItem.getMenuName());
//        System.out.println("******************");
//
//        System.out.println("These are the dishes of the menuItem: ");
//        System.out.println(food1.getFoodId() + " "  + food1.getFoodName());
//        System.out.println("******************");
//
//        System.out.println("These are the ingredients of "+ food1.getFoodName());
//        System.out.println(ingredient1.getIngredientId() + " " + ingredient1.getIngredientName());
//        System.out.println("******************");
//
//        System.out.println("These are the drinks of the menuItem");
//        System.out.println(drink1.getDrinkId() +" "+ drink1.getDrinkName());
//        System.out.println("******************");
//
//
//
//
}