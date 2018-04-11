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
}
