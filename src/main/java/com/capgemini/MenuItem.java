package com.capgemini;

public class MenuItem {

    //Parent class for Food and Drink


    private int id;
    private EMenuItem item;
    private double price;
    private String name;


    public MenuItem(int newId, EMenuItem newItem, String newName, double newPrice) {
        this.id = newId;
        this.item = newItem;
        this.price = newPrice;
        this.name = newName;
    }

    public void setItem(EMenuItem item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EMenuItem getItem() {
        return item;
    }

    public void setMenuItem(EMenuItem name) {
        this.item = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void printMenuItem() {
        System.out.println("Dish: " + getName() + "      Price:" + getPrice());
    }


}
