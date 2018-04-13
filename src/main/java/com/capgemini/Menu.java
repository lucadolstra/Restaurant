package com.capgemini;



public class Menu {

   private MenuItem[] menuItemList;

   //constructor: a menu requires a list of MenuItem

    public Menu(MenuItem[] menuItemList) {

        this.menuItemList = menuItemList;
    }


    public MenuItem[] getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(MenuItem[] menuItemList) {
        this.menuItemList = menuItemList;
    }


    //Method to print the menu, for every item in the list, it checks whether what kind of dish it is, and prints
    //the required information accordingly
    public void printMenuItemList() {
        for (MenuItem currentMenuItem : menuItemList){
            if(currentMenuItem instanceof Food && currentMenuItem.getItem() == EMenuItem.Starter) {
                Food tempFood = (Food)currentMenuItem;
                System.out.println("*Starters*:");
                tempFood.printMenuItem();
                System.out.println();

            }
            else if(currentMenuItem instanceof Food && currentMenuItem.getItem() == EMenuItem.Main ){
                Food tempFood = (Food)currentMenuItem;
                System.out.println("*Mains*:");
                tempFood.printMenuItem();
                System.out.println();
            }
            else if(currentMenuItem instanceof Food && currentMenuItem.getItem() == EMenuItem.Desert ){
                Food tempFood = (Food)currentMenuItem;
                System.out.println("*Deserts*:");
                tempFood.printMenuItem();
                System.out.println();
            }
            else if(currentMenuItem instanceof Drink){
                Drink tempDrink = (Drink)currentMenuItem;
                System.out.println("*Drinks*:");
                tempDrink.printMenuItem();
                System.out.println();
            }
            else{
                System.out.println("Error: this item is not part of the Menu");
            }
        }
        }
    }



