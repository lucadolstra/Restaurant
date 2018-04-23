package com.capgemini;

public class OrderController {
    private Order[] orderList;
    private int tableId;
    private double totalOrderPrice = 0;

    public OrderController(Order[] orderList, int tableId) {
        this.orderList = orderList;
        this.tableId = tableId;
    }

    public Order[] getOrderList() {
        return orderList;
    }

    public void setOrderList(Order[] orderList) {
        this.orderList = orderList;
    }

    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public void setTotalOrderPrice(double totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }


    //Before I had the OrderPrice be calculated out of the prices of the MenuItems, but had them hardcoded
    //this calculator, that takes all the orders together DID work!!!
    public double calcTotalOrderPrice(){
        for(Order currentOrder : orderList){
            totalOrderPrice = totalOrderPrice + currentOrder.calculateOrderPrice();
            }
            return totalOrderPrice;
    }

    public void printOrderTotalPrice(){
        System.out.println(totalOrderPrice);
    }


    //method to print the order
    //this does print anything anymore, it did work before.

    public void printOrderList() {
        for (Order currentOrder : orderList) {

                System.out.println();
                System.out.println("id: " + currentOrder.getOrderId());
                System.out.println("order: ");
                currentOrder.printOrder();
                System.out.println("Total order price: " + calcTotalOrderPrice());
                System.out.println("for table" + currentOrder.getTableId());

            }
        }

    }

