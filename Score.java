import java.awt.*;

public class Score extends Rectangle {

    static int GAME_WIDTH;  // Represents the width of the game area.
    static int GAME_HEIGHT; // Represents the height of the game area.
    int player1;            // Score for player 1.
    int player2;            // Score for player 2.

    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;   // Initializes the game width.
        Score.GAME_HEIGHT = GAME_HEIGHT; // Initializes the game height.
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        // Draws a vertical line to separate the scores.
        g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);

        // Draws the score of player 1 on the left side of the line.
        g.drawString(String.valueOf(player1 / 10) + String.valueOf(player1 % 10), (GAME_WIDTH / 2) - 85, 50);

        // Draws the score of player 2 on the right side of the line.
        g.drawString(String.valueOf(player2 / 10) + String.valueOf(player2 % 10), (GAME_WIDTH / 2) + 20, 50);
    }
}
