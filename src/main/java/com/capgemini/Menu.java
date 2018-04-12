package com.capgemini;


import java.util.ArrayList;
import java.util.List;

public class Menu {

   private MenuItem[] menuItemList;
   //List<MenuItem> menuItemList;

    public Menu(MenuItem[] menuItemList) {

        this.menuItemList = menuItemList;
    }

//    public Menu(MenuItem newMenuItemList) {
//
//        // maak een Ingredient array aan met size 1
//        MenuItem[] menuItems = new MenuItem[1];
//
//        // voeg het ingredient toe aan de nieuwe array
//        menuItems[0] = newMenuItemList;
//
//        // set de array op this.menuItemlist
//        this.menuItemList = menuItemList;
//    }


    public MenuItem[] getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(MenuItem[] menuItemList) {
        this.menuItemList = menuItemList;
    }

    public void printMenuItemList() {
        for (MenuItem currentMenuItem : menuItemList){
            if(currentMenuItem instanceof Food && currentMenuItem.getItem() == EMenuItem.Starter) {
                Food tempFood = (Food)currentMenuItem;
                System.out.println("*Starters*:");
                System.out.println(currentMenuItem.getName());
                tempFood.printMenuItem();
                System.out.println();

            }
            else if(currentMenuItem instanceof Food && currentMenuItem.getItem() == EMenuItem.Main ){
                Food tempFood = (Food)currentMenuItem;
                System.out.println("*Mains*:");
                System.out.println(currentMenuItem.getName());
                tempFood.printMenuItem();
                System.out.println();
            }
            else if(currentMenuItem instanceof Food && currentMenuItem.getItem() == EMenuItem.Desert ){
                Food tempFood = (Food)currentMenuItem;
                System.out.println("*Deserts*:");
                System.out.println(currentMenuItem.getName());
                tempFood.printMenuItem();
                System.out.println();
            }
            else if(currentMenuItem instanceof Drink){
                System.out.println("*Drinks*:");
                System.out.println(currentMenuItem.getName());
                System.out.println();
            }
            else{
                System.out.println("nothing");
            }
        }
        }
    }



