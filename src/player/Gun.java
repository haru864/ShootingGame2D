package src.player;

import java.awt.Polygon;
import java.awt.BasicStroke;

import src.Main;

import java.awt.Graphics2D;
import java.awt.Color;

public class Gun {
    private Polygon gun;
    public static int HEAD_TO_TAIL = 30; // 自機の機首から尾翼までの長さ
    public static int LEFT_TO_RIGHT = 60; // 自機の主翼の長さ

    public Gun() {
        int[] xList = { 30, 60, 50, 40, 30, 20, 10, 0 };
        int[] yList = { 0, 24, 30, 20, 30, 20, 30, 24 };
        gun = new Polygon(xList, yList, xList.length);
    }

    public Gun(int x, int y) {
        this();
        for (int i = 0; i < gun.xpoints.length; i++) {
            gun.xpoints[i] += x;
            gun.ypoints[i] += y;
        }
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.YELLOW);
        g2d.fill(gun);
        g2d.setColor(Color.BLACK);
        g2d.draw(gun);
        // paintメソッドはコンポーネントを画面に表示したり、
        // 画面サイズの変更で再描画するタイミングでコールされる。
        // System.out.println("print");
    }

    public void moveLeftGun() {
    }

    public void moveRightGun() {
    }

    public void setGun() {
    }
}
