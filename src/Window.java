import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(){
        setBounds(20, 21, Const.W, Const.H);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(new MyPanel(), BorderLayout.CENTER);
        pack();
    }
}
