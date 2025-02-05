import javax.swing.*;
import java.awt.*;


public class PawlishedPets {
    public static int x = 10;
    public static int y = 10;
    public static int w = 100;
    public static int h = 100;
    public static void main(String[] args) throws Exception {
        
        JFrame frmHome = new JFrame(); 
               
        frmHome.setSize(1080, 720);
        frmHome.setVisible(true);
        frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmHome.setLayout(new GridLayout());
        frmHome.setLocationRelativeTo(null);

        for (int i = 0; i < 10; i++){
            JPanel pnl = new JPanel();
            pnl.setBounds(x, y, w, h);
            pnl.setBackground(Color.black);

            x += 110;
            frmHome.add(pnl);

        }
    }
}
