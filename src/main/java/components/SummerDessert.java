/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a dessert item for the Summer menu.
 * Contains multiple dessert options available during the Summer season.
 * 
 * @author Yi Wu
 */
public class SummerDessert implements Dessert {

    // List to store all the dessert items for Summer
    private final List<String> desserts;

    /**
     * Constructor for SummerDessert.
     * Initializes the dessert list for the Summer menu.
     */
    public SummerDessert() {
        // Initializing the list with the desserts available for the Summer season
        desserts = Arrays.asList("Lime Pie", "\nUltimate Cookie", "\nChurro Ice Cream Sandwich");
    }

    /**
     * Returns a string representation of the Summer desserts.
     * 
     * @return The names of the Summer desserts.
     */
    @Override
    public String toString() {
        return String.join(", ", desserts);
    }
}
