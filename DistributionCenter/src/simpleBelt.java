import java.util.*;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.*;
import java.io.File;
import java.awt.Image;

public class simpleBelt {

    protected int x;
    protected int y;
    protected int beltH;
    protected int beltW;
    protected int nOfLines;
    protected int spacing;
    protected int wheelSpacing;
    protected int wheelSize;
    protected int lx;
    protected int ly;
    protected int wx;
    protected int wy;
    private int counter1;
    private int counter2;
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private int y1;
    private int y2;
    private int y3;
    private int y4;

    public simpleBelt(int x, int y) {
        this.x = x;
        this.y = y;
        this.lx = this.x;
        this.ly = this.y;
        beltH = 75;
        beltW = 60;
        nOfLines = 10;
        spacing = 50;
        wheelSpacing = 25;
        wheelSize = 20;
        wx = this.x + 8;
        wy = this.y + 3;
        this.x1 = this.x + 18;
        this.x2 = this.x1;

        this.y1 = this.y + 4;
        this.y2 = this.y1 + 18;

        this.x3 = this.x + 8;
        this.x4 = this.x3 + 20;

        this.y3 = this.y + 14;
        this.y4 = this.y3;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillPolygon(new int[] {x - beltW, x - beltW + 500, x + 500, x}, new int[] {y - beltH + 15, y - beltH + 15, y + 15, y + 15}, 4);;
        
        g2d.setColor(Color.darkGray);
        g2d.fillRoundRect(x, y, 500, 25, 30, 75);

        g2d.setColor(Color.black);

        for(int i = 0; i < nOfLines + 1; i++) {
            if(this.lx - 10 + i * this.spacing >= x + 495) {
                lx -= 50;
            }
            g2d.drawLine(this.lx - this.beltW + i * this.spacing, this.ly - this.beltH + 15, this.lx - 10 + i * this.spacing, this.ly);
        }

        

        for (int i = 0; i < wheelSpacing; i++) {
            g2d.setColor(Color.gray);

            g2d.fillOval(this.wx + i * wheelSpacing, this.wy, wheelSize, wheelSize);

            g2d.setColor(Color.black);

            g2d.drawLine(x1 + i * wheelSpacing, y2, x2 + i * wheelSpacing, y1);
            g2d.drawLine(x3 + i * wheelSpacing, y3, x4 + i * wheelSpacing, y4);
        }
    }

    public void move() {

        this.lx = lx + 5;
        counter1++;
        if(counter1 % 4 == 0) {
            counter2++;
            if (counter2 % 2 == 0) {
                this.x1 = this.x + 18;
                this.x2 = this.x1;

                this.y1 = this.y + 4;
                this.y2 = this.y1 + 18;

                this.x3 = this.x + 8;
                this.x4 = this.x3 + 20;

                this.y3 = this.y + 14;
                this.y4 = this.y3;
            } else {
                this.x1 = this.wx + 3;
                this.x2 = this.wx + 17;
                this.y1 = this.wy + 3;
                this.y2 = this.wy + 17;
                this.x3 = this.x2;
                this.x4 = this.x1;
                this.y3 = this.y2;
                this.y4 = this.y1;
            }
        }

    }
    
}
