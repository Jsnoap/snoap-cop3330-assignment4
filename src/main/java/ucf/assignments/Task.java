/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jordan Snoap
 */

package ucf.assignments;

import java.time.LocalDate;

/*
PSEUDOCODE GENERAL IDEA: The "Task" class gives the project a place to refer to to create task messages for displaying.
The main components of the class are getters and setters that give the task its date and description.
It also will have a method to bring together the date and description into a message to display to the user.
This class will work with the "TaskListController" to give functionality to the "TaskListScreen"
 */
public class Task {

    // These are the variables/attributes that make up this Class and will be referred to in the implementation of the code
    private LocalDate date;
    private String description;

    // This is the Constructor for the Class. Since the Constructor code is simple, I wrote it out to better picture functionality
    public Task(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    @Override
    public String toString(){
        /*
        This method will be used to compile the description and date into a coherent message
        that can be displayed as a task item on the screen.
        It will return a string of the message that was produced and displayed
         */
        return "";
    }

    /*
    The following methods in the class are simple getters and setters which will allow for the creation of the
    task descriptions and the associated dates.
     */
    public LocalDate getDate() {
        // Gets the date supplied
        return date;
    }

    public void setDate(LocalDate date) {
        // Allows for the date to be set at a later time if needed
        this.date = date;
    }

    public String getDescription() {
        // Gets the description supplied
        return description;
    }

    public void setDescription(String description) {
        // Allows for the description to be set at a later time if needed
        this.description = description;
    }
}
