package fxmlexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMLExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));
        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(new Scene(root, 330, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
//https://docs.oracle.com/javase/8/javafx/get-started-tutorial/fxml_tutorial.htm