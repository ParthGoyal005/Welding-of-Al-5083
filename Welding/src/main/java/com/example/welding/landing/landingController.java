package com.example.welding.landing;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.HelloApplication;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class landingController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void challenges (ActionEvent event)throws Exception {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("challenges/challengesView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle("Ship deck welding");
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
        }
    }

    @FXML
    void expertSystem(ActionEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("expertsystem/expertsystemView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle("Ship deck welding");
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
        }
    }

    @FXML
    void importanceAl(ActionEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("importance/importanceView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 625, 430);
            stage.setTitle("Ship deck welding");
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
        }
    }

    @FXML
    void startWelding(ActionEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("material1/materialView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 625, 430);
            stage.setTitle("Ship deck welding");
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
        }
    }

    @FXML
    void initialize() {

    }

}
