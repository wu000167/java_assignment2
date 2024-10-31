/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * Abstract class representing a restaurant menu. 
 * It includes details about the menu name, active period, and menu items.
 * 
 * @author Yi Wu
 */
public abstract class RestaurantMenu {
    
    private String name; // Menu name
    private String period; // Period during which the menu is active
    
    // Objects representing the menu items.
    protected Entree entree;
    protected MainCourse mainCourse;
    protected Dessert dessert;
    protected Drink drink;
    
    /**
     * Gets the name of the menu.
     * 
     * @return The name of the menu.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the menu.
     * 
     * @param name The name to set for the menu.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets the period during which the menu is active.
     * 
     * @return The active period of the menu.
     */
    public String getPeriod() {
        return period;
    }
    
    /**
     * Sets the active period of the menu.
     * 
     * @param period The period to set for the menu.
     */
    public void setPeriod(String period) {
        this.period = period;
    }
    
    /**
     * Populates the menu with items specific to the season.
     */
    public abstract void populateMenu();
    
    /**
     * Returns the menu contents as a string representation.
     * 
     * @return A string representation of the menu.
     */
    @Override
    public String toString() {
        return "The " + name + "\nActive: " + period + "\n\n" +
               "Entrees:\n" + entree + "\n\n" +
               "Main Courses:\n" + mainCourse + "\n\n" +
               "Desserts:\n" + dessert + "\n\n" +
               "Drinks:\n" + drink + "\n";
    }
}
