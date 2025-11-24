package com.example.welding.feedrate8;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class feedController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField rate;

    @FXML
    void next(ActionEvent event) {
        float temp= Float.parseFloat(rate.getText());

        if(temp>6350 && temp<10160)
        {
            SceneUtil.newScene("curcuitrate9/curcuitrateView.fxml", event);
        }
        else{
            SceneUtil.newScene("feedrate8/suggestfeedView.fxml", event);
        }
    }

    @FXML
    void initialize() {
        assert rate != null : "fx:id=\"rate\" was not injected: check your FXML file 'feedView.fxml'.";

    }

}
