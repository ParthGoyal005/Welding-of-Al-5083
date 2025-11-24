package com.example.welding.tubedistance10;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class suggestdistanceController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void weldSpeed(ActionEvent event) {
        SceneUtil.newScene("weldingspeed11/weldingspeedView.fxml", event);
    }

    @FXML
    void initialize() {

    }

}
