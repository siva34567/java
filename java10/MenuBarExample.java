import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class MenuBarExample extends Application {
    // Launch the application
    public void start(Stage stage) {
        // Set title for the stage
        stage.setTitle("Creating MenuBar");

        // Create a menu
        Menu menu = new Menu("Menu");

        // Create menu items
        MenuItem menuItem1 = new MenuItem("Menu Item 1");
        MenuItem menuItem2 = new MenuItem("Menu Item 2");
        MenuItem menuItem3 = new MenuItem("Menu Item 3");

        // Add menu items to the menu
        menu.getItems().addAll(menuItem1, menuItem2, menuItem3);

        // Label to display events
        Label label = new Label("No menu item selected");

        // Create events for menu items
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                label.setText(((MenuItem) e.getSource()).getText() + " selected");
            }
        };

        // Add event handlers to menu items
        menuItem1.setOnAction(event);
        menuItem2.setOnAction(event);
        menuItem3.setOnAction(event);

        // Create a menu bar
        MenuBar menuBar = new MenuBar();
        // Add menu to menu bar
        menuBar.getMenus().add(menu);

        // Create a VBox layout
        VBox vBox = new VBox(menuBar, label);
        // Create a scene
        Scene scene = new Scene(vBox, 500, 300);
        // Set the scene
        stage.setScene(scene);
        // Show the stage
        stage.show();
    }

    public static void main(String[] args) {
        // Launch the application
        launch(args);
    }
}
