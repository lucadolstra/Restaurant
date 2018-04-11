package com.capgemini;

public class Starter {
    private String starterName;
    private int starterID;
    private double price;

    public Starter(String newName, int newStarterID, double newPrice) {
        this.starterName = newName;
        this.starterID = newStarterID;
        this.price = newPrice;
    }

    public String getStarterName() {
        return this.starterName;
    }

    public int getStarterID() {
        return this.starterID;
    }

    public double getPrice() {
        return this.price;
    }
}
