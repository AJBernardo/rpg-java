import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class CustomButton extends JButton {
	
	//INITIALIZATION AND DECLARATIONS
	
	int btnWidth = 304;
	int btnHeight = 72;
	
	ImageIcon icnStart;
	ImageIcon icnExit;
	ImageIcon icnRestart;
	
	JFrame frmHome;
	JFrame frmGame;
	
	public CustomButton() {
		
		//URL FOR THE BUTTONS
		URL urlStart = Home.class.getResource("/btnStart.png");
		icnStart = new ImageIcon(urlStart);
		
		URL urlExit = Home.class.getResource("/btnExit.png");
		icnExit = new ImageIcon(urlExit);
		
		URL urlRestart = Home.class.getResource("/btnRestart.png");
		icnRestart = new ImageIcon(urlRestart);
		
		//BUTTON SETTINGS
		this.setPreferredSize(new Dimension(btnWidth, btnHeight));
		this.setContentAreaFilled(false);
		this.setBorder(null);

	}
	
	void start(JFrame home, JFrame mainGame) {
		mainGame.setVisible(true);
		home.setVisible(false);
	}
	
	void exit() {
		System.exit(0);
	}
	
	void restart() {
		
	}
	
	
}
