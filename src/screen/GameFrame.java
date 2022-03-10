package src.screen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.plaf.DimensionUIResource;

import src.Main;

import java.awt.Color;
import java.awt.Dimension;

public class GameFrame extends JFrame {
    public JPanel gamePanel;

    public GameFrame() {
        gamePanel = new GamePanel();

        this.setTitle("2Dシューティング");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        this.getContentPane().setPreferredSize(new Dimension(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));

        this.add(gamePanel);
        // this.setLocationRelativeTo(null);
        this.setLocation(200, 200);
        this.pack();
        this.setVisible(true);
    }
}
