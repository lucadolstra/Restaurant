package com.capgemini;

public class Menu {

    private int menuId;
    private String menuName;
    private Food[] food;
    private Food singleFood;
    private Drink[] drink;
    private Drink singleDrink;


    //Constructors

    //with list of food and drinks
    public Menu(int menuId, String menuName, Food[] food, Drink[] drink){
        this.menuId = menuId;
        this.menuName = menuName;
        this.food = food;
        this. drink = drink;
    }

    //menu with a single food item and a single drink item
    public Menu(int menuId, String menuName, Food singleFood, Drink singleDrink){
        this.menuId = menuId;
        this.menuName = menuName;
        this.singleFood = singleFood;
        this. singleDrink = singleDrink;
    }


    //getters and setters
    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Food[] getFood() {
        return food;
    }

    public void setFood(Food[] food) {
        this.food = food;
    }

    public Food getSingleFood() {
        return singleFood;
    }

    public void setSingleFood(Food singleFood) {
        this.singleFood = singleFood;
    }

    public Drink[] getDrink() {
        return drink;
    }

    public void setDrink(Drink[] drink) {
        this.drink = drink;
    }

    public Drink getSingleDrink() {
        return singleDrink;
    }

    public void setSingleDrink(Drink singleDrink) {
        this.singleDrink = singleDrink;
    }
}
