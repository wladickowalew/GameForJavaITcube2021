import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class MyPanel extends JPanel {
    BufferedImage grass;
    Hero hero;

    public MyPanel(){
        setLayout(null);
        hero = new Hero(0, 0);
        try {
            grass = ImageIO.read(new File("Images\\grass.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int yg = 0; yg < 600; yg+=50) {
            for (int xg = 0; xg < 800; xg += 50) {
                g.drawImage(grass, xg, yg, null);
            }
        }
        hero.draw(g);
    }
}
