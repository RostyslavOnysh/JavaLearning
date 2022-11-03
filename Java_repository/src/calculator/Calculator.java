package calculator;

import java.io.*;
import java.lang.*;
import javax.swing.JOptionPane;

public class Calculator extends Logic {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Calculator otp = new Calculator();
        String choice1 = JOptionPane.showInputDialog
                ("Mathematical operations list:" + "-\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Square Root\n7.Exponent\n8.Pi\n9.Sine\n10.Cosine\n11.Tangent\nEnter the number of the mathematical operation of your choice");
        int choice = Integer.parseInt(choice1);
        if (choice == 1) {
            otp.Addition();
        } else if (choice == 2) {
            otp.Subtraction();
        } else if (choice == 3) {
            otp.Multiplication();
        } else if (choice == 4) {
            otp.Division();
        } else if (choice == 5) {
            otp.Modulus();
        } else if (choice == 6) {
            otp.Squareroot();
        } else if (choice == 7) {
            otp.Exponent();
        } else if (choice == 8) {
            otp.Pi();
        } else if (choice == 9) {
            otp.Sine();
        } else if (choice == 10) {
            otp.Cosine();
        } else if (choice == 11) {
            otp.Tangent();
        } else {
            JOptionPane.showMessageDialog(null, "Enter a number between 1 and 11",
                    "info", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}


//