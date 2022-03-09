package src.bullet;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class EnemyBullet {
    private Ellipse2D bullet;
    private Rectangle r = new Rectangle(8, -15, 10, 15); // 中心のX座標とY座標、幅と高さ

    public EnemyBullet() {
        bullet = new Ellipse2D.Double();
        bullet.setFrame(r);
    }

    public EnemyBullet(int x, int y) {
        this();
        r.x += x;
        r.y += y;
        bullet.setFrame(r);
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.yellow);
        g2d.fill(bullet);
        g2d.setColor(Color.black);
        g2d.draw(bullet);
    }
}
