package com.capgemini;

public class Desert {

    private EDesert desertName;
    private int desertID;
    private double price;

    public Desert (EDesert newName, int newStarterID, double newPrice)
    {
        this.desertName = newName;
        this.desertID = newStarterID;
        this.price  = newPrice;
    }

    public EDesert getDesertName() {
        return this.desertName;
    }

    public int getDesertID() {
        return this.desertID;
    }

    public double getPrice() {
        return this.price;
    }
}
