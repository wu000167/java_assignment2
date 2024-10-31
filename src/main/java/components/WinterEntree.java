/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents an entree item for the Winter menu.
 * Contains multiple entree options available during the Winter season.
 * 
 * @author Yi Wu
 */
public class WinterEntree implements Entree {

    // List to store all the entree items for Winter
    private final List<String> entrees;

    /**
     * Constructor for WinterEntree.
     * Initializes the entree list for the Winter menu.
     */
    public WinterEntree() {
        // Initializing the list with the entrees available for the Winter season
        entrees = Arrays.asList("Sesame Soy Tartare", "\nBoston Clam Chowder", "\nThai Soup");
    }

    /**
     * Returns a string representation of the Winter entrees.
     * 
     * @return The names of the Winter entrees.
     */
    @Override
    public String toString() {
        return String.join(", ", entrees);
    }
}
