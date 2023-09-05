module QuaternaryCalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens QuaternaryCalculator to javafx.fxml;
    exports QuaternaryCalculator;
}