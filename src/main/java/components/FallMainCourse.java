/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a main course item for the Fall menu.
 * Contains multiple main course options available during the Fall season.
 * 
 * @author Yi Wu
 */
public class FallMainCourse implements MainCourse {

    // List to store all the main course items for Fall
    private final List<String> mainCourses;

    /**
     * Constructor for FallMainCourse.
     * Initializes the main course list for the Fall menu.
     */
    public FallMainCourse() {
        // Initializing the list with the main courses available for the Fall season
        mainCourses = Arrays.asList("Salmon Avocado Toast", "\nPesto Chicken Penne Asiago", "\nPortobello Mushroom Chicken");
    }

    /**
     * Returns a string representation of the Fall main courses.
     * 
     * @return The names of the Fall main courses.
     */
    @Override
    public String toString() {
        return String.join(", ", mainCourses);
    }
}
