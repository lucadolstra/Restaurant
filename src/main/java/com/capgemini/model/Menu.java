package com.capgemini.model;


import com.capgemini.model.MenuItem;

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

    }



