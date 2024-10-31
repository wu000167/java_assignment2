/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a drink item for the Winter menu.
 * Contains multiple drink options available during the Winter season.
 * 
 * @author Yi Wu
 */
public class WinterDrink implements Drink {

    // List to store all the drink items for Winter
    private final List<String> drinks;

    /**
     * Constructor for WinterDrink.
     * Initializes the drink list for the Winter menu.
     */
    public WinterDrink() {
        // Initializing the list with the drinks available for the Winter season
        drinks = Arrays.asList("Mojito", "\nAlcohol Free Wine", "\nTequila");
    }

    /**
     * Returns a string representation of the Winter drinks.
     * 
     * @return The names of the Winter drinks.
     */
    @Override
    public String toString() {
        return String.join(", ", drinks);
    }
}
