package com.example.welding.diameter7;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class diameterController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void feedRate(ActionEvent event) {
        SceneUtil.newScene("feedrate8/feedView.fxml", event);
    }

    @FXML
    void initialize() {

    }

}
