package src.screen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

import src.Main;
import src.player.Gun;

public class GamePanel extends JPanel {
    public GamePanel() {
        this.setPreferredSize(new Dimension(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
        this.setBackground(Color.black);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.yellow);
        g2.setBackground(Color.black);
        g2.clearRect(0, 0, getWidth(), getHeight());
        Gun gun = new Gun();
        gun.draw(g2);
        // System.out.println("draw");
    }

    public void update(Graphics g) {
        paint(g);
    }
}
