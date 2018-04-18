package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class MenuItemController {

        private MenuItemView menuItemView = new MenuItemView();
        private IngredientController ing = new IngredientController();
        private MenuItem[] listOfMenuItems;


        MenuItem menuItem = new Food(1, EMenuItem.Starter, "soup", 0.47,ing.getListOfIngredients());
        MenuItem pizza = new Food(2, EMenuItem.Main, "pizza", 3,ing.getListOfIngredients() );
        MenuItem tiramisu = new Food(3, EMenuItem.Desert, "tiramisu", 8, ing.getListOfIngredients());
        MenuItem water = new Drink(4, EMenuItem.Drink, "water", 2);
        MenuItem lasagna = new Food(5, EMenuItem.Main, "lasagna", 5,ing.getListOfIngredients());
        MenuItem pastaBolognese = new Food(6, EMenuItem.Main, "pastaBolognese", 3,ing.getListOfIngredients());
        MenuItem ceaserSalad = new Food(7, EMenuItem.Starter, "ceaserSalad", 8,ing.getListOfIngredients() );
        MenuItem burger = new Food(8, EMenuItem.Main, "burger", 2,ing.getListOfIngredients());
        MenuItem fragolo = new Food(9, EMenuItem.Starter, "fragolo", 2,ing.getListOfIngredients());
        MenuItem beer = new Drink(10, EMenuItem.Drink, "beer", 3);

   public MenuItemController(){
       listOfMenuItems = new MenuItem[2];
       listOfMenuItems[0] = menuItem;
       listOfMenuItems[1] = pizza;


   }


    public void printSingleMenuItem(){
            menuItemView.printMenuItem(menuItem);
            ing.printListOfIngredients();
        }

        public void printMenuItem(){
            menuItemView.printListOfMenuItem(listOfMenuItems);

        }


}

