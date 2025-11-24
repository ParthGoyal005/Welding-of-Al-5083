package com.example.welding.feedrate8;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class suggestfeedController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void curcuitRate(ActionEvent event) {
        SceneUtil.newScene("curcuitrate9/curcuitrateView.fxml", event);
    }

    @FXML
    void initialize() {

    }

}
