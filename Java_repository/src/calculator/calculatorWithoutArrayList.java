package calculator;

import java.io.*;
import java.lang.*;
import javax.swing.JOptionPane;

public class calculatorWithoutArrayList {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        calculatorWithoutArrayList otp = new calculatorWithoutArrayList();
        String choice1 = JOptionPane.showInputDialog
                ("Mathematical operation list :" +
                        " -\\n1.Addition" +
                        "\\n2.Subtraction" +
                        "\\n3.Multiplication" +
                        "\\n4.Division" +
                        "\\n5.Modulus" +
                        "\\n6.Square Root" +
                        "\\n7.Exponent" +
                        "\\n8.Pi" +
                        "\\n9.Sine" +
                        "\\n10.Cosine" +
                        "\\n11.Tangent" +
                        "\\nEnter the number of the mathematical operation of your choice");
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

    public void Squareroot() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String sqrt1;
        sqrt1 = JOptionPane.showInputDialog("Enter the number");
        double sqrt = Double.parseDouble(sqrt1);
        double ans = Math.sqrt(sqrt);
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Addition() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String add11, add21;
        add11 = JOptionPane.showInputDialog("Enter the first number");
        add21 = JOptionPane.showInputDialog("Enter the second number");
        double add1 = Double.parseDouble(add11);
        double add2 = Double.parseDouble(add21);
        double ans = add1 + add2;
        JOptionPane.showMessageDialog(null, "Answer: "
                + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Subtraction() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String sub11, sub21;
        sub11 = JOptionPane.showInputDialog("Enter the first number");
        sub21 = JOptionPane.showInputDialog("Enter the second number");
        double sub1 = Double.parseDouble(sub11);
        double sub2 = Double.parseDouble(sub21);
        double ans = sub1 - sub2;
        double rev = sub2 - sub1;
        JOptionPane.showMessageDialog(null, "Answer: "
                + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Reverse Answer: "
                + rev, "Reverse Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Multiplication() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String mul11, mul21;
        mul11 = JOptionPane.showInputDialog("Enter the first number");
        mul21 = JOptionPane.showInputDialog("Enter the second number");
        double mul1 = Double.parseDouble(mul11);
        double mul2 = Double.parseDouble(mul21);
        double ans = mul1 * mul2;
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Division() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String div11, div21;
        div11 = JOptionPane.showInputDialog("Enter the first number");
        div21 = JOptionPane.showInputDialog("Enter the second number");
        double div1 = Double.parseDouble(div11);
        double div2 = Double.parseDouble(div21);
        double ans = div1 / div2;
        double rev = div2 / div1;
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Reverse Answer: " + rev, "Reverse Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Modulus() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String mod11, mod21;
        mod11 = JOptionPane.showInputDialog("Enter the first number");
        mod21 = JOptionPane.showInputDialog("Enter the second number");
        double mod1 = Double.parseDouble(mod11);
        double mod2 = Double.parseDouble(mod21);
        double ans = mod1 % mod2;
        double rev = mod2 % mod1;
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Reverse Answer: " + rev, "Reverse Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Exponent() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String exp11, exp21;
        exp11 = JOptionPane.showInputDialog("Enter the base number");
        exp21 = JOptionPane.showInputDialog("Enter the power number");
        double exp1 = Double.parseDouble(exp11);
        double exp2 = Double.parseDouble(exp21);
        double ans = Math.pow(exp1, exp2);
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Sine() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String sin1;
        sin1 = JOptionPane.showInputDialog("Enter the number");
        double sin = Double.parseDouble(sin1);
        double ans = Math.sin(sin);
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Cosine() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String cos1;
        cos1 = JOptionPane.showInputDialog("Enter the number");
        double cos = Double.parseDouble(cos1);
        double ans = Math.cos(cos);
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Tangent() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String tan1;
        tan1 = JOptionPane.showInputDialog("Enter the number");
        double tan = Double.parseDouble(tan1);
        double ans = Math.tan(tan);
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Pi() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String pi1;
        pi1 = JOptionPane.showInputDialog("Enter the number");
        double pi = Double.parseDouble(pi1);
        double ans = Math.PI * pi;
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

}
