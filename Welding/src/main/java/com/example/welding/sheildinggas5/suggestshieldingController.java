package com.example.welding.sheildinggas5;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class suggestshieldingController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void fillerWire(ActionEvent event) {
        SceneUtil.newScene("fillerwire6/fillerwireView.fxml", event);
    }

    @FXML
    void initialize() {

    }

}
