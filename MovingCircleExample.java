import javax.swing.*;
import java.awt.*;

public class MovingCircleExample extends JPanel {

    // Circle properties
    private int x = 0; // Initial x-coordinate
    private int y = 0; // y-coordinate (fixed)
    private int diameter = 50; // Circle diameter
    private int dx = 5; // Change in x (speed)
    private int dy = 5; // Change in y (speed)
    private boolean flag = false;


    // Timer and duration
    private Timer timer; // The animation timer
    private int elapsedTime = 0; // Time counter in milliseconds
    private final int duration = 5000; // Animation duration in milliseconds (10 seconds)

    public MovingCircleExample() {
        // Create a timer to update the circle's position
        timer = new Timer(30, e -> updateAnimation());
        timer.start();
    }

    // Method to update the animation
    private void updateAnimation() {
        elapsedTime += 30; // Increment elapsed time by timer interval (30 ms)
        
        if (elapsedTime >= duration && flag == false) {
            
           

            //reset the ball
            x = (int)(Math. random() * 800);
            y = (int)(Math. random() * 400);

            // inc speed
            dx += 1; 
            dy += 1; 

            //reset time
            elapsedTime = 0;       
        }

        x += dx; // Update x-coordinate
        if (x + diameter > getWidth() || x < 0) { // Bounce off edges
            dx = -dx; // Reverse direction
        }

        y += dy; // Update x-coordinate
        if (y + diameter > getHeight() || y < 0) { // Bounce off edges
            dy = -dy; // Reverse direction
        }

        repaint(); // Refresh the panel
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Clear the panel

        // Set the background color
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw the moving circle
        g.setColor(Color.BLACK);
        g.fillOval(x, y, diameter, diameter);
    }

    public static void main(String[] args) {
        // Set up the frame
        JFrame frame = new JFrame("Moving Circle (20 seconds)");
        MovingCircleExample panel = new MovingCircleExample();
        frame.add(panel);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
