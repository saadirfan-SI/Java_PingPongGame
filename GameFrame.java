import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GamePanel panel;

    GameFrame() {
        // Create a new GamePanel and add it to the frame
        panel = new GamePanel();
        this.add(panel);

        this.setTitle("Pong Game"); // Set the title of the frame
        this.setResizable(false); // Disable frame resizing
        this.setBackground(Color.black); // Set the background color of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the frame is closed
        this.pack(); // Pack the components in the frame
        this.setVisible(true); // Set the frame to be visible
        this.setLocationRelativeTo(null); // Center the frame on the screen
    }
}
