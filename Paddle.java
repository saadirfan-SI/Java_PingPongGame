import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle {

    int id;           // Identifier for the paddle.
    int yVelocity;    // Velocity of the paddle in the y-direction.
    int speed = 10;   // Speed of the paddle.

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e) {
        switch (id) {
            case 1:
                // If player 1 pressed the W key, move the paddle upwards.
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed);
                }
                // If player 1 pressed the S key, move the paddle downwards.
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed);
                }
                break;
            case 2:
                // If player 2 pressed the UP arrow key, move the paddle upwards.
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(-speed);
                }
                // If player 2 pressed the DOWN arrow key, move the paddle downwards.
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(speed);
                }
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (id) {
            case 1:
                // If player 1 released the W key, stop the vertical movement of the paddle.
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(0);
                }
                // If player 1 released the S key, stop the vertical movement of the paddle.
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0);
                }
                break;
            case 2:
                // If player 2 released the UP arrow key, stop the vertical movement of the paddle.
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(0);
                }
                // If player 2 released the DOWN arrow key, stop the vertical movement of the paddle.
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(0);
                }
                break;
        }
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    public void move() {
        y = y + yVelocity; // Updates the y-coordinate of the paddle based on its velocity.
    }

    public void draw(Graphics g) {
        if (id == 1)
            g.setColor(Color.blue);
        else
            g.setColor(Color.red);
        g.fillRect(x, y, width, height); // Draws the paddle as a filled rectangle.
    }
}
