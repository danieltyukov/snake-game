import javax.swing.JFrame;

public class Game extends JFrame {

  Game() {
    Game panel = new Game();
    this.add(panel);
    this.setTitle("Snake Game");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }
}
