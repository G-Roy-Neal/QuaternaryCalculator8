package QuaternaryCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label TopLabel = new Label("");

    int quartNumber1 = 0;
    String labelNumber = "";
    String operand = null;
    boolean quart = true;

    private void resetLabel() {
        TopLabel.setText("");
        labelNumber = "";
    }

    public void onButtonToggleClick(ActionEvent actionEvent) {
        if (quart) {
            TopLabel.setText(String.valueOf(Calculator.quartToDec(Integer.parseInt(TopLabel.getText()))));
            quart = false;
        } else {
            TopLabel.setText(String.valueOf(Calculator.decToQuart(Integer.parseInt(TopLabel.getText()))));
            quart = true;
        }
    }

//-------------1st Row-------------------------
    public void onButton0Click(ActionEvent actionEvent) {
        labelNumber = labelNumber + "0";
        TopLabel.setText(labelNumber);
    }

    public void onButton1Click(ActionEvent actionEvent) {
        labelNumber = labelNumber + "1";
        TopLabel.setText(labelNumber);
    }

    public void onButton2Click(ActionEvent actionEvent) {
        labelNumber = labelNumber + "2";
        TopLabel.setText(labelNumber);
    }

    public void onButton3Click(ActionEvent actionEvent) {
        labelNumber = labelNumber + "3";
        TopLabel.setText(labelNumber);
    }

//-------------2nd Row-------------------------
    public void onButtonPlusClick(ActionEvent actionEvent) {
        quartNumber1 = Integer.parseInt(TopLabel.getText());
        operand = "add";
        resetLabel();
    }

    public void onButtonMinusClick(ActionEvent actionEvent) {
        quartNumber1 = Integer.parseInt(TopLabel.getText());
        operand = "sub";
        resetLabel();
    }

    public void onButtonMultiplyClick(ActionEvent actionEvent) {
        quartNumber1 = Integer.parseInt(TopLabel.getText());
        operand = "mul";
        resetLabel();
    }

    public void onButtonDivideClick(ActionEvent actionEvent) {
        quartNumber1 = Integer.parseInt(TopLabel.getText());
        operand = "div";
        resetLabel();
    }

//-------------3rd Row-------------------------
    public void onButtonEqualsClick(ActionEvent actionEvent) {
        int result = Calculator.calculate(quartNumber1, operand, Integer.parseInt(TopLabel.getText()));
        TopLabel.setText(String.valueOf(result));
    }

    public void onButtonClearClick(ActionEvent actionEvent) {
        resetLabel();
    }

    public void onButtonSquareClick(ActionEvent actionEvent) {
        int result = Calculator.calculate(Integer.parseInt(TopLabel.getText()), "square");
        TopLabel.setText(String.valueOf(result));
    }

    public void onButtonSqrootClick(ActionEvent actionEvent) {
        int result = Calculator.calculate(Integer.parseInt(TopLabel.getText()), "sqroot");
        TopLabel.setText(String.valueOf(result));
    }
}