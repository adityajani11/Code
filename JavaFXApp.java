import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXApp extends Application {
    private TextField usernameField;
    private PasswordField passwordField;
    private RadioButton maleRadio;
    private RadioButton femaleRadio;
    private ComboBox<String> branchComboBox;
    private TextArea addressArea;
    private CheckBox readingCheckbox;
    private CheckBox travelingCheckbox;
    private CheckBox sportsCheckbox;
    private Label resultLabel;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("User Signup Form");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label usernameLabel = new Label("Username:");
        usernameField = new TextField();
        grid.add(usernameLabel, 0, 0);
        grid.add(usernameField, 1, 0);

        Label passwordLabel = new Label("Password:");
        passwordField = new PasswordField();
        grid.add(passwordLabel, 0, 1);
        grid.add(passwordField, 1, 1);

        Label genderLabel = new Label("Gender:");
        ToggleGroup genderGroup = new ToggleGroup();
        maleRadio = new RadioButton("Male");
        maleRadio.setToggleGroup(genderGroup);
        femaleRadio = new RadioButton("Female");
        femaleRadio.setToggleGroup(genderGroup);
        HBox genderBox = new HBox(10, maleRadio, femaleRadio);
        grid.add(genderLabel, 0, 2);
        grid.add(genderBox, 1, 2);

        Label branchLabel = new Label("Branch:");
        branchComboBox = new ComboBox<>();
        branchComboBox.getItems().addAll("Computer Science", "Electrical Engineering", "Mechanical Engineering");
        grid.add(branchLabel, 0, 3);
        grid.add(branchComboBox, 1, 3);

        Label addressLabel = new Label("Address:");
        addressArea = new TextArea();
        addressArea.setPrefRowCount(3);
        grid.add(addressLabel, 0, 4);
        grid.add(addressArea, 1, 4);

        Label hobbiesLabel = new Label("Hobbies:");
        readingCheckbox = new CheckBox("Reading");
        travelingCheckbox = new CheckBox("Traveling");
        sportsCheckbox = new CheckBox("Sports");
        HBox hobbiesBox = new HBox(10, readingCheckbox, travelingCheckbox, sportsCheckbox);
        grid.add(hobbiesLabel, 0, 5);
        grid.add(hobbiesBox, 1, 5);

        Button signupButton = new Button("Signup");
        signupButton.setOnAction(event -> displayUserData());
        Button clearButton = new Button("Clear");
        clearButton.setOnAction(event -> clearForm());
        HBox buttonBox = new HBox(10, signupButton, clearButton);
        grid.add(buttonBox, 1, 6);

        resultLabel = new Label();
        grid.add(resultLabel, 0, 7, 2, 1);

        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void displayUserData() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String gender = maleRadio.isSelected() ? "Male" : "Female";
        String branch = branchComboBox.getValue();
        String address = addressArea.getText();
        StringBuilder hobbies = new StringBuilder();
        if (readingCheckbox.isSelected()) {
            hobbies.append("Reading, ");
        }
        if (travelingCheckbox.isSelected()) {
            hobbies.append("Traveling, ");
        }
        if (sportsCheckbox.isSelected()) {
            hobbies.append("Sports");
        }
        String hobbiesText = hobbies.toString().isEmpty() ? "None" : hobbies.toString();

        resultLabel.setText("Username: " + username + "\nPassword: " + password + "\nGender: " + gender +
                "\nBranch: " + branch + "\nAddress: " + address + "\nHobbies: " + hobbiesText);
    }

    private void clearForm() {
        usernameField.clear();
        passwordField.clear();
        maleRadio.setSelected(false);
        femaleRadio.setSelected(false);
        branchComboBox.getSelectionModel().clearSelection();
        addressArea.clear();
        readingCheckbox.setSelected(false);
        travelingCheckbox.setSelected(false);
        sportsCheckbox.setSelected(false);
        resultLabel.setText("");
    }

    public static void main(String[] args) {
        launch(args);
    }
}