package com.capgemini;


import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IngredientTest {
    static Ingredient testIngredient;

    //Basic test to see if JUnit is working
    @Test
    public void jUnitWorksTest() {
        String testString = "Yay!";
        assertEquals("Yay!", testString);
    }

    //Initialises an ingredient before every test
    @BeforeClass
    public static void setup() {
        testIngredient = new Ingredient(1, "Test", 50, 1);

    }

    //Tests the get methods of ingredient
    @Test
    public void testGetIngredient() {
        int testId = testIngredient.getIngredientId();
        String testName = testIngredient.getIngredientName();
        int testGrams = testIngredient.getIngredientGrams();
        double testPrice = testIngredient.getIngredientPrice();

        int expectedId = 1;
        String expectedName = "Test";
        int expectedGrams = 50;
        double expectedPrice = 1;

        assertEquals(testId, expectedId);
        assertEquals(testName, expectedName);
        assertEquals(testGrams, expectedGrams);
        assertEquals(testPrice, expectedPrice);

    }
}