import javax.swing.*;
import java.awt.*;

class Dim extends Dimension{
    public Dim(int width, int height) {
        super(width, height);
    }

    @Override
    public String toString() {
        return "" + width + "x" + height;
    }
}

public class Const {
    public static int W = 800;
    public static int H = 600;
    public static int STEP = 50;
    public static final Dimension[] DIMENSIONS = {new Dim(800, 600),
                                                  new Dim(1024, 768),
                                                  new Dim(1200, 600),
                                                  new Dim(1280, 1024),
                                                  new Dim(1680, 1050),
                                                  new Dim(1920, 1080)};
    public static void chooseDimension(){
        //Dimension d = DimensionChooser.getDimension();
        Dimension d = (Dimension) JOptionPane.showInputDialog(
                null,
                "Выберите разрешение",
                "Выбор разрешения",
                JOptionPane.PLAIN_MESSAGE,
                null,
                DIMENSIONS,
                DIMENSIONS[0]);

        W = (d.width / STEP) * STEP;
        H = (d.height / STEP) * STEP;
    }
}
