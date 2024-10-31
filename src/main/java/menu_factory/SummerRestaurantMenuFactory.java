/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;
import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.SummerDessert;
import components.SummerDrink;
import components.SummerEntree;
import components.SummerMainCourse;

/**
 * Factory for creating Summer menu items.
 * Implements methods to create specific drinks, entrees, main courses, and desserts for the Summer season.
 * 
 * @author Yi Wu
 */
public class SummerRestaurantMenuFactory implements RestaurantMenuFactory {
   
    /**
     * Creates a drink for the Summer menu.
     * 
     * @return The drink created.
     */
    @Override
    public Drink createDrink() {
        return new SummerDrink();
    }
    
    /**
     * Creates a main course for the Summer menu.
     * 
     * @return The main course created.
     */
    @Override
    public MainCourse createMainCourse() {
        return new SummerMainCourse();
    }

    /**
     * Creates an entree for the Summer menu.
     * 
     * @return The entree created.
     */
    @Override    
    public Entree createEntree() {
        return new SummerEntree();
    }

    /**
     * Creates a dessert for the Summer menu.
     * 
     * @return The dessert created.
     */
    @Override    
    public Dessert createDessert() {
        return new SummerDessert();
    }
}
