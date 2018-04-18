package com.capgemini;

import java.util.List;

public class MenuItemView {

//    private IngredientView ingredientView = new IngredientView();
    private IngredientController ingredientController = new IngredientController();

    public void printMenuItem(MenuItem menuItemToPrint){
        System.out.println("Dish:" + menuItemToPrint.getName());
        ingredientController.printListOfIngredients();
    }

    public void printListOfMenuItem(MenuItem[] ListOfMenuItemToPrint) {
        for (MenuItem currentMenuItem : ListOfMenuItemToPrint){
            if(currentMenuItem instanceof Food && currentMenuItem.getItem() == EMenuItem.Starter) {
                System.out.println("");
                System.out.println("*Starters*:");
                printMenuItem(currentMenuItem);
            }
            else if(currentMenuItem instanceof Food && currentMenuItem.getItem() == EMenuItem.Main ){
                System.out.println("");
                System.out.println("*Mains*:");
                printMenuItem(currentMenuItem);
            }
            else if(currentMenuItem instanceof Food && currentMenuItem.getItem() == EMenuItem.Desert ){
                System.out.println("");
                System.out.println("*Deserts*:");
                printMenuItem(currentMenuItem);
            }
            else if(currentMenuItem instanceof Drink){
                System.out.println("");
                System.out.println("*Drinks*:");
                printMenuItem(currentMenuItem);
            }
            else{
                System.out.println("Error: this item is not part of the Menu");
            }
        }
    }
}
