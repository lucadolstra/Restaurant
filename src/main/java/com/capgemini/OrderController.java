package com.capgemini;

public class OrderController {
    private Order[] orderList;

    private MenuItemController menuItemController = new MenuItemController();
    private OrderView orderView = new OrderView();
    private int tableId;
    private double totalOrderPrice = 0;


    public OrderController() {
        Order order1 = new  Order(6, menuItemController.getListOfMenuItems(),  2);
        Order order2 = new Order(7, menuItemController.getListOfMenuItems(),  2);

        this.orderList = new Order[]{order1, order2};
    }

    public void printOrder() {
        orderView.printOrderList(this.orderList);
    }


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
        totalOrderPrice = 0;
        for(Order currentOrder : orderList){
            totalOrderPrice = totalOrderPrice + currentOrder.getOrderPrice();
            }
            return totalOrderPrice;
    }



    //method to print the order
    //this does print anything anymore, it did work before.

    public void printOrderList() {
        for (Order currentOrder : orderList) {

                System.out.println();
//              System.out.println("id: " + currentOrder.getOrderId());
                System.out.print("order: ");
                currentOrder.printOrder();
                System.out.println("The price of this order: " + currentOrder.getOrderPrice());
//                System.out.println("The total order price: " + calcTotalOrderPrice());
            }
        System.out.println("-----------");
        System.out.println("The total order price: " + calcTotalOrderPrice());
        }

    }