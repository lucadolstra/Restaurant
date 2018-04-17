package com.capgemini;

import java.lang.reflect.Array;

public class Table {

    private int tableId;
    private int numberOfPeople;
    private MenuItem[] menuItemList;
    //private Order[] listOforders;

    public Table(int tableId, int numberOfPeople, MenuItem[] menuItemList){
        this.tableId = tableId;
        this.numberOfPeople = numberOfPeople;
        this.menuItemList = menuItemList;
    }

    // method for add reservation

    // method for calculating total price

    // method for showing menu

    public void printMenu(MenuItem[] menuItemList){
        Menu newMenu = new Menu(menuItemList);
        newMenu.printMenuItemList();
    }

    // method for paying order. 

    // method for placing order. When placing an order we will need the table ID of the table,
    // an order list is needed from the order class
//    public void placeOrder(int tableId, Order[] orderList) {
//        this.tableId = tableId;
//        orderList.getId;
//    }



    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }


}
