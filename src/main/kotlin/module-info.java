module com.example.jesus_pol_act10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.jesus_pol_act10 to javafx.fxml;
    exports com.example.jesus_pol_act10;
}