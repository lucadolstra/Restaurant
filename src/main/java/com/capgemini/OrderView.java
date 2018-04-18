package com.capgemini;

public class OrderView {

//    public void printOrder(MenuItem menuItem){
//            System.out.println(menuItem.getName());
//        }
//    }

    public void printOrderList(Order[] orderList){
        for(Order currentOrder : orderList){
            System.out.println("id: " + currentOrder.getOrderId() + "order: ");
            System.out.println( "orderprice: " + currentOrder.getOrderPrice() + "for table: " + currentOrder.getTableId());
        }
    }
}
