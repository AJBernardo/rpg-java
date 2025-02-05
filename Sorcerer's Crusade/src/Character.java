import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Character extends JPanel {
	
	//DECLARATIONS
	String characterDirection = "stillRight";
	boolean isFacedRight = true;
	
	int charX;
	int charY;

	public Character(int x, int y) {
		
		charX = x; 
		charY = y;
		
		//CHARACTER SETTINGS
		this.setPreferredSize(new Dimension(100, 100));
		this.setOpaque(false);
		
		//URL FOR THE SPRITES
		URL urlStillRight = Home.class.getResource("/still_right.gif");
		ImageIcon icnStillRight = new ImageIcon(urlStillRight);
		
		URL urlStillLeft = Home.class.getResource("/still_left.gif");
		ImageIcon icnStillLeft = new ImageIcon(urlStillLeft);
		
		URL urlRunRight = Home.class.getResource("/run_right.gif");
		ImageIcon icnRunRight = new ImageIcon(urlRunRight);
		
		URL urlRunLeft = Home.class.getResource("/run_left.gif");
		ImageIcon icnRunLeft = new ImageIcon(urlRunLeft);
		
		//INITIALIZATION OF THE IMAGEHOLDER
		JLabel lblImageHolder = new JLabel();
		
		//BOUNDS FOR THE CHARACTER
		if(characterDirection != "still") {
			lblImageHolder.setBounds(0,0,100,100); //if running
		}else {
			lblImageHolder.setBounds(20,0,100,100); //if still
		}
		
		//CHANGING OF THE SPRITE
		Timer animationTimer = new Timer(1000/60, e ->{
			switch(characterDirection) {
			case "stillRight": 
				lblImageHolder.setIcon(icnStillRight);
				break;
			case "stillLeft": 
				lblImageHolder.setIcon(icnStillLeft);
				break;
			case "right":
				lblImageHolder.setIcon(icnRunRight);
				break;
			case "left":
				lblImageHolder.setIcon(icnRunLeft);
				break;
			case "up":
				if(isFacedRight)
					lblImageHolder.setIcon(icnRunRight);
				else
					lblImageHolder.setIcon(icnRunLeft);
				break;
			case "down":
				if(isFacedRight)
					lblImageHolder.setIcon(icnRunRight);
				else
					lblImageHolder.setIcon(icnRunLeft);
				break;
			default:
				break;
				
			}

		});
		
		animationTimer.start();

		this.add(lblImageHolder);
		
		
	}
	
	//METHOD TO REMOVE THE PLAYER FROM THE CURRENT PANEL AND MOVE IT TO THE NEXT PANEL
	void teleportPlayer(JPanel currentDimension, JPanel nextDimension) {
		currentDimension.remove(this);
		nextDimension.add(this);
		nextDimension.setComponentZOrder(this, 0);

		
	}

}
