package com.capgemini;

public class Starter {
    private EStarter starterName;
    private int starterID;
    private double price;

    public Starter (EStarter newName, int newStarterID, double newPrice)
    {
        this.starterName = newName;
        this.starterID = newStarterID;
        this.price  = newPrice;
    }

    public EStarter getStarterName() {
        return this.starterName;
    }

    public int getStarterID() {
        return this.starterID;
    }

    public double getPrice() {
        return this.price;
    }
}
