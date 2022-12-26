import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exitBelt extends simpleBelt {

    private Color light;

    public exitBelt(int x, int y) {
        super(x, y);
        light = Color.darkGray;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.gray);
        g2d.fillRect(this.x + 100, this.y + 20, 30, 45);

        g2d.setColor(light);
        g2d.fillOval(this.x + 105, this.y + 35, 20, 20);
        light = Color.darkGray;

        super.paint(g2d);
    }

    @Override
    public void move() {
        super.move();
        light = Color.green;
    }

}