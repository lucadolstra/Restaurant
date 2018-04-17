package com.capgemini;

public class Order {

    private int orderId;
    private MenuItem[] menuItemList;
    private int orderPrice;
    //private Table tableId;
    private int tableId;


    //Todo: for now the Order takes an int tableId, but this needs to be converted to an Table tableId;
    public Order(int orderId, MenuItem[] menuItemList, int orderPrice, int tableId) {
        this.orderId = orderId;
        this.menuItemList = menuItemList;
        this.orderPrice = orderPrice;
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

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

   public void printOrder(){
        for (MenuItem currentItem : menuItemList){
            System.out.println(currentItem.getName());
        }
   }



}
