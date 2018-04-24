package com.capgemini;

import static junit.framework.TestCase.assertEquals;

import com.capgemini.model.*;
import org.junit.Test;

public class AppTestMenuItem {

    private static MenuItem testMenuItemDrink;
    private static Food testMenuItemFood;

//We do not use Before or BeforeClass because we use different constructors in every test


    //Test the getName method of MenuItem and Drink
    @Test
    public void testGetDrinkName() {
        int excpectedId = 1;
        EMenuItem expectedItem = EMenuItem.Drink;
        double expectedPrice = 1;
        String expectedName = "Test";

        testMenuItemDrink = new Drink(1, EMenuItem.Drink, "Test", 1);
        String testName = testMenuItemDrink.getName();

        assertEquals(testName, expectedName);
    }


    //Test the getName method for a Food MenuItem
    @Test
    public void testGetFoodName() {
        Ingredient testIngredient = new Ingredient(3, "testIngredient", 200, 1.0);
        Ingredient[] testListOfIngredients = {testIngredient};

        int excpectedId = 2;
        EMenuItem expectedItem = EMenuItem.Main;
        double expectedPrice = 1;
        String expectedName = "Test";
        Ingredient[] expectedIngredientList = {testIngredient};
        int expectedLength = expectedIngredientList.length;


        testMenuItemFood = new Food(2, EMenuItem.Main, "Test", 1, testListOfIngredients);

        String testName = testMenuItemFood.getName();
        int testId = testMenuItemFood.getId();
        double testPrice = testMenuItemFood.getPrice();

//        if(testMenuItemFood instanceof Food) {
//            Food temp = (Food)testMenuItemFood;
//            temp.getListOfIngredients();
//        }

        Ingredient[] testIngredientList = testMenuItemFood.getListOfIngredients();
        int testLength = testIngredientList.length;


        assertEquals(testName, expectedName);
        assertEquals(testId, excpectedId);
        assertEquals(testPrice, expectedPrice);

        //Because we test 2 arrays, we test the lengths of these arrays. Testing 2 arrays as is would not
        //result in an equal result.
        assertEquals(testLength, expectedLength);
    }

}

