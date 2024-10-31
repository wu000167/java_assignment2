/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a dessert item for the Spring menu.
 * Contains multiple dessert options available during the Spring season.
 * 
 * @author Yi Wu
 */
public class SpringDessert implements Dessert {

    // List to store all the dessert items for Spring
    private final List<String> desserts;

    /**
     * Constructor for SpringDessert.
     * Initializes the dessert list for the Spring menu.
     */
    public SpringDessert() {
        // Initializing the list with the desserts available for the Spring season
        desserts = Arrays.asList("Vanilla Crème Brûlée", "\nWhite Chocolate Brownie", "\nPassion Fruit Fig Tart");
    }

    /**
     * Returns a string representation of the Spring desserts.
     * 
     * @return The names of the Spring desserts.
     */
    @Override
    public String toString() {
        return String.join(", ", desserts);
    }
}
