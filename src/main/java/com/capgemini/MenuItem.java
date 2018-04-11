package com.capgemini;

public class MenuItem {


    private int id;
    private String name;
    private double price;


    public MenuItem(int newId, String newName, double newPrice){
        this.id = newId;
        this.name = newName;
        this.price = newPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void printMenuItem(){
        System.out.println("Id:" + getId() + " Name: " + getName() + " price: " + getPrice());
    }



    //    private int menuId;
////    private String menuName;
////    private Food[] food;
////    private Food singleFood;
////    private Drink[] drink;
////    private Drink singleDrink;



    //Constructors
//
//    //with list of food and drinks
//    public MenuItem(int menuId, String menuName, Food[] food, Drink[] drink){
//        this.menuId = menuId;
//        this.menuName = menuName;
//        this.food = food;
//        this. drink = drink;
//    }
//
//    //menu with a single food item and a single drink item
//    public MenuItem(int menuId, String menuName, Food singleFood, Drink singleDrink){
//        this.menuId = menuId;
//        this.menuName = menuName;
//        this.singleFood = singleFood;
//        this. singleDrink = singleDrink;
//    }

//
//
//    //getters and setters
//    public int getMenuId() {
//        return menuId;
//    }
//
//    public void setMenuId(int menuId) {
//        this.menuId = menuId;
//    }
//
//    public String getMenuName() {
//        return menuName;
//    }
//
//    public void setMenuName(String menuName) {
//        this.menuName = menuName;
//    }
//
//    public Food[] getFood() {
//        return food;
//    }
//
//    public void setFood(Food[] food) {
//        this.food = food;
//    }
//
//    public Food getSingleFood() {
//        return singleFood;
//    }
//
//    public void setSingleFood(Food singleFood) {
//        this.singleFood = singleFood;
//    }
//
//    public Drink[] getDrink() {
//        return drink;
//    }
//
//    public void setDrink(Drink[] drink) {
//        this.drink = drink;
//    }
//
//    public Drink getSingleDrink() {
//        return singleDrink;
//    }
//
//    public void setSingleDrink(Drink singleDrink) {
//        this.singleDrink = singleDrink;
//    }
}
