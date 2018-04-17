package com.capgemini;

public class OrderController {
    private Order[] orderList;


    public OrderController(Order[] orderList) {
        this.orderList = orderList;
    }

    public Order[] getOrderList() {
        return orderList;
    }

    public void setOrderList(Order[] orderList) {
        this.orderList = orderList;
    }



    //method to print the order
    public void printOrderList(){
        for(Order currentOrder : orderList){
            System.out.println("id: " + currentOrder.getOrderId() + "order: ");
            currentOrder.printOrder();
            System.out.println( "orderprice: " + currentOrder.getOrderPrice() + "for table: " + currentOrder.getTableId());
        }
    }

}
