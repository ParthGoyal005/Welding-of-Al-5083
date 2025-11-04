module com.example.welding {
    requires javafx.controls;
    requires javafx.fxml;


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

    exports com.example.welding.joint2;
    opens com.example.welding.joint2 to javafx.fxml;


}