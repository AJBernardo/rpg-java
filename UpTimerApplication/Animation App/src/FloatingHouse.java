import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.util.Random;

class FloatingHouse extends JPanel {

    //DECLARATIONS AND INITIALIZATIONS
    int index = 0;
    int yLand = 750;
    int yGrass = 722;
    int xHouse = 437;
    int yHouse = 295;
    int xCloudBlock = 0;
    int yCloudBlock = -932;
    int xNightCloud = 0;
    int yNightCloud = -932;
    int cloudSpeed = 1;
    
    int[][] bgColor = {
        { 158, 242, 255 },
        { 158, 232, 255 },
        { 158, 222, 255 },
        { 158, 212, 255 },
        { 158, 202, 255 },
        { 158, 192, 255 },
        { 122, 129, 191 },
        { 104, 113, 187 },
        { 95, 104, 186 },
        { 77, 87, 178 },
        { 67, 78, 173 },
        { 61, 73, 174 },
        { 47, 59, 157 },
        { 36, 46, 142 },
        { 22, 32, 134 },
        { 18, 28, 125 },
        { 14, 22, 96 },
        { 12, 19, 86 },
        { 10, 16, 74 },
        { 9, 13, 55 },
    };

    int[] xCloud = {
            -113,
            -46,
            196,
            547,
            788,
            1133,
            1193,
            
    };

    int[] xCloud2 = {274, 515, 920};
    int[] yCloud2 = { 567, 755, 491};
    boolean[] isMovingRight2 = {false, true, false};

    int[] yCloud = {
            264,
            -40,
            112,
            0,
            188,
            149,
            -76,
           
    };

    boolean[] isMovingRight = {
            true,
            false,
            true,
            false,
            true,
            false,
            true
    };

    boolean isGoingDown = true;

    URL urlHouse;
    URL urlCloud;
    URL urlCloudBlock;
    URL urlNightCloud;
    ImageIcon imageIcon;
    Image house;
    Image cloud;
    Image cloudBlock;
    Image stars;
    Image nightCloud;

    int[][] starPositions;
    int numStars = 50;
    boolean isNightTime = false;
    boolean showNightCloud = false;
    float second;
    Random random = new Random();

    FloatingHouse() {
    	
    	//CREATING THE TIMER
        Timer t = new Timer(1000 / 120, e -> animateScene());
        t.start();
        
        //INITIAL BACKGROUND COLOR
        setBackground(new Color(158, 242, 255));
        
        //INITIALIZE THE FLOATING HOUSE IMAGE
        urlHouse = Home.class.getResource("assets/floatingHouse.png");
        imageIcon = new ImageIcon(urlHouse);
        house = imageIcon.getImage();
        
        //INITIALIZE THE SMALL CLOUD IMAGE
        urlCloud = Home.class.getResource("assets/cloud.png");
        imageIcon = new ImageIcon(urlCloud);
        cloud = imageIcon.getImage();
        
        //INITIALIZE THE CLOUD BLOCK IMAGE
        urlCloudBlock = FloatingHouse.class.getResource("assets/cloudBlock.png");
        imageIcon = new ImageIcon(urlCloudBlock);
        cloudBlock = imageIcon.getImage();
        
        //INITIALIZE THE NIGHT CLOUD IMAGE
        urlNightCloud = FloatingHouse.class.getResource("assets/nightCloud.png");
        imageIcon = new ImageIcon(urlNightCloud);
        nightCloud = imageIcon.getImage();

        // INITIALIZE THE STAR IMAGE
        URL urlStars = Home.class.getResource("assets/smallStar.png");
        imageIcon = new ImageIcon(urlStars);
        stars = imageIcon.getImage();

        // INITIALIZE STAR POSITIONS
        starPositions = new int[numStars][2];
        for (int i = 0; i < numStars; i++) {
            starPositions[i][0] = random.nextInt(1280); 
            starPositions[i][1] = random.nextInt(754); 
        }
    }

    void animateScene() {

        updateBgColor();

        // LAND ANIMATION
        if (second > 60) {
			yLand += 1;
			yGrass += 1;
		}
        
        // CLOUD BLOCK ANIMATION
        if (isGoingDown) {
            yCloudBlock += 2;
        }
        
        // NIGHT CLOUD ANIMATION
        if(second > 2250) {
			yNightCloud += 2;
		}
        
        // RESETTING THE POSITION OF THE HOUSE
        if (yHouse < -566) {
            yHouse = 1398;
        }
        
        // HOUSE ANIMATION
        if (yHouse > 78 && yHouse < 188) {
        	// DELAYS THE FLOATING OF THE HOUSE
            yHouse -= 1; 
        } else {
            yHouse -= 3;
        }

        // CLOUD ANIMATION
        for (int i = 0; i < 7; i++) {

            if (isMovingRight[i]) {

                xCloud[i] += cloudSpeed;

                if (xCloud[i] > 1253) {
                    xCloud[i] = -215;
                }

            } else {
                xCloud[i] -= cloudSpeed;

                if (xCloud[i] < -215) {
                    xCloud[i] = 1253;
                }
            }
        }

        for (int i = 0; i < 3; i++) {

            if (isMovingRight2[i]) {

                xCloud2[i] += cloudSpeed;

                if (xCloud2[i] > 1253) {
                    xCloud2[i] = -215;
                }

            } else {

                xCloud2[i] -= cloudSpeed;

                if (xCloud2[i] < -215) {
                    xCloud2[i] = 1253;
                }
            }
        }

        repaint();
    }

    void updateBgColor() {
    	// A FUNCTION THAT CHANGES THE BACKGROUND COLOR EVERY 200 SECONDS
        second += 1;

        if (second % 200 == 0) {

            if (index < 19) {

                index += 1;

            } else
                index = 0;
            	isNightTime = false;

            setBackground(new Color(bgColor[index][0], bgColor[index][1], bgColor[index][2]));
            
           
            if (index > 12) {
                isNightTime = true;
            }

        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // STARS
        if (isNightTime) {
            for (int[] position : starPositions) {
                g.drawImage(stars, position[0], position[1], this);
            }
        }

        // GRASS
        g.setColor(new Color(105, 149, 70));
        g.fillRect(0, yGrass, 1280, 30);
        
        // LAND
        g.setColor(new Color(115, 36, 36));
        g.fillRect(0, yLand, 1280, 39);

        // CLOUDS
        if(!isNightTime){
            for (int i= 0; i < 7; i++){
                g.drawImage(cloud, xCloud[i], yCloud[i], this);
            }
        } 
        
        if(yCloudBlock >= 225)  {
            for (int i= 0; i < 3; i++){
                g.drawImage(cloud, xCloud2[i], yCloud2[i], this);
            }
        }
        
        // CLOUD BLOCK
        g.drawImage(cloudBlock, xCloudBlock, yCloudBlock, this);

        // NIGHT CLOUD
        g.drawImage(nightCloud, xNightCloud, yNightCloud, this);
      
        // HOUSE
        g.drawImage(house, xHouse, yHouse, this);

    }
}
