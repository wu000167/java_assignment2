/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents an entree item for the Summer menu.
 * Contains multiple entree options available during the Summer season.
 * 
 * @author Yi Wu
 */
public class SummerEntree implements Entree {

    // List to store all the entree items for Summer
    private final List<String> entrees;

    /**
     * Constructor for SummerEntree.
     * Initializes the entree list for the Summer menu.
     */
    public SummerEntree() {
        // Initializing the list with the entrees available for the Summer season
        entrees = Arrays.asList("Avocado scramble", "\nLittle Gem Salad", "\nMiso Cauliflower Soup");
    }

    /**
     * Returns a string representation of the Summer entrees.
     * 
     * @return The names of the Summer entrees.
     */
    @Override
    public String toString() {
        return String.join(", ", entrees);
    }
}
