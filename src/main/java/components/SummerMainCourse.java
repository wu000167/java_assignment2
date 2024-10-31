/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a main course item for the Summer menu.
 * Contains multiple main course options available during the Summer season.
 * 
 * @author Yi Wu
 */
public class SummerMainCourse implements MainCourse {

    // List to store all the main course items for Summer
    private final List<String> mainCourses;

    /**
     * Constructor for SummerMainCourse.
     * Initializes the main course list for the Summer menu.
     */
    public SummerMainCourse() {
        // Initializing the list with the main courses available for the Summer season
        mainCourses = Arrays.asList("Beef Tartare", "\nSpiced Cauliflower", "\nChinook Salmon");
    }

    /**
     * Returns a string representation of the Summer main courses.
     * 
     * @return The names of the Summer main courses.
     */
    @Override
    public String toString() {
        return String.join(", ", mainCourses);
    }
}
