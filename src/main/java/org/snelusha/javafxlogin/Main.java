package org.snelusha.javafxlogin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Scene scene = new Scene(loader.load(), 320, 240);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
//        Scene scene = new Scene(root);
//        stage.setTitle("JavaFX Login");
//        stage.setScene(scene);
//        stage.setResizable(false);
//        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}