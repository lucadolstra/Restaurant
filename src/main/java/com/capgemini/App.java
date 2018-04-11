package com.capgemini;

/*
Restaurant application
*/

public class App {
    private MenuItem menuItem;

    //instantiates a Drink and a Food

    public static void main(String[] args) {
        System.out.println("***Menu****");
        System.out.println();

        Drink drink = new Drink(1, EMenuItem.Drink, "Carlsberg", 2);

        Ingredient cream = new Ingredient("cream", 1, 500, 3);
        Ingredient garlic = new Ingredient("garlic", 2, 500, 3);
        Ingredient potato = new Ingredient("potato", 3, 500, 3);

        Food food = new Food(2, EMenuItem.Desert, "tiramisu", 3, cream);
        Food food2 = new Food(3, EMenuItem.Desert, "icecream", 3, new Ingredient[]{cream, potato, garlic});
        
        //print the drink and the food to the console
        //todo: the Ingredient is now presented as NULL, needs to be solved
        drink.printMenuItem();
        food.printMenuItem();
        food2.printMenuItem();


    }
}