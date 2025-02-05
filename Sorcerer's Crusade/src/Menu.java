import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Menu extends JPanel{
	
	public Menu(Domain domainOne) {
		
		//MENU SETTINGS
		this.setPreferredSize(new Dimension(1080, 720));
		this.setBackground(new Color(0, 0, 0, 150));
		this.setLayout(null);
		
		//URL FOR THE GAMEOVER
		URL urlText = Home.class.getResource("/gameOver.png");
		ImageIcon icnText = new ImageIcon(urlText);
		
		//HOLDER OF THE GAMEOVER IMAGE
		JLabel lblText = new JLabel();
		lblText.setBounds(301, 56, 477, 260);
		lblText.setIcon(icnText);
		
		//INSTANCES OF CUSTOM BUTTON
		CustomButton btnRestart = new CustomButton();
		btnRestart.setBounds(388, 360, btnRestart.btnWidth, btnRestart.btnHeight);
		btnRestart.setIcon(btnRestart.icnRestart);
		
		CustomButton btnExit = new CustomButton();
		btnExit.setBounds(388, 485, btnExit.btnWidth, btnExit.btnHeight);
		btnExit.setIcon(btnExit.icnExit);
		
		//ACTIONLISTENER OF THE CUSTOM BUTTONS
		btnRestart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//RESETS THE PROGRESS OF THE PLAYER IN THAT PORTAL AND TELEPORT THEM BACK TO THE MAIN MAP
				domainOne.gameoverSound.stop();

				domainOne.mainGame.bgMusic2.rewind();
				domainOne.mainGame.bgMusic2.start();
				
				domainOne.mainGame.playerX = 495;
				domainOne.mainGame.playerY = 270;
				
				domainOne.mainGame.gameCharacter.teleportPlayer(domainOne, domainOne.mainGame.gameMap);
				domainOne.mainGame.panelStacks.show(domainOne.mainGame.panelHolder, "mainMap");
				
				domainOne.isCharCaught = false;
				domainOne.isCharOnLeft = false;
				domainOne.defenderSpeed = 10;
				
				domainOne.mainGame.isInDomain = false;
				
				domainOne.isItemRetrieved = false;
				
				domainOne.mainMenu.setVisible(false);
				
				
			}
			
		});
		
		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnExit.exit();
				
			}
			
		});
		
		//ADDING OF THE COMPONENTS TO THE MENU
		this.add(btnRestart);
		this.add(btnExit);
		this.add(lblText);
		
	}

}
