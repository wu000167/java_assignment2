/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a dessert item for the Winter menu.
 * Contains multiple dessert options available during the Winter season.
 * 
 * @author Yi Wu
 */
public class WinterDessert implements Dessert {

    // List to store all the dessert items for Winter
    private final List<String> desserts;

    /**
     * Constructor for WinterDessert.
     * Initializes the dessert list for the Winter menu.
     */
    public WinterDessert() {
        // Initializing the list with the desserts available for the Winter season
        desserts = Arrays.asList("Chocolate Mousse", "\nCaramel Cheesecake", "\nChocolate Sponge Cake");
    }

    /**
     * Returns a string representation of the Winter desserts.
     * 
     * @return The names of the Winter desserts.
     */
    @Override
    public String toString() {
        return String.join(", ", desserts);
    }
}
