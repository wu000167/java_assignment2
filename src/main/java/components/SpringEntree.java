/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents an entree item for the Spring menu.
 * Contains multiple entree options available during the Spring season.
 * 
 * @author Yi Wu
 */
public class SpringEntree implements Entree {

    // List to store all the entree items for Spring
    private final List<String> entrees;

    /**
     * Constructor for SpringEntree.
     * Initializes the entree list for the Spring menu.
     */
    public SpringEntree() {
        // Initializing the list with the entrees available for the Spring season
        entrees = Arrays.asList("Lobster Veracruzana", "\nOrganic Ocean Halibut", "\nMushroom Soup");
    }

    /**
     * Returns a string representation of the Spring entrees.
     * 
     * @return The names of the Spring entrees.
     */
    @Override
    public String toString() {
        return String.join(", ", entrees);
    }
}
