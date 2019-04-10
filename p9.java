package application;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;


public class p9 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Text nameLabel = new Text("Name");
        TextField nameText = new TextField();
        Text dobLabel = new Text("Date of Birth");
        DatePicker datePicker = new DatePicker();
        Text genderLabel = new Text("Gender");
        ToggleGroup groupGender  = new ToggleGroup();
        RadioButton maleButton = new RadioButton("Male");
        maleButton.setToggleGroup(groupGender);
        RadioButton femaleButton = new RadioButton("Female");
        femaleButton.setToggleGroup(groupGender);

        Text nptel = new Text("Have you Registered for NPTEL?");
        ToggleGroup group = new ToggleGroup();
        ToggleButton yes = new ToggleButton("Yes");
        yes.setToggleGroup(group);
        yes.setUserData(yes);
        ToggleButton no = new ToggleButton("No");
        no.setUserData(no);
        no.setToggleGroup(group);

        Text locationLabel = new Text("location");
        ChoiceBox loc = new ChoiceBox();
        loc.getItems().addAll("Bangalore","Vishakhapatnam","Hyderabad","Chennai","Delhi","Mumbai");
        loc.getSelectionModel().selectFirst();
        Button buttonRegister = new Button("Register");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(500,600);
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(10);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);
        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);
        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleButton, 1, 2);
        gridPane.add(femaleButton, 2, 2);
        gridPane.add(nptel, 0, 3);
        gridPane.add(yes, 1, 3);
        gridPane.add(no, 2, 3);
        gridPane.add(locationLabel, 0, 6);
        gridPane.add(loc, 1, 6);

        Text Resp = new Text();
        gridPane.add(Resp, 1, 15);
        gridPane.add(buttonRegister, 2, 8);

        buttonRegister.setText("Submit");
        buttonRegister.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Registration Complete");
                System.out.println("Name: " + nameText.getText());
                System.out.println("DoB: "+datePicker.getValue());
                System.out.println("Location: "+loc.getValue());
                Resp.setText("Registration Complete");
            }
        });

        buttonRegister.setStyle("-fx-background-color:Red;-fx-textfill:white;");
        Resp.setStyle("-fx-font:normal bold 15px 'serif'");
        nameLabel.setStyle("-fx-font:normal bold 15px 'serif'");
        dobLabel.setStyle("-fx-font:normal bold 15px 'serif'");
        locationLabel.setStyle("-fx-font:normal bold 15px 'serif'");
        nptel.setStyle("-fx-font:normal bold 15px 'serif'");
        genderLabel.setStyle("-fx-font:normal bold 15px 'serif'");

        gridPane.setStyle("-fx-background-color:BEIGE;");
        try {
            Scene scene = new Scene(gridPane);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("Registration Form");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
