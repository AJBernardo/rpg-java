import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class GameItem extends JPanel {
	
	int attack = 0;
	int speed = 0;
	int defense = 0;
	
	ImageIcon icnSmall;
	
	public GameItem(String item) {
		
		this.setOpaque(false);
		
		//IMAGE HOLDER OF SPRITES
		JLabel lblSprite = new JLabel();
		lblSprite.setBounds(0, 0, 25, 25);
		add(lblSprite);
		
		URL urlBoots = Home.class.getResource("/boots.png");
		ImageIcon icnBoots = new ImageIcon(urlBoots);
		
		URL urlSword = Home.class.getResource("/sword.png");
		ImageIcon icnSword = new ImageIcon(urlSword);
		
		
		switch(item) {
			case "boots":
				lblSprite.setIcon(icnBoots);
				this.speed = 5;
				Image imgBoots = icnBoots.getImage().getScaledInstance(10, 10, java.awt.Image.SCALE_SMOOTH);
				icnSmall = new ImageIcon(imgBoots);
				break;
			case "sword":
				this.attack = 20;
				lblSprite.setIcon(icnSword);
				Image imgSword = icnSword.getImage().getScaledInstance(10, 10, java.awt.Image.SCALE_SMOOTH);
				icnSmall = new ImageIcon(imgSword);
				break;
		}
	}
	
	void hideItem() {
		this.setBounds(-50,-50,1,1);
	}
}