import java.util.*;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.*;
import java.io.File;
import java.awt.Image;

public class parcel {

    private Random num = new Random();
    private int x;
    private int y;
    private int z;
    private int w;
    private int d;
    private int h;
    private int a;
    private int type;
    private int[] polygonXArray;
    private int[] polygonYArray;
    private Polygon hexFrame;
    private Color parcelColor;
    private BufferedImage img;

    public parcel(int i, int x, int y) {

        setX(x);
        setY(y);

        this.type = i;

        setW(num.nextInt(50-20) + 20);
        setH(num.nextInt(50-20) + 20);
        setD(num.nextInt(50-10) + 10);

        polygonXArray = new int[] {getX(), getX() + getW(), getX() + getW() + getA(), getX() + getW() + getA(), getX() + getA(), getX()};
        polygonYArray = new int[] {getY(), getY(), getY() - getA(), getY() - getH() - getA(), getY() - getH() - getA(), getY() - getH()};
        hexFrame = new Polygon(polygonXArray, polygonYArray, 6);

        setType();

    }

    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(parcelColor);
        g2d.fillPolygon(hexFrame);
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(hexFrame);
		g2d.drawLine(getX(), getY()-getH(), getX()-getW(), getY()-getH());
		g2d.drawLine(getX() - getW() - getA(), getY() - getH() - getA(), getX()-getW(), getY()-getH());
		g2d.drawLine(getX() - getW(), getY(), getX()-getW(), getY()-getH());

    }

    public void move() {
        setX(getX() + 5);
        polygonXArray = new int[] {getX(), getX() - getW(), getX() - getW() - getA(), getX() - getW() - getA(), getX() - getA(), getX()};
        polygonYArray = new int[] {getY(), getY(), getY() - getA(), getY() - getH() - getA(), getY() - getH() - getA(), getY() - getH()};
        hexFrame = new Polygon(polygonXArray, polygonYArray, 6);
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public int getZ() {
        return this.z;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setZ(int z) {
        this.z = z;
    }
    public void setW(int w) {
        this.w = w;
    }
    public void setH(int h) {
        this.h = h;
    }
    public void setD(int d) {
        this.d = d;
        this.a = (int) Math.sqrt(d*d/2);
    }
    public int getA() {
        return this.a;
    }
    public int getW() {
        return this.w;
    }
    public int getH() {
        return this.h;
    }
    public int getD() {
        return this.d;
    }
    public int getType() {
        return this.type;
    }
    public void setType() {
        switch(this.type) {
            case 1:
                this.parcelColor = DistributionCenter.green();
                break;
            case 2:
                this.parcelColor = DistributionCenter.yellow();
                break;
            case 3:
                this.parcelColor = DistributionCenter.blue();
                break;
        }
    }

    

}
