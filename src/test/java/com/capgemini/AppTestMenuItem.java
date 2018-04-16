package com.capgemini;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTestMenuItem {

    private static MenuItem testGetName;

    @BeforeClass
    public static void setup() {
        testGetName = new MenuItem();
    }

        @Test
        public void testGetName() {
            String name = "Burger";

            this.testGetName.setName(name);

            assertEquals(this.testGetName.getName(), name);
        }

    }

}

/*public String getName() {
    return name;
}*/