/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jordan Snoap
 */
package ucf.assignments;

/*
PSEUDOCODE GENERAL IDEA: The "List" class has been created to work with other classes in the code and allow for
access to already created lists from the "HomeScreen".
The app must hold 100 lists so there should be a way to refer to the past lists and access them as needed.
This class aids in that process.
 */
public class List {

    // This is the variable/attribute that make up this simple Class and will be referred to in the implementation of the code
    // Other variables may be added if there is a need to increase the abilities of this class
    private String listName;

    // This is a simple Constructor for the class which has been coded up. It will allow the creation of instances
    public List(String listName) {
        this.listName = listName;
    }

    /*
    The following methods in the class are simple getters and setters which will allow for access to the
    list name (to set or receive).
     */
    public String getListName() {
        // Gets the name of the list
        return listName;
    }

    public void setListName(String listName) {
        // Allows the setting of the list name
        this.listName = listName;
    }
}
