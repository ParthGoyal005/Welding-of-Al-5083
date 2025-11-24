package com.example.welding.zprint;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class printController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void exit(ActionEvent event) {
        SceneUtil.closeWindow(event);
    }

    @FXML
    void initialize() {

    }

}
