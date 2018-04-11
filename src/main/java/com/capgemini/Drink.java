package com.capgemini;

public class Drink {

    private int drinkId;
    private EDrink drinkName;


    //Constructor that makes sure we add an id and a name for every drink we make

    public Drink(int drinkId, EDrink drinkName ){
        this.drinkId = drinkId;
        this.drinkName = drinkName;
    }


    //Setters and Getters

    //public void setDrinkId(int drinkId){
    //    this.drinkId = drinkId;
    //}

    public int getDrinkId(){
        return this.drinkId;
    }


    //public void setDrinkName(String drinkName){
    //    this.drinkName = drinkName;
    //}

    public EDrink getDrinkName(){
        return this.drinkName;
    }

}
