module com.example.welding {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.welding to javafx.fxml;
    exports com.example.welding;

    opens com.example.welding.landing to javafx.fxml;
    exports com.example.welding.landing;

    opens com.example.welding.challenges to javafx.fxml;
    exports com.example.welding.challenges
            ;
    exports com.example.welding.importance;
    opens com.example.welding.importance to javafx.fxml;

    exports com.example.welding.expertsystem;
    opens com.example.welding.expertsystem to javafx.fxml;

    exports com.example.welding.material1;
    opens com.example.welding.material1 to javafx.fxml;

    exports com.example.welding.thickness2;
    opens com.example.welding.thickness2 to javafx.fxml;

    exports com.example.welding.joint2;
    opens com.example.welding.joint2 to javafx.fxml;

    exports com.example.welding.baking3;
    opens com.example.welding.baking3 to javafx.fxml;

    exports com.example.welding.powersource4;
    opens com.example.welding.powersource4 to javafx.fxml;

    exports com.example.welding.sheildinggas5;
    opens com.example.welding.sheildinggas5 to javafx.fxml;

    exports com.example.welding.fillerwire6;
    opens com.example.welding.fillerwire6 to javafx.fxml;

    exports com.example.welding.diameter7;
    opens com.example.welding.diameter7 to javafx.fxml;

    exports com.example.welding.feedrate8;
    opens com.example.welding.feedrate8 to javafx.fxml;

    exports com.example.welding.curcuitrate9;
    opens com.example.welding.curcuitrate9 to javafx.fxml;

    exports com.example.welding.tubedistance10;
    opens com.example.welding.tubedistance10 to javafx.fxml;

    exports com.example.welding.weldingspeed11;
    opens com.example.welding.weldingspeed11 to javafx.fxml;

    exports com.example.welding.zprint;
    opens com.example.welding.zprint to javafx.fxml;


}