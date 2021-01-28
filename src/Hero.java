import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hero {
    private int x, y;
    private BufferedImage image;

    public Hero(int x, int y){
        this.x = x;
        this.y = y;
        try {
            image = ImageIO.read(new File("Images\\Hangehog.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stepX(int x){
        this.x += x;
    }

    public void stepY(int y){
        this.y += y;
    }

    public void draw(Graphics g){
        g.drawImage(image, x, y, 50, 50, null);
    }
}
