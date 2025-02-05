import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Defender extends JPanel {
	
	String defenderDirection = "right";
	
	public Defender() {
		
		this.setPreferredSize(new Dimension(100, 100));
		this.setOpaque(false);
		
		URL urlYujiRight = Home.class.getResource("/yuji_right.gif");
		ImageIcon icnYujiRight = new ImageIcon(urlYujiRight);
		
		URL urlYujiLeft = Home.class.getResource("/yuji_left.gif");
		ImageIcon icnYujiLeft = new ImageIcon(urlYujiLeft);
		
		JLabel lblDefenderHolder = new JLabel();
		lblDefenderHolder.setBounds(0,0,100,100);
		
		Timer yujiSpriteTimer = new Timer(1000/60, e ->{
			switch(defenderDirection) {
				case "right":
					lblDefenderHolder.setIcon(icnYujiRight);
					break;
				case "left":
					lblDefenderHolder.setIcon(icnYujiLeft);
					break;
				default:
					break;
				
			}
			
		});
		
		yujiSpriteTimer.start();
		
		this.add(lblDefenderHolder);
	}
}
