import javax.swing.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class DistributionCenter extends JPanel{

    private parcel[] shivam  = new parcel[20];
    private image[] imgArray = {new image(1), new image(2), new image(3)};
    private exitBelt[] exit = {new exitBelt(700, 350), new exitBelt(700, 500), new exitBelt(700, 200)};
    private introBelt b = new introBelt(-50, 300);
    private static int frameWidth = 1020;
    private static int frameHeight = 640;
    private Random rand = new Random();
    private scanner2 s1 = new scanner2();
    private scanner s2 = new scanner();
    private static Color blue = new Color(82, 147, 204);
    private static Color green = new Color(129, 222, 174);
    private static Color yellow = new Color(245, 212, 83);

    public DistributionCenter() {
        for(int i = 0; i < shivam.length; i++) {
            shivam[i] = new parcel(rand.nextInt(3) + 1, i * -1 * 430, 285);            
        }

        addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
			b.keyReleased(e);
			}
			@Override
			public void keyPressed(KeyEvent e) {
			b.keyPressed(e);
			}
			});
			setFocusable(true);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        s1.paint(g2d);
        b.paint(g2d);

        for(exitBelt z:exit) {
            z.paint(g2d);
        }
        for(parcel z:shivam) {
            z.paint(g2d);
        }

        s2.paint(g2d);

        g2d.setColor(Color.lightGray);
        g2d.fillRect(420, 285, 45, 65);
        g2d.setColor(Color.darkGray);
        for (int i = 0; i < shivam.length; i++) {
            if(shivam[i].getX() >= 475 && shivam[i].getX() <= 700) {
                imgArray[shivam[i].getType() - 1].paint(g2d);
                g2d.setColor(Color.green);
            }
        }
        g2d.fillOval(425, 300, 35, 35);
    }

    public void move() {
        for(parcel z:shivam) {
            if (z.getX() >= 473 || b.getStatus() && z.getX() <= frameWidth) {
                z.move();
            }
            if (z.getX() == 675) {
                switch(z.getType()) {
                    case 1:
                        z.setY(z.getY() + 50);
                        break;
                    case 2:
                        z.setY(z.getY() + 200);
                        break;
                    case 3:
                        z.setY(z.getY() - 100);
                        break;
                }
            }

            if (z.getX() >= 600 && z.getX() <= 1020) {
                exit[z.getType() - 1].move();
            }
        }
        b.move();
    }

    public static void main(String[] args) throws InterruptedException {
        
        JFrame frame = new JFrame("Math is like eating pineapple...");
		DistributionCenter DistroCenter = new DistributionCenter();
		frame.setSize(frameWidth, frameHeight);
		frame.setVisible(true);
        frame.add(DistroCenter);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true) {
            DistroCenter.move();
            DistroCenter.repaint();
            Thread.sleep(75);
        }

    }

    public static Color blue() {
        return blue;
    }
    public static Color yellow() {
        return yellow;
    }
    public static Color green() {
        return green;
    }
}
