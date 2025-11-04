package com.example.welding.material1;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.DirectoryChooser;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class materialController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> materialCombo;

    @FXML
    private Label selectText;

    @FXML
    void idk(ActionEvent event) {
        newScene("material1/wrongView.fxml", event);
    }

    @FXML
    void next(ActionEvent event) {
        if(materialCombo.getSelectionModel().isSelected(2))
        {
            newScene("joint2/jointView.fxml", event);
        }
        else if(materialCombo.getSelectionModel().isSelected(0))
        {
            selectText.setVisible(true);
        }
        else{
            newScene("material1/wrongView.fxml", event);
        }
    }

    void newScene(String directory, ActionEvent event)
    {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();;
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(directory));
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
        assert materialCombo != null : "fx:id=\"materialCombo\" was not injected: check your FXML file 'materialView.fxml'.";
        materialCombo.getItems().add("Select Item");
        materialCombo.getItems().add("Steel");
        materialCombo.getItems().add("Aluminium 5xxx");
        materialCombo.getItems().add("Aluminium 6xxx");
        materialCombo.getItems().add("Aluminium 4xxx");
        materialCombo.getItems().add("Aluminium 3xxx");
        materialCombo.getSelectionModel().select(0);
    }

}
