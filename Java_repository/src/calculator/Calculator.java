package calculator;

import java.io.*;
import java.lang.*;
import javax.swing.JOptionPane;

public class Calculator extends Logic {
    public static void main(String[] args) throws IOException {
        InputStreamReader InputStreamReader = new InputStreamReader(System.in);
        BufferedReader BufferedReader = new BufferedReader(InputStreamReader);
        Calculator calculator = new Calculator();
        String choice1 = JOptionPane.showInputDialog
                ("Mathematical operations list:" + "-\n1.Addition" +
                        "\n2.Subtraction" +
                        "\n3.Multiplication" +
                        "\n4.Division" +
                        "\n5.Modulus" +
                        "\n6.Square Root" +
                        "\n7.Exponent" +
                        "\n8.Pi" +
                        "\n9.Sine" +
                        "\n10.Cosine" +
                        "\n11.Tangent" +
                        "\nEnter the number of the mathematical operation of your choice");
        int choice = Integer.parseInt(choice1);
        if (choice == 1) {
            calculator.Addition();
        } else if (choice == 2) {
            calculator.Subtraction();
        } else if (choice == 3) {
            calculator.Multiplication();
        } else if (choice == 4) {
            calculator.Division();
        } else if (choice == 5) {
            calculator.Modulus();
        } else if (choice == 6) {
            calculator.Squareroot();
        } else if (choice == 7) {
            calculator.Exponent();
        } else if (choice == 8) {
            calculator.Pi();
        } else if (choice == 9) {
            calculator.Sine();
        } else if (choice == 10) {
            calculator.Cosine();
        } else if (choice == 11) {
            calculator.Tangent();
        } else {
            JOptionPane.showMessageDialog(null, "Enter a number between 1 and 11",
                    "info", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}


//