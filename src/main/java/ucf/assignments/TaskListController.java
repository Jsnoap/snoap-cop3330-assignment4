/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jordan Snoap
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

/*
PSEUDOCODE GENERAL IDEA: The "TaskListController" Class links with the "TaskListScreen" .fxml file and allows
for all of the functionality associated with creating an individual "To do" list.
Once the "Add List" button is clicked from the "HomeScreen" this controller will implement methods for the "TaskListScreen".
This includes methods to save a list, load a list, add a task (description + date),
edit a task (description + date), remove a list, mark a task as completed/uncompleted, filter tasks with status
of completed/uncompleted, and return to the "HomeScreen"
This will implement the "Task" and "List" class to aid in accomplishing these functions
 */
public class TaskListController {

    // These are the variables/attributes that make up this Class and will be referred to in the implementation of the code later
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    public Button addButton;
    @FXML
    public DatePicker datePicker;
    @FXML
    public TextField taskText;
    // Using created Task Class to store the task data with a ListView component in SceneBuilder
    @FXML
    public ListView<Task> listData;
    @FXML
    public Pane goBack;
    @FXML
    public Button removeList;
    @FXML
    public MenuItem saveIndividualList;
    @FXML
    public MenuItem loadIndividualList;
    @FXML
    public Button editTaskDesc;
    @FXML
    public Button removeTask;
    @FXML
    public Button markComplete;
    @FXML
    public Button editTaskDate;
    @FXML
    public MenuItem allTasksShown;
    @FXML
    public MenuItem completedTasksShown;
    @FXML
    public MenuItem uncompletedTasksShown;
    @FXML
    public Button goBackHome;

    // This method may be needed later to implement functionality. For now it can be ignored.
    /*@FXML
    public void initialize(URL url, ResourceBundle rb){
        datePicker.setValue(LocalDate.now());
    }
     */

    // Similar to ArrayList but allows for more functionality in this case to track changes to the task
    public ObservableList<Task> list = FXCollections.observableArrayList();

    // FileChooser will be used to implement save and load functionalities for all items of an individual list
    public FileChooser fileChooser = new FileChooser();


    @FXML
    private String addTask (Event e){
        /*
        This function will use the "Task" class and add the date and description to the ObservableList
        to show on the screen. When the user clicks the "Add Task" button after entering in what they desire,
        this method will be triggered to show what they set.
        It will return a String of the task message that it output to the screen.
         */

        return "";
    }

    public void goBackHomeButtonClicked(ActionEvent actionEvent) throws IOException {
        /*
        This method is linked with the "Go Back" button on the "TaskListScreen" and it will let the
        user return to the "HomeScreen" when they desire.
        Once again, I understand that this assignment is primarily pseudocode, but I implemented this
        functionality to allow me to better picture how the app would navigate.
         */
        Parent root = FXMLLoader.load(getClass().getResource("HomeScreen.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public boolean saveButtonClicked(ActionEvent actionEvent) {
        /*
        This function is called when the "Save" button is clicked from the menu bar of the app.
        It should prompt the opening of the Save dialogue and allow the user to save their lists.
        It will save the file and return true if completed successfully.
        This save button will save the list that is currently displayed on the "TaskListScreen"
         */

        return true;
    }

    public boolean loadButtonClicked(ActionEvent actionEvent) {
        /*
        This function is called when the "Load" button is clicked from the menu bar of the app.
        It should prompt the opening of the Load dialogue and allow the user to load their past lists.
        It will load the file and return true if completed successfully.
        This load button will load a singular list and its tasks that was previously displayed and saved.
         */

        return true;
    }

    public String editTaskButtonClicked(ActionEvent actionEvent) {
        /*
        This method is linked with the "Edit Task" button.
        It will allow the user to edit a previously created tasks description and then return the
        newly edited message.
        It will be linked with the "Task" Class and specifically it's "description" variable to allow for this to
        be changed.
         */

        return "";
    }

    public boolean removeTaskButtonClicked(ActionEvent actionEvent) {
        /*
        This method will be linked with the red text "Remove Task" button on the "TaskListScreen".
        It will also use the "Task" class and will be able to delete a past entry including its
        description and date that was set.
        It should return true if the previous entry that was attempting to be deleted is no longer shown.
         */

        return true;
    }

    public boolean markCompleteButtonClicked(ActionEvent actionEvent) {
        /*
        This method is linked with the "Mark/Unmark Complete" button on the "TaskListScreen".
        There may need to be a boolean parameter added to the "Task" Class for this functionality,
        but the goal of this button is to set when a task has been completed (this could be linked to a true or false variable).
        This function will also be paired with the "SplitMenuButton" to be able to filter the
        list and only show completed or uncompleted tasks.
        It will return a boolean of true when the task is completed or false when it is uncompleted
         */

        return true;
    }

    public int allTasksDisplayedChosen(ActionEvent actionEvent) {
        /*
        This task will be linked with the Split Menu Button in the "TaskListScreen".
        It will be used to display all tasks in the list when the all option is selected.
        It should be compatible with the "Mark/Unmark Complete" button to know what to show.
        It will return an int of the amount of lists that fall in this category.
         */
        return 1;
    }

    public int completedTasksDisplayedChosen(ActionEvent actionEvent) {
        /*
        This task will be linked with the Split Menu Button in the "TaskListScreen".
        It will be used to display all completed tasks in the list when the completed option is selected.
        It should be compatible with the "Mark/Unmark Complete" button to know what to show.
        It will return an int of the amount of lists that fall in this category.
        This int value plus the value from the uncompleted tasks option should sum to the all tasks option int
        value.
         */
        return 1;
    }

    public int uncompletedTasksDisplayedChosen(ActionEvent actionEvent) {
        /*
        This task will be linked with the Split Menu Button in the "TaskListScreen".
        It will be used to display all uncompleted tasks in the list when the uncompleted option is selected.
        It should be compatible with the "Mark/Unmark Complete" button to know what to show.
        It will return an int of the amount of lists that fall in this category.
        This int value plus the value from the completed tasks option should sum to the all tasks option int
        value.
         */
        return 1;
    }

    public boolean removeListButtonClicked(ActionEvent actionEvent) {
        /*
        This method is linked with the "Remove List" button on the "TaskListScreen".
        When the button is hit, it should delete the list and its contents from the "TaskListScreen"
        as well as the "HomeScreen".
        It will return a value of true when the list removal has been completed.
         */

        return true;
    }
}