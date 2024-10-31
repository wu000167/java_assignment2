/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a dessert item for the Fall menu.
 * 
 * @author Yi Wu
 */
public class FallDessert implements Dessert {

    // List to store all the dessert items for Fall
    private final List<String> desserts;

    /**
     * Constructor for FallDessert.
     * Initializes the dessert list for the Fall menu.
     */
    public FallDessert() {
        // Initializing the list with the desserts available for the Fall season
        desserts = Arrays.asList("Carrot Cake", "\nWhite Chocolate Cheesecake", "\nApple Pie");
    }

    /**
     * Returns a string representation of the Fall desserts.
     * 
     * @return The names of the Fall desserts.
     */
    @Override
    public String toString() {
        // Joining all items in the list into a single formatted string
        return String.join(", ", desserts);
    }
}
