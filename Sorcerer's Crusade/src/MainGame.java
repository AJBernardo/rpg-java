import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGame extends JFrame {
	
	//DECLARATIONS AND INITIALIZATIONS
	CardLayout panelStacks = new CardLayout();
	
	String domainLocation;
	
	int playerX = 495;
	int playerY = 270;
	
	int defaultWidth = 1080;
	int defaultHeight = 720;
	
	boolean isInDomain = false;
	boolean isPortalOneSteppedOn = false;
	boolean isPortalTwoSteppedOn = false;
	boolean isPortalThreeSteppedOn = false;
	boolean isPortalFourSteppedOn = false;
	
	JPanel panelHolder;
	
	Map gameMap;
	Character gameCharacter;

	Audio bgMusic2;
	
	
	public MainGame() {
		//MAIN GAME SETTINGS
		this.setTitle("JUJUTSU KAISEN: MEGUMI FUSHIGURO'S ADVENTURE TO THE DOMAIN EXPANSIONS");
		this.setSize(1094, 757);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		bgMusic2 = new Audio("/audio/ingame_bg.wav");
		
		//PANEL THAT HOLDS ALL OF OTHER PANELS
		panelHolder = new JPanel();
		panelHolder.setBounds(0, 0, defaultWidth, defaultHeight);
		panelHolder.setLayout(panelStacks);
		
		//INSTANCE OF CLASS CHARACTER
		gameCharacter = new Character(playerX, playerY);
		gameCharacter.setBounds(playerX, playerY, 100, 100);
		
		//INSTANCE OF CLASS MAP
		gameMap = new Map(gameCharacter);
		//gameMap.setBounds(0, 0, defaultWidth, defaultHeight);
		
		//INSTANCE OF CLASS DOMAIN
		Domain domainOne = new Domain(gameCharacter, this);
		
		//ADDING OF THE PANELS TO PANEL HOLDER
		panelHolder.add(gameMap, "mainMap");
		panelHolder.add(domainOne, "domainOne");
		
		//ADDING COMPONENTS TO MAIN GAME
		this.add(panelHolder);
		
		//TIMER THAT UPDATES THE X AND Y POSITION OF THE CHARACTER
		Timer t = new Timer(1000/60, e -> {
			
			//BOUNDS IF IN GAMEMAP
			if (!isInDomain) {
				switch(gameCharacter.characterDirection) {
					case "right":
						if (playerX < 1000)
							playerX += 10;
						break;
					case "left":
						if (playerX > 0)
							playerX -= 10;
						break;
					case "up":
						if (playerY > 0)
							playerY -= 10;
						break;
					case "down":
						if (playerY < 620)
							playerY += 10;
						break;
						
				}
			
			//BOUNDS IF IN DOMAIN
			}else {
				switch(gameCharacter.characterDirection) {
				case "right":
					if (playerX < 925)
						playerX += 10;
					break;
				case "left":
					if (playerX > 70)
						playerX -= 10;
					break;
				case "up":
					if (playerY > 70)
						playerY -= 10;
					break;
				case "down":
					if (playerY < 550)
						playerY += 10;
					break;
					
				}
			}
			
			gameCharacter.setBounds(playerX, playerY, 80, 100);
					
			this.repaint();
			this.setFocusable(true);
			this.requestFocusInWindow();
			
		});
		
		//ADDING KEY LISTENER
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				if(!domainOne.isCharCaught) {
					if(e.getKeyCode() == KeyEvent.VK_W) {
						gameCharacter.characterDirection = "up";
					}
					if(e.getKeyCode() == KeyEvent.VK_D) {
						gameCharacter.characterDirection = "right";
						gameCharacter.isFacedRight = true;
					}
					if(e.getKeyCode() == KeyEvent.VK_A) {
						gameCharacter.characterDirection = "left";
						gameCharacter.isFacedRight = false;
					}
					if(e.getKeyCode() == KeyEvent.VK_S) {
						gameCharacter.characterDirection = "down";
					}
					if(e.getKeyCode() == KeyEvent.VK_SPACE) {
						checkPortalSteppedOn(gameCharacter);
						
						if (!isInDomain) {
							if (isPortalOneSteppedOn && domainOne.isItemRetrievedDomainOne == false) {
								playerX = 983; 
								playerY = 270;
								
								gameCharacter.teleportPlayer(gameMap, domainOne);
								domainOne.showDomainOne();	
								
								domainOne.moveDefender.start();
								panelStacks.show(panelHolder, "domainOne");
								
								isInDomain = true;
							}
							else if (isPortalTwoSteppedOn && domainOne.isItemRetrievedDomainTwo == false) {
								
								playerX = 97;
								playerY = 270;
								
								gameCharacter.teleportPlayer(gameMap, domainOne);
								domainOne.showDomainTwo();
								
								domainOne.moveDefender.start();
								panelStacks.show(panelHolder, "domainOne");
								
								isInDomain = true;
							}
							
							else if (isPortalThreeSteppedOn && domainOne.isItemRetrievedDomainThree == false) {
								
								playerX = 500;
								playerY = 550;
								
								gameCharacter.teleportPlayer(gameMap, domainOne);
								domainOne.showDomainThree();
								
								domainOne.moveDefender.start();
								panelStacks.show(panelHolder, "domainOne");
								
								isInDomain = true;
							}
							
							else if (isPortalFourSteppedOn && domainOne.isItemRetrievedDomainFour == false) {
								
								playerX = 500;
								playerY = 50;
								
								gameCharacter.teleportPlayer(gameMap, domainOne);
								domainOne.showDomainFour();
								
								domainOne.moveDefender.start();
								panelStacks.show(panelHolder, "domainOne");

								isInDomain = true;
							}
							
						}else { //CHECKS IF THE PLAYER SUCCESSFULLY RETRIEVED THE ITEM AND IS STANDING ON THE PORTAL
							switch(domainOne.domainLocation) {
								case "domainOne":
									domainOne.checkPortalSteppedOn(gameCharacter, 947, 318);
									domainOne.hasChestBeenCollided(gameCharacter, 82, 288);
									break;
									
								case "domainTwo":
									domainOne.checkPortalSteppedOn(gameCharacter, 28, 318);
									domainOne.hasChestBeenCollided(gameCharacter, 934, 288);
									break;
									
								case "domainThree":
									domainOne.checkPortalSteppedOn(gameCharacter, 480, 596);
									domainOne.hasChestBeenCollided(gameCharacter, 510, 70);
									break;
									
								case "domainFour":
									domainOne.checkPortalSteppedOn(gameCharacter, 480, 100);
									domainOne.hasChestBeenCollided(gameCharacter, 510, 570);
									break;
								
							}
							
							if(domainOne.isDomainPortalSteppedOn == true && domainOne.isItemRetrieved == true) {
								playerX = 495;
								playerY = 270;
								
								if (domainOne.domainLocation == "domainOne")
									gameMap.portal1.setIcon(gameMap.icnPortalWand);
								else if (domainOne.domainLocation == "domainTwo")
									gameMap.portal3.setIcon(gameMap.icnPortalRuin);
								else if (domainOne.domainLocation == "domainThree")
									gameMap.portal2.setIcon(gameMap.icnPortalEye);
								else if (domainOne.domainLocation == "domainFour")
									gameMap.portal4.setIcon(gameMap.icnPortalBook);
								
								if (domainOne.isItemRetrievedDomainOne == true &&
									domainOne.isItemRetrievedDomainTwo == true &&
									domainOne.isItemRetrievedDomainThree == true &&
									domainOne.isItemRetrievedDomainFour == true
									) {
									gameMap.portal5.setIcon(gameMap.icnPortalOn);
									gameMap.pnlCongratulation.setVisible(true);
								}
								
								gameCharacter.teleportPlayer(domainOne, gameMap);
								panelStacks.show(panelHolder, "mainMap");
								
								domainOne.moveDefender.stop();
								domainOne.isCharOnLeft = false;
								domainOne.defenderSpeed = 10;
								//domainOne.isItemRetrieved = false;
								isInDomain = false;
								
							}
						}
					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_W) {
					gameCharacter.characterDirection = "stillRight";
				}
				if(e.getKeyCode() == KeyEvent.VK_D) {
					gameCharacter.characterDirection = "stillRight";
				}
				if(e.getKeyCode() == KeyEvent.VK_A) {
					gameCharacter.characterDirection = "stillLeft";
				}
				if(e.getKeyCode() == KeyEvent.VK_S) {
					gameCharacter.characterDirection = "stillLeft";
				}
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					
				}
			}
			
		});
		
		//START THE TIMER
		t.start();
		
		this.setVisible(false);
	
	}
	
	//METHOD TO CHECK IF THE CHARACTER IS STANDING ON THE PORTAL
	void checkPortalSteppedOn(Character character) {
		
        Rectangle characterBounds = character.getBounds(); // Get character's bounding box

        Rectangle portal1Bounds = new Rectangle(18, 318, 120, 84);
        Rectangle portal2Bounds = new Rectangle(947, 318, 120, 84);
        Rectangle portal3Bounds = new Rectangle(480, 6, 120, 84);
        Rectangle portal4Bounds = new Rectangle(480, 630, 120, 84);
        
        //CHECK IF PORTAL ONE IS STEPPED ON
        if (characterBounds.intersects(portal1Bounds))
            isPortalOneSteppedOn = true;
        else 
        	isPortalOneSteppedOn = false;
        
        //CHECK IF PORTAL ONE IS STEPPED ON
        if (characterBounds.intersects(portal2Bounds))
            isPortalTwoSteppedOn = true;
        else 
        	isPortalTwoSteppedOn = false;
        
        //CHECK IF PORTAL ONE IS STEPPED ON
        if (characterBounds.intersects(portal3Bounds))
            isPortalThreeSteppedOn = true;
        else 
        	isPortalThreeSteppedOn = false;
        
        //CHECK IF PORTAL ONE IS STEPPED ON
        if (characterBounds.intersects(portal4Bounds))
            isPortalFourSteppedOn = true;
        else 
        	isPortalFourSteppedOn = false;
        

    }
	
	

	
}
