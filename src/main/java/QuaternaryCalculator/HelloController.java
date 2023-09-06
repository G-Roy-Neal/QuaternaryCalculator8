package QuaternaryCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label TopLabel = new Label("");
    @FXML
    private Label TypeLabel = new Label("qrt");

    int quartNumber1 = 0;
    String labelNumber = "";
    String operand = null;
    boolean quart = true;
    boolean operandClicked = false;
    boolean equalsClicked = false;

//Resets the label to blank
    private void resetLabel() {
        TopLabel.setText("");
        labelNumber = "";
    }
//Holds the first number in the label until an operand is clicked
    private void clickedFlip() {
        if (operandClicked) {
            resetLabel();
            operandClicked = false;
        }
    }
//Creates new operation if equals has been clicked and a new number is pressed
    private void equalsFlip() {
        if (equalsClicked) {
            resetLabel();
            equalsClicked = false;
        }
    }
//Makes sure all operations are done in Quart
    private void switchToQuart() {
        if (!quart) {
            TopLabel.setText(String.valueOf(Calculator.decToQuart(Integer.parseInt(TopLabel.getText()))));
            TypeLabel.setText("qrt");
            quart = true;
        }
    }
//Toggles the operation between decimal and quart
    public void onButtonToggleClick(ActionEvent actionEvent) {
        if (quart) {
            TopLabel.setText(String.valueOf(Calculator.quartToDec(Integer.parseInt(TopLabel.getText()))));
            TypeLabel.setText("dec");
            quart = false;
        } else {
            switchToQuart();
        }
    }

//-------------1st Row-------------------------
    public void onButton0Click(ActionEvent actionEvent) {
        switchToQuart();
        equalsFlip();
        clickedFlip();
        labelNumber = labelNumber + "0";
        TopLabel.setText(labelNumber);
    }

    public void onButton1Click(ActionEvent actionEvent) {
        switchToQuart();
        equalsFlip();
        clickedFlip();
        labelNumber = labelNumber + "1";
        TopLabel.setText(labelNumber);
    }

    public void onButton2Click(ActionEvent actionEvent) {
        switchToQuart();
        equalsFlip();
        clickedFlip();
        labelNumber = labelNumber + "2";
        TopLabel.setText(labelNumber);
    }

    public void onButton3Click(ActionEvent actionEvent) {
        switchToQuart();
        equalsFlip();
        clickedFlip();
        labelNumber = labelNumber + "3";
        TopLabel.setText(labelNumber);
    }

//-------------2nd Row-------------------------
    public void onButtonPlusClick(ActionEvent actionEvent) {
        quartNumber1 = Integer.parseInt(TopLabel.getText());
        operand = "add";
        operandClicked = true;
        switchToQuart();
    }

    public void onButtonMinusClick(ActionEvent actionEvent) {
        quartNumber1 = Integer.parseInt(TopLabel.getText());
        operand = "sub";
        operandClicked = true;
        switchToQuart();
    }

    public void onButtonMultiplyClick(ActionEvent actionEvent) {
        quartNumber1 = Integer.parseInt(TopLabel.getText());
        operand = "mul";
        operandClicked = true;
        switchToQuart();
    }

    public void onButtonDivideClick(ActionEvent actionEvent) {
        quartNumber1 = Integer.parseInt(TopLabel.getText());
        operand = "div";
        operandClicked = true;
        switchToQuart();
    }

//-------------3rd Row-------------------------
    public void onButtonEqualsClick(ActionEvent actionEvent) {
        int result = Calculator.calculate(quartNumber1, operand, Integer.parseInt(TopLabel.getText()));
        TopLabel.setText(String.valueOf(result));
        equalsClicked = true;
    }

    public void onButtonClearClick(ActionEvent actionEvent) {
        resetLabel();
    }

    public void onButtonSquareClick(ActionEvent actionEvent) {
        int result = Calculator.calculate(Integer.parseInt(TopLabel.getText()), "square");
        TopLabel.setText(String.valueOf(result));
        equalsClicked = true;
    }

    public void onButtonSqrootClick(ActionEvent actionEvent) {
        int result = Calculator.calculate(Integer.parseInt(TopLabel.getText()), "sqroot");
        TopLabel.setText(String.valueOf(result));
        equalsClicked = true;
    }
}