package com.capgemini.view;

import com.capgemini.controller.OrderController;
import com.capgemini.model.MenuItem;
import com.capgemini.model.Order;


public class OrderView {

    public void printOrder(MenuItem[] menuItemList) {
        for (MenuItem currentItem : menuItemList) {
            System.out.println(currentItem.getName());
            System.out.println("Price: " + currentItem.getPrice());
        }
    }

    public void printOrderList(Order[] orderList) {
        OrderController tempCont = new OrderController();
        for (Order currentOrder : orderList) {

            System.out.println();
//              System.out.println("id: " + currentOrder.getOrderId());
            System.out.print(currentOrder);
//            MenuItem[] tempArray = currentOrder.getMenuItemList();
//            printOrder(tempArray);
//
//            System.out.println("The price of this order: " + currentOrder.;
////                System.out.println("The total order price: " + calcTotalOrderPrice());
        }
        System.out.println("-----------");
        System.out.println("The total order price: " + tempCont.calcTotalOrderPrice());
    }
//    public void printOrderList(Order[] orderList){
//        for(Order currentOrder : orderList){
//            System.out.println("id: " + currentOrder.getOrderId() + "order: ");
//            System.out.println( "orderprice: " + currentOrder.getOrderPrice() + "for table: " + currentOrder.getTableId());
//        }
//    }
}
