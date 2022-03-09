package src.player;

import java.awt.Polygon;
import java.awt.Graphics2D;
import java.awt.Color;

public class Gun {
    private Polygon gun;

    public Gun() {
        int[] xList = { 12, 26, 25, 19, 13, 9, 1, 0 };
        int[] yList = { 0, 19, 20, 11, 20, 11, 20, 19 };
        gun = new Polygon(xList, yList, xList.length);
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.YELLOW);
        g2d.fill(gun);
        g2d.setColor(Color.BLACK);
        g2d.draw(gun);
    }

    public void moveLeftGun() {
    }

    public void moveRightGun() {
    }

    public void setGun() {
    }
}
