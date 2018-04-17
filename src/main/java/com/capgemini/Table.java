package com.capgemini;

import java.lang.reflect.Array;

public class Table {

    private int tableId;
    private int numberOfPeople;
    private Menu menu;
    private Order[] orderList;
    private MenuItem[] menuItemList;
    private Order order;

    public Table(int tableId, int numberOfPeople) {
        this.tableId = tableId;
        this.numberOfPeople = numberOfPeople;
    }

    // method for add reservation

    // method for calculating total price

    // method for paying order. 

    // method for placing order. When placing an order we will need the table ID of the table,
    // an order list is needed from the order class
    public void placeOrder(OrderController orderController) {
        orderController.printOrderList();

    }

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
