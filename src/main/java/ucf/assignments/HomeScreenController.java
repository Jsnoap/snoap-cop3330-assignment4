/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jordan Snoap
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;

/*
PSUEDOCODE GENERAL IDEA: The main functionality of the "HomeScreenController" Class is to allow the proper
functioning of the buttons on the "HomeScreen.fxml" of the app. It should bring the user to the "TaskListScreen.fxml"
when the "Add List" button is pressed and bring back a way to refer to a created list.
The menu bar is also given functionality in this Class to allow the user to save/load multiple lists from the home page.
 */
public class HomeScreenController {

    // These are the variables/attributes that make up this Class and will be referred to in the implementation of the code later
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    public Button addList;
    @FXML
    public Label welcomeText;
    @FXML
    public MenuItem saveLists;
    @FXML
    public MenuItem loadLists;

    // FileChooser will be used to implement save and load functionalities for multiple lists
    public FileChooser fileChooser = new FileChooser();

    // Occurs on click of "Add List" button
    // I implemented functionality to change screens just to better picture how to app would function. I understand that this assignment is primarily pseduocode
    public List continueToTaskListScreen(ActionEvent actionEvent) throws IOException {
        /*
        This is prompted when the "Add List" button is clicked, so it should progress the user to the
        screen to create their list, add tasks, etc.
        It should also be able to return "List" Class to populate the home screen with the created list and allow user to
        refer back to a created list
         */
        Parent root = FXMLLoader.load(getClass().getResource("TaskListScreen.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        return null;
    }

    public boolean saveButtonClicked(ActionEvent actionEvent) {
        /*
        This function is called when the "Save" button is clicked from the menu bar of the app.
        It should prompt the opening of the Save dialogue and allow the user to save their lists.
        It will save the file and return true if completed successfully
        This save button will save items from all lists that would be seen on the "HomeScreen" page.
         */

        return true;
    }

    public boolean loadButtonClicked(ActionEvent actionEvent) {
        /*
        This function is called when the "Load" button is clicked from the menu bar on the top of the app.
        It should prompt the opening of the Load dialogue with the file directories and allow the user to load their past lists.
        It will load the file and return true if completed successfully.
        This load button will open the multiple lists that would be seen on the "HomeScreen" page.
         */

        return true;
    }

}
