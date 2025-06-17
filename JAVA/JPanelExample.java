import javax.swing.*;
import java.awt.*;

public class JPanelExample {

    // Create a custom JPanel class to override paintComponent
    static class MyPanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // Always call the superclass method first

            // Set a custom color
            g.setColor(Color.WHITE);

            // Draw a filled rectangle
            g.fillRect(0, 0, getWidth(), getHeight());

            // Set another color for text
            g.setColor(Color.BLACK);

            String text = "Custom Painting Example";
            FontMetrics fm = g.getFontMetrics();

            // Calculate the position to center the text
            int x = (getWidth() - fm.stringWidth(text)) / 2;
            int y = (50) ;

            // Draw the text
            g.drawString(text, x, y);

            // Draw diagonal lines
            g.setColor(Color.BLACK);
            
            //head
            g.drawOval(getWidth()/2 - 50, getHeight()/2 - 50, 100, 100);
            
            //body
            g.drawLine(getWidth()/2, getHeight()/2 + 50, getWidth()/2, getHeight()/2 + 200);
            
            //arms
            g.drawLine(getWidth()/2-50, getHeight()/2 + 100, getWidth()/2+50, getHeight()/2 + 100);
            
            //legs
            g.drawLine(getWidth()/2, getHeight()/2 + 200, getWidth()/2 - 50, getHeight()/2 + 250);
            g.drawLine(getWidth()/2, getHeight()/2 + 200, getWidth()/2 + 50, getHeight()/2 + 250);

        }
    }

    public static void main(String[] args) {
        // Create a JFrame to display the custom JPanel
        JFrame frame = new JFrame("Custom Painting Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        // Create an instance of MyPanel (which does custom painting)
        MyPanel panel = new MyPanel();

        // Add the custom panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
