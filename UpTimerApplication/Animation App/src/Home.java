//To get the full animation, please run it for at least a minute.
import javax.swing.*;

public class Home {
    
    public static void main(String[] args) {

        JFrame frm = new JFrame();
        
        //INSTANCE OF FLOATING HOUSE
        FloatingHouse up = new FloatingHouse();
        
        //FRAME SETTINGS
        frm.setTitle("UP IN THE SKY");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(1280, 800);
        frm.setVisible(true);

        frm.add(up);
    }
}
