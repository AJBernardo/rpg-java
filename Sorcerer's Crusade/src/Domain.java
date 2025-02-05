import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Domain extends JPanel {
	
	//DECLARATIONS
	String domainLocation;
	
	URL urlBackground;
	URL urlDomainTwo;
	URL urlDomainThree;
	URL urlDomainFour;
	URL urlPortal;
	URL urlChestItem;
	URL urlChestRuin;
	URL urlChestEye;
	URL urlChestBook;
	URL urlEmptyChest;
	ImageIcon icnBackground;
	ImageIcon icnDomainTwo;
	ImageIcon icnDomainThree;
	ImageIcon icnDomainFour;
	ImageIcon icnPortal;
	ImageIcon icnChestItem;
	ImageIcon icnChestRuin;
	ImageIcon icnChestEye;
	ImageIcon icnChestBook;
	ImageIcon icnEmptyChest;
	
	JLabel portalDomain;
	JLabel itemHolder;
	JLabel lblBackground;
	
	Defender defenderOne;
	Defender defenderTwo;
	Defender defenderThree;
	
	Menu mainMenu;
	
	int defenderX = 70;
	int reverseX = 925;;
	int defenderY = 550;
	int reverseY = 70;
	int defenderSpeed = 10;
	int defenderOneX = 812;
	int defenderTwoX = 532;;
	int defenderThreeX = 252;
	int defenderOneY = 168;
	int defenderTwoY = 200;
	int defenderThreeY = 435;
	
	int portalWidth = 120;
	int portalHeight = 84;
	
	boolean isDomainPortalSteppedOn = false;
	boolean isItemRetrieved = false;
	boolean isDefenderGoingUp = true;
	boolean isDefenderGoingRight = true;
	boolean isCharOnLeft = false;
	boolean isCharCaught = false;
	
	boolean isItemRetrievedDomainOne = false;
    boolean isItemRetrievedDomainTwo = false;
    boolean isItemRetrievedDomainThree = false;
    boolean isItemRetrievedDomainFour = false;

    MainGame mainGame;

	Timer moveDefender;
	Audio gameoverSound;
	
	public Domain(Character character, MainGame game) {

		// AUDIO
		gameoverSound = new Audio("/audio/gameover.wav");

		//INSTANCE OF CLASS MAINGAME
		mainGame = game;
		
		//DOMAIN SETTINGS
		this.setPreferredSize(new Dimension(1080, 720));
		this.setLayout(null);
		this.setOpaque(false);
		
		//URLS FOR THE DOMAIN CLASS
		urlBackground = Home.class.getResource("/domainFloor.png");
		icnBackground = new ImageIcon(urlBackground);
		
		urlDomainTwo = Home.class.getResource("/domainTwo.png");
		icnDomainTwo = new ImageIcon(urlDomainTwo);
		
		urlDomainThree = Home.class.getResource("/domainThree.png");
		icnDomainThree = new ImageIcon(urlDomainThree);
		
		urlDomainFour = Home.class.getResource("/domainFour.png");
		icnDomainFour = new ImageIcon(urlDomainFour);
		
		urlPortal = Home.class.getResource("/portal.png");
		icnPortal = new ImageIcon(urlPortal);
		
		urlChestItem = Home.class.getResource("/chestWithRuby.png");
		icnChestItem = new ImageIcon(urlChestItem);
		
		urlChestRuin = Home.class.getResource("/chestWithRuin.png");
		icnChestRuin = new ImageIcon(urlChestRuin);
		
		urlChestEye = Home.class.getResource("/chestWithEye.png");
		icnChestEye = new ImageIcon(urlChestEye);
		
		urlChestBook = Home.class.getResource("/chestWithBook.png");
		icnChestBook = new ImageIcon(urlChestBook);
		
		urlEmptyChest = Home.class.getResource("/emptyChest.png");
		icnEmptyChest = new ImageIcon(urlEmptyChest);
		
		//INITIALIZATION OF THE COMPONENTS FOR THE DOMAIN
		lblBackground = new JLabel();
		lblBackground.setBounds(0, 0, 1080, 720);
		
		portalDomain = new JLabel();
		itemHolder = new JLabel();
		
		defenderOne = new Defender();
		defenderTwo = new Defender();
		defenderThree = new Defender();
		
		mainMenu = new Menu(this);
		mainMenu.setBounds(0, 0, 1080, 720);
		mainMenu.setVisible(false);
		
		//ADDING COMPONENTS TO THE DOMAIN
		this.add(mainMenu);
		
		this.add(defenderOne);
		this.add(defenderTwo);
		this.add(defenderThree);

		//TIMER TO ANIMATE THE DEFENDERS MOVEMENTS
		moveDefender = new Timer(1000/60, e -> {
			//IF THE CHARACTER IS IN DOMAIN1 OR DOMAIN2, THE DEFENDERS WILL MOVE UP AND DOWN
			if(domainLocation == "domainOne" || domainLocation == "domainTwo") {
				defenderOne.setVisible(true);
			    if (defenderY > 70 && isDefenderGoingUp) {
			        defenderY -= defenderSpeed;
			        reverseY += defenderSpeed;
			    } else {
			        isDefenderGoingUp = false;
			    }
			    
			    if (defenderY < 550 && !isDefenderGoingUp) {
			        defenderY += defenderSpeed;
			        reverseY -= defenderSpeed;
			      
			    } else {
			        isDefenderGoingUp = true;
			    }
			    
			    defenderOne.setBounds(defenderOneX, defenderY, 100, 100);
			    defenderTwo.setBounds(defenderTwoX, reverseY, 100, 100);
			    defenderThree.setBounds(defenderThreeX, defenderY, 100, 100);
			    
				
				if (isCharOnLeft == true) {
					defenderOne.defenderDirection = "left";
					defenderTwo.defenderDirection = "left";
					defenderThree.defenderDirection = "left";
				}else {
					defenderOne.defenderDirection = "right";
					defenderTwo.defenderDirection = "right";
					defenderThree.defenderDirection = "right";
				}

			//IF THE CHARACTER IS IN DOMAIN3 OR DOMAIN4, THE DEFENDERS WILL MOVE LEFT AND RIGHT 
			}else if (domainLocation == "domainThree" || domainLocation == "domainFour") {
				
				if (defenderX < 925 && isDefenderGoingRight) {
			            defenderX += defenderSpeed;
			            reverseX -= defenderSpeed;
			            
		        } else {
		            isDefenderGoingRight = false;
					defenderTwo.defenderDirection = "right";
					defenderThree.defenderDirection = "left";
		        }

		        if (defenderX > 70 && !isDefenderGoingRight) {
		            defenderX -= defenderSpeed;
		            reverseX += defenderSpeed;
		        } else {
		            isDefenderGoingRight = true;
					defenderTwo.defenderDirection = "left";
					defenderThree.defenderDirection = "right";
		        }

		        defenderOne.setVisible(false);
		        defenderTwo.setBounds(reverseX, defenderTwoY, 100, 100);
		        defenderThree.setBounds(defenderX, defenderThreeY, 100, 100);
			}

			//CONSTANTLY CHECKS IF THE CHARACTER HAS COLLIDE WITH THE DEFENDER
			isCharacterCaught(character);
		    repaint();
		    
		});


	}
	

	//SHOW DOMAIN ONE THE PORTAL ON THE LEFT SIDE OF THE MAP
	void showDomainOne() {
		lblBackground.setIcon(icnBackground);
		
		portalDomain.setBounds(947, 318, portalWidth, portalHeight);
		portalDomain.setIcon(icnPortal);
		
		itemHolder.setBounds(82, 288, 60, 86);
		itemHolder.setIcon(icnChestItem);
		
		domainLocation = "domainOne";
		
		this.add(itemHolder);
		this.add(portalDomain);
		this.add(lblBackground);
	}
	
	//SHOW DOMAIN TWO THE PORTAL ON THE RIGHT SIDE OF THE MAP
	void showDomainTwo() {
		lblBackground.setIcon(icnDomainTwo);
		
		portalDomain.setBounds(28, 318, portalWidth, portalHeight);
		portalDomain.setIcon(icnPortal);
		
		itemHolder.setBounds(934, 288, 60, 86);
		itemHolder.setIcon(icnChestRuin);
		
		domainLocation = "domainTwo";
		isCharOnLeft = true;
		
		defenderSpeed = 10;
		
		this.add(itemHolder);
		this.add(portalDomain);
		this.add(lblBackground);
	}
	
	//SHOW DOMAIN THREE THE PORTAL ON THE NORTH SIDE OF THE MAP
	void showDomainThree() {
		lblBackground.setIcon(icnDomainThree);
		
		portalDomain.setBounds(480, 596, portalWidth, portalHeight);
		portalDomain.setIcon(icnPortal);
		
		itemHolder.setBounds(510, 70, 60, 86);
		itemHolder.setIcon(icnChestEye);
		
		domainLocation = "domainThree";
		isCharOnLeft = true;
		
		defenderSpeed = 15;
		
		this.add(itemHolder);
		this.add(portalDomain);
		this.add(lblBackground);
	}
	
	//SHOW DOMAIN THREE THE PORTAL ON THE SOUTH SIDE OF THE MAP
	void showDomainFour() {
		lblBackground.setIcon(icnDomainFour);
		
		portalDomain.setBounds(480, 100, portalWidth, portalHeight);
		portalDomain.setIcon(icnPortal);
		
		itemHolder.setBounds(510, 570, 60, 86);
		itemHolder.setIcon(icnChestBook);
		
		domainLocation = "domainFour";
		defenderSpeed = 20;
		
		this.add(itemHolder);
		this.add(portalDomain);
		this.add(lblBackground);
	}
	
	//A METHOD TO CHECK IF THE CHARACTER HAS STEPPED ON THE PORTAL INSIDE THE RESPECTIVE DOMAIN
	void checkPortalSteppedOn(Character character, int x, int y) {
		
        Rectangle characterBounds = character.getBounds();
        Rectangle portalBounds = new Rectangle(x, y, 120, 84);
        
        if (characterBounds.intersects(portalBounds))
        	isDomainPortalSteppedOn = true;
        else 
        	isDomainPortalSteppedOn = false;  

    }
	
	//A METHOD TO CHECK IF THE CHARACTER HAS ALREADY COLLIDE WITH THE DEFENDERS
	void isCharacterCaught(Character character) {
		Rectangle characterBounds = character.getBounds();
		Rectangle defenderOneBounds = defenderOne.getBounds();
		Rectangle defenderTwoBounds = defenderTwo.getBounds();
		Rectangle defenderThreeBounds = defenderThree.getBounds();
		
		if ((characterBounds.intersects(defenderOneBounds)) || (characterBounds.intersects(defenderTwoBounds)) || (characterBounds.intersects(defenderThreeBounds))){
			moveDefender.stop();
			isCharCaught = true;

			mainGame.bgMusic2.stop();
			gameoverSound.rewind();
			gameoverSound.start();	
			
			this.setComponentZOrder(mainMenu, 0);
			mainMenu.setVisible(true);
			
			//RESTARTS THE PROGRESS OF THE PLAYER IN THAT PORTAL IF CAUGHT
			if (domainLocation == "domainOne")
				isItemRetrievedDomainOne = false;
			else if (domainLocation == "domainTwo")
				isItemRetrievedDomainTwo = false;
			else if (domainLocation == "domainThree")
				isItemRetrievedDomainThree = false;
			else if (domainLocation == "domainFour")
				isItemRetrievedDomainFour = false;

		}
	}
	
	// A METHOD THAT UPDATE THE CHEST, THE POSITION OF THE DEFENDERS, AND CHECKS IF THE ITEM WAS SUCCESSFULLY RETRIEVED
	void hasChestBeenCollided(Character character, int x, int y) {
		Rectangle characterBounds = character.getBounds(); // Get character's bounding box
        Rectangle chestBounds = new Rectangle(x, y, 60, 86);
        
        if (characterBounds.intersects(chestBounds)){

    		itemHolder.setIcon(icnEmptyChest);
    		isItemRetrieved = true;
    		
    		if (domainLocation == "domainOne") {
    			isCharOnLeft = true;
    			isItemRetrievedDomainOne = true;
    		}
    		else if (domainLocation == "domainTwo") {
    			isCharOnLeft = false;
    			isItemRetrievedDomainTwo = true;
    		}
    		else if (domainLocation == "domainThree") {
    			isItemRetrievedDomainThree = true;
    		}
    		else if (domainLocation == "domainFour") {
    			isItemRetrievedDomainFour = true;
    		}
    			
    		
        }
       
	}
	

}
