/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a main course item for the Spring menu.
 * Contains multiple main course options available during the Spring season.
 * 
 * @author Yi Wu
 */
public class SpringMainCourse implements MainCourse {

    // List to store all the main course items for Spring
    private final List<String> mainCourses;

    /**
     * Constructor for SpringMainCourse.
     * Initializes the main course list for the Spring menu.
     */
    public SpringMainCourse() {
        // Initializing the list with the main courses available for the Spring season
        mainCourses = Arrays.asList("Sunny Rise Burger", "\nCalifornia Spring Salad", "\nCrispy Chicken Sandwich");
    }

    /**
     * Returns a string representation of the Spring main courses.
     * 
     * @return The names of the Spring main courses.
     */
    @Override
    public String toString() {
        return String.join(", ", mainCourses);
    }
}
