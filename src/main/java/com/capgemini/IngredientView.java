package com.capgemini;

import java.util.List;

public class IngredientView {

    public void printSingleIngredient(Ingredient ingredientToPrint){
        System.out.println(" ");
        System.out.println("IngredientId" + ingredientToPrint.getIngredientId() );
        System.out.println("Ingredient name: " + ingredientToPrint.getIngredientName() );
        System.out.println("Ingredient grams: " + ingredientToPrint.getIngredientGrams() );
        System.out.println("Ingredient price" + ingredientToPrint.getIngredientPrice());
    }

    public void printListOfIngredients(Ingredient[] listOfIngredientsToPrint){
        for (Ingredient currentIngredient : listOfIngredientsToPrint ) {
            System.out.println("Ingredient name: " + currentIngredient.getIngredientName());
        }
    }

}
