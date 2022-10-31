package experementalUI;

import javax.swing.*;
import java.awt.*;

public class SimpleAnnimation {
    private JFrame frame;
    private int x = 5;
    private int y = 5;


    static SimpleAnnimation animation;

    public static void main(String[] args) {
        animation = new SimpleAnnimation();
        animation.buildGUI();
        for (int i = 0; i <= 300; i += 1) {
            animation.setCoordinates(i, i);
            animation.frame.repaint();      // JVM uses new co-ordinates in paintComponent() to repaint the ball
            try {
                Thread.sleep(10);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
    public void buildGUI(){
        frame = new JFrame("Simple animation");
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        frame.setContentPane(new DrawPanel(new BorderLayout()));
                        frame.setSize(400, 500);
                        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                    }
                }
        );

    }
    // GETTERS
    int getX(){
        return x;
    }

    int getY(){
        return y;
    }

    // SETTERS
    void setCoordinates(int newX, int newY){
        x = newX;
        y = newY;
    }

    class DrawPanel extends JPanel{
        public DrawPanel(LayoutManager layout){
            super(layout);
        }

        @Override
        public void paintComponent(Graphics g){
            g.setColor(Color.ORANGE);
            g.fillOval(animation.getX(), animation.getY(), 100, 100);
        }
    }
}

//////
