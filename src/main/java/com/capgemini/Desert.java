package com.capgemini;

public class Desert {

    private String desertName;
    private int desertID;
    private double price;

    public Desert(String newName, int newStarterID, double newPrice) {
        this.desertName = newName;
        this.desertID = newStarterID;
        this.price = newPrice;
    }

    public String getDesertName() {
        return this.desertName;
    }

    public int getDesertID() {
        return this.desertID;
    }

    public double getPrice() {
        return this.price;
    }
}
