package com.capgemini;


//An order is made out of MenuItems. Several orders are combined in the OrderController
public class Order {

    private int orderId;
    private MenuItem[] menuItemList;
    private double orderPrice;
    //private Table tableId;
    private int tableId;


    //Todo: for now the Order takes an int tableId, but this needs to be converted to an Table tableId;
    public Order(int orderId, MenuItem[] menuItemList, int tableId) {
        this.orderId = orderId;
        this.menuItemList = menuItemList;
        this.tableId = tableId;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public MenuItem[] getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(MenuItem[] menuItemList) {
        this.menuItemList = menuItemList;
    }



    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }


//Tried to cast Food and Drink, but this doesn't seem to differ
// The calculator doesn't work and the Orders aren't printed
    public double calculateOrderPrice() {

        for (MenuItem currentItem : menuItemList) {
            if (currentItem instanceof Food) {
                Food tempFood = (Food) currentItem;
                orderPrice = tempFood.getPrice()+orderPrice;
            }
            if (currentItem instanceof Drink) {
                Drink temDrink = (Drink) currentItem;
                orderPrice = temDrink.getPrice() + orderPrice;
            }
        }
        return orderPrice;
    }



    public void printOrder() {
        for (MenuItem currentItem : menuItemList) {
            System.out.println(currentItem.getName());
            System.out.println("Price: " + currentItem.getPrice());
        }
    }

    public double getOrderPrice() {
        return orderPrice;
    }
}
