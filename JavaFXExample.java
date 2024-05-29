import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class JavaFXExample extends Application {

    @Override
    public void start(Stage stage) {
        // Create a button
        Button myButton = new Button("Click Me!");

        // Create a layout pane (e.g., HBox)
        HBox layout = new HBox();
        layout.getChildren().add(myButton);

        // Create a scene
        Scene scene = new Scene(layout, 300, 200);

        // Set the scene on the stage and show the stage
        stage.setScene(scene);
        stage.setTitle("My JavaFX App");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}