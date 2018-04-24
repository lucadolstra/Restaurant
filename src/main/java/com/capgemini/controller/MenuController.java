package com.capgemini.controller;

import com.capgemini.model.EMenuItem;
import com.capgemini.model.Food;
import com.capgemini.model.MenuItem;
import com.capgemini.model.Drink;
import com.capgemini.view.MenuView;


public class MenuController {

    private MenuItemController menuItem = new MenuItemController();

    public void printListOfMenuItem(MenuItem[] ListOfMenuItemToPrint) {
        for (MenuItem currentMenuItem : ListOfMenuItemToPrint){
            if(currentMenuItem instanceof Food && currentMenuItem.getItem() == EMenuItem.Starter) {
                menuItem.showMenuItem();
            }
            else if(currentMenuItem instanceof Food && currentMenuItem.getItem() == EMenuItem.Main ){
                menuItem.showMenuItem();
            }
            else if(currentMenuItem instanceof Food && currentMenuItem.getItem() == EMenuItem.Desert ){
                menuItem.showMenuItem();
            }
            else if(currentMenuItem instanceof Drink){
                menuItem.showMenuItem();
            }
            else{
                System.out.println("Error: this item is not part of the Menu");
            }
        }
    }
}
