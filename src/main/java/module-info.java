module QuaternaryCalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;
    requires junit;
    requires javafx.graphics;

    opens QuaternaryCalculator to javafx.fxml;
    exports QuaternaryCalculator;
}
