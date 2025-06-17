import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovingTwoObjectsExample extends JPanel {

    private int squareX = 200, squareY = 200; // Initial square position
    private final int squareSize = 50; // Square size

    private int circleX = 300, circleY = 300; // Initial circle position
    private final int circleSize = 30; // Circle size
    private int circleDX = 3, circleDY = 3; // Circle movement speed

    private Timer timer;

    public MovingTwoObjectsExample() {
        // Timer to move the circle automatically
        timer = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveCircle();
                checkCollision();
                // checkInbounds();
                repaint();
            }
        });
        timer.start();

        // Add a key listener for user control of the square
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                moveSquare(e);
                repaint();
            }
        });
        setFocusable(true);
        setFocusTraversalKeysEnabled(false); // Allow arrow keys to be captured
    }

    // Move the square based on key press
    private void moveSquare(KeyEvent e) {
        int step = 10; // Move step size
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                squareY -= step;
                break;
            case KeyEvent.VK_DOWN:
                squareY += step;
                break;
            case KeyEvent.VK_LEFT:
                squareX -= step;
                break;
            case KeyEvent.VK_RIGHT:
                squareX += step;
                break;
        }

        // Ensure the square stays within bounds
        if (squareX < 0) squareX = 0;
        if (squareY < 0) squareY = 0;
        if (squareX + squareSize > getWidth()) squareX = getWidth() - squareSize;
        if (squareY + squareSize > getHeight()) squareY = getHeight() - squareSize;
    }

    // Move the circle automatically
    private void moveCircle() {
        circleX += circleDX;
        circleY += circleDY;

        // Bounce off walls
        if (circleX <= 0 || circleX + circleSize >= getWidth()) {
            circleDX *= -1;
        }
        if (circleY <= 0 || circleY + circleSize >= getHeight()) {
            circleDY *= -1;
        }
    }

    // Check for collision between square and circle
    private void checkCollision() {
        Rectangle squareRect = new Rectangle(squareX, squareY, squareSize, squareSize);
        Rectangle circleRect = new Rectangle(circleX, circleY, circleSize, circleSize);

        if (squareRect.intersects(circleRect)) {
            // Reverse circle direction on collision
            circleDX *= -1;
            circleDY *= -1;

            // Optional: Push the circle slightly to prevent sticking
            if (circleDX > 0) {
                circleX += 5;
            } else {
                circleX -= 5;
            }
            if (circleDY > 0) {
                circleY += 5;
            } else {
                circleY -= 5;
            }
        }
    }

    // public void checkInbounds() {
    //     Rectangle squareRect = new Rectangle(squareX, squareY, squareSize, squareSize);
    //     Rectangle circleRect = new Rectangle(circleX, circleY, circleSize, circleSize);

    //     if (circleX < 0 || circleX + circleSize > getWidth() || circleY < 0 || circleY + circleSize > getHeight()) {
    //         // Reverse circle direction on collision
    //         circleX = getWidth()/2;
    //         circleY = getHeight()/2;
    //     }

    // }

    // Paint the square and circle
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the square
        g.setColor(Color.BLUE);
        g.fillRect(squareX, squareY, squareSize, squareSize);

        // Draw the circle
        g.setColor(Color.RED);
        g.fillOval(circleX, circleY, circleSize, circleSize);
    }

    // Main method to run the program
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Square and Circle");
        MovingTwoObjectsExample panel = new MovingTwoObjectsExample();
        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

