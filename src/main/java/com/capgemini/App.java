package com.capgemini;

/*
Restaurant application
*/

import com.capgemini.controller.OrderController;
import com.capgemini.model.Menu;
import com.capgemini.model.MenuItem;
import com.capgemini.model.Order;

public class App {

    //instantiates a Drink and a Food

    public static void main(String[] args) {

        OrderController orderController = new OrderController();
        orderController.printOrder();
    }
}