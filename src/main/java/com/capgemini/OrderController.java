package com.capgemini;

public class OrderController {
    private Order[] orderList;
    private MenuItemController menuItemController;
    private OrderView orderView;


    public OrderController(Order[] orderList) {
        this.orderList = orderList;
    }

    public Order[] getOrderList() {
        return orderList;
    }

    public void setOrderList(Order[] orderList) {
        this.orderList = orderList;
    }





        Order order1 = new  Order(6, orderMenuItems1, 10, 2);
        Order order2 = new Order(7, orderMenuItems2, 20, 2);

        Order[] orderList = {order1, order2};

        public void printOrder(){
            orderView.printOrderList(orderList);
        }
}
