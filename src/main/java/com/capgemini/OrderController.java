package com.capgemini;

public class OrderController {
    private Order[] orderList;
    private MenuItemController menuItemController = new MenuItemController();
    private OrderView orderView = new OrderView();


    public OrderController() {
        Order order1 = new  Order(6, menuItemController.getListOfMenuItems(), 10, 2);
        Order order2 = new Order(7, menuItemController.getListOfMenuItems(), 20, 2);

        this.orderList = new Order[]{order1, order2};
    }

    public void printOrder(){
        orderView.printOrderList(this.orderList);
    }

    public Order[] getOrderList() {
        return orderList;
    }

    public void setOrderList(Order[] orderList) {
        this.orderList = orderList;
    }
}
