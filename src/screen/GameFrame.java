package src.screen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import src.Main;

import java.awt.Color;
import java.awt.Dimension;

public class GameFrame extends JFrame {
    public JPanel gamePanel;

    public GameFrame() {
        gamePanel = new GamePanel();
        // System.out.println("panel created");

        this.setTitle("2Dシューティング");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);

        this.add(gamePanel);
        // System.out.println("panel added");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
