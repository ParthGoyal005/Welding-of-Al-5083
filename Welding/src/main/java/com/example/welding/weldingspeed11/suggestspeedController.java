package com.example.welding.weldingspeed11;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class suggestspeedController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void print(ActionEvent event) {
        SceneUtil.newScene("zprint/printView.fxml", event);
    }

    @FXML
    void initialize() {

    }

}
