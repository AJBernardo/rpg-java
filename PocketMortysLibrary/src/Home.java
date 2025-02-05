import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Home {
	
	static int xSize = 35; //variable for the x in the setBounds
	static int ySize = 35; //variable for the y in the setBounds
	static int count = 0;  //variable to keep track of the instances of the custom component
	
	public static void main(String[] args) {
		
		//IMAGE URL FOR THE HEADER
		URL imgurlHeader = Home.class.getResource("/header.png");
		ImageIcon imgHeader = new ImageIcon(imgurlHeader);
		
		//FRAME HOME SETTINGS
		JFrame frmHome = new JFrame("WELCOME TO POCKET MORTYS LIBRARY EDITION");
        frmHome.setSize(1280, 832);
        frmHome.setLayout(new BorderLayout());
        frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ensures that the application stops running upon exiting the program
        frmHome.setLocationRelativeTo(null); //puts the frame at the center of the screen
        
        //CREATING JPANELS
        JPanel pnlHeader = new JPanel();
        JPanel pnlLibrary = new JPanel();
        JPanel pnlContent = new JPanel();
        
        //CREATING A JSCROLLPANE
        JScrollPane scrLibrary = new JScrollPane(pnlLibrary);
        
        //CREATING A JLABEL TO HOLD THE IMAGEHEADER
        JLabel lblHeader = new JLabel();
        
        //An array that holds the values needed for the arguments of the LibraryContent component
        String[][] mortys = {
        		{"MOON MORTY", "220 HP", "moon morty.png", "u_rock.png", "This Morty worships the Moon and is planning a fantastical expedition to find the hidden gallery-tomb.", "rock.png", "IMPLODE", "400", "Deals massive damage to all targets, also applies a stun effect."},
        		{"MAGIC MORTY", "205 HP", "magic morty.png", "u_rock.png", "This Morty is deceitful. He lied on his exam paper and said he finished his vegetables when he actually did not.", "rock.png", "NICKEL & DIME", "110", "Deals moderate damage to one target, also applies a random status effect."},
        		{"PARADE MORTY", "204 HP", "parade morty.png", "u_rock.png", "This Morty is participating in the election campaign parade to support the Morty candidate.", "rock.png", "VAPE FUME", "110", "Deals moderate damage to all targets, also applies a random status effect."},
        		{"EMPLOYEE MORTY", "207 HP", "employee morty.png", "u_paper.png", "It's unclear if this Morty is working hard, or hardly working.", "paper.png", "STOCK CRASH", "110", "Deals moderate damage to all targets, also reduces their defense."},
        		{"SQUID FACE MORTY", "199 HP", "squid face morty.png", "u_paper.png", "This Morty is pink and sticky and smells funny. He sometimes squirts a thick slimly ink when he gets scared.", "paper.png", "RUSH", "110", "Deals moderate damage to one target, also applies a speed boost to the user."},
        		{"WONDER MORTY", "211 HP", "wonder morty.png", "u_paper.png", "This Morty gained super powers after eating his Rick's liver, burning away everything he was before.", "paper.png", "ASCEND", "120", "Deals moderate damage to one target, also increases the user's defense."},
        		{"RABBIT MORTY", "172 HP", "rabbit morty.png", "u_scissor.png", "This Morty was bitten by a radioactive bunny, and now turns into a rabbit every time a carrot is near.", "scissor.png", "SCRATCH POST", "90", "Deals moderate damage to one target, also applies a random status effect."},
        		{"CULT OF MORTY MORTY", "247 HP", "cult of morty morty.png", "u_scissor.png", "This Morty hopes to find peace in the power of The One True Morty. Praise The One True Morty!", "scissor.png", "MIND MELD", "115", "Deals moderate damage to one target, also applies a random status effect."},
        		{"CUCUMBER MORTY", "185 HP", "cucumber morty.png", "u_scissor.png", "This Morty pricked himself on his Rick's experimental prickly cucumber.", "scissor.png", "TRANSPLANT", "92", "Deals moderate damage to one target, also swaps the user's position with the target."},
        		{"BIKER MORTY", "348 HP", "biker morty.png", "r_rock.png", "This Morty was born to be wild, a son of the open road, a life of hard living.", "rock.png", "FIERCE LUNGE", "120", "Deals high damage to one target, also applies a knockback effect."},
        		{"MERMAID MORTY", "285 HP", "mermaid morty.png", "r_rock.png", "This Morty is sometimes thought to be a myth. He sits on rocks and lures fishermen to their doom.", "rock.png", "RUSH", "100", "Deals moderate damage to one target, also applies a speed boost to the user."},
        		{"COLLEGE MORTY MORTY", "300 HP", "college morty.png", "r_rock.png", "This Morty enjoys all the benefits of being an adult without all of downsides like back pain.", "rock.png", "WEDGIE", "100", "Deals moderate damage to one target, also applies a random status effect."},
        		{"ELF MORTY", "312 HP", "elf morty.png", "r_paper.png", "This Morty works at the North Poll along with thousands of other enslaved Elf Mortys.", "paper.png", "SELFIE", "1OO", "Deals moderate damage to one target, also applies a random status effect."},
        		{"ENSIGN MORTY", "285 HP", "ensign morty.png", "r_paper.png", "This Morty received 4-D vision from a planet that deemed eyeballs illegal.", "paper.png", "RUSH", "100", "Deals moderate damage to one target, also applies a speed boost to the user."},
        		{"JELLY MORTY", "287 HP", "jelly morty.png", "r_paper.png", "This Morty's heart dissolved long ago into the clear, pink jelly that makes up his current form.", "paper.png", "VAPORTIZE", "85", "Deals moderate damage to one target, also has a chance to apply a random status effect."},
        		{"EVIL RABBIT MORTY", "307 HP", "evil rabbit morty.png", "r_scissor.png", "This Morty is an evil cosplayer from a dimension where Halloween is 340 days long.", "scissor.png", "MIND MELD", "115", "Deals moderate damage to one target, also applies a random status effect."},
        		{"NO SKIN MORTY", "273 HP", "no skin morty.png", "r_scissor.png", "This Morty asked his Rick to create a powerful spot removal cream for his acne but has regretted it ever since.", "scissor.png", "MUTATE", "105", "Deals moderate damage to one target, and transform the user into a random form."},
        		{"SWASHBUCKLE MORTY", "244 HP", "swashbuckle morty.png", "r_scissor.png", "This Morty once found a treasure in the Caribbean but was tricked into trading it for a date with mermaid.", "scissor.png", "LEG SWEEP", "108", "Deals moderate damage to one target, also applies a knockback effect."},
        		{"WIZARD MORTY", "366 HP", "wizard morty.png", "ep_rock.png", "This Morty enjoys role playing. He uses it as an escape where he can be a powerful wizard and rule entire lands.", "rock.png", "FIRE BALL", "120", "Deals high damage to one target, also applies a burn effect."},
        		{"BLACK HOLE MORTY", "361 HP", "black hole morty.png", "ep_rock.png", "This Morty is full of wonders, waiting just beyond his event horizon to be exposed from the darkness", "rock.png", "IMPLODE", "400", "Deals massive damage to all targets, also applies a stun effect."},
        		{"LIBERTY MORTY", "370 HP", "liberty morty.png", "ep_rock.png", "This Morty can be found in gift shops in the country, in-between the decorative plates & keyring stands.", "rock.png", "BODY CHECK", "110", "Deals moderate damage to one target, also applies a knockback effect."},
        		{"ANCIENT MORTY", "301 HP", "ancient morty.png", "ep_paper.png", "This Morty chose poorly. Dried up and dead to the world, only hatred, and cruel fate keep his heart beating.", "paper.png", "BOIL SQUEEZE", "105", "Deals moderate damage to one target, also applies a random status effect."},
        		{"SHOGUN MORTY", "394 HP", "shogun morty.png", "ep_paper.png", "This Morty rules over his Ricks with an iron fist and will crush any Morty in his path.", "paper.png", "FIERCE LUNGE", "120", "Deals high damage to one target, also applies a knockback effect."},
        		{"MASTER MORTY MORTY", "335 HP", "master morty.png", "ep_paper.png", "This Morty is from a well-to-do family closely related to the royal line and looks down upon other Mortys.", "paper.png", "DESCALE", "105", "Deals moderate damage to one target, also reduces their defense."},
        		{"CUPID MORTY", "333 HP", "cupid morty.png", "ep_scissor.png", "This Morty is in love with the abstract concept of love.", "scissor.png", "WING BLAST", "120", "Deals high damage to one target, and has a chance to charm the target."},
        		{"COWBOY DANCER MORTY", "393 HP", "cowboy dancer morty.png", "ep_scissor.png", "This Morty cowpoke likes to ride ‘em high.", "scissor.png", "UNLEASH", "140", "Deals high damage to all targets, and has a chance to increase the user's energy."},
        		{"VENTRILOQUIVER MORTY", "355 HP", "ventriloquiver morty.png", "ep_scissor.png", "This Morty's smack talk is as sharp as his aim.", "scissor.png", "CUTTING GAZE", "80", "Deals moderate damage to one target, also applies a blind effect and reduces the target's defense."},
        		{"DETOX MORTY", "356 HP", "detox morty.png", "e_rock.png", "This Morty has had all toxins removed. Extremely confident, this Morty’s behavior can be erratic sometimes.", "rock.png", "STRAIGHT EDGE", "115", "Deals moderate damage to one target, also cures the user's status effects."},
        		{"EGG MORTY", "200 HP", "egg morty.png", "e_rock.png", "This Morty is obtained from Masy Kallerax's quest, New Chef in the Rickchen.", "rock.png", "HARDEN", "20", "Heals the user's HP by a small amount."},
        		{"MORTOX MORTY", "431 HP", "mortox morty.png", "e_rock.png", "This Morty was found living on a rogue planetoid in the southeastern knot of the Cygnus loop.", "rock.png", "AEROKINESIS", "120", "Deals high damage to all targets, also applies a knockback effect."},
        		{"SHERLOCK MORTY", "343 HP", "sherlock morty.png", "e_paper.png", "This Morty wears a deerstalker cap, more popularly known as a ‘Sherlock hat’ and possesses no detective skills.", "paper.png", "SIGN AUTOGRAPH", "12O", "Deals moderate damage to one target, also applies a random status effect."},
        		{"FLOWER MORTY", "336 HP", "flower morty.png", "e_paper.png", "This Morty has a flower growing from his head. He would like it removed, but the doctors won't touch it", "paper.png", "ROOT DOWN", "113", "Deals moderate damage to one target, also applies a random status effect."},
        		{"RICK MORTY", "334 HP", "rick morty.png", "e_paper.png", "This Morty was tired of always being told he would never have even half the brain power that his Rick possessed.", "paper.png", "MOOD KILL", "113", "Deals moderate damage to one target, also applies a random status effect."},
        		{"SEXY DEVIL MORTY", "396 HP", "sexy devil morty.png", "e_scissor.png", "This Morty has been wearing the same cheap, ill-fitting devil costume since last halloween.", "scissor.png", "ENGULF", "95", "Deals high damage to all targets, also applies a random status effect."},
        		{"ANIMATRONIC MORTY", "320 HP", "animatronic morty.png", "e_scissor.png", "This Morty is one of the last original Morty-bots left from the Uprising that’s still functioning.", "scissor.png", "REBOOT", "108", "Heals the user's HP by a small amount and restores their energy."},
        		{"MORTAION MORTY", "415 HP", "mortaion morty.png", "e_scissor.png", "This Morty comes from a mysterious race of beautiful space sirens who all happen to look like Morty.", "scissor.png", "MIND MELD", "115", "Deals moderate damage to one target, also applies a random status effect."}
        };
        
        for (String[] morty : mortys){
        	LibraryContent libContent = new LibraryContent(morty[0], morty[1], morty[2], xSize, ySize, morty[3], morty[4], morty[5], morty[6], morty[7], morty[8]);
        	
        	count += 1;
        	xSize += 305; //adjusts the x-point of the component in each iteration
        	
        	//a conditional statement ensuring that each row will only hold up to 4 components
        	if (count % 4 == 0) {
        		ySize += 415; //adjusts the y-point of the component in each iteration
        		xSize = 35; 
        	}
        	
        
        	pnlLibrary.add(libContent);
        }
        
        
        //ALL PANEL SETTINGS
        pnlLibrary.setPreferredSize(new Dimension(0, ySize));
        	
        pnlContent.setLayout(new BorderLayout());
        pnlHeader.setPreferredSize(new Dimension(0, 120));
        pnlHeader.setBackground(new Color(114, 32, 32));
        pnlLibrary.setBackground(new Color(32, 114, 114));
        pnlLibrary.setLayout(null);
        
        lblHeader.setPreferredSize(new Dimension(1280, 120));
        lblHeader.setIcon(imgHeader);
        
        //ADDING THE COMPONENTS TO A FRAME/PANEL
        pnlHeader.add(lblHeader);
        frmHome.add(pnlHeader, BorderLayout.NORTH);
        frmHome.add(scrLibrary, BorderLayout.CENTER);
        
        frmHome.setVisible(true);
	}

}
