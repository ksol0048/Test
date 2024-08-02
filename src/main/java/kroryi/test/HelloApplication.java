package kroryi.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println("Git 시험");
        System.out.println("Git 소스변경");
    }

    public static void main(String[] args) {
        launch();
    }
}