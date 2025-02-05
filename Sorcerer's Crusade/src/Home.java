import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Home {

	public static void main(String[] args) {
		Home home = new Home();
	}

	public Home() {

		// AUDIO
		Audio bgMusic = new Audio("/audio/menu_bg.wav");
		// Audio bgMusic2 = new Audio("/audio/ingame_bg.wav");
		bgMusic.start();

		// FRAME SETTINGS
		JFrame frmHome = new JFrame("LANDING PAGE");
		frmHome.setSize(1080, 720);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.setResizable(false);
		frmHome.setLocationRelativeTo(null);
		frmHome.setLayout(null);

		// URL FOR THE BACKGROUND
		URL urlBackground = Home.class.getResource("/background.png");
		ImageIcon icnBackground = new ImageIcon(urlBackground);

		// CONTAINER OF THE BACKGROUND
		JLabel lblBackground = new JLabel();
		lblBackground.setBounds(0, 0, 1066, 683);
		lblBackground.setIcon(icnBackground);

		// INSTANCES OF CUSTOMBUTTON
		CustomButton btnStart = new CustomButton();
		btnStart.setBounds(388, 421, btnStart.btnWidth, btnStart.btnHeight);
		btnStart.setIcon(btnStart.icnStart);

		CustomButton btnExit = new CustomButton();                                          
		btnExit.setBounds(388, 536, btnExit.btnWidth, btnExit.btnHeight);
		btnExit.setIcon(btnExit.icnExit);

		// INSTANCE OF CLASS MAINGAME
		MainGame gameAdventure = new MainGame();

		// ACTIONLISTENER OF THE BUTTONS
		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnStart.start(frmHome, gameAdventure);

				gameAdventure.bgMusic2.start();
				bgMusic.stop();

			}

		});

		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnExit.exit();

			}

		});

		// ADDING COMPONENTS TO THE FRAME AND SETTING THE FRAME VISIBLE
		frmHome.add(btnStart);
		frmHome.add(btnExit);
		frmHome.add(lblBackground);
		frmHome.setVisible(true);
	}

}
