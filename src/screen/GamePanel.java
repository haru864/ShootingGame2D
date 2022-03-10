package src.screen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

import src.Main;
import src.player.Gun;

public class GamePanel extends JPanel implements KeyListener {
    public Gun player;

    public GamePanel() {
        this.setPreferredSize(new Dimension(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
        this.setBackground(Color.black);

        // KeyLietenerを追加
        this.setFocusable(true); // パネルでキーを受付ける
        this.addKeyListener(this);

        // 自機オブジェクトを生成
        player = new Gun((Main.SCREEN_WIDTH - Gun.LEFT_TO_RIGHT) / 2,
                Main.SCREEN_HEIGHT - Gun.HEAD_TO_TAIL - 20);
    }

    // 背景と自機を描画
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setBackground(Color.black);
        g2.clearRect(0, 0, getWidth(), getHeight());
        player.draw(g2);
        // paintメソッドはコンポーネントを画面に表示したり、
        // 画面サイズの変更で再描画するタイミングでコールされる。
        // System.out.println("paint");
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT
                && player.getEdge("left") >= Gun.MOVEMENT_UNIT) {
            player.moveLeftGun();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT
                && player.getEdge("right") <= (Main.SCREEN_WIDTH - Gun.MOVEMENT_UNIT)) {
            player.moveRightGun();
        } else if (e.getKeyCode() == KeyEvent.VK_UP
                && player.getEdge("top") >= Gun.MOVEMENT_UNIT) {
            player.moveUpGun();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN
                && player.getEdge("bottom") <= Main.SCREEN_HEIGHT - Gun.MOVEMENT_UNIT) {
            player.moveDownGun();
        }
        repaint(); // call paint() method
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void update(Graphics g) {
        paint(g);
    }
}
