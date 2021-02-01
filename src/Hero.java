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
        if (this.x >= Const.W)
            this.x = 0;
        if (this.x < 0)
            this.x = Const.W - Const.STEP;
    }

    public void stepY(int y){
        this.y += y;
        if (this.y >= Const.H)
            this.y = 0;
        if (this.y < 0)
            this.y = Const.H - Const.STEP;
    }

    public void draw(Graphics g){
        g.drawImage(image, x, y, Const.STEP, Const.STEP, null);
    }
}
