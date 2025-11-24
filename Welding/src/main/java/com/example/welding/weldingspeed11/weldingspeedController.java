package com.example.welding.weldingspeed11;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class weldingspeedController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField rate;

    @FXML
    void next(ActionEvent event) {
        float temp= Float.parseFloat(rate.getText());

        if(temp>406 && temp<610)
        {
            SceneUtil.newScene("zprint/printView.fxml", event);
        }
        else{
            SceneUtil.newScene("weldingspeed11/suggestspeedView.fxml", event);
        }
    }

    @FXML
    void initialize() {
        assert rate != null : "fx:id=\"rate\" was not injected: check your FXML file 'weldingspeedView.fxml'.";

    }

}
