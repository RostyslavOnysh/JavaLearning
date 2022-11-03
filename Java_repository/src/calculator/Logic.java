package calculator;

import javax.swing.*;
import java.io.IOException;

public class Logic extends repeatLine{
    public void Squareroot() throws IOException {
        String sqrt1;
        sqrt1 = JOptionPane.showInputDialog("Enter the number");
        double sqrt = Double.parseDouble(sqrt1);
        double ans = Math.sqrt(sqrt);
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Addition() throws IOException {
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
        String mul11, mul21;
        mul11 = JOptionPane.showInputDialog("Enter the first number");
        mul21 = JOptionPane.showInputDialog("Enter the second number");
        double mul1 = Double.parseDouble(mul11);
        double mul2 = Double.parseDouble(mul21);
        double ans = mul1 * mul2;
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Division() throws IOException {
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
        String exp11, exp21;
        exp11 = JOptionPane.showInputDialog("Enter the base number");
        exp21 = JOptionPane.showInputDialog("Enter the power number");
        double exp1 = Double.parseDouble(exp11);
        double exp2 = Double.parseDouble(exp21);
        double ans = Math.pow(exp1, exp2);
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Sine() throws IOException {
        String sin1;
        sin1 = JOptionPane.showInputDialog("Enter the number");
        double sin = Double.parseDouble(sin1);
        double ans = Math.sin(sin);
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Cosine() throws IOException {
        String cos1;
        cos1 = JOptionPane.showInputDialog("Enter the number");
        double cos = Double.parseDouble(cos1);
        double ans = Math.cos(cos);
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Tangent() throws IOException {
        String tan1;
        tan1 = JOptionPane.showInputDialog("Enter the number");
        double tan = Double.parseDouble(tan1);
        double ans = Math.tan(tan);
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Pi() throws IOException {
        String pi1;
        pi1 = JOptionPane.showInputDialog("Enter the number");
        double pi = Double.parseDouble(pi1);
        double ans = Math.PI * pi;
        JOptionPane.showMessageDialog(null, "Answer: " + ans, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }
}
