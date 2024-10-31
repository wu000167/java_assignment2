/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a drink item for the Fall menu.
 * 
 * @author Yi Wu
 */
public class FallDrink implements Drink {

    // List to store all the drink items for Fall
    private final List<String> drinks;

    /**
     * Constructor for FallDrink.
     * Initializes the drink list for the Fall menu.
     */
    public FallDrink() {
        // Initializing the list with the drinks available for the Fall season
        drinks = Arrays.asList("Margarita", "\nDark Rum", "\nOrange Juice");
    }

    /**
     * Returns a string representation of the Fall drinks.
     * 
     * @return The names of the Fall drinks.
     */
    @Override
    public String toString() {
        // Joining all items in the list into a single formatted string
        return String.join(", ", drinks);
    }
}
