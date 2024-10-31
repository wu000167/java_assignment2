/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_building;
import menus.*;

/**
 * Abstract class for building restaurant menus. 
 * It defines the template for creating restaurant menus based on seasons.
 * 
 * @author Yi Wu
 */
public abstract class MenuBuilding {
    /**
     * Creates the restaurant menu based on the season.
     * 
     * @param season The season for which the menu is created.
     * @return The restaurant menu for the specified season.
     */

    protected abstract RestaurantMenu makeMenuBuilding(String season);
    /**
     * Builds the restaurant menu for the specified season and populates it with menu items.
     * 
     * @param season The season for which the menu is built.
     * @return The populated restaurant menu.
     */
    public RestaurantMenu buildRestaurantMenu(String season) {
        RestaurantMenu theMenu = makeMenuBuilding(season);
        theMenu.populateMenu();
        return theMenu;
    }
    
}