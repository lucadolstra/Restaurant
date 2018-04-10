package com.capgemini;

public class Drink {

    private int drinkId;
    private String drinkName;
    private Drink[] drink;
    private Drink singleDrink;

    //Constructor that makes sure we add an id and a name for every drink we make

    public Drink(int drinkId, String drinkName ){
        this.drinkId = drinkId;
        this.drinkName = drinkName;
    }

    //get an drink
    public String getDrinkName() {
        return drinkId + " " + drinkName;
    }
}
