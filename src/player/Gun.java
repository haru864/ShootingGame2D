package src.player;

import java.awt.Polygon;
import java.io.PipedOutputStream;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Point;

import src.Main;
import src.bullet.PlayerBullet;

public class Gun {
    public Polygon gun;
    public static int HEAD_TO_TAIL = 30; // 自機の機首から尾翼までの長さ
    public static int LEFT_TO_RIGHT = 60; // 自機の主翼の長さ
    public static int MOVEMENT_UNIT = 5;

    // コンストラクタ
    public Gun() {
        int[] xList = { 30, 60, 50, 40, 30, 20, 10, 0 };
        int[] yList = { 0, 24, 30, 20, 30, 20, 30, 24 };
        gun = new Polygon(xList, yList, xList.length);
    }

    // コンストラクタ
    public Gun(int x, int y) {
        this();
        for (int i = 0; i < this.gun.xpoints.length; i++) {
            this.gun.xpoints[i] += x;
            this.gun.ypoints[i] += y;
        }
    }

    // 自機の描画
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.YELLOW);
        g2d.fill(this.gun);
        g2d.setColor(Color.BLACK);
        g2d.draw(this.gun);
    }

    // 左に移動
    public void moveLeftGun() {
        for (int i = 0; i < this.gun.xpoints.length; i++) {
            this.gun.xpoints[i] -= MOVEMENT_UNIT;
        }
    }

    // 右に移動
    public void moveRightGun() {
        for (int i = 0; i < this.gun.xpoints.length; i++) {
            this.gun.xpoints[i] += MOVEMENT_UNIT;
        }
    }

    // 上に移動
    public void moveUpGun() {
        for (int i = 0; i < this.gun.xpoints.length; i++) {
            this.gun.ypoints[i] -= MOVEMENT_UNIT;
        }
    }

    // 下に移動
    public void moveDownGun() {
        for (int i = 0; i < this.gun.xpoints.length; i++) {
            this.gun.ypoints[i] += MOVEMENT_UNIT;
        }
    }

    // 前後左右の座標を返す
    public int getEdge(String dir) {
        int min_x, max_x, min_y, max_y;
        min_x = min_y = Integer.MAX_VALUE;
        max_x = max_y = Integer.MIN_VALUE;

        for (int x : this.gun.xpoints) {
            min_x = Math.min(min_x, x);
            max_x = Math.max(max_x, x);
        }

        for (int y : this.gun.ypoints) {
            min_y = Math.min(min_y, y);
            max_y = Math.max(max_y, y);
        }

        if (dir == "left")
            return min_x;
        if (dir == "right")
            return max_x;
        if (dir == "top")
            return min_y;
        if (dir == "bottom")
            return max_y;
        else
            return -1;
    }

    public void setGun() {
    }

    public Point getGun(String LR) {
        Point p = new Point();
        double x, y;
        x = y = 0;
        int len = this.gun.xpoints.length;

        if (LR == "left") {
            x = (this.gun.xpoints[0] + this.gun.xpoints[len - 1]) / 2;
            y = (this.gun.ypoints[0] + this.gun.ypoints[len - 1]) / 2;
        } else if (LR == "right") {
            x = (this.gun.xpoints[0] + this.gun.xpoints[1]) / 2;
            y = (this.gun.ypoints[0] + this.gun.ypoints[1]) / 2;
        }

        p.setLocation(x, y);
        return p;
    }
}
