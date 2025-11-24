package com.example.welding.fillerwire6;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class fillerwireController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label selectText;

    @FXML
    private ComboBox<String> wireCombo;

    @FXML
    void next(ActionEvent event) {
        if(wireCombo.getSelectionModel().isSelected(2))
        {
            SceneUtil.newScene("diameter7/diameterView.fxml", event);
        }
        else if(wireCombo.getSelectionModel().isSelected(0))
        {
            selectText.setVisible(true);
        }
        else{
            SceneUtil.newScene("fillerwire6/suggestwireView.fxml", event);
        }
    }

    @FXML
    void suggestWire(ActionEvent event) {
        SceneUtil.newScene("fillerwire6/suggestwireView.fxml", event);
    }

    @FXML
    void initialize() {
        assert wireCombo != null : "fx:id=\"wireCombo\" was not injected: check your FXML file 'fillerwireView.fxml'.";
        wireCombo.getItems().add("Select Item");
        wireCombo.getItems().add("ER5356");
        wireCombo.getItems().add("ER5183");
        wireCombo.getItems().add("ER5556");

        wireCombo.getSelectionModel().select(0);
    }

}
