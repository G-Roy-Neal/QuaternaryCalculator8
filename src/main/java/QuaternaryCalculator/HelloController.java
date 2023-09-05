package QuaternaryCalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label button0;

    @FXML
    protected void onButton0Click() {
        button0.setText("0");
    }
    @FXML
    protected void onButton1Click() {
        button0.setText("1");
    }
    @FXML
    protected void onButton2Click() {
        button0.setText("2");
    }
    @FXML
    protected void onButton3Click() {
        button0.setText("3");
    }
}