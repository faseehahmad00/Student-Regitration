package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("signin.fxml"));
        primaryStage.setTitle("WELCOME TO STUDENT REGISTRATION");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setFullScreenExitHint("");
        primaryStage.setFullScreen(true);
    }


    public static void main(String[] args) {
        launch(args);
    }

}

