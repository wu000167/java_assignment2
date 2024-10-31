/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a drink item for the Spring menu.
 * Contains multiple drink options available during the Spring season.
 * 
 * @author Yi Wu
 */
public class SpringDrink implements Drink {

    // List to store all the drink items for Spring
    private final List<String> drinks;

    /**
     * Constructor for SpringDrink.
     * Initializes the drink list for the Spring menu.
     */
    public SpringDrink() {
        // Initializing the list with the drinks available for the Spring season
        drinks = Arrays.asList("Cucumber Smash", "\nLime Juice", "\nCandy Apple Cider");
    }

    /**
     * Returns a string representation of the Spring drinks.
     * 
     * @return The names of the Spring drinks.
     */
    @Override
    public String toString() {
        return String.join(", ", drinks);
    }
}
