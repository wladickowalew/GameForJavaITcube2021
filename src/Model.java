import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

abstract public class Model {
    private int x, y;
    private BufferedImage image;

    public Model(int x, int y, String img_path){
        this.x = x;
        this.y = y;
        try {
            image = ImageIO.read(new File(img_path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g){
        g.drawImage(image, x, y, Const.STEP, Const.STEP, null);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
