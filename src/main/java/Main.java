import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    private static final String DEFAULT_FILE_PATH = "duke/example.txt";
    // ...

    // Existing constructor
    public Main(String filePath) {
        // ...
    }

    // Overloaded constructor
    public Main() {
        this(DEFAULT_FILE_PATH);
    }

    @Override
    public void start(Stage stage) {
        Label helloWorld = new Label("Hello World!"); // Creating a new Label control
        Scene scene = new Scene(helloWorld); // Setting the scene to be our Label

        stage.setScene(scene); // Setting the stage to show our scene
        stage.show(); // Render the stage.
    }
}

