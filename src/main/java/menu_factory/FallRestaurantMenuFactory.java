/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;
import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.FallDessert;
import components.FallDrink;
import components.FallEntree;
import components.FallMainCourse;

/**
 * Factory for creating Fall menu items. 
 * Implements methods to create specific drinks, entrees, main courses, and desserts for the Fall season.
 * 
 * @author Yi Wu
 */
public class FallRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates a drink for the Fall menu.
     * 
     * @return The drink created.
     */
    @Override
    public Drink createDrink() {
        // Add the required code here to return a Fall drink
        return new FallDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
         // Add the required code here to return a Fall main course
        return new FallMainCourse();
    }
     /**
     * Creates an entree for the Fall menu.
     * 
     * @return The entree created.
     */
    @Override    
    public Entree createEntree() {
        // Add the required code here to return a Fall entree
        return new FallEntree();
    }
    /**
     * Creates a dessert for the Fall menu.
     * 
     * @return The dessert created.
     */
    @Override    
    public Dessert createDessert() {
        // Add the required code here to return a Fall dessert
        return new FallDessert();
    }    
}
