import javax.swing.*;
import java.awt.*;

public class scanner {

    private int a;
    private int b;
    private Polygon p1;
    private Polygon p2;
    private Color c1;
    private Color c2;

    public scanner() {
        a = 390;
        b = 325;
        p1 = new Polygon(new int[] {a - 50, a + 50, a + 265, a + 315, a + 50, a}, new int[] {b - 200, b - 200, b-340, b -290, b + 75, b - 150}, 6);
        p2 = new Polygon(new int[] {a, a + 100, a + 315, a + 315, a + 100, a}, new int[] {b - 150, b - 150, b - 290, b + 220, b + 75, b + 75}, 6);
        c1 = new Color(179, 125, 209);
        c2 = new Color(120, 84, 140);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(c1);
        g2d.fillPolygon(p1);
        g2d.setColor(Color.black);
        g2d.drawPolygon(p1);
        
        g2d.setColor(c2);
        g2d.fillPolygon(p2);

        g2d.setColor(Color.black);
        g2d.drawLine(a + 50, b - 200, a + 100, b - 150);
        g2d.drawPolygon(p2);
    }
    
}
