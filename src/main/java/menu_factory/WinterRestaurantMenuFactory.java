/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;
import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.WinterDessert;
import components.WinterDrink;
import components.WinterEntree;
import components.WinterMainCourse;

/**
 * Factory for creating Winter menu items.
 * Implements methods to create specific drinks, entrees, main courses, and desserts for the Winter season.
 * 
 * @author Yi Wu
 */
public class WinterRestaurantMenuFactory implements RestaurantMenuFactory {
    
    /**
     * Creates a drink for the Winter menu.
     * 
     * @return The drink created.
     */
    @Override
    public Drink createDrink() {
        return new WinterDrink();
    }
    
    /**
     * Creates a main course for the Winter menu.
     * 
     * @return The main course created.
     */
    @Override
    public MainCourse createMainCourse() {
        return new WinterMainCourse();
    }

    /**
     * Creates an entree for the Winter menu.
     * 
     * @return The entree created.
     */
    @Override    
    public Entree createEntree() {
        return new WinterEntree();
    }

    /**
     * Creates a dessert for the Winter menu.
     * 
     * @return The dessert created.
     */
    @Override    
    public Dessert createDessert() {
        return new WinterDessert();
    }   
}
