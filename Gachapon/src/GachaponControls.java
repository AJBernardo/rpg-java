import java.awt.*;
import java.awt.event.*;
import java.net.URL;

import javax.swing.*;

public class GachaponControls extends JPanel {
	int x = 136;
	public GachaponControls(Color clr, JFrame frm, JPanel pnl, CardLayout lm) {
		
		URL imgurlPrize = Home.class.getResource("/prize.png");
		ImageIcon imgPrize = new ImageIcon(imgurlPrize);

		URL imgurlMech = Home.class.getResource("/mechanics.png");
		ImageIcon imgMech = new ImageIcon(imgurlMech);
		
		URL imgurlBronze = Home.class.getResource("/bronze.png");
		ImageIcon imgBronze = new ImageIcon(imgurlBronze);
		
		URL imgurlSilver = Home.class.getResource("/silver.png");
		ImageIcon imgSilver = new ImageIcon(imgurlSilver);
		
		URL imgurlGold = Home.class.getResource("/gold.png");
		ImageIcon imgGold = new ImageIcon(imgurlGold);
		
		this.setPreferredSize(new Dimension(0,250));
		this.setBackground(clr);
	    this.setLayout(null);
	    
	    JLabel lblPrizeBox = new JLabel();
        JLabel lblMechanics = new JLabel();
        
	    JButton btnGold = new JButton();
	    JButton btnSilver = new JButton();
	    JButton btnBronze = new JButton();
	        
        lblPrizeBox.setBounds(35, 35, 179, 179);
        lblPrizeBox.setIcon(imgPrize);
        lblMechanics.setBounds(271, 35, 362, 73);
        lblMechanics.setIcon(imgMech);
        
        btnBronze.setBounds(269, 126, 98,86);
        btnBronze.setIcon(imgBronze);
        btnSilver.setBounds(402, 126, 98,86);
        btnSilver.setIcon(imgSilver);
        btnGold.setBounds(535, 126, 98,86);
        btnGold.setIcon(imgGold);
        
        
        String[][] Prizes = {
        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
        		{"evilrabbitmorty.png", "EVIL RABBIT MORTY", "This Morty is an evil cosplayer from a dimension where Halloween is 340 days long. His rabbit costume used to be pink and cute but has since faded to a dull gray from overuse."},
        		{"phantommorty.png", "PHANTOM MORTY", "This Morty will visit you at 2:00am if you leave the game running in front of a mirror in an otherwise empty room and knock on the door 3 times before going to sleep."},
        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
        };
        
        btnBronze.addActionListener(new ActionListener() {
        	
	      public void actionPerformed(ActionEvent e) {
	    	  frm.setVisible(true);
	      	//frmhome.setVisible(false);
	      	
		       for (int i = 0; i < 3; i++) {
			       	Gachapon item1 = new Gachapon(Prizes[i][1], Prizes[i][2], Prizes[i][0], clr, lm, pnl);
			       	
			       	pnl.add(item1, "A");
		       }
	       }
        });
        
        btnSilver.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		frm.setVisible(true);
          		//frmhome.setVisible(false);
          		
          		for (int i = 0; i < 5; i++) {
          			Gachapon item2 = new Gachapon(Prizes[i][1], Prizes[i][2], Prizes[i][0], clr, lm, pnl);
          			
          			pnl.add(item2, "B");
          		}
            }
        });
        
        btnGold.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		frm.setVisible(true);
          		//frmhome.setVisible(false);
          		
          		for (int i = 0; i < 10; i++) {
          			Gachapon item3 = new Gachapon(Prizes[i][1], Prizes[i][2], Prizes[i][0], clr, lm, pnl);
          			
          			pnl.add(item3, "C");
          		}
            }
        });
        
        lblPrizeBox.addMouseListener(new MouseAdapter() {
        	public void MouseClicked(MouseEvent e) {
        		
        	}
        });
        
        
        
        
        
        this.add(lblMechanics);
        this.add(lblPrizeBox);
        this.add(btnBronze);
        this.add(btnSilver);
        this.add(btnGold);
	}
}
