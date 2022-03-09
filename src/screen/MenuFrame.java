package src.screen;

import java.awt.Color;

import javax.swing.JFrame;

import src.Main;

public class MenuFrame extends JFrame {
    public MenuFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        this.getContentPane().setBackground(Color.black);
        this.setVisible(true);
    }
}
