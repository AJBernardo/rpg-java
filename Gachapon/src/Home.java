import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Home {
	
	static Color clrSalmon = new Color(0XF7C6AB);
	
	public static void main(String[] args) {
		
		URL imgurl1 = Home.class.getResource("/container.png");
		ImageIcon imgcontainer = new ImageIcon(imgurl1);
		
		URL imgurl2 = Home.class.getResource("/title.png");
		ImageIcon imgtitle = new ImageIcon(imgurl2);
		
//		URL imgurl4 = Home.class.getResource("/bronze.png");
//		ImageIcon imgbronze = new ImageIcon(imgurl4);
//		
//		URL imgurl5 = Home.class.getResource("/silver.png");
//		ImageIcon imgsilver = new ImageIcon(imgurl5);
//		
//		URL imgurl6 = Home.class.getResource("/gold.png");
//		ImageIcon imggold = new ImageIcon(imgurl6);
		
		
		
		JFrame frmhome = new JFrame();
        frmhome.setSize(700, 800);
        frmhome.setLayout(new BorderLayout());
        frmhome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmhome.setLocationRelativeTo(null);
        
        JFrame frmShowPrize = new JFrame();
        frmShowPrize.setSize(600, 400);
        frmShowPrize.setLayout(new BorderLayout());
        //frmShowPrize.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmShowPrize.setLocationRelativeTo(null);
        frmShowPrize.setVisible(false);
        
        JPanel pnlDisplay = new JPanel();
        JPanel pnlCenter = new JPanel();  
        JPanel pnlPrize = new JPanel();
        
        JLabel lblContainer = new JLabel();
        JLabel lblTitle = new JLabel();
        
//        JButton btnGold = new JButton();
//        JButton btnSilver = new JButton();
//        JButton btnBronze = new JButton();
        
        pnlDisplay.setPreferredSize(new Dimension(0,150)); 
        pnlCenter.setPreferredSize(new Dimension(0,400));
        
        lblContainer.setIcon(imgcontainer);
        lblTitle.setBounds(95, 35, 500, 80);
        lblTitle.setIcon(imgtitle);
      
//        btnBronze.setBounds(269, 126, 98,86);
//        btnBronze.setIcon(imgbronze);
//        btnSilver.setBounds(402, 126, 98,86);
//        btnSilver.setIcon(imgsilver);
//        btnGold.setBounds(535, 126, 98,86);
//        btnGold.setIcon(imggold);
        
        pnlDisplay.setBackground(clrSalmon);
        
        CardLayout lmCard = new CardLayout();
        
        pnlDisplay.setLayout(null);
        pnlPrize.setLayout(lmCard);
        
        GachaponControls pnlControl = new GachaponControls(clrSalmon, frmShowPrize, pnlPrize, lmCard);
        
        
//        String[][] Prizes = {
//        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
//        		{"evilrabbitmorty.png", "EVIL RABBIT MORTY", "This Morty is an evil cosplayer from a dimension where Halloween is 340 days long. His rabbit costume used to be pink and cute but has since faded to a dull gray from overuse."},
//        		{"phantommorty.png", "PHANTOM MORTY", "This Morty will visit you at 2:00am if you leave the game running in front of a mirror in an otherwise empty room and knock on the door 3 times before going to sleep."},
//        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
//        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
//        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
//        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
//        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
//        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
//        		{"eggmorty.png", "EGG MORTY", "This egg appears to contain a life force."},
//        };
        
//        btnBronze.addActionListener(new ActionListener() {
//        	public void actionPerformed(ActionEvent e) {
//        		frmShowPrize.setVisible(true);
//        		//frmhome.setVisible(false);
//        		
//        		for (int i = 0; i < 3; i++) {
//        			Gachapon item1 = new Gachapon(Prizes[i][1], Prizes[i][2], Prizes[i][0], clrSalmon, lmCard, pnlPrize);
//        			
//        			pnlPrize.add(item1, "A");
//        		}
//        	}
//        });
        
//        pnlControl.add(btnBronze);
//        pnlControl.add(btnSilver);
//        pnlControl.add(btnGold);
//        pnlControl.add(lblMechanics);
//        pnlControl.add(lblPrizeBox);
        pnlDisplay.add(lblTitle);
        pnlCenter.add(lblContainer);
        
        //pnlDisplay.add(display);
        frmhome.add(pnlDisplay, BorderLayout.NORTH);
        frmhome.add(pnlCenter, BorderLayout.CENTER);
        frmhome.add(pnlControl, BorderLayout.SOUTH);
        frmShowPrize.add(pnlPrize, BorderLayout.CENTER);
        
        frmhome.setVisible(true);

	}

}
