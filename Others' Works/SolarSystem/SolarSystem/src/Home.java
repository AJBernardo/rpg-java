import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home {
        // DECLARATIONS
        public static SolarSystem solarSystem;
        public static JFrame frm;
        public static JLabel lblTitle;
        public static JLabel lblHidePlanets;
        public static JLabel lblSettings;
        public static JLabel lblExplorePlanets;
        public static JLabel lblFacts;
        public static JComboBox<String> cbPlanets;

        public static void main(String[] args) {

                // INITIALIZATIONS
                solarSystem = new SolarSystem();
                frm = new JFrame();
                lblTitle = new JLabel();
                lblTitle = new JLabel("Solar System");
                lblHidePlanets = new JLabel("Hide planets");
                lblSettings = new JLabel("Settings");
                lblExplorePlanets = new JLabel("Explore planets");
                lblFacts = new JLabel();

                JLabel[] planetFacts = {

                                new JLabel("<html>Did you know that Mercury is the closest planet to the Sun? "
                                                + "Mercury has a very thin atmosphere, causing drastic temperature changes between day and night. "
                                                + "It has no moons.</html>"),

                                new JLabel("<html>Did you know that Venus is the hottest planet in our solar system? "
                                                + "Venus has a thick atmosphere full of carbon dioxide and clouds made of sulfuric acid. "
                                                + "It has no moons.</html>"),

                                new JLabel("<html>Did you know that Earth is the only planet known to support life? "
                                                + "Earth has a diverse climate, abundant water, and a protective atmosphere. "
                                                + "It has one moon.</html>"),

                                new JLabel("<html>Did you know that Mars is known as the Red Planet due to its reddish appearance? "
                                                + "Mars has the tallest volcano and the deepest, longest canyon in the solar system. "
                                                + "It has two moons, Phobos and Deimos.</html>"),

                                new JLabel("<html>Did you know that Jupiter is the largest planet in our solar system? "
                                                + "Jupiter has a Great Red Spot, which is a giant storm larger than Earth. "
                                                + "It has 79 known moons, with Ganymede being the largest.</html>"),

                                new JLabel("<html>Did you know that Saturn is famous for its stunning ring system? "
                                                + "Saturn's rings are made of ice and rock particles. "
                                                + "It has 82 known moons, with Titan being the largest.</html>"),

                                new JLabel("<html>Did you know that Uranus rotates on its side, making it unique among the planets? "
                                                + "Uranus has a faint ring system and is known for its blue-green color due to methane in its atmosphere. "
                                                + "It has 27 known moons, with Titania being the largest.</html>"),

                                new JLabel("<html>Did you know that Neptune is approximately 4.3 billion kilometers from Earth? "
                                                + "Neptune is known for its deep blue color and strong winds, the fastest in the solar system. "
                                                + "It has 14 moons, with Triton being the largest.</html>")
                };

                // LABEL AND CHECKBOX SETTINGS
                lblTitle.setBounds(285, 23, 870, 94);
                lblTitle.setFont(new Font("Aquire", Font.BOLD, 64));
                lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
                lblTitle.setForeground(Color.WHITE);

                lblSettings.setBounds(55, 108, 166, 20);
                lblSettings.setFont(new Font("Aquire", Font.PLAIN, 24));
                lblSettings.setHorizontalAlignment(SwingConstants.LEFT);
                lblSettings.setForeground(Color.WHITE);

                lblExplorePlanets.setBounds(51, 421, 277, 20);
                lblExplorePlanets.setFont(new Font("Aquire", Font.PLAIN, 24));
                lblExplorePlanets.setHorizontalAlignment(SwingConstants.LEFT);
                lblExplorePlanets.setForeground(Color.WHITE);

                lblFacts.setBounds(51, 470, 654, 185);
                lblFacts.setFont(new Font("Friz Quadrata TT", Font.PLAIN, 20));
                lblFacts.setHorizontalAlignment(SwingConstants.LEFT);
                lblFacts.setForeground(Color.WHITE);

                // Integer yAxis = 160;
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

                Integer yAxis2 = 160;
                String[] settings = {
                                "Hide orbits",
                                "Hide/show all planets",
                                "Earth distance line",
                                "Time freeze",
                                "Fast forward"
                                
                };

                for (String setting : settings) {

                        JCheckBox cbSetting = new JCheckBox();

                        cbSetting.setBounds(55, yAxis2, 341, 27);
                        cbSetting.setText(setting);
                        cbSetting.setFont(new Font("Friz Quadrata TT", Font.PLAIN, 24));
                        cbSetting.setHorizontalAlignment(SwingConstants.LEFT);
                        cbSetting.setForeground(Color.WHITE);
                        cbSetting.setBackground(Color.BLACK);
                        cbSetting.setIconTextGap(27);

                        yAxis2 += 50;
                        solarSystem.add(cbSetting);

                        if ("Hide orbits".equals(setting)) {
                                cbSetting.addItemListener(new ItemListener() {
                                        public void itemStateChanged(ItemEvent e) {

                                                if (e.getStateChange() == ItemEvent.SELECTED) {
                                                        solarSystem.hideOrbits(Color.BLACK);
                                                } else {
                                                        solarSystem.hideOrbits(Color.WHITE);
                                                }
                                        }
                                });
                        }

                        if ("Hide/show all planets".equals(setting)) {
                                cbSetting.addItemListener(new ItemListener() {
                                        public void itemStateChanged(ItemEvent e) {

                                                if (e.getStateChange() == ItemEvent.SELECTED) {
                                                        solarSystem.hideAllPlanets(true);
                                                } else {
                                                        solarSystem.hideAllPlanets(false);
                                                }
                                        }
                                });
                        }

                        if ("Earth distance line".equals(setting)) {
                                cbSetting.addItemListener(new ItemListener() {
                                        public void itemStateChanged(ItemEvent e) {

                                                if (e.getStateChange() == ItemEvent.SELECTED) {
                                                        solarSystem.showDistanceLine(Color.GREEN);
                                                } else {
                                                        solarSystem.showDistanceLine(new Color(0, 0, 0, 0));
                                                }
                                        }
                                });
                        }

                        if ("Time freeze".equals(setting)) {
                                cbSetting.addItemListener(new ItemListener() {
                                        public void itemStateChanged(ItemEvent e) {

                                                if (e.getStateChange() == ItemEvent.SELECTED) {
                                                        solarSystem.freezeTime();
                                                } else {
                                                        solarSystem.startTime();
                                                }
                                        }
                                });
                        }

                        if ("Fast forward".equals(setting)) {
                                cbSetting.addItemListener(new ItemListener() {
                                        public void itemStateChanged(ItemEvent e) {
                                                
                                                if (e.getStateChange() == ItemEvent.SELECTED) {
                                                        solarSystem.fastFowardTime(true);
                                                } else {
                                                        solarSystem.fastFowardTime(false);
                                                }
                                        }
                                });
                        }



                }

                // COMBOBOX SETTINGS
                cbPlanets = new JComboBox<>(planets);
                cbPlanets.setBounds(51, 456, 300, 35);
                cbPlanets.setFont(new Font("Friz Quadrata TT", Font.PLAIN, 20));

                // RENDER SOLAR SYSTEM MODEL
                solarSystem.setLayout(null);

                // FRAME SETTINGS
                frm.setTitle("Solar System Model");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setSize(1440, 1024);
                frm.setVisible(true);

                // ADD TO PANEL
                solarSystem.add(lblTitle);
                solarSystem.add(lblHidePlanets);
                solarSystem.add(lblSettings);
                solarSystem.add(lblExplorePlanets);
                solarSystem.add(lblFacts);
                solarSystem.add(cbPlanets);

                // ADD TO FRAME
                frm.add(solarSystem);

                // EVENTS
                cbPlanets.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                                int selectedIndex = cbPlanets.getSelectedIndex();
                                lblFacts.setText(planetFacts[selectedIndex].getText());
                                
                                String selectedPlanet = (String) cbPlanets.getSelectedItem();
                                solarSystem.focusedPlanet(selectedPlanet);
                        }
                });

        }
}
