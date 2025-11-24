package com.example.welding.curcuitrate9;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class suggestrateController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void tubeDistance(ActionEvent event) {
        SceneUtil.newScene("tubedistance10/tubedistanceView.fxml", event);
    }

    @FXML
    void initialize() {

    }

}
