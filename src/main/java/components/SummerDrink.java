/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a drink item for the Summer menu.
 * Contains multiple drink options available during the Summer season.
 * 
 * @author Yi Wu
 */
public class SummerDrink implements Drink {

    // List to store all the drink items for Summer
    private final List<String> drinks;

    /**
     * Constructor for SummerDrink.
     * Initializes the drink list for the Summer menu.
     */
    public SummerDrink() {
        // Initializing the list with the drinks available for the Summer season
        drinks = Arrays.asList("Lemonade", "\nSangria", "\nRum Punch");
    }

    /**
     * Returns a string representation of the Summer drinks.
     * 
     * @return The names of the Summer drinks.
     */
    @Override
    public String toString() {
        return String.join(", ", drinks);
    }
}
