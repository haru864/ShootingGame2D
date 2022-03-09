package src.player;

import java.awt.Polygon;
import java.awt.Graphics2D;
import java.awt.Color;

public class Gun {
    private Polygon gun;

    public Gun() {
        int[] xList = { 30, 60, 50, 40, 30, 20, 10, 0 };
        int[] yList = { 0, 24, 30, 20, 30, 20, 30, 24 };
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
