import java.awt.*;
import javax.swing.*;

public class SolarSystem extends JPanel {

    // GLOBAL DECLARATIONS

    // LIST OF PLANETS THAT CAN BE USED TO LOOP 
    String[] planets = {
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Jupiter",
        "Saturn",
        "Uranus",
        "Neptune"
    };

    // EMPTY STORAGE FOR FOCUSED PLANET TO STORE
    String focusedPlanet = null;

    // PLANET DIAMETERS
    int[] planetDiameters = { 14, 16, 20, 18, 32, 26, 24, 26 };

    // ORBIT AND PLANET COLORS
    public static Color white = Color.WHITE;
    public static Color black = Color.BLACK;
    public static Color orbitColor = Color.WHITE;
    public static Color earthDistanceLn = new Color(0, 0, 0, 0);

    public static Color[] orgPlanetColors = {
            new Color(251, 165, 13), // MERCURY
            new Color(221, 188, 134), // VENUS
            new Color(0, 91, 227), // EARTH
            new Color(229, 115, 40), // MARS
            new Color(119, 151, 105), // JUPITER
            new Color(246, 221, 160), // SATURN
            new Color(93, 179, 187), // URANUS
            new Color(0, 255, 255) // NEPTUNE
    };

    public static Color[] tempPlanetColors = {
            new Color(251, 165, 13), // MERCURY
            new Color(221, 188, 134), // VENUS
            new Color(0, 91, 227), // EARTH
            new Color(229, 115, 40), // MARS
            new Color(119, 151, 105), // JUPITER
            new Color(246, 221, 160), // SATURN
            new Color(93, 179, 187), // URANUS
            new Color(0, 255, 255) // NEPTUNE
    };

    public static Color clrSun = new Color(255, 210, 31);

    // DECLARE THE TIMER & SPEED
    Timer t;
    int speed = 60;

    // VALUE OF PI
    double pi = 3.141592653589793238462643383279502884197;

    // ANGLE OF THE PLANETS
    double[] planetAngles = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // PLANET SPEED
    double[] planetSpeeds = { 0.04787, 0.03502, 0.02978, 0.02407, 0.01307, 0.00969, 0.00681, 0.00543 };

    // CENTER OF THE SOLAR SYSTEM
    int xCenter = 1040;
    int yCenter = 493;

    // DATABASE TO STORE PLANET'S RADII, X & Y AXES, & VISIBILITY FLAGS
    int[] planetOrbitRadii = { 54, 84, 114, 144, 174, 204, 234, 264 };
    int[] xPlanetAxes = new int[8];
    int[] yPlanetAxes = new int[8];
    boolean[] planetVisible = { true, true, true, true, true, true, true, true };

    // CONSTRUCTOR
    public SolarSystem() {
        t = new Timer(1000 / 1200, e -> animate());
        t.start();

        // INTIALIZE PLANET POSITIONS & VISIBILITY FLAGS
        for (int i = 0; i < planetAngles.length; i++) {
            xPlanetAxes[i] = xCenter + planetOrbitRadii[i];
            yPlanetAxes[i] = yCenter;
        }
    }

    // ANIMATION METHOD
    void animate() {

        for (int i = 0; i < planetAngles.length; i++) {
            planetAngles[i] += planetSpeeds[i];
            if (planetAngles[i] >= 2 * pi) {
                planetAngles[i] = 0;
            }

            xPlanetAxes[i] = xCenter + (int) (planetOrbitRadii[i] * Math.cos(planetAngles[i]));
            yPlanetAxes[i] = yCenter + (int) (planetOrbitRadii[i] * Math.sin(planetAngles[i]));
        }

        repaint();
    }

    // PAINT METHOD
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // SPACE COLOR
        setBackground(black);

        // SUN
        g.setColor(clrSun);
        g.fillOval(xCenter - 25, yCenter - 25, 50, 50);

        // ORBITS
        g.setColor(orbitColor);
        for (int radius : planetOrbitRadii) {
            g.drawOval(xCenter - radius, yCenter - radius, 2 * radius, 2 * radius);
        }

        // DRAW PLANETS
        for(int i = 0; i < planets.length; i++){
            if(planetVisible[i]){
                g.setColor(tempPlanetColors[i]);

                int diameter = planetDiameters[i];
                g.fillOval(xPlanetAxes[i] - diameter / 2, yPlanetAxes[i] - diameter / 2, diameter, diameter);

                 // FOCUS BOX FOR PLANETS
                if(planets[i] == focusedPlanet){
                    g.setColor(new Color(173, 216, 230));
                    g.drawRect(xPlanetAxes[i] - 36 / 2, yPlanetAxes[i] - 36 / 2,
                    36, 36);
                }
            }
        }

        // EARTH DISTANCE LINE
        g.setColor(earthDistanceLn);
        for (int i = 0; i < xPlanetAxes.length; i++) {
            for (int j = 0; j < yPlanetAxes.length; j++) {
                g.drawLine(xPlanetAxes[2], yPlanetAxes[2], xPlanetAxes[i], yPlanetAxes[i]);
            }
        }

    }

    // METHOD TO HIDE ALL THE PLANETS' ORBITS
    public void hideOrbits(Color orbColor) {
        orbitColor = orbColor;
        repaint();
    }

    // METHOD TO HIDE ALL THE PLANETS
    public void hideAllPlanets(boolean isHidden) {

        if (isHidden) {
            for (int i = 0; i < tempPlanetColors.length; i++) {
                tempPlanetColors[i] = new Color(0, 0, 0, 0);
            }
        } else {
            for (int i = 0; i < tempPlanetColors.length; i++) {
                tempPlanetColors[i] = orgPlanetColors[i];
            }
        }
        repaint();
    }

    // METHOD TO SHOW THE EARTH DISTANCE LINE
    public void showDistanceLine(Color lineColor) {
        earthDistanceLn = lineColor;
        repaint();
    }

    // METHOD TO STOP AND RESTART THE TIMER
    public void freezeTime() {
        t.stop();
    }

    public void startTime() {
        t.start();
    }

    // METHOD TO FAST FORWARD THE TIME
    public void fastFowardTime(boolean isFastForward) {

        // FAST FORWARD THE TIME 10X
        if (isFastForward) {

            for (int i = 0; i < planetSpeeds.length; i++) {
                planetSpeeds[i] *= 2;
            }

        } else {

            for (int i = 0; i < planetSpeeds.length; i++) {
                planetSpeeds[i] /= 2;
            }
        }

    }

    // METHOD TO BOX THE PLANET TO FOCUS
    public void focusedPlanet(String planet){
        focusedPlanet = planet;
        repaint();
    } 
}
