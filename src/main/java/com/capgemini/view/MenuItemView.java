package com.capgemini.view;

import com.capgemini.model.MenuItem;
import com.capgemini.controller.IngredientController;

public class MenuItemView {

    private IngredientController ingredientController = new IngredientController();

    public void printMenuItem(MenuItem menuItemToPrint) {
        System.out.println("Dish:" + menuItemToPrint.getName());
        ingredientController.showIngredients();
    }

    public void printListOfMenuItem(MenuItem[] ListOfMenuItemToPrint) {
        for (MenuItem currentMenuItem : ListOfMenuItemToPrint) {
            printMenuItem(currentMenuItem);
        }
    }

    public void printOrderItems(MenuItem[] ListOfMenuItemToPrint) {
        for (MenuItem currentMenuItem : ListOfMenuItemToPrint) {
            System.out.println(currentMenuItem.getName());
            System.out.println("Price: " + currentMenuItem.getPrice());
        }
    }
}
