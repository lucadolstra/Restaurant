package com.capgemini;

/*
Restaurant application
*/

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class App {

    //instantiates a Drink and a Food

    public static void main(String[] args) {
//        IngredientController ing = new IngredientController();
//
//        ing.printIngredient();
//        ing.printListOfIngredients();

        MenuItemController menuItem = new MenuItemController();
//        menu.printSingleMenuItem();
        menuItem.printMenuItem();


//
//
//        //Menu is instantiated with a id, an ENum, name, price and Ingredients array
//

//
//        //Instantiates a menu
//        Menu menu = new Menu(new MenuItem[] {soup, pizza, tiramisu, water});
//
//        // A menu is created with a list of menu items, you need to add menu items after the MenuItem[]
//
//        System.out.println("***Menu****");
//        System.out.println();
//
//        // The menu is printed here. See Class menu for all details.
//        menu.printMenuItemList();
//
//
//
//
//        //Instatiate an order
//

//
//        System.out.println("**Order****");
//        System.out.println("");
//
//        OrderController orderController = new OrderController(orderList);
//
//        orderController.printOrderList();
//
//

    }
}