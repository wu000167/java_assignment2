/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents an entree item for the Fall menu.
 * Contains multiple entree options available during the Fall season.
 * 
 * @author Yi Wu
 */
public class FallEntree implements Entree {

    // List to store all the entree items for Fall
    private final List<String> entrees;

    /**
     * Constructor for FallEntree.
     * Initializes the entree list for the Fall menu.
     */
    public FallEntree() {
        // Initializing the list with the entrees available for the Fall season
        entrees = Arrays.asList("Spinach and Artichoke Dip", "\nSesame Soy Tuna Tartare", "\nTuscan Bruschetta");
    }

    /**
     * Returns a string representation of the Fall entrees.
     * 
     * @return The names of the Fall entrees.
     */
    @Override
    public String toString() {
        return String.join(", ", entrees);
    }
}
