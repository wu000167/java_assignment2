/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a main course item for the Winter menu.
 * Contains multiple main course options available during the Winter season.
 * 
 * @author Yi Wu
 */
public class WinterMainCourse implements MainCourse {

    // List to store all the main course items for Winter
    private final List<String> mainCourses;

    /**
     * Constructor for WinterMainCourse.
     * Initializes the main course list for the Winter menu.
     */
    public WinterMainCourse() {
        // Initializing the list with the main courses available for the Winter season
        mainCourses = Arrays.asList("Sirloin", "\nSalmon Croquettes", "\nSteak and Fries");
    }

    /**
     * Returns a string representation of the Winter main courses.
     * 
     * @return The names of the Winter main courses.
     */
    @Override
    public String toString() {
        return String.join(", ", mainCourses);
    }
}
