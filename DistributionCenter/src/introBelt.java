import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class introBelt extends simpleBelt{

    private boolean status;
    private Color light;

    public introBelt(int x, int y) {
        super(x, y);
        status = true;
        light = Color.darkGray;
    }

    public void keyReleased(KeyEvent e) {
        
    }
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
            status = !status;
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.gray);
        g2d.fillRect(this.x + 100, this.y + 20, 30, 45);

        g2d.setColor(light);
        g2d.fillOval(this.x + 105, this.y + 35, 20, 20);

        super.paint(g2d);
    }

    @Override
    public void move() {
        if(status) {
            super.move();
            light = Color.green;
        } else {
            light = Color.DARK_GRAY;
        }
    }

    public boolean getStatus() {
        return this.status;
    }
    
}
