package com.capgemini;

import java.awt.MenuItem;

public class OrderView {

    private MenuItemView menuItemView = new MenuItemView();
    private com.capgemini.MenuItem[] menuItemsList;


    public void printOrder(Order order){
        menuItemsList = order.getMenuItemList();
        menuItemView.printListOfMenuItem(menuItemsList);

    }

    public void printOrderList(Order[] orderList){
        for(Order currentOrder : orderList){
            printOrder(currentOrder);
            System.out.println("id: " + currentOrder.getOrderId() + "order: ");
            System.out.println( "orderprice: " + currentOrder.getOrderPrice() + "for table: " + currentOrder.getTableId());
        }
    }
}
