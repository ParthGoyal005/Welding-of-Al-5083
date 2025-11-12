package com.example.welding;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class SceneUtil {
    public static void newScene(String directory, ActionEvent event)
    {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(directory));
            javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 625, 430);
            stage.setTitle("Ship deck welding");
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
        }
    }

    public static void newScene2(String directory, MouseEvent event)
    {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(directory));
            javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load(), 625, 430);
            stage.setTitle("Ship deck welding");
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
        }
    }
}
