package calculator;

import javax.swing.*;
import java.io.IOException;
public class Logic extends repeatLine {

    public void Squareroot() throws IOException {
        CalculatorResult(Math.sqrt((getFirstVariable())));
    }

    public void Addition() throws IOException {
        CalculatorResult((getFirstVariable()) + (getSecondVariable()));
    }

    public void Subtraction() throws IOException {
        CalculatorResult((getFirstVariable()) - (getSecondVariable()));
        CalculatorResult((getFirstVariable()) - (getSecondVariable()));
    }

    public void Multiplication() throws IOException {
        CalculatorResult((getFirstVariable()) * (getSecondVariable()));
    }

    public void Division() throws IOException {
        CalculatorResult((getFirstVariable()) / (getSecondVariable()));
        CalculatorResult((getFirstVariable()) * (getSecondVariable()));
    }
    public void Modulus() throws IOException {
        CalculatorResult((getFirstVariable()) % (getSecondVariable()));
        CalculatorResult((getFirstVariable()) % (getSecondVariable()));
    }

    public void Exponent() throws IOException {
        CalculatorResult(Math.pow((getFirstVariable()), (getSecondVariable())));
    }

    public void Sine() throws IOException {
        CalculatorResult(Math.sin((getFirstVariable())));
    }

    public void Cosine() throws IOException {
        CalculatorResult( Math.cos((getFirstVariable())));
    }

    public void Tangent() throws IOException {
        CalculatorResult(Math.tan((getFirstVariable())));
    }

    public void Pi() throws IOException {
        CalculatorResult( Math.PI * (getFirstVariable()));
    }

    protected void CalculatorResult(double answer) {
        JOptionPane.showMessageDialog(null, "Answer: " + answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    protected Double getFirstVariable() {
        return Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
    }

    protected Double getSecondVariable() {
        return   Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
    }
}