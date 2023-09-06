module QuaternaryCalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;
    requires junit;

    opens QuaternaryCalculator to javafx.fxml;
    exports QuaternaryCalculator;
}
