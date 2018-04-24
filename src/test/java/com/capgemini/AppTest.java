package com.capgemini;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.capgemini.model.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMenu() {
        Ingredient garlic = new Ingredient(1, "garlic", 100, 2);
        MenuItem soup = new Food(1, EMenuItem.Starter, "soup", 2, new Ingredient[]{garlic});
        Menu newItemList = new Menu(new MenuItem[]{soup});


        assertEquals(soup, newItemList.getMenuItemList()[0]);

    }
}
