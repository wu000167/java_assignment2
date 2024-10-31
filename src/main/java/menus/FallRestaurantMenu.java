/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import menu_factory.RestaurantMenuFactory;

/**
 * Represents the Fall restaurant menu. 
 * Populates the menu with items specific to the Fall season.
 * 
 * @author Yi Wu
 */
public class FallRestaurantMenu extends RestaurantMenu {
    
    RestaurantMenuFactory theFactory;
    
    /**
     * Constructor for FallRestaurantMenu.
     * 
     * @param factory The factory used to create Fall menu items.
     */
    public FallRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    /**
     * Populates the Fall menu with specific items.
     */
    @Override
    public void populateMenu() {
        System.out.println("Adding items to " + getName());
        this.entree = theFactory.createEntree();
        this.mainCourse = theFactory.createMainCourse();
        this.dessert = theFactory.createDessert();
        this.drink = theFactory.createDrink();
        
    }
}
