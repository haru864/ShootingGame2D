package src.bullet;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class PlayerBullet {
    public Ellipse2D bullet;
    public int WIDTH = 6;
    public int HEIGHT = 10;
    public Rectangle r = new Rectangle(0, 0, this.WIDTH, this.HEIGHT); // 中心のX座標とY座標、幅と高さ

    public PlayerBullet() {
        bullet = new Ellipse2D.Double();
        bullet.setFrame(r);
    }

    public PlayerBullet(int x, int y) {
        this();
        r.x += x;
        r.y += y;
        bullet.setFrame(r);
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.CYAN);
        g2d.fill(bullet);
        g2d.setColor(Color.BLACK);
        g2d.draw(bullet);
    }
}
