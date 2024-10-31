/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package menu_factory;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * Interface for restaurant menu factories. 
 * Defines the methods for creating different types of menu items.
 * 
 * @author Yi Wu
 */
public interface RestaurantMenuFactory {
    
    /**
     * Creates a drink for the menu.
     * 
     * @return The drink created.
     */
    public Drink createDrink();
    
    /**
     * Creates a main course for the menu.
     * 
     * @return The main course created.
     */
    public MainCourse createMainCourse();
    
    /**
     * Creates an entree for the menu.
     * 
     * @return The entree created.
     */
    public Entree createEntree();
    
    /**
     * Creates a dessert for the menu.
     * 
     * @return The dessert created.
     */
    public Dessert createDessert();
}
