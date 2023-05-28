import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {

    Random random;          // Random number generator for initial direction.
    int xVelocity;          // Velocity of the ball in the x-direction.
    int yVelocity;          // Velocity of the ball in the y-direction.
    int initialSpeed = 2;   // Initial speed of the ball.

    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();

        // Randomly sets the initial x-direction of the ball.
        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection * initialSpeed);

        // Randomly sets the initial y-direction of the ball.
        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0)
            randomYDirection--;
        setYDirection(randomYDirection * initialSpeed);
    }

    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void move() {
        x += xVelocity; // Updates the x-coordinate of the ball based on its velocity.
        y += yVelocity; // Updates the y-coordinate of the ball based on its velocity.
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, height, width); // Draws the ball as a filled oval.
    }
}
