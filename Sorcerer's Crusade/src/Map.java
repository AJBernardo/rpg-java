import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Map extends JPanel{
	
	//MAP MATRIX
	int[][] tileMap = {
			{1, 1, 1, 1, 0, 0, 0, 1, 2, 2, 1, 0, 0, 0, 1, 1, 1, 1},
			{1, 1, 1, 0, 0, 1, 1, 3, 2, 2, 3, 1, 1, 0, 0, 1, 1, 1},
			{1, 1, 0, 0, 1, 3, 3, 1, 2, 2, 1, 3, 3, 1, 0, 0, 1, 1},
			{1, 0, 0, 0, 1, 3, 1, 1, 2, 2, 1, 1, 3, 1, 0, 0, 0, 1},
			{1, 0, 0, 1, 3, 1, 1, 2, 3, 3, 2, 1, 1, 3, 1, 0, 0, 1},
			{2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2},
			{2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2},
			{1, 0, 0, 1, 3, 1, 1, 2, 3, 3, 2, 1, 1, 3, 1, 0, 0, 1},
			{1, 0, 0, 0, 1, 3, 1, 1, 2, 2, 1, 1, 3, 1, 0, 0, 0, 1},
			{1, 1, 0, 0, 1, 3, 3, 1, 2, 2, 1, 3, 3, 1, 0, 0, 1, 1},
			{1, 1, 1, 0, 0, 1, 1, 3, 2, 2, 3, 1, 1, 0, 0, 1, 1, 1},
			{1, 1, 1, 1, 0, 0, 0, 1, 2, 2, 1, 0, 0, 0, 1, 1, 1, 1}
	};
	
	//DECLARATIONS
	int tileWidth = 60;
	int tileHeight = 60;
	int tileX = 0;
	int tileY = 0;
	int i = 0;
	int row = 0;

	
	URL urlGrassTile;
    URL urlStoneTile;
    URL urlDirtTile;
    URL urlWaterTile;
    URL urlPortal;
    URL urlPortalWand;
    URL urlPortalRuin;
    URL urlPortalEye;
    URL urlPortalBook;
    URL urlPortalOn;
    ImageIcon icnGrassTile;
    ImageIcon icnStoneTile;
    ImageIcon icnDirtTile;
    ImageIcon icnWaterTile;
	ImageIcon icnPortal;
	ImageIcon icnPortalWand;
    ImageIcon icnPortalRuin;
    ImageIcon icnPortalEye;
    ImageIcon icnPortalBook;
    ImageIcon icnPortalOn;

	int portalWidth = 120;
	int portalHeight = 84;
	
	JLabel portal1;
	JLabel portal2;
	JLabel portal3;
	JLabel portal4;
	JLabel portal5;
	JLabel wall;
	JPanel pnlCongratulation;
	JLabel lblCongratulation;
	
	public Map(Character character) {
		
		//PANEL SETTINGS
		this.setPreferredSize(new Dimension());
		this.setLayout(null);
		
		//URL FOR THE PANEL
		urlGrassTile = Home.class.getResource("/grassTile.png");
		icnGrassTile = new ImageIcon(urlGrassTile);
     
        urlStoneTile = Home.class.getResource("/stoneTile.png");
        icnStoneTile = new ImageIcon(urlStoneTile);
        
        urlDirtTile = Home.class.getResource("/dirtTile.png");
        icnDirtTile = new ImageIcon(urlDirtTile);
        
        urlWaterTile = Home.class.getResource("/WaterTile.gif");
        icnWaterTile = new ImageIcon(urlWaterTile);
        
        urlPortal = Home.class.getResource("/portal.png");
		icnPortal = new ImageIcon(urlPortal);
		
		urlPortalWand = Home.class.getResource("/portalWand.png");
		icnPortalWand = new ImageIcon(urlPortalWand);
		
		urlPortalRuin = Home.class.getResource("/portalRuin.png");
		icnPortalRuin = new ImageIcon(urlPortalRuin);
		
		urlPortalEye = Home.class.getResource("/portalEye.png");
		icnPortalEye = new ImageIcon(urlPortalEye);
		
		urlPortalBook = Home.class.getResource("/portalBook.png");
		icnPortalBook = new ImageIcon(urlPortalBook);

		urlPortalOn = Home.class.getResource("/portalOn.png");
		icnPortalOn = new ImageIcon(urlPortalOn);
		
		//INITIALIZATION OF THE PORTALS
		portal1 = new JLabel();
		portal2 = new JLabel();
		portal3 = new JLabel();
		portal4 = new JLabel();
		portal5 = new JLabel();
		
		//SETTINGS OF THE PORTALS
		portal1.setBounds(18, 318, portalWidth ,portalHeight);
		portal1.setIcon(icnPortal);
		portal2.setBounds(480, 6, portalWidth, portalHeight);
		portal2.setIcon(icnPortal);
		portal3.setBounds(947, 318, portalWidth, portalHeight);
		portal3.setIcon(icnPortal);
		portal4.setBounds(480, 630, portalWidth, portalHeight);
		portal4.setIcon(icnPortal);
		portal5.setBounds(480, 318, portalWidth, portalHeight);
		portal5.setIcon(icnPortal);
		
		//PANEL CONGRATULATION INITIALIZATION AND SETTINGS
		pnlCongratulation = new JPanel();
		pnlCongratulation.setBounds(250, 117, 579, 150);
		pnlCongratulation.setOpaque(false);
		pnlCongratulation.setVisible(false);
		
		
		//URL for the lblCongratulations
		URL urlCongratulation = Home.class.getResource("/congratulation.png");
		ImageIcon icnCongratulation = new ImageIcon(urlCongratulation);
		
		//LABEL FOR CONGRATULATIONS
		lblCongratulation = new JLabel();
		lblCongratulation.setBounds(0, 0, 579, 150);
		lblCongratulation.setIcon(icnCongratulation);
		
		//ADDING COMPONENTS TO THE PANEL
		pnlCongratulation.add(lblCongratulation);
		this.add(pnlCongratulation);
		
		this.add(character);
		this.add(portal1);
		this.add(portal2);
		this.add(portal3);
		this.add(portal4);
		this.add(portal5);
		
		//TO CREATE THE TILE MAP
		for (int[] tileRow : tileMap) {
					
			for(int tile : tileRow) {

				JLabel lblTileHolder = new JLabel();
				
				lblTileHolder.setBounds(tileX, tileY, tileWidth, tileHeight);
				
				if(tile == 1) {
					lblTileHolder.setIcon(icnGrassTile);
				} 
				else if(tile == 2) {
					lblTileHolder.setIcon(icnStoneTile);
				} 
				else if(tile == 3) {
					lblTileHolder.setIcon(icnWaterTile);
				} 
				else {
					lblTileHolder.setIcon(icnDirtTile);
				}
				
				tileX += 60;
				this.add(lblTileHolder);
//				this.add(pnlTile);
			}
			
			tileX = 0;
			tileY += 60;
//			row += 1;
		}
		
		
		
	}

}
