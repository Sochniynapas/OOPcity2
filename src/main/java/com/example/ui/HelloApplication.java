package com.example.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;




public class HelloApplication extends Application {


    @Override


    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1212, 869);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        GameEngine gameEngine = new GameEngine();
        GameController gameController = new GameController();
        gameEngine.StartGame();




    }

    public static void main(String[] args) {
        launch();
    }


}