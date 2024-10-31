/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;
import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.SpringDessert;
import components.SpringDrink;
import components.SpringEntree;
import components.SpringMainCourse;

/**
 * Factory for creating Spring menu items.
 * Implements methods to create specific drinks, entrees, main courses, and desserts for the Spring season.
 * 
 * @author Yi Wu
 */
public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates a drink for the Spring menu.
     * 
     * @return The drink created.
     */
    @Override
    public Drink createDrink() {
        return new SpringDrink();
    }
    
    /**
     * Creates a main course for the Spring menu.
     * 
     * @return The main course created.
     */
    @Override
    public MainCourse createMainCourse() {
        return new SpringMainCourse();
    }

    /**
     * Creates an entree for the Spring menu.
     * 
     * @return The entree created.
     */
    @Override    
    public Entree createEntree() {
        return new SpringEntree();
    }

    /**
     * Creates a dessert for the Spring menu.
     * 
     * @return The dessert created.
     */
    @Override    
    public Dessert createDessert() {
        return new SpringDessert();
    }
}
