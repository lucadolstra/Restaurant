package com.capgemini;

/*
Restaurant application
*/

public class App {

    //instantiates a Drink and a Food

    public static void main(String[] args) {

        Ingredient garlic = new Ingredient(1,"garlic", 100, 2);
        Ingredient salt = new Ingredient(2, "salt", 22, 1);
        Ingredient oil = new Ingredient(3, "oil", 78, 3);
        Ingredient cream = new Ingredient(4, "cream", 1500, 55);


        //Menu is instantiated with a id, an ENum, name, price and Ingredients array
        MenuItem soup = new Food(1, EMenuItem.Starter, "soup", 2, new Ingredient[] {garlic, salt});
        MenuItem pizza = new Food(2, EMenuItem.Main, "pizza", 3, new Ingredient[] {cream});
        MenuItem tiramisu = new Food(3, EMenuItem.Desert, "tiramisu", 8, new Ingredient[]{garlic, oil, cream});
        MenuItem water = new Drink(4, EMenuItem.Drink, "water", 2);

        //Instantiates a menu
        Menu menu = new Menu(new MenuItem[] {soup, pizza, tiramisu, water});

        // A menu is created with a list of menu items, you need to add menu items after the MenuItem[]

        System.out.println("***Menu****");
        System.out.println();

        // The menu is printed here. See Class menu for all details.
        menu.printMenuItemList();



    }
}