package src.screen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import src.Main;

import java.awt.Dimension;

public class GameFrame extends JFrame {
    public JPanel gamePanel;
    public static Thread t;

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

        Thread drawingThread = new Thread(() -> {
            t = new Thread() {
                public void run() {
                    Thread ct = Thread.currentThread();
                    while (t == ct) {
                        try {
                            Thread.sleep(10);
                            gamePanel.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                }
            };
            t.start();
        });
        drawingThread.start();
        System.out.println(Thread.activeCount());
    }
}
