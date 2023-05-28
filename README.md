Pong Game
This is a simple implementation of the classic Ping Pong game using Java and Swing. It consists of several classes that handle different aspects of the game.

Classes:

Score
The Score class represents the score display in the game. It extends the Rectangle class and contains information about the game's width, height, and the scores of player 1 and player 2. It provides methods for drawing the score on the screen.

Ball
The Ball class represents the game ball. It extends the Rectangle class and contains information about its position, size, and velocity. The ball can move within the game area and bounce off the walls and paddles. It provides methods for setting its direction, moving, and drawing on the screen.

Paddle
The Paddle class represents a player's paddle. It extends the Rectangle class and contains information about its position, size, and velocity. The paddles can move up and down and are controlled by the players. It provides methods for handling key events to move the paddles and drawing them on the screen.

GamePanel
The GamePanel class represents the main game panel. It extends the JPanel class and implements the Runnable interface to create a separate thread for the game loop. It manages the game objects, such as paddles, ball, and score, and handles the game logic, including collision detection and updating the game state. It provides methods for drawing the game objects, handling user input, and running the game loop.

GameFrame
The GameFrame class represents the game window. It extends the JFrame class and creates an instance of the GamePanel class to add to the frame. It sets up the frame's properties, such as title, size, and visibility, and provides a container for the game panel.

PongGame
The PongGame class serves as the main class of the game. It contains the main method and creates an instance of the GameFrame class to start the game.

Getting Started
To run the game, compile and execute the PongGame class. Once the game window appears, players can control the paddles using the specified keys and try to score points by hitting the ball past the opponent's paddle.

Feel free to explore and modify the code to enhance the game or add new features.

Enjoy playing Ping Pong!
