package com.capgemini;

/*
Restaurant application
*/

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class App {

    //instantiates a Drink and a Food

    public static void main(String[] args) {

        Ingredient garlic = new Ingredient(1,"garlic", 100, 2);
        Ingredient salt = new Ingredient(2, "salt", 22, 1);
        Ingredient oil = new Ingredient(3, "oil", 78, 3);
        Ingredient cream = new Ingredient(4, "cream", 60, 55);
        Ingredient meat = new Ingredient(5, "meat", 300, 10);
        Ingredient tomato = new Ingredient(6, "tomato", 50, 5.5);
        Ingredient sugar = new Ingredient(7, "sugar", 50, 1.2);
        Ingredient pepper = new Ingredient(8, "pepper", 5, 0.02);
        Ingredient dough = new Ingredient(9, "dough", 250, 1.1);
        Ingredient pasta = new Ingredient(10, "pasta", 220, 1.3);


        //Menu is instantiated with a id, an ENum, name, price and Ingredients array

        MenuItem soup = new Food(1, EMenuItem.Starter, "soup", 10, new Ingredient[] {garlic});
        MenuItem pizza = new Food(2, EMenuItem.Main, "pizza", 3, new Ingredient[] {dough});
        MenuItem tiramisu = new Food(3, EMenuItem.Desert, "tiramisu", 8, new Ingredient[]{sugar, oil, cream});
        MenuItem water = new Drink(4, EMenuItem.Drink, "water", 2);
        MenuItem lasagna = new Food(5, EMenuItem.Main, "lasagna", 5, new Ingredient[] {dough, salt, oil, tomato, pepper});
        MenuItem pastaBolognese = new Food(6, EMenuItem.Main, "pastaBolognese", 3, new Ingredient[] {pasta, oil, salt, pepper, tomato});
        MenuItem ceaserSalad = new Food(7, EMenuItem.Starter, "ceaserSalad", 8, new Ingredient[]{meat, oil, salt, pepper});
        MenuItem burger = new Food(8, EMenuItem.Main, "burger", 2, new Ingredient[] {meat,salt,pepper, oil});
        MenuItem fragolo = new Food(9, EMenuItem.Starter, "fragolo", 2, new Ingredient[] {sugar, dough, cream});
        MenuItem beer = new Drink(10, EMenuItem.Drink, "beer", 3);

        //Instantiates a menu
        Menu menu = new Menu(new MenuItem[] {soup, pizza, tiramisu, water});

        // A menu is created with a list of menu items, you need to add menu items after the MenuItem[]

//        System.out.println("***Menu****");
//        System.out.println();
//
//        // The menu is printed here. See Class menu for all details.
//        menu.printMenuItemList();




        //Instatiate an order

        MenuItem[] orderMenuItems1 = {soup, lasagna};
        MenuItem[] orderMenuItems2 = {water, beer, fragolo};


        Order order1 = new Order(6, orderMenuItems1, 2);
        Order order2 = new Order(7, orderMenuItems2,  2);
       // Order order3 = new Order(9, orderMenuItems1,  3);

        order1.calculateOrderPrice();
        order2.calculateOrderPrice();

        Order[] orderList = {order1, order2};
      //  Order[] orderList1 = {order3};

        OrderController orderController = new OrderController(orderList, 2);




        System.out.println("**Order for table " + orderController.getTableId());
        orderController.printOrderList();





    }
}