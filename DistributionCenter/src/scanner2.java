import javax.swing.*;
import java.awt.*;

public class scanner2{

    private int a;
    private int b;
    private Polygon p;
    private Color c;

    public scanner2() {
        a = 390;
        b = 325;
        p = new Polygon(new int[] {a - 50, a - 50, a, a}, new int[] {b - 200, b + 15, b + 75, b - 200}, 4);
        c = new Color(66, 47, 77);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.black);
        g2d.drawPolygon(p);
        g2d.setColor(c);
        g2d.fillPolygon(p);



    }
    
}
