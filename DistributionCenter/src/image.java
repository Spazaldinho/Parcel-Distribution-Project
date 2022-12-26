import java.util.*;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.awt.Image;

public class image {

    private Color c;

    private BufferedImage img;

    public image (int type) {

        switch(type) {
            case 1:
                try { 
                    img = ImageIO.read(new File("B:\\My Documents\\Downloads\\DistributionCenter\\DistributionCenter\\DistributionCenter\\Truck.png"));
                } catch (IOException e) {
                    System.out.println("Domestic Image Error");
                }
                c = DistributionCenter.green();
                break;
            case 2:
                try {
                    img = ImageIO.read(new File("B:\\My Documents\\Downloads\\DistributionCenter\\DistributionCenter\\DistributionCenter\\Unknown.png"));
                } catch (IOException e) {
                    System.out.println("Unknown Image Error");
                }
                c = DistributionCenter.yellow();
                break;
            case 3:
                try {
                    img = ImageIO.read(new File("B:\\My Documents\\Downloads\\DistributionCenter\\DistributionCenter\\DistributionCenter\\Plane.png"));
                } catch (IOException e) {
                    System.out.println("Plane Image Error");
                }
                c = DistributionCenter.blue();
                break;
        }

    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(c);
        g2d.fillRect(25, 425, 150, 150);
        g2d.drawImage(img, 50, 450, 100, 100, null);
        
    }
    
}
