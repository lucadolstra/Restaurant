package com.capgemini;

/*
Restaurant application
*/

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class App {

    //instantiates a Drink and a Food

    public static void main(String[] args) {


        MenuItem soup = new Food(1, EMenuItem.Starter, "soup", 2, new EIngredient[] {EIngredient.Garlic});
        MenuItem dish = new Food(2, EMenuItem.Main, "more soup", 3, new EIngredient[] {EIngredient.Love});
        MenuItem tiramisu = new Food(3, EMenuItem.Desert, "tiramisu", 8, new EIngredient[]{EIngredient.Cream, EIngredient.Cringe});
        MenuItem water = new Drink(4, EMenuItem.Drink, "water", 2);

       // MenuItem[] menuItems = new MenuItem[] {soup, dish, tiramisu, water} ;

        Menu menu = new Menu(new MenuItem[] {soup, dish, tiramisu, water});

        System.out.println("***Menu****");
        System.out.println();

        menu.printMenuItemList();



    }
}